package ssu.hollandt.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    private TextView welcomeText;
    private Button navigateButton;

    public static final String NAME_KEY = "USER_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        welcomeText = (TextView)findViewById(R.id.name_edit_text);
        Intent newIntent = getIntent();
        String name = newIntent.getStringExtra(NAME_KEY);
        navigateButton = (Button)findViewById(R.id.navigate_button);

        if (name == null || name.isEmpty()) {
            name = "Not Bob";

        }

        welcomeText.setText("Welcome, " + name);

        navigateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(OtherActivity.this, MainActivity.class);

                startActivity(intent);
            }
        });



    }
}
