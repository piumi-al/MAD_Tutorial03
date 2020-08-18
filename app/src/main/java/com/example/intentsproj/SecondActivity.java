package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
     EditText num1,num2;
     Button add1,sub1,multi1,divid1;
     TextView ans;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        num1 = (EditText)findViewById(R.id.edit1);
        num2= (EditText)findViewById(R.id.edit2) ;
        add1 =(Button)findViewById(R.id.add);
        sub1 =(Button)findViewById(R.id.sub);
        multi1 =(Button)findViewById(R.id.multi);
        divid1 =(Button)findViewById(R.id.divid);
        ans = (TextView)findViewById(R.id.ans);


        //addition
        add1.setOnClickListener(
                new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        int number1 = Integer.parseInt(num1.getText().toString());
                        int number2 = Integer.parseInt(num2.getText().toString());
                        int sum = number1 + number2;
                        ans.setText(String.valueOf(sum));
                    }
                }
        );

        //subtraction
        sub1.setOnClickListener(
                new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        int number1 = Integer.parseInt(num1.getText().toString());
                        int number2 = Integer.parseInt(num2.getText().toString());
                        int subtract = number1 - number2;
                        ans.setText(String.valueOf(subtract));
                    }
                }
        );

        //multiplication
        multi1.setOnClickListener(
                new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        int number1 = Integer.parseInt(num1.getText().toString());
                        int number2 = Integer.parseInt(num2.getText().toString());
                        int multiply = number1 * number2;
                        ans.setText(String.valueOf(multiply));
                    }
                }
        );


        //division
        divid1.setOnClickListener(
                new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        int number1 = Integer.parseInt(num1.getText().toString());
                        int number2 = Integer.parseInt(num2.getText().toString());
                        int divide = number1  / number2;
                        ans.setText(String.valueOf(divide));
                    }
                }
        );

    }
}