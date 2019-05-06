package com.atiqrs.apidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.atiqrs.apidemo.RegModel.RegistrationResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUp extends AppCompatActivity {

    EditText firstName,lastName,email,password,Mobile;
    Button Registration,SignINonSignupPage;
    ProgressBar progressBar;

    //Create Object Interface class
    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        init();
        apiInterface = AppConfig.getRetrofit().create(ApiInterface.class);


        Registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registration();
            }
        });
    }

    private void registration() {

        String fname = firstName.getText().toString();
        String lname = lastName.getText().toString();
        String mail = email.getText().toString();
        String pass = password.getText().toString();
        String mobile = Mobile.getText().toString();


        apiInterface.postData("BD@task987",fname,lname,mail,pass,mobile).enqueue(new Callback<RegistrationResponse>() {
            @Override
            public void onResponse(Call<RegistrationResponse> call, Response<RegistrationResponse> response) {
                Toast.makeText(SignUp.this, "Succesfull", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<RegistrationResponse> call, Throwable t) {
                Toast.makeText(SignUp.this, "Something Wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void init() {
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        SignINonSignupPage = findViewById(R.id.SignInonSignupPage);
        Registration = findViewById(R.id.registration);
        Mobile = findViewById(R.id.mobile);

        progressBar = findViewById(R.id.progressbarId);
    }
}
