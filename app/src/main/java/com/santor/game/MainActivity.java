package com.santor.game;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnExit, btnNewGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnExit = (Button) findViewById(R.id.btnExit);
        btnNewGame = (Button) findViewById(R.id.NewGame);


        // обработчик нажатия кнопки выход
        View.OnClickListener oclBtnEx = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Кнопка Exit нажата
                finish();
            }
        };

        View.OnClickListener oclBtnNewGame = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.category);
            }
        };

        // присвоим обработчик кнопке выход (btnExit)
        btnExit.setOnClickListener(oclBtnEx);
        btnNewGame.setOnClickListener(oclBtnNewGame);
    }

    @Override
    public void onBackPressed() {
        openQuitDialog();
    }

    private void openQuitDialog() {
        AlertDialog.Builder quitDialog = new AlertDialog.Builder(
                MainActivity.this);
        quitDialog.setTitle("Вы уверены что хотите выйти?");

        quitDialog.setPositiveButton("Да", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
                finish();
            }
        });

        quitDialog.setNegativeButton("Нет", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
            }
        });

        quitDialog.show();
    }
}
