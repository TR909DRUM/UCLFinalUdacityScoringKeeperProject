package android.example.uclfinaludacityscoringkeeperproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int RealMadridScore = 0;
int foulsBarcelona = 0;
int foulsRealMadrid = 0;
int BarcelonaScore = 0;
String goalsScoredByRm = "";
String goalsScoredByBarcelona = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForRM(int score) {
        TextView scoreView = (TextView) findViewById(R.id.real_madrid_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForBarcelona(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barcelona_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayGoalsScoredByRM(String goals){
        TextView goalsView = (TextView) findViewById(R.id.goals_scored_by_rm);
                goalsView.setText(String.valueOf(goals));
    }
    public void displayGoalsScoredByBarcelona(String goals){
        TextView goalsView = (TextView) findViewById(R.id.goals_scored_by_barcelona);
        goalsView.setText(String.valueOf(goals));
    }
    public void displayFoulsB(int fouls){
        TextView goalsView = (TextView) findViewById(R.id.fouls_barcelona);
        goalsView.setText(String.valueOf(fouls));
    }
    public void displayFoulsRm(int fouls){
        TextView goalsView = (TextView) findViewById(R.id.fouls_rm);
        goalsView.setText(String.valueOf(fouls));
    }
    public void increaseGoalsMessi(View view){
        BarcelonaScore = BarcelonaScore + 1;
        goalsScoredByBarcelona = goalsScoredByBarcelona + "Messi ";
        displayForBarcelona(BarcelonaScore);
        displayGoalsScoredByBarcelona(goalsScoredByBarcelona);
    }
    public void increaseGoalsSuarez(View view){
        BarcelonaScore = BarcelonaScore + 1;
        goalsScoredByBarcelona = goalsScoredByBarcelona + "Suarez ";
        displayForBarcelona(BarcelonaScore);
        displayGoalsScoredByBarcelona(goalsScoredByBarcelona);
    }
    public void increaseGoalsDembele(View view){
        BarcelonaScore = BarcelonaScore + 1;
        goalsScoredByBarcelona = goalsScoredByBarcelona + "Dembele ";
        displayForBarcelona(BarcelonaScore);
        displayGoalsScoredByBarcelona(goalsScoredByBarcelona);
    }
    public void increaseGoalsBenzema(View view){
        RealMadridScore = RealMadridScore + 1;
        goalsScoredByRm = goalsScoredByRm + "Benzema ";
        displayForRM(RealMadridScore);
        displayGoalsScoredByRM(goalsScoredByRm);
    }
    public void increaseGoalsVinicius(View view){
        RealMadridScore = RealMadridScore + 1;
        goalsScoredByRm = goalsScoredByRm + "Vinicius ";
        displayForRM(RealMadridScore);
        displayGoalsScoredByRM(goalsScoredByRm);
    }
    public void increaseGoalsBale(View view){
        RealMadridScore = RealMadridScore + 1;
        goalsScoredByRm = goalsScoredByRm + "Bale ";
        displayForRM(RealMadridScore);
        displayGoalsScoredByRM(goalsScoredByRm);
    }
    public void increaseFouls(View view){
        foulsBarcelona = foulsBarcelona + 1;
        displayFoulsB(foulsBarcelona);
    }
    public void increaseFoulsRM(View view){
        foulsRealMadrid = foulsRealMadrid + 1;
        displayFoulsRm(foulsRealMadrid);
    }
    public void resetMethod(View view){
        goalsScoredByBarcelona = "";
        goalsScoredByRm = "";
        foulsBarcelona = 0;
        RealMadridScore = 0;
        BarcelonaScore = 0;
        foulsRealMadrid = 0;
        displayGoalsScoredByBarcelona(goalsScoredByBarcelona);
        displayGoalsScoredByRM(goalsScoredByRm);
        displayForBarcelona(BarcelonaScore);
        displayForRM(RealMadridScore);
        displayFoulsB(foulsBarcelona);
        displayFoulsRm(foulsRealMadrid);
    }

}
