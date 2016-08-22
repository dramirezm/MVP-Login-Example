package com.ramirez.diego.mvplogin.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.ramirez.diego.mvplogin.R;
import com.ramirez.diego.mvplogin.interfaces.LoginPresenter;
import com.ramirez.diego.mvplogin.interfaces.LoginView;
import com.ramirez.diego.mvplogin.presenters.LoginPresenterImpl;

public class Login extends AppCompatActivity implements LoginView {

    EditText edtUser;
    EditText edtPassword;
    ProgressBar loading;
    private LoginPresenterImpl loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        edtUser = (EditText) findViewById(R.id.editText);
        edtPassword = (EditText) findViewById(R.id.editText2);
        loading = (ProgressBar) findViewById(R.id.progressBar);

        loginPresenter = new LoginPresenterImpl(this);
    }

    @Override
    public void showProgress() {
        loading.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        loading.setVisibility(View.GONE);
    }

    @Override
    public void setErrorUser() {
        edtUser.setError("User Error");
    }

    @Override
    public void setErrorPassword() {
        edtPassword.setError("Password Error");
    }

    @Override
    public void goToMain() {
       startActivity(new Intent(Login.this,Home.class));
    }

    public void validation(View view)
    {
        loginPresenter.validateUser(edtUser.getText().toString(),edtPassword.getText().toString());
    }
}
