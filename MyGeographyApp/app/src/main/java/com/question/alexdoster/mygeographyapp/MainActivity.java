package com.question.alexdoster.mygeographyapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    //variables go here
    private Button btnTrue;
    private Button btnFalse;
    private TextView lblQuestion;
    private ImageView imgPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // connect variables to interface items
        btnTrue=(Button)findViewById(R.id.btnTrue);
        btnFalse=(Button)findViewById(R.id.btnFalse);
        lblQuestion =(TextView)findViewById(R.id.lblQuestion);
        imgPicture=(ImageView)findViewById(R.id.imgPicture);

        //set geography question
        lblQuestion.setText("is this the flag for Canada");

        //set image Picture
        imgPicture.setImageResource(R.drawable.canadianflag);

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

}
}
