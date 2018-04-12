package com.selle.aline.topquiz.model;

import java.util.Collections;
import java.util.List;

/**
 * Created by Aline de Alexandria e Pasquali Selle - OpenClassrooms on 09/04/2018.
 */
public class QuestionBank {

    private List<Question>mQuestionList;
    private int mNextQuestionIndex;

    public QuestionBank(List<Question> questionList) {
       //Shuffle the question list before storing it
        Collections.shuffle(mQuestionList);
    }

    public Question getQuestion(){
        //Loop over the questions and return  a new one at each call
        if(mNextQuestionIndex == mQuestionList.size()){
            mNextQuestionIndex =0;
        }
        return mQuestionList.get(mNextQuestionIndex++);
    }

}
