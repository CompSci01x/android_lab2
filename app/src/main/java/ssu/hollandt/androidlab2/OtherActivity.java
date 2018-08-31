package ssu.hollandt.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    public static final String NAME_KEY = "USER_NAME";
    private TextView welcomeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //get intent used to begin this activity
        Intent newIntent = getIntent();
        //retrieve the VALUE stored in the EXTRAS using the same KEY
        //that we used to insert it in MainActivity
        String name = newIntent.getStringExtra(NAME_KEY);

        //protect ourselves from a user not entering a name
        if (name == null || name.isEmpty()){
            name = "Not Bob";
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        welcomeText = findViewById(R.id.welcome_text);
        welcomeText.setText("Welcome, " + name);
    }
}
