package com.question.alexdoster.questionapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.question.alexdoster.questionapp.R.*;

public class MainActivity extends Activity {

//variables go here
    private Button btnfalse;
    private Button btntrue;
    public TextView lblQuestion;
    private ImageView imgPicture;
    private String question;
    private boolean answer;
    private int pictures;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        /* connect Variables to the interface items */
        btnfalse = (Button) findViewById(id.btnfalse);
        btntrue = (Button) findViewById(id.btntrue);
        lblQuestion = (TextView) findViewById(id.lblQuestion);
        imgPicture = (ImageView) findViewById(id.imgPicture);

        // set Questionaire text
        lblQuestion.setText("What Car Is This");

        // Set  image picture
        imgPicture.setImageResource(drawable.ferrari);



        /* connect Variables to the interface items */
        btnfalse=(Button)findViewById(id.btnfalse);
        btntrue=(Button)findViewById(id.btntrue);
        lblQuestion=(TextView)findViewById(id.lblQuestion);
        imgPicture = (ImageView)findViewById(id.imgPicture);


    }

}
