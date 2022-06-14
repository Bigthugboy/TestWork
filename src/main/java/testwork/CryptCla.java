package testwork;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class CryptCla {

    private String password = "pass123";
    private String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());

}
