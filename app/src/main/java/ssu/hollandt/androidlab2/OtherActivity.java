package ssu.hollandt.androidlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OtherActivity extends AppCompatActivity {
public static final String NAME_KEY="USER_NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Intent newintent=getIntent();
        String name=newintent.getStringExtra(NAME_KEY);
        if(name==null||name.isEmpty())name="Not Bob";
        welcome_text.setText("Welcome, "+name);
    }
}
