package com.example.convertidora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondMainActivity extends AppCompatActivity {

    private TextView mensIn;
    private EditText mensOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main2);

        mensIn = findViewById(R.id.mensIn);
        mensOut = findViewById(R.id.mensOut);

        Bundle extra = getIntent().getExtras();
        String mens = extra.getString("mens");
        float numero = extra.getFloat("numero");


        String mensajeCompleto = " El resultado en € es: " + numero + " y el mensaje es: " + mens;
        mensIn.setText(mensajeCompleto);
    }

    public void enviaMens(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("mesnACT2", mensOut.getText().toString());
        startActivity(intent);
    }
}