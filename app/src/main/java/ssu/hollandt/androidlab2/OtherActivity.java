package ssu.hollandt.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity
{

    public static final String NAME_KEY = "USER_NAME";
    private TextView welcomeText;
    //step 11 part b, declare button variable
    private Button otherActivityNavigationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //get intent used to begin this activity
        final Intent newIntent = getIntent();
        //retrieve the VALUE stored in the EXTRAS using the same KEY
        //that we used to insert it in MainActivity
        String name = newIntent.getStringExtra(NAME_KEY);

        //protect ourselves from a user not entering a name
        if (name == null || name.isEmpty())
            name = "Not Bob";


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        //Step 10. put up a welcome text to display to show information passed by the intent
        //need to both declare a welcome text variable at the top, and initialize with
        //findViewById
        welcomeText = findViewById(R.id.welcome_text);
        welcomeText.setText("Welcome, " + name);


        //Step 11 c , assign the button to the variable using findViewById
        otherActivityNavigationButton = findViewById(R.id.other_activity_navigation_button);

        otherActivityNavigationButton.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View view)
                            {
                                Intent intent = new Intent(OtherActivity.this, MainActivity.class);
                                startActivity(intent);
                            }
                        }
                );
    }


}
