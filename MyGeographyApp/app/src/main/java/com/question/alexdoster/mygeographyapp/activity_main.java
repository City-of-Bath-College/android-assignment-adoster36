package com.question.alexdoster.mygeographyapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class activity_main extends Activity {
    //variables go here
    private Button btnTrue;
    private Button btnFalse;
    private TextView lblQuestion;
    private ImageView imgPicture;


    private List<QuestionObject> questions;
    private int index;
    private QuestionObject currentQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.canadian_flag);



            // connect variables to interface items
            btnTrue=(Button)findViewById(R.id.btnTrue);
            btnFalse=(Button)findViewById(R.id.btnFalse);
            lblQuestion =(TextView)findViewById(R.id.lblQuestion);
            imgPicture=(ImageView)findViewById(R.id.imgPicture);


        setUpQuestions();
        index = 0;

        setUpSingleQuestion();

            //onclick listners
            btnTrue.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    determineIfUserIsCorrect(true);
                }
            });
            //onclick listners
            btnFalse.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    determineIfUserIsCorrect(false);
                }
            });

        }



    private void setUpQuestions(){

        questions = new ArrayList<>();

        QuestionObject q1 = new QuestionObject("is this the canadian flag", true, R.drawable.canadianflag);
        questions.add(q1);

        QuestionObject q2 = new QuestionObject("is the eiffel tower in france",true,R.drawable.eiffeltower );
        questions.add(q2);

        QuestionObject q3 = new QuestionObject("have you ever flown on a jumbojet",false,R.drawable.boeing747);
        questions.add (q3);

        QuestionObject q4 = new QuestionObject("is the leaning tower of pisa in germany",false,R.drawable.leaningtowerofpisa);
        questions.add(q4);

        QuestionObject q5 =new QuestionObject("is the car from the transformers film a real car",true,R.drawable.bumblebee);
        questions.add(q5);

        QuestionObject q6 = new QuestionObject("have you ever flown on the airbus a380",false, R.drawable.airbusa380);
        questions.add(q6);

        QuestionObject q7 = new QuestionObject("is this aircraft russian", true,R.drawable.russiancargoplane);
        questions.add(q7);

        QuestionObject q8 = new QuestionObject(" is this payment system known as apple pay",true,R.drawable.applepay);
        questions.add(q8);

        QuestionObject q9 = new QuestionObject("is this a nissan skyline nismo GTR",true,R.drawable.nissanskylinenismo);
        questions.add(q9);

        QuestionObject q10 = new QuestionObject("is mercedes a german car",true,R.drawable.mercedes );
        questions.add(q10);






    }


    private void setUpSingleQuestion() {

        currentQuestion = questions.get(index);


        //set geography question
        lblQuestion.setText(currentQuestion.getquestion());

        //set image Picture
        imgPicture.setImageResource(currentQuestion.getPicture());

        //on
        index++;
        //todo check if that index is too big
    }



    private void determineIfUserIsCorrect(boolean theirAnswer){

        //you are wrong!
        //e.g. they pick true, answer is true -> they are correct!
//e.g. they pick false, answer is false -> they are wrong
        if (theirAnswer == currentQuestion.isAnswer()){

        } else {
            Toast.makeText(activity_main.this, "wrong", Toast.LENGTH_SHORT).show();
        }
        {
             Toast.makeText(activity_main.this,"Correct",Toast.LENGTH_SHORT) .show();
        }



        setUpSingleQuestion();

    }



}
