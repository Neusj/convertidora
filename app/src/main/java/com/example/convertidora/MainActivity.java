package com.example.convertidora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num;
    private EditText mens;
    private TextView mesnACT2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = findViewById(R.id.num);
        mens = findViewById(R.id.mensTxt);
        mesnACT2 = findViewById(R.id.mesnACT2);

        Bundle extra = getIntent().getExtras();

        try {
            String mens2 = extra.getString("mesnACT2");

            mesnACT2.setText(mens2);
        }catch (Exception e){
            Log.d("Error", e.getMessage());
        }

    }

    public void convierteAEuro(View view){
        //valor del eruo 10/09/2021 (1 peso = 0,0011 €)
        float EURO = 0.0011f;

        float numIn = Float.parseFloat(num.getText().toString());
        float res = numIn * EURO;

        Intent intent = new Intent(this, SecondMainActivity.class);
        intent.putExtra("numero", res);
        intent.putExtra("mens", mens.getText().toString());
        startActivity(intent);
    }
}