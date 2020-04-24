package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

      EditText t1,t2,t3,t4;
      Button b;
      String s1,s2,s3,s4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.e1);
        t2=findViewById(R.id.e2);
        t3=findViewById(R.id.e3);
        t4=findViewById(R.id.e4);
        b=findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=t1.getText().toString();
                s2=t2.getText().toString();
                s3=t3.getText().toString();
                s4=t4.getText().toString();
                if(s1.equals(""))
                {
                    t1.setError("bank1");
                }
                if(s2.equals(""))
                {
                    t2.setError("bank2");
                }
                if(s3.equals(""))
                {
                    t3.setError("bank3");
                }
                if(s4.equals(""))
                {
                    t4.setError("bank4");
                }

            }
        });




    }

    }




