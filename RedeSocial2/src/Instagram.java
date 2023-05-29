public class Instagram extends Redesocial {

    public Instagram(String password, int numFriends) {
        super(password, numFriends);
    }

    @Override
    public void postarFoto() {
        try {
            System.out.println("Postou uma foto no Instagram!");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção enquanto postava uma foto no Instagram.");
        }
    }

    @Override
    public void postarVideo() {
        try {
            System.out.println("Postou um video no Instagram!");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção enquanto postava um video no Instagram.");
        }
    }

    @Override
    public void postarComentario() {
        try {
            System.out.println("Postou um comentario no Instagram!");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção enquanto postava um comentario no Instagram.");
        }
    }

    @Override
    public void curtirPublicacao() {
        try {
            System.out.println("Curtiu uma publicação no Instagram!");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção enquanto curtia uma publicação no Instagram.");
        }
    }
}