package com.ama.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    public Button adminloginButton;
    public Button stuloginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        stuloginButton=findViewById(R.id.stuloginButton);
        adminloginButton=findViewById(R.id.adminloginButton);

        adminloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                adminonclick();
            }
        });

        stuloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stuonclick();
            }
        });
    }

    public void stuonclick(){
        Intent intnt =new Intent(this, MainActivity2.class);
        startActivity(intnt);
        finish();
    }

    public void adminonclick(){

        Intent intnt =new Intent(this, MainActivity.class);
        startActivity(intnt);
        finish();
    }
}