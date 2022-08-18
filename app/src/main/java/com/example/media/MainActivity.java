package com.example.media;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button botaoCalcular;
    EditText campoNota1, campoNota2, campoMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNota1 = findViewById(R.id.edtNota1);
        campoNota2 = findViewById(R.id.edtNota2);
        campoMedia = findViewById(R.id.edtMedia);
        botaoCalcular = findViewById(R.id.btCalcular);

        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float varNota1, varNota2, varMedia;

                varNota1 = Float.parseFloat(campoNota1.getText().toString());
                varNota2 = Float.parseFloat(campoNota2.getText().toString());
                varMedia = (varNota1 + varNota2)/2;

                campoMedia.setText(String.valueOf(varMedia));
            }
        });

    }
}