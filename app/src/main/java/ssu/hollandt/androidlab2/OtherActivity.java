package ssu.hollandt.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    public static final String NAME_KEY = "USER_NAME";
    public TextView welcomeText;
    public Button returnToMainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Intent newIntent = getIntent();
        String name = newIntent.getStringExtra(NAME_KEY);
        if(name == null || name.isEmpty()) {
            name = "Not Bob";
        }
        welcomeText = findViewById(R.id.welcome_text);
        welcomeText.setText("Welcome, " + name);
        returnToMainButton = findViewById(R.id.return_to_main_button);
        returnToMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OtherActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
