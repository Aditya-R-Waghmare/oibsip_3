package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button add,sub,mul,div;
    TextView tv;
    EditText ed1,ed2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sub=findViewById(R.id.sub);
        add=findViewById(R.id.add);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        tv=findViewById(R.id.tv);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(ed1.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
                }else if(ed2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
                }else {
                    double n1=Double.parseDouble(ed1.getText().toString());
                    double n2=Double.parseDouble(ed2.getText().toString());
                    double result=n1+n2;
                    tv.setText("Result: "+result);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(ed1.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
                }else if(ed2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
                }else {
                    double n1=Double.parseDouble(ed1.getText().toString());
                    double n2=Double.parseDouble(ed2.getText().toString());
                    double result=n1-n2;
                    tv.setText("Result: "+result);
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(ed1.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
                }else if(ed2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
                }else {
                    double n1=Double.parseDouble(ed1.getText().toString());
                    double n2=Double.parseDouble(ed2.getText().toString());
                    double result=n1*n2;
                    tv.setText("Result: "+result);
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(ed1.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
                }else if(ed2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
                }else {
                    double n1=Double.parseDouble(ed1.getText().toString());
                    double n2=Double.parseDouble(ed2.getText().toString());
                    if(n2==0){
                        Toast.makeText(MainActivity.this, "Cannot divide with zero!", Toast.LENGTH_SHORT).show();
                    }else {
                        double result = n1 / n2;
                        tv.setText("Result: " + result);
                    }
                }
            }
        });

    }
}