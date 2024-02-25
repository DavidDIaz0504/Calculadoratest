package com.DavidEstebanDiazArguello_CalculadoraAPP;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")

    String operation;
    double firstNum;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonCenti = findViewById(R.id.centi);
        botonCenti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Maincntf.class);
                startActivity(intent);
            }
        });



        Button num0 = findViewById(R.id.n0);
        Button num1 = findViewById(R.id.n1);
        Button num2 = findViewById(R.id.n2);
        Button num3 = findViewById(R.id.n3);
        Button num4 = findViewById(R.id.n4);
        Button num5 = findViewById(R.id.n5);
        Button num6 = findViewById(R.id.n6);
        Button num7 = findViewById(R.id.n7);
        Button num8 = findViewById(R.id.n8);
        Button num9 = findViewById(R.id.n9);

        Button ac = findViewById(R.id.ac);
        Button div = findViewById(R.id.btndiv);
        Button multi = findViewById(R.id.btnmulti);
        Button suma = findViewById(R.id.btnsuma);
        Button resta = findViewById(R.id.btnresta);
        Button resultado = findViewById(R.id.btnres);
        Button punto = findViewById(R.id.dot);
        Button del = findViewById(R.id.del);
        Button percen = findViewById(R.id.percentage);

        TextView screen = findViewById(R.id.screen);



        ac.setOnClickListener(view -> {
            firstNum = 0;
            screen.setText("0");
        });

        del.setOnClickListener(view -> {
            String num = screen.getText().toString();
            if (num.length()>1){
                screen.setText(num.substring(0, num.length()-1));
            } else if (num.length() == 1 && !num.equals("0")) {
                screen.setText("0");
            }
        });

        punto.setOnClickListener(view -> {
            if (!screen.getText().toString().contains(".")) {
                screen.setText(screen.getText().toString() + ".");
            }
        });


        ArrayList<Button> nums = new ArrayList<>();
        nums.add(num0);
        nums.add(num1);
        nums.add(num2);
        nums.add(num3);
        nums.add(num4);
        nums.add(num5);
        nums.add(num6);
        nums.add(num7);
        nums.add(num8);
        nums.add(num9);

        for (Button b : nums) {
            b.setOnClickListener(view -> {
                if(!screen.getText().toString().equals("0")){
                    screen.setText(screen.getText().toString() + b.getText().toString());
                } else {
                    screen.setText(b.getText().toString());
                }
            });
        }

        ArrayList<Button> opers = new ArrayList<>();
        opers.add(div);
        opers.add(multi);
        opers.add(suma);
        opers.add(resta);
        opers.add(percen);

        for (Button b : opers){
            b.setOnClickListener(view -> {
            firstNum = Double.parseDouble(screen.getText().toString());
            operation = b.getText().toString();
            screen.setText("0");
            });
        }

        resultado.setOnClickListener(view -> {
            double secondNum = Double.parseDouble(screen.getText().toString());
            double result;
            switch (operation) {
                case "/":
                    result = firstNum/secondNum;
                    break;
                case "X":
                    result = firstNum*secondNum;
                    break;
                case "+":
                    result = firstNum+secondNum;
                    break;
                case "-":
                    result = firstNum-secondNum;
                    break;
                case "%":
                    result= (firstNum * secondNum) / 100;
                    break;
                default:
                    result = firstNum+secondNum;
            }
            screen.setText(String.valueOf(result));
            firstNum = result;
        });
    }

}