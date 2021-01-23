package com.loginsystem;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> loginInfo = new HashMap<String, String>();

    IDandPasswords() {

    loginInfo.put("Bro","pizza");
    loginInfo.put("Brometheus","PASSWORD");
    loginInfo.put("Login","123");

}

       public HashMap getLoginInfo() {
        return loginInfo;
  }
}



