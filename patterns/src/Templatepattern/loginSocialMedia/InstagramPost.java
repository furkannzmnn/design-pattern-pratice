package Templatepattern.loginSocialMedia;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class InstagramPost extends Network{


    Logger logger = Logger.getLogger(InstagramPost.class.getName());

    public InstagramPost(String email, String password) {
       this.email = email;
       this.password = password;
    }

    @Override
    protected boolean logIn(String email, String password) {
        if (isCorrectInfo(email,password)) {
            logger.info("SUCCES LOGIN");
            return true;
        }
        logger.warning("INCORRECT LOGIN DATA");
        return false;
    }

    @Override
    protected void logOut() {

        System.out.println("LOGOUT -> " + email);
    }

    @Override
    protected boolean data(byte[] data) {
        boolean sendData = true;

        if (sendData) {
            System.out.println( "sended post ->  "+ new String(data) );
            return true;
        }
        return false;
    }

    private boolean isCorrectInfo(String email, String password) {
        Map<String, String> db = new HashMap<>();
        db.put("email","furkan@gmail.com");
        db.put("password","123");

        return db.containsValue(email) && db.containsValue(password);
    }
}
