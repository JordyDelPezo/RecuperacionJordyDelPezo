package com.edu.recuperacionjordydelpezo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextLado;
    private Button btnGenerar;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLado = findViewById(R.id.editTextLado);
        btnGenerar = findViewById(R.id.btnGenerar);
        textViewResultado = findViewById(R.id.textViewResultado);

        btnGenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularArea();
            }
        });
    }

    private void calcularArea() {
        String ladoStr = editTextLado.getText().toString();
        if (!ladoStr.isEmpty()) {
            double lado = Double.parseDouble(ladoStr);
            double area = lado * lado;
            textViewResultado.setText("Área: " + area);
        } else {
            textViewResultado.setText("Introduce un valor válido para el lado");
        }
    }
}
