package org.myactivity.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent passedIntent=getIntent();
        if(passedIntent!=null) {
            String name = passedIntent.getStringExtra("Name");
            String age = passedIntent.getStringExtra("Age");
            Toast.makeText(getApplicationContext(), "Student info : " + name + ", " + age, Toast.LENGTH_LONG).show();
        }

        Button button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                finish();
            }
        });
    }
}
