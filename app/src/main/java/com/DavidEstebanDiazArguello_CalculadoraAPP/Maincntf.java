package com.DavidEstebanDiazArguello_CalculadoraAPP;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Maincntf extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cntf);



        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button BtnBack= findViewById(R.id.back);
        BtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Maincntf.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
