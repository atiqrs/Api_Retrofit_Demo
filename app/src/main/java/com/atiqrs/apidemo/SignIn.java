package com.atiqrs.apidemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.atiqrs.apidemo.QueryModel.SignInResponse;

import java.util.zip.Inflater;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignIn extends AppCompatActivity {

    EditText username,password;
    Button signIn;

    //Create Object Interface class
    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        
        username = findViewById(R.id.loginUsername);
        password = findViewById(R.id.loginPass);
        signIn = findViewById(R.id.logIn);

        apiInterface = AppConfig.getRetrofit().create(ApiInterface.class);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitApiForLogin();
            }
        });
        
        
        
    }

    private void hitApiForLogin() {
        String getUserName = username.getText().toString();
        String getPassword = password.getText().toString();

        apiInterface.queryData("BD@task987",getUserName,getPassword).enqueue(new Callback<SignInResponse>() {
            @Override
            public void onResponse(Call<SignInResponse> call, Response<SignInResponse> response) {

                if (response.body().getResponse().getSuccess() == "Ok") {
                    Toast.makeText(SignIn.this, "Ok", Toast.LENGTH_SHORT).show();

                    String firstname = response.body().getResponse().getData().getFirstname();
                    String lastname = response.body().getResponse().getData().getLastname();
                    String email = response.body().getResponse().getData().getEmail();

                    Toast.makeText(SignIn.this, firstname, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),HomePage.class);
                    intent.putExtra("first",firstname);
                    intent.putExtra("last",lastname);
                    intent.putExtra("email",email);
                    startActivity(intent);
                }

                Toast.makeText(SignIn.this, "not ok", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<SignInResponse> call, Throwable t) {

            }
        });

    }
}
