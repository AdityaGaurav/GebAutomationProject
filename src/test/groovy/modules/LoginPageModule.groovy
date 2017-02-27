package modules

import geb.Module

/**
 * Created by adityag on 2/23/17.
 */
class LoginPageModule extends Module {

    static content = {
        loginLink { $('._2k0gmP[href="/account/login?ret=/"]') }
        enterUserID { $('._39M2dM input[type="text"]') }
        enterPassword { $('._39M2dM input[type="password"]') }
        loginButton { $('._2AkmmA._7UHT_c') }
    }
}
