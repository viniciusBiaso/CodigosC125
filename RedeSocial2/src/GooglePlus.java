public class GooglePlus extends Redesocial {

    private VideoConferencia videoConference;

    public GooglePlus(String password, int numFriends, VideoConferencia videoConference) {
        super(password, numFriends);
        this.videoConference = videoConference;
    }

    @Override
    public void postarFoto() {
        try {
            System.out.println("Postou uma foto no GooglePlus!");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção enquanto postava uma foto no GooglePlus.");
        }
    }

    @Override
    public void postarVideo() {
        try {
            System.out.println("Postou um video on GooglePlus!");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção enquanto postava um video no GooglePlus.");
        }
    }

    @Override
    public void postarComentario() {
        try {
            System.out.println("Postou um comentario no GooglePlus!");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção enquanto postava um comentario no GooglePlus.");
        }
    }

    @Override
    public void curtirPublicacao() {
        try {
            System.out.println("Curtiu uma publicação no GooglePlus!");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção enquanto curtia uma publicação no GooglePlus.");
        }
    }

    public void makeVideoConference() {
        try {
            System.out.println("Fez uma chamada de video no GooglePlus!");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção enquanto fazia uma chamada de video no GooglePlus.");
        }
    }
}