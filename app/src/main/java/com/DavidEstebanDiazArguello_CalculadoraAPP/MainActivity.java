package com.DavidEstebanDiazArguello_CalculadoraAPP;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BtnSumar, BtnRestar, BtnMultip, BtnDIV;
        EditText Numm1, Numm2, Nress;

        BtnSumar = findViewById(R.id.BtnSuma);
        BtnRestar = findViewById(R.id.BtnResta);
        BtnMultip = findViewById(R.id.BtnMulti);
        BtnDIV = findViewById(R.id.BtnDiv);

        Numm1 = findViewById(R.id.Num1);
        Numm2 = findViewById(R.id.Num2);
        Nress = findViewById(R.id.Nres);


    }
    public void clickSumae(View veew){
        Toast.makeText(this, "SI SUMAAAA!!!", Toast.LENGTH_SHORT).show();
    }
    public void clickRestar(View veew){
        Toast.makeText(this, "SI RESTAAA!!!", Toast.LENGTH_SHORT).show();
    }
    public void clickMultip(View veew){
        Toast.makeText(this, "SI MULTIPLICA!!!", Toast.LENGTH_SHORT).show();
    }
    public void clickDIVID(View veew){
        Toast.makeText(this, "SI DIVIDEEE!!!", Toast.LENGTH_SHORT).show();
    }
    public void clicktest(View veew){
        Toast.makeText(this, "QUe esperas tonto?!!!", Toast.LENGTH_SHORT).show();
    }

}