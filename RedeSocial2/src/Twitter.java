public class Twitter extends Redesocial implements Sharing {

    public Twitter(String password, int numFriends) {
        super(password, numFriends);
    }

    @Override
    public void postarFoto() {
        try {
            System.out.println("Postou uma foto no Twitter!");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção enquanto postava uma foto no Twitter.");
        }
    }

    @Override
    public void postarVideo() {
        try {
            System.out.println("Postou um video no Twitter!");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção enquanto postava um video no Twitter.");
        }
    }

    @Override
    public void postarComentario() {
        try {
            System.out.println("Postou um comentario no Twitter!");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção enquanto postava um comentario no Twitter.");
        }
    }

    @Override
    public void curtirPublicacao() {
        try {
            System.out.println("Curtiu uma publicação no Twitter!");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção enquanto curtia uma publicação no Twitter.");
        }
    }

    @Override
    public void share(String publication) {
        try {
            System.out.println("Compartilhou uma publicação no Twitter!");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção enquanto compartilhava uma publicação no Twitter.");
        }
    }
}
