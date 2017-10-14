package knu.ar.kr.passwordvaildator;

import com.sun.istack.internal.localization.NullLocalizable;
import org.apache.commons.lang3.ObjectUtils;

public class PasswordVaildator {

    private int minLength;
    private int maxLength;

    public PasswordVaildator(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    public boolean vaildate(String password){
        int passwrodLength = password.length();
        if(passwrodLength<minLength||passwrodLength>maxLength) {
            return false;
        }
        return true;
    }

    public boolean checkNull(String password){
        if(password==null){
           return false;
        }
        else if(password.isEmpty()){
            return false;
        }
        return true;
    }

    public boolean admin(String password){
        if(password.equals("ADMIN")){
            return true;
        }
        return false;
    }
}
