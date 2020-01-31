package com.erocha.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        private EditText editTextAlcool, editTextGasolina;
        private TextView textResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAlcool          = findViewById(R.id.editTextAlcool);
        editTextGasolina        = findViewById(R.id.editTextGasolina);
        textResultado           = findViewById(R.id.textResultado);
    }

    public void calcularPreco(View view){

    }
}
