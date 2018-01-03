package com.example.circlebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import at.markushi.ui.CircleButton;

public class MainActivity extends AppCompatActivity {

    CircleButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (CircleButton)  findViewById(R.id.circlebutton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Circle Button Clicked.",Toast.LENGTH_LONG).show();
            }
        });
    }
}
