package com.example.aaron.classselection3;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

private EditText username;
private EditText userPassword;
private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtLogin = (EditText) findViewById(R.id.loginTxt);
        final EditText passwordLogin = (EditText) findViewById(R.id.passWord);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login(txtLogin.getText().toString(), passwordLogin.getText().toString());
            }
        });

    }

    public void login(String s, String toString) {

        if ((username.equals("Erin") && (userPassword.equals("password")))) {
            Intent intent = new Intent(MainActivity.this, loginSuccess.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
        }
    }
}
