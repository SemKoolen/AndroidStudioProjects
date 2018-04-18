package com.bignerrannch.android.geoquiz;

/**
 * Created by semko on 3/14/2018.
 */

public class Question {

    private int mTextRedId;
    private boolean mAnswerTrue;


    public Question(int textRedId, boolean answerTrue) {
        mTextRedId = textRedId;
        mAnswerTrue = answerTrue;
    }

    public int getTextRedId() {
        return mTextRedId;
    }

    public void setTextRedId(int textRedId) {
        mTextRedId = textRedId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
