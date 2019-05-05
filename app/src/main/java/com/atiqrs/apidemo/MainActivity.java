package com.atiqrs.apidemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.atiqrs.apidemo.Model.JsonResponse;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView MidId;
    TextView fName,lName,Gender,username, Email, Mobile;
    Button refresh, gotoSignin, getGotoSignup;

    //Create Object Interface class
    ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MidId = findViewById(R.id.MidId);
        fName = findViewById(R.id.fName);
        lName = findViewById(R.id.lName);
        Gender = findViewById(R.id.Gender);
        username = findViewById(R.id.username);
        Email = findViewById(R.id.Email);
        Mobile = findViewById(R.id.Mobile);
        refresh = findViewById(R.id.refresh);
        gotoSignin = findViewById(R.id.gotoSignin);
        getGotoSignup = findViewById(R.id.gotoSignup);


        apiInterface = AppConfig.getRetrofit().create(ApiInterface.class);
        refresh.setOnClickListener(this);
        gotoSignin.setOnClickListener(this);
        getGotoSignup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.refresh){
            getJsonData();
        }
        if (v.getId() == R.id.gotoSignin){
            startActivity(new Intent(getApplicationContext(),SignIn.class));
        }
        if (v.getId() == R.id.gotoSignup){
            startActivity(new Intent(getApplicationContext(),SignUp.class));
        }
    }

    private void getJsonData() {
        apiInterface.getData().enqueue(new Callback<JsonResponse>() {
            @Override
            public void onResponse(Call<JsonResponse> call, Response<JsonResponse> response) {

                String picApi = response.body().getResults().get(0).getPicture().getThumbnail();
                String FNameApi = response.body().getResults().get(0).getName().getFirst();
                String LNameApi = response.body().getResults().get(0).getName().getLast();
                String GenderApi = response.body().getResults().get(0).getGender();
                String UsernameApi = response.body().getResults().get(0).getLogin().getUsername();
                String EmailApi = response.body().getResults().get(0).getEmail();
                String MobileApi = response.body().getResults().get(0).getPhone();

                Picasso.get().load(picApi).into(MidId);
                fName.setText(FNameApi);
                lName.setText(LNameApi);
                Gender.setText(GenderApi);
                username.setText(UsernameApi);
                Email.setText(EmailApi);
                Mobile.setText(MobileApi);
            }

            @Override
            public void onFailure(Call<JsonResponse> call, Throwable t) {

            }
        });
    }

}
