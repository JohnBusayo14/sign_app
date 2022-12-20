package com.example.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class CodeDisplay extends AppCompatActivity {

    EditText etInput;
    Button btGenerate;
    ImageView ivOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_display);


        etInput = findViewById(R.id.et_input);
        btGenerate =  findViewById(R.id.bt_generate);
        ivOutput =  findViewById(R.id.iv_output);

        btGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sText = etInput.getText().toString().trim();
            }
        });
    }
}