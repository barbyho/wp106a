package com.example.textinputlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //inflate all the view button,edittext etc.
        button = (Button)findViewById(R.id.button);
        username = (EditText)findViewById((R.id.username));
        password = (EditText)findViewById((R.id.password));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the date frome the editText
                String user = username.getText().toString();
                String pass = password.getText().toString();

                Toast.makeText(MainActivity.this,"Username is :"+
                        user+"\n Password is :"+pass+"",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
