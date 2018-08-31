package ssu.hollandt.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    private TextView welcomeText;
    public static final String NAME_KEY = "USER_NAME";
    private Button mainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        welcomeText = findViewById(R.id.welcome_text);



        Intent newIntent = getIntent();
        String name = newIntent.getStringExtra(NAME_KEY);
        mainButton = findViewById(R.id.main_button);



        if (name == null || name.isEmpty()){
            name = "Not Bob";
        }
        welcomeText.setText("Welcome, " + name);


        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                Intent intent = new Intent(OtherActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
