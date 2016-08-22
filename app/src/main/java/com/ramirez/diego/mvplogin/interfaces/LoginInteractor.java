package com.ramirez.diego.mvplogin.interfaces;

/**
 * Created by Diego on 21/08/2016.
 */
public interface LoginInteractor {

    void validateUser(String user,String password,OnLoginFinishListener listener);
}
