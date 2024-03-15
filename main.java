public class Main {
    public static void main(String[] args) {
        // Exemplo de uso da rede social
        RedeSocial redeSocial = new RedeSocial();

        Usuario usuario1 = new Usuario("João", "joao@example.com", "senha123", new Date());
        Usuario usuario2 = new Usuario("Maria", "maria@example.com", "senha456", new Date());

        Postagem postagem1 = new Postagem("Primeira postagem", new Date());
        Postagem postagem2 = new Postagem("Segunda postagem", new Date());

        usuario1.adicionarPostagem(postagem1);
        usuario2.adicionarPostagem(postagem2);

        postagem1.curtir();
        postagem1.adicionarComentario("Legal!");
        postagem2.curtir();
    }
}