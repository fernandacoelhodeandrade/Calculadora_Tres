package com.example.calculadora_tres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private double num1, num2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_somar = findViewById(R.id.btn_soma);
        Button btn_subtrair = findViewById(R.id.btn_subtrai);
        Button btn_multiplicar = findViewById(R.id.btn_multiplica);
        Button btn_dividir = findViewById(R.id.btn_divide);

        EditText et_valor1 = findViewById(R.id.et_valor1);
        EditText et_valor2 = findViewById(R.id.et_valor2);

        btn_somar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(et_valor1.getText().toString());
                num2=Double.parseDouble(et_valor2.getText().toString());
                res=num1+num2;

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("resultado", String.valueOf(res));
                startActivity(intent);
            }
        });
        btn_subtrair.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(et_valor1.getText().toString());
                num2=Double.parseDouble(et_valor2.getText().toString());
                res=num1-num2;

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("resultado", String.valueOf(res));
                startActivity(intent);
            }
        });
        btn_multiplicar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(et_valor1.getText().toString());
                num2=Double.parseDouble(et_valor2.getText().toString());
                res=num1*num2;

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("resultado", String.valueOf(res));
                startActivity(intent);
            }
        });
        btn_dividir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(et_valor1.getText().toString());
                num2=Double.parseDouble(et_valor2.getText().toString());
                res=num1/num2;

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("resultado", String.valueOf(res));
                startActivity(intent);
            }
        });
    }
}