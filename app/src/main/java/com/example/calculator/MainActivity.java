package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText number1 = findViewById(R.id.number_one);
        EditText number2 = findViewById(R.id.number_two);
        Button button = findViewById(R.id.addition);
        TextView result = findViewById(R.id.result);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (!number1.getText().toString().equals("") && !number2.getText().toString().equals("")) {
                    double r;
                    r = Double.parseDouble(number1.getText().toString()) +
                            Double.parseDouble(number2.getText().toString());
                    result.setText(Double.toString(r));
                }
            }
        });

    }
}
