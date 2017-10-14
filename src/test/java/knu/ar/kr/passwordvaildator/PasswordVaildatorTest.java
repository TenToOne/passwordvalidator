package knu.ar.kr.passwordvaildator;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordVaildatorTest {

    @Test
    public void 최소길이가지정값보다크면테스트성공() {
        String testPassword = "abcdef";
        knu.ar.kr.passwordvaildator.PasswordVaildator passwordVaildator = new knu.ar.kr.passwordvaildator.PasswordVaildator(5,10);
        boolean result = passwordVaildator.vaildate(testPassword);
        assertTrue(result);
    }

    @Test
    public void 최대길이가지정값보다작으면테스트성공(){
        String testPassword = "abcdef";
        knu.ar.kr.passwordvaildator.PasswordVaildator passwordVaildator = new knu.ar.kr.passwordvaildator.PasswordVaildator(5,10);
        boolean result = passwordVaildator.vaildate(testPassword);
        assertTrue(result);
    }

    @Test
    public void 최대길이가지정값보다크면테스트실패(){
        String testPassword = "abcdef";
        knu.ar.kr.passwordvaildator.PasswordVaildator passwordVaildator = new knu.ar.kr.passwordvaildator.PasswordVaildator(2,4);
        boolean result = passwordVaildator.vaildate(testPassword);
        assertFalse(result);
    }

    @Test
    public void 패스워드가널이면테스트실패(){
        String testPassword = null;
        knu.ar.kr.passwordvaildator.PasswordVaildator passwordVaildator = new knu.ar.kr.passwordvaildator.PasswordVaildator(5,10);
        boolean result = passwordVaildator.checkNull(testPassword);
        assertFalse(result);
    }

    @Test
    public void 패스워드가비어있으면테스트실패(){
        String testPassword = "";
        knu.ar.kr.passwordvaildator.PasswordVaildator passwordVaildator = new knu.ar.kr.passwordvaildator.PasswordVaildator(5,10);
        boolean result = passwordVaildator.checkNull(testPassword);
        assertFalse(result);
    }

    @Test
    public void 패스워드가ADMIN이면테스트성공(){
        String testPassword = "ADMIN";
        knu.ar.kr.passwordvaildator.PasswordVaildator passwordVaildator = new knu.ar.kr.passwordvaildator.PasswordVaildator(5,10);
        boolean result = passwordVaildator.admin(testPassword);
        assertTrue(result);
    }
}
