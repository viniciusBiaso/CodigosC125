public class Facebook extends Redesocial {

    private VideoConferencia videoconferencia;

    public Facebook(String password, int numFriends, VideoConferencia videoConference) {
        super(password, numFriends);
        this.videoconferencia = videoConference;
    }

    @Override
    public void postarFoto() {
        try {
            System.out.println("Postou uma foto no Facebook!");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção enquanto postava uma foto no Facebook.");
        }
    }

    @Override
    public void postarVideo() {
        try {
            System.out.println("Postou um video no Facebook!");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção enquanto postava um video no Facebook.");
        }
    }

    @Override
    public void postarComentario() {
        try {
            System.out.println("Postou um comentario no Facebook!");
        } catch (Exception e) {            
            System.out.println("Ocorreu uma exceção enquanto postava um comentario no Facebook.");
        }
    }

    @Override
    public void curtirPublicacao() {
        try {
            System.out.println("Curtiu uma publicação no Facebook!");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção enquanto curtia uma publicação no Facebook.");
        }
    }

    public void makeVideoConference() {
        try {
            System.out.println("Fez uma chamada de video no Facebook!");
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção enquanto fazia uma chamada de video Facebook.");
        }
    }
}