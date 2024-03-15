class Postagem {
    private String texto;
    private Date dataPostagem;
    private int curtidas;
    private List<String> comentarios;

    public Postagem(String texto, Date dataPostagem) {
        this.texto = texto;
        this.dataPostagem = dataPostagem;
        this.curtidas = 0;
        this.comentarios = new ArrayList<>();
    }

    public void curtir() {
        curtidas++;
    }

    public void adicionarComentario(String comentario) {
        comentarios.add(comentario);
    }
}