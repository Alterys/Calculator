package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calculator.databinding.ActivityMainBinding;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private String buffer = "0";

    ActivityMainBinding binding = null;

    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.numberZero.setOnClickListener(view -> {
            if (buffer.length() == 1 && buffer.charAt(0) == '0'){
                return;
            } else {
                buffer += "0";
            }
            binding.textView.setText(buffer);
        });

        binding.numberOne.setOnClickListener(view -> {
            if (buffer.length() == 1 && buffer.charAt(0) == '0'){
                buffer = "1";
            } else {
                buffer += "1";
            }
            binding.textView.setText(buffer);
        });
        binding.numberTwo.setOnClickListener(view -> {
            if (buffer.length() == 1 && buffer.charAt(0) == '0'){
                buffer = "2";
            } else {
                buffer += "2";
            }
            binding.textView.setText(buffer);
        });
        binding.numberThree.setOnClickListener(view -> {
            if (buffer.length() == 1 && buffer.charAt(0) == '0'){
                buffer = "3";
            } else {
                buffer += "3";
            }
            binding.textView.setText(buffer);
        });
        binding.numberFour.setOnClickListener(view -> {
            if (buffer.length() == 1 && buffer.charAt(0) == '0'){
                buffer = "4";
            } else {
                buffer += "4";
            }
            binding.textView.setText(buffer);
        });
        binding.numberFive.setOnClickListener(view -> {
            if (buffer.length() == 1 && buffer.charAt(0) == '0'){
                buffer = "5";
            } else {
                buffer += "5";
            }
            binding.textView.setText(buffer);
        });
        binding.numberSix.setOnClickListener(view -> {
            if (buffer.length() == 1 && buffer.charAt(0) == '0'){
                buffer = "6";
            } else {
                buffer += "6";
            }
            binding.textView.setText(buffer);
        });
        binding.numberSeven.setOnClickListener(view -> {
            if (buffer.length() == 1 && buffer.charAt(0) == '0'){
                buffer = "7";
            } else {
                buffer += "7";
            }
            binding.textView.setText(buffer);
        });
        binding.numberEight.setOnClickListener(view -> {
            if (buffer.length() == 1 && buffer.charAt(0) == '0'){
                buffer = "8";
            } else {
                buffer += "8";
            }
            binding.textView.setText(buffer);
        });
        binding.numberNine.setOnClickListener(view -> {
            if (buffer.length() == 1 && buffer.charAt(0) == '0'){
                buffer = "9";
            } else {
                buffer += "9";
            }
            binding.textView.setText(buffer);
        });
        binding.clear.setOnClickListener(view -> {
            buffer = "0";
            binding.textView.setText(buffer);
        });
        binding.plus.setOnClickListener(view -> {
            if (buffer.length() == 1 && buffer.charAt(0) == '0'){
                buffer = "0";
            }
            if (buffer.charAt(0) == '+') {
                buffer = "";
            } else {
                buffer = "+";
            }

            binding.textView.setText(buffer);
        });



    }
}


