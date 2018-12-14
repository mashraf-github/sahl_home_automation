package sahl.home_automation.sahl_home_automation.configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoderUtil {
    public String getEncryptedPassword(String pwd) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encoded = encoder.encode(pwd);
        return encoded;
    }
    
    
    public static void main(String[] args) {
		System.out.println(new PasswordEncoderUtil().getEncryptedPassword("234"));
	}
}