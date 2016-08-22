package com.ramirez.diego.mvplogin.presenters;

import com.ramirez.diego.mvplogin.interactors.LoginInteractorImpl;
import com.ramirez.diego.mvplogin.interfaces.LoginInteractor;
import com.ramirez.diego.mvplogin.interfaces.LoginPresenter;
import com.ramirez.diego.mvplogin.interfaces.LoginView;
import com.ramirez.diego.mvplogin.interfaces.OnLoginFinishListener;

/**
 * Created by Diego on 21/08/2016.
 */
public class LoginPresenterImpl implements LoginPresenter ,OnLoginFinishListener {

    private LoginView view;
    private LoginInteractorImpl loginInteractor;

    public LoginPresenterImpl(LoginView view) {
        this.view = view;
        loginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void validateUser(String user, String password) {
        if (view != null)
        {
            view.showProgress();
            loginInteractor.validateUser(user,password,this);
        }
    }

    @Override
    public void userNameError() {
        if (view != null){
            view.hideProgress();
            view.setErrorUser();
        }
    }

    @Override
    public void passwordError() {
        if (view != null) {
            view.hideProgress();
            view.setErrorPassword();
        }
    }

    @Override
    public void success() {
        if (view != null) {
            view.hideProgress();
            view.goToMain();
        }
    }
}
