package com.example.dialerpad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText numberInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberInput = findViewById(R.id.numberInput);
    }
    public void onDigitButtonClick(View view) {
        Button button = (Button) view;
        String digit = button.getText().toString();
        String currentNumber = numberInput.getText().toString();
        numberInput.setText(currentNumber + digit);
    }
    public void onDeleteButtonClick(View view) {
        String currentNumber = numberInput.getText().toString();
        if (!currentNumber.isEmpty()) {
            currentNumber = currentNumber.substring(0, currentNumber.length() - 1);
            numberInput.setText(currentNumber);
        }


    }
    public void onDeclineButtonClick(View view) {
        // Implement action to decline the call here
    }
}