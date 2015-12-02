package com.question.alexdoster.mygeographyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntroductionActivity extends Activity {


    private Button btnAbout;
    private Button btnplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        btnAbout = (Button)findViewById(R.id.btnabout);
        btnplay = (Button)findViewById(R.id.btnplay);

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(IntroductionActivity.this, ProfileActivity.class);
                startActivity(i);

            }
        });


        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(IntroductionActivity.this, activity_main.class);
                startActivity(i);

            }
        });


    }


}
