public abstract class Redesocial {

    private String password;
    private int numFriends;

    public Redesocial(String password, int numFriends) {
        this.password = password;
        this.numFriends = numFriends;
    }

    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();

    public abstract void curtirPublicacao();

    public void share(String post) {}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumFriends() {
        return numFriends;
    }

    public void setNumFriends(int numFriends) {
        this.numFriends = numFriends;
    }

}
