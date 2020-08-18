package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class FirstActivity  extends AppCompatActivity {
    Button button;
    Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        onclickButtonLister();




    }


    public void onclickButtonLister(){

        button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(
                new View.OnClickListener(){


                    @Override
                    public void onClick(View view) {
                        showToast();


                        Intent intent =  new Intent(FirstActivity.this,SecondActivity.class);
                        startActivity(intent);
                    }

                    //toast message
                    private void showToast() {
                        LayoutInflater li = getLayoutInflater();
                        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                                findViewById(R.id.custom_toast_layout));

                        Toast toast = new Toast(getApplicationContext());
                        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setView(layout);
                        toast.show();


                    }
                }

        );



    }



}