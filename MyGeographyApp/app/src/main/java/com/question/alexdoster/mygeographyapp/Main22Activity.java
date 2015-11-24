package com.question.alexdoster.mygeographyapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends Activity {

    //variables go here
    private Button btnTrue;
    private Button btnFalse;
    private TextView lblQuestion;
    private ImageView imgPicture;

    private List<QuestionObject>questions;

    private QuestionObject currentQuestions;
    private int index;
    private int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // connect variables to interface items
        btnTrue = (Button) findViewById(R.id.btnTrue);
        btnFalse = (Button) findViewById(R.id.btnFalse);
        lblQuestion = (TextView) findViewById(R.id.lblQuestion);
        imgPicture = (ImageView) findViewById(R.id.imgPicture);

        //set geography question
        lblQuestion.setText("is this the flag for Canada");

        //set image Picture
        imgPicture.setImageResource(R.drawable.canadianflag);

        index = 0;
        score = 0;

        //onclick listners
        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "correct!!", Toast.LENGTH_SHORT).show();
            }
        });
        //onclick listners
        btnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "wrong!!", Toast.LENGTH_SHORT).show();


            }
        });
        generateQuestions();

    }
    private void generateQuestions(){

        questions=new ArrayList<>();

        questions.add(new QuestionObject("Is this the flag of canada,true,R.drawable.canadianflag "));
        questions.add(new QuestionObject("Is this Aircraft an airbusa380,false,R.drawable.airbusa380"));
        questions.add(new QuestionObject("Is this payment sytem known as apple pay,true,R.drawable.applepay"));
        questions.add(new QuestionObject("Is this aircraft a boeing747,false,R.drawable.boeing747"));
        questions.add(new QuestionObject("Where is the eiffeltower,true,R.drawable.eiffeltower"));
        questions.add(new QuestionObject("Is this plane made in russia,false,R.drawable.russiancargoplane"));
        questions.add(new QuestionObject("who makes this car,true,R.drawable.nissanskylinenismo"));
        questions.add(new QuestionObject("which is the film that bumblebee the car starred in,false,R.drawable.bumblebee"));
        questions.add(new QuestionObject("who makes this car,true,R.drawable.mercedes"));
        questions.add(new QuestionObject("what is this tower called,false,R.drawable.leaningtowerofpisa"));

    }

    private void setUpQuestion(){

        currentQuestions=questions.get(index);

        lblQuestion.setText(currentQuestions.getquestion());
        imgPicture.setImageResource(currentQuestions.getPicture());

        index++;
    }
    private void determineButtonPress(boolean answer){

        boolean expectedAnswer = currentQuestions.isAnswer();

        if (answer == expectedAnswer){
            //you were right!!
            Toast.makeText(MainActivity.this,"correct", Toast.LENGTH_SHORT).show();
        }else{
            // you were wrong!!

            Toast.makeText(MainActivity.this,"correct", Toast.LENGTH_SHORT).show();
            score++;

            return super.onOptionsItemSelected(item);
        }
    }