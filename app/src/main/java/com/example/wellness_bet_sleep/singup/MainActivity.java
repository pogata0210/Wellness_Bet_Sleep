package com.example.wellness_bet_sleep.singup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.EditText;



import com.example.wellness_bet_sleep.R;

public class MainActivity extends AppCompatActivity {

    private  EditText name, password;
    private CardView loginButton;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.name_text);
        password= (EditText) findViewById(R.id.password_text);
        loginButton = (CardView)findViewById(R.id.cardView);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               validate(name.getText().toString(), password.getText().toString());
            }
        });
    }


    private void validate(String username, String userPassword){
        if((username.equals("Admin")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, bottomNavigatoinActivity.class);
            startActivity(intent);
        }else{
            counter--;

            if (counter == 0){
                loginButton.setEnabled(false);
            }

        }

    }
}
