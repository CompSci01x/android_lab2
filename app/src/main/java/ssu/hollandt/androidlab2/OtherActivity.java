package ssu.hollandt.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.*;

public class OtherActivity extends AppCompatActivity {

    private Button navigateButon;
    private Button returnToMainButton;
    private TextView navigateText;
    private TextView welcomeText;

    public static final String NAME_KEY = "USER_NAME";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Intent newIntent = getIntent();
        String name = newIntent.getStringExtra(NAME_KEY);
        if(name == null || name.isEmpty()) {
            name = "Not Bob";
        }

        welcomeText.<EditText>findViewById(R.id.welcome_text);
        welcomeText.setText("Welcome, " + name);
        returnToMainButton = findViewById(R.id.return_button);
        returnToMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherActivity.this, MainActivity.class);


                startActivity(intent);
            }
        });
    }
}
