package com.kaksha.karanbagle.kaksha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
   private EditText username;
   private EditText password;
   private Button Login;





    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username=(EditText) findViewById(R.id.etText);
        password=(EditText) findViewById(R.id.etPassword);
        Login=(Button) findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(username.getText().toString(),password.getText().toString());
            }
        });

    }
    private void validate (String username, String userPassword){
        if(username.equals("Aadhar")&& userPassword.equals("1234")) {
            Intent intent = new Intent(LoginActivity.this, About1.class);
            startActivity(intent);
        }
        else{
            Login.setEnabled(false);
        }
    }
}
