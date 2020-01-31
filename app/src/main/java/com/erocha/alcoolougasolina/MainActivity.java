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

    public void Limpar(View view){
        editTextAlcool.setText("");
        editTextGasolina.setText("");
        textResultado.setText("");
        textResultado.setText("Resultado");
    }

    public void calcularPreco(View view){

        String precoAlcool      = editTextAlcool.getText().toString();
        String precoGasolina      = editTextGasolina.getText().toString();

        //Limpar Campos


        //Validar Campos
        Boolean campoValidados = validarCampos(precoAlcool, precoGasolina);

        if(campoValidados){

            //Convertendo string para números
            Double valorAlcool = Double.parseDouble(precoAlcool);
            Double valorGasolina = Double.parseDouble(precoGasolina);

            Double resultado = valorAlcool/valorGasolina;

            if(resultado>=0.7){
                textResultado.setText("Melhor utilizar Gasolina!");
            }else{
                textResultado.setText("Melhor utilizar Álcool!");
            }

        }else{
            textResultado.setText("Preencha os campos!");
        }
    }

    public Boolean validarCampos(String pAlcool, String pGasolina){

        Boolean camposValidados = true;


        if(pAlcool == null || pAlcool.equals("")){

            camposValidados = false;

        }else if(pGasolina == null || pGasolina.equals("")){
            camposValidados = false;
        }

        return camposValidados;
    }


}
