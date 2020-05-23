package com.example.fblogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email =findViewById(R.id.email);
        password=findViewById(R.id.password);
    }
    public void google(View view){


    }
    public void twitter(View view){


    }
    public void login(View view){


    }
    public void createaccount(View view){
    Intent i = new Intent(this,newaccount.class);

    }


}
