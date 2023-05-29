
//                            nomes: Vinicius Moura Biaso Baptista e Matheus de Moura Pinatti

public class Main {

    public static void main(String[] args) {

        Redesocial facebook = new Facebook("password", 100, new VideoConferencia() {
            @Override
            public void fazStreaming() {

            }
        });
        facebook.postarFoto();
        facebook.postarVideo();
        facebook.postarComentario();
        facebook.curtirPublicacao();

        Redesocial googlePlus = new GooglePlus("password", 200, new VideoConferencia() {
            @Override
            public void fazStreaming() {

            }
        });
        googlePlus.postarFoto();
        googlePlus.postarVideo();
        googlePlus.postarComentario();
        googlePlus.curtirPublicacao();

        Redesocial twitter = new Twitter("password", 300);
        twitter.postarFoto();
        twitter.postarVideo();
        twitter.postarComentario();
        twitter.curtirPublicacao();

        twitter.share("Compartilhando uma publicacao");
    }

}
