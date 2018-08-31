package ssu.hollandt.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class OtherActivity extends AppCompatActivity {

    private TextView welcomeText;
    public static final String NAME_KEY = "USER_NAME";
    private Button navButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Intent newIntent = getIntent();
        String name = newIntent.getStringExtra(NAME_KEY);

        if(name == null || name.isEmpty()) {
            name = "Not Bob";
        }

        welcomeText = (TextView)findViewById(R.id.welcome_text);

        welcomeText.setText("Welcome, " + name);

        navButton = (Button)findViewById(R.id.other_button);

        navButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(OtherActivity.this,MainActivity.class);

                startActivity(intent);
            }
        });

    }


}
