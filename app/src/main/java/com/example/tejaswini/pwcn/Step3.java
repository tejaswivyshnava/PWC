package com.example.tejaswini.pwcn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Step3 extends AppCompatActivity {
    Button b11,b12,b13,b14,b15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b11 =(Button)findViewById(R.id.button9);
        b12 =(Button)findViewById(R.id.button10);
        b13 =(Button)findViewById(R.id.button11);
        b14 =(Button)findViewById(R.id.button12);
        b15 =(Button)findViewById(R.id.butnex2);
        setContentView(R.layout.activity_step3);


        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Step3.this,Step1.class);
                startActivity(i);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Step3.this,Step2.class);
                startActivity(i);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Step3.this,Step3.class);
                startActivity(i);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Step3.this,Step4.class);
                startActivity(i);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Step3.this,Step4.class);
                startActivity(i);
            }
        });
    }
}
