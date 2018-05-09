package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA=0,scoreB=0;
    public void add3ForA(View view)
    {
        scoreA+=3;
        displayScoreA(scoreA);
    }
    public void add2ForA(View view)
    {
        scoreA+=2;
        displayScoreA(scoreA);
    }
    public void add1ForA(View view)
    {
        scoreA+=1;
        displayScoreA(scoreA);
    }
    public void displayScoreA(int score){
        TextView A_score=(TextView) findViewById(R.id.team_a_score);
        A_score.setText(String.valueOf(score));
    }

    public void add3ForB(View view)
    {
        scoreB+=3;
        displayScoreB(scoreB);
    }
    public void add2ForB(View view)
    {
        scoreB+=2;
        displayScoreB(scoreB);
    }
    public void add1ForB(View view)
    {
        scoreB+=1;
        displayScoreB(scoreB);
    }
    public void displayScoreB(int score){
        TextView B_score=(TextView) findViewById(R.id.team_b_score);
        B_score.setText(String.valueOf(score));
    }
    public void reset(View view){
        scoreA=scoreB=0;
        displayScoreB(scoreB);
        displayScoreA(scoreA);
    }
}
