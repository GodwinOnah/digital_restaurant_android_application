package com.example.digitalrestaurant.Authentications;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.digitalrestaurant.Database.DatabaseHelper;
import com.example.digitalrestaurant.R;

public class ForgotPassword extends AppCompatActivity {

    Button checkUser,signup;
    EditText enterEmail,enterMaidenName;

    TextView userExistText;

    DatabaseHelper checker;


    @Override
    public void onBackPressed() {




        Intent intent5 =new Intent(getApplicationContext(), IntroPage.class);

        intent5.putExtra("Exit",true);
        startActivity(intent5);

        finish();
        System.exit(0);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        checkUser=findViewById(R.id.checkUser);
        enterEmail=findViewById(R.id.enterEmail);
        signup=findViewById(R.id.signupAgain);
        userExistText=findViewById(R.id.userExistText);
        enterMaidenName=findViewById(R.id.enterMaidenName);

        checker=new DatabaseHelper(this);

        signupAgain();

        checkUser();
    }

    public void checkUser() {

        checkUser.setOnClickListener(v -> {

            Boolean yes=checker.forgotPassordChecker(enterEmail.getText().toString(),enterMaidenName.getText().toString());

            if(yes==true){

                Intent intent=new Intent(this,NewPassword.class);
                intent.putExtra("emailSentForPass",enterEmail.getText().toString());
                startActivity(intent);
            }

            else{   setTextVisible(v);
                Toast.makeText(this, "You can creat a new account", Toast.LENGTH_SHORT).show();}


        });
    }

    public void signupAgain() {

        signup.setOnClickListener(v -> {
            Intent intent=new Intent(this,SignupPage.class);
            startActivity(intent);

        });
    }

    void setTextVisible(View view){
        userExistText.setVisibility(View.VISIBLE);

    }

}