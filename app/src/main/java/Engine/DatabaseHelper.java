package Engine;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by illestboy on 22.09.16.
 */

class DatabaseHelper extends SQLiteOpenHelper {

    private static final String LOG_TAG = DatabaseHelper.class.getName();

    private static final String DATABASE_NAME = "quiz.db";

    private static final String DATABASE_CREATE_SCRIPT = "";

    private static final int DATABASE_VERSION = 1;

    private static String DB_FOLDER;

    private static final String DB_PATH = DB_FOLDER + DATABASE_NAME;
    private static final String DB_ASSETS_PATH = "db/" + DATABASE_NAME;
    private static final int DB_VERSION = 1;
    private static final int DB_FILES_COPY_BUFFER_SIZE = 8192;

    private static Context context;

    DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.DB_FOLDER = "/data/data/" + context.getPackageName() + "/databases/";
        this.context = context;
    }

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,
                          int version) {
        super(context, name, factory, version);
    }

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,
                          int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    public void Initialize() {
        if (isInitialized() == false) {
            copyInialDBfromAssets();
        }
    }

    private boolean isInitialized() {

        SQLiteDatabase checkDB = null;
        Boolean correctVersion = false;

        try {
            checkDB = SQLiteDatabase.openDatabase(DB_PATH, null,
                    SQLiteDatabase.OPEN_READONLY);
            correctVersion = checkDB.getVersion() == DB_VERSION;
        } catch (SQLiteException e) {
            Log.w(LOG_TAG, e.getMessage());
        } finally {
            if (checkDB != null)
                checkDB.close();
        }

        return checkDB != null && correctVersion;
    }

    private void copyInialDBfromAssets() {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new BufferedInputStream(context.getAssets().open(
                    DB_ASSETS_PATH), DB_FILES_COPY_BUFFER_SIZE);
            File dbDir = new File(DB_FOLDER);
            if (dbDir.exists() == false)
                dbDir.mkdir();
            outStream = new BufferedOutputStream(new FileOutputStream(DB_PATH),
                    DB_FILES_COPY_BUFFER_SIZE);

            byte[] buffer = new byte[DB_FILES_COPY_BUFFER_SIZE];
            int length;
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }

            outStream.flush();
            outStream.close();
            inStream.close();

        } catch (IOException ex) {
            throw new SQLiteException(
                    "Fail to copy initial db from assets", ex);
        } finally {
                /*IOUtils.closeSilent(outStream);
                IOUtils.closeSilent(inStream);*/
        }
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE_SCRIPT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF IT EXISTS " + DATABASE_NAME);
        onCreate(db);
    }
}
