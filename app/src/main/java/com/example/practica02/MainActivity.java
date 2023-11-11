package com.example.practica02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView tvResultado;

    private Button calcular;

    private RadioButton suma;
    private RadioButton resta;

    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.et1);
        num2 = findViewById(R.id.et2);
        tvResultado = findViewById(R.id.tv1);
        suma = findViewById(R.id.rbSumar);
        resta = findViewById(R.id.rbRestar);

        calcular = findViewById(R.id.btCalcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(suma.isChecked()){
                    Sumar();
                } else if (resta.isChecked()) {
                    Restar();
                }else{
                    Toast.makeText(MainActivity.this, "Debe seleccionar una operacion", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
    public void Sumar(){
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();
        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);
        int resultado = numero1 + numero2;

        String result = String.valueOf(resultado);
        tvResultado.setText(result);

    }
    public void Restar(){
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();
        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);
        int resultado = numero1 - numero2;

        String result = String.valueOf(resultado);
        tvResultado.setText(result);

    }
}