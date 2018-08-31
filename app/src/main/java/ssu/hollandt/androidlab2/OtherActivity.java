package ssu.hollandt.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    public static final String NAME_KEY = "USER_NAME";
    private TextView welcomeText;

    private Button navigateButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Intent newIntent = getIntent();
        String name = newIntent.getStringExtra(NAME_KEY);
        welcomeText = findViewById(R.id.welcome_text);

        navigateButton2 = findViewById(R.id.navigate_button2);


        if(name == null || name.isEmpty()) {
            name = "Not Bob";
        }

        welcomeText.setText("Welcome, " + name);

        navigateButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherActivity.this,MainActivity.class);

                startActivity(intent);

            }
        });

    }
}
