package com.ramirez.diego.mvplogin.interactors;

import android.os.Handler;

import com.ramirez.diego.mvplogin.interfaces.LoginInteractor;
import com.ramirez.diego.mvplogin.interfaces.OnLoginFinishListener;

/**
 * Created by Diego on 21/08/2016.
 */
public class LoginInteractorImpl implements LoginInteractor {
    @Override
    public void validateUser(final String user, final String password, final OnLoginFinishListener listener) {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                if (!user.equals("")&& !password.equals(""))
                {
                    listener.success();
                }
                else
                {
                    if (user.equals(""))
                    {
                        listener.userNameError();
                    }
                    if (password.equals(""))
                    {
                        listener.passwordError();
                    }
                }
            }
        }, 2000);
    }
}
