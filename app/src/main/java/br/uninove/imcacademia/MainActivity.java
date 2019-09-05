package br.uninove.imcacademia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtIdade;
    private EditText txtPeso;
    private EditText txtAltura;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtIdade = findViewById(R.id.txtIdade);
        this.txtAltura = findViewById(R.id.txtAltura);
        this.txtPeso = findViewById(R.id.txtPeso);
    }

    public void calcIMC(View view){
        double peso = 0.0;
        double altura = 0.0;
        double resultado = 0.0;
        peso = Double.parseDouble(this.txtPeso.getText().toString());
        altura = Double.parseDouble(this.txtAltura.getText().toString());
        resultado = peso/(altura * altura);

        if(resultado < 18.5){
            this.txtResultado.setText("Magro");
        }else if(resultado > 18.4 && resultado < 24.9){
            this.txtResultado.setText("Normal");
        }else if(resultado > 24.9 && resultado < 29.9){
            this.txtResultado.setText("Sobrepeso");
        }else{
            this.txtResultado.setText("Obesidade");
        }
    }




}
