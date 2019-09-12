package br.uninove.imcacademia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtIdade;
    private EditText txtPeso;
    private EditText txtAltura;
    private TextView txtResultado;
    private ImageView imgResultado;
    private Spinner opcSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtIdade = findViewById(R.id.txtIdade);
        this.txtAltura = findViewById(R.id.txtAltura);
        this.txtPeso = findViewById(R.id.txtPeso);
        this.txtResultado = findViewById(R.id.txtResultado);
        this.imgResultado = findViewById(R.id.imgResultado);
        this.opcSexo = findViewById(R.id.opcSexo);
    }

    public void calcIMC(View view){
        double peso = 0.0;
        double altura = 0.0;
        double resultado = 0.0;
        int sexo = this.opcSexo.getSelectedItemPosition();

        if (sexo == 0) {
            peso = Double.parseDouble(this.txtPeso.getText().toString());
            altura = Double.parseDouble(this.txtAltura.getText().toString());
            resultado = peso / (altura * altura);

            if (resultado < 18.5) {
                this.txtResultado.setText("Magro");
                this.imgResultado.setImageResource(R.drawable.homemmagro);
            } else if (resultado > 18.4 && resultado < 24.9) {
                this.txtResultado.setText("Normal");
                this.imgResultado.setImageResource(R.drawable.homemnormal);
            } else if (resultado > 24.9 && resultado < 29.9) {
                this.txtResultado.setText("Sobrepeso");
                this.imgResultado.setImageResource(R.drawable.homemobeso);
            } else {
                this.txtResultado.setText("Obesidade");
                this.imgResultado.setImageResource(R.drawable.homemsobrepeso);
            }
        }else{
            if (resultado < 18.5) {
                this.txtResultado.setText("Magra");
                this.imgResultado.setImageResource(R.drawable.mulhermagra);
            } else if (resultado > 18.4 && resultado < 24.9) {
                this.txtResultado.setText("Normal");
                this.imgResultado.setImageResource(R.drawable.mulhernormal);
            } else if (resultado > 24.9 && resultado < 29.9) {
                this.txtResultado.setText("Sobrepeso");
                this.imgResultado.setImageResource(R.drawable.mulherobesa);
            } else {
                this.txtResultado.setText("Obesidade");
                this.imgResultado.setImageResource(R.drawable.mulherobesa);
            }

        }

    }

}
