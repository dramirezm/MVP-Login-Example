package com.ramirez.diego.mvplogin.interfaces;

/**
 * Created by Diego on 21/08/2016.
 */
public interface OnLoginFinishListener {

    void userNameError();
    void passwordError();
    void success();
}
