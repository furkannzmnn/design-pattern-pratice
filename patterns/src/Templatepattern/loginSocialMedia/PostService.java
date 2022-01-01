package Templatepattern.loginSocialMedia;

import java.util.Arrays;

public class PostService {

    public Network network;


    public PostService(Network network) {
        this.network = network;
    }

    public void LoginAndPost(int choose, String email, String password , String message) {

        if (choose == 1) {
            network = new InstagramPost(email, password);
        } else if (choose == 2) {
            network = new PinterestPost(email, password);
        }
        if (Arrays.asList(1,2).contains(choose)) {
            final boolean post = network.post(message);
            if (!post) {
                System.out.println("POST GÖNDERİLEMEDİ");
            }
        }

    }
}
