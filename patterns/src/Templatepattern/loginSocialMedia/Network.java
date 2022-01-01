package Templatepattern.loginSocialMedia;

public abstract class Network {

    protected String email;
    protected String password;

    protected Network() {
    }

    public boolean post(String post) {
        if (logIn(email,password)) {
            boolean isSuccess = data(post.getBytes());
            logOut();
            return isSuccess;
        }
        return false;
    }

    protected abstract boolean logIn(String email, String password);
    protected abstract void logOut();
    protected abstract boolean data(byte[] data);
}
