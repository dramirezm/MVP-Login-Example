package com.ramirez.diego.mvplogin.interfaces;

/**
 * Created by Diego on 21/08/2016.
 */
public interface LoginView {

    void showProgress();
    void hideProgress();
    void setErrorUser();
    void setErrorPassword();
    void goToMain();
}
