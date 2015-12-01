package com.question.alexdoster.mygeographyapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

public class HighScoreActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score);
        class HighscoreAdapter extends ArrayAdapter<HighScoreActivity> {

            public HighscoreAdapter(List<HighScoreObject> items) {
                super(HighScoreActivity.this, 0);
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                if (convertView == null) {
                    convertView = getLayoutInflater().inflate(
                            R.layout.row_highscore, null);
                }

                //get the highscore object for the row we're looking at
                HighScoreObject highscore;
               // highscore = 'highscores'.get(position);

                return convertView;
            }// end get view

        }// end adapter class

        }


}
