package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1_click(View view)
    {
        EditText edt1 = findViewById(R.id.num1);
        EditText edt2 = findViewById(R.id.num2);
        int num1 = Integer.parseInt(edt1.getText().toString());
        int num2 = Integer.parseInt(edt2.getText().toString());
        int result = num1 + num2;
        TextView textView = findViewById(R.id.result);
        textView.setText("Result: " + result);
    }
}