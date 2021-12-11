package com.example.digitalrestaurant.Authentications;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.digitalrestaurant.Authentications.LoginPage;
import com.example.digitalrestaurant.Authentications.SignupPage;
import com.example.digitalrestaurant.Menu;
import com.example.digitalrestaurant.R;

public class Customer extends AppCompatActivity //implements AdapterView.OnItemSelectedListener
                                                         {


    TextView loginText1,signupText1;;




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
        setContentView(R.layout.activity_main);



        loginText1= findViewById(R.id.customerloginBut);
        signupText1= findViewById(R.id.customersignupBut);




        loginText1.setOnClickListener(v -> click1(LoginPage.class));

        signupText1.setOnClickListener(v -> click1(SignupPage.class));

    }

    public void click1(Object x){
        Intent intent=new Intent(this, (Class<?>) x);

        startActivity(intent);
        overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);

    }



}


