package com.question.alexdoster.mygeographyapp;

/**
 * Created by alexdoster on 18/11/15.
 */
public class QuestionObject {

    private String question;
    private boolean answer;
    private int picture;


    public QuestionObject(String question, boolean answer, int picture){

      this.question=question;
      this.answer=answer;
      this.picture=picture;
    }


    public String getquestion() {
        return question;
    }

    public boolean isAnswer(){
        return answer;
    }

    public int getPicture(){
        return picture;
    }

    public static int get(int index) {
        return index;
    }
}
