package Templatepattern.loginSocialMedia;

import java.util.Scanner;

public class PostController {

    public static final String EMAIL_EXPECTED = "ENTER EMAIL";
    public static final String PASSWORD_EXPECTED = "ENTER PASSWORD";

    private final PostService postService;



    public PostController(PostService postService) {
        this.postService = postService;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Network network = null;


        System.out.println(EMAIL_EXPECTED);
        String email = scanner.nextLine();

        System.out.println(PASSWORD_EXPECTED);
        String password = scanner.nextLine();

        System.out.println("MESSAGE");
        String message = scanner.nextLine();

        System.out.println("HANGİ PLATFORM İLE GİRİŞ YAPMAK İSTERSİNİZ \n"
                +"1-INSTAGRAM\n " + "2-PINTEREST \n"
        );

        int choose = scanner.nextInt();

        PostController postController = new PostController(new PostService(network));

        postController.postService.LoginAndPost(choose,email,password,message);




    }
}
