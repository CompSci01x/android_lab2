package ssu.hollandt.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class OtherActivity extends AppCompatActivity {

    public static final String NAME_KEY = "USER_NAME";
    private TextView welcomeText;
    private Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        welcomeText = findViewById(R.id.welcome_text);
        returnButton = findViewById(R.id.return_button);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Intent newIntent = getIntent();
        String name = newIntent.getStringExtra(NAME_KEY);
        if(name == null || name.isEmpty())
            name = "not Bob";
        welcomeText.setText("Welcome, " + name);



    }
}
