package com.example.calculadora_tres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv_resultado;
    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_resultado = (TextView) findViewById(R.id.tv_resultado);
        btn_voltar = (Button) findViewById(R.id.btn_voltar);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String resultado = extras.getString("resultado");
            tv_resultado.setText(resultado);
        }

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}