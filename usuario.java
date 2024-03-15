
class Usuario {
    private String nome;
    private String email;
    private String senha;
    private Date dataNascimento;
    private List<Postagem> postagens;

    public Usuario(String nome, String email, String senha, Date dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Postagem postagem) {
        postagens.add(postagem);
    }

    public void removerPostagem(Postagem postagem) {
        postagens.remove(postagem);
    }

    public List<Postagem> getPostagens() {
        return postagens;
    }
}
