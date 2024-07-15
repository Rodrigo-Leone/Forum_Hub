package hub.forum.leone.api.domain.autor;

public record DadosAutor(
        Long id,
        String nome) {

    public DadosAutor(Autor autor) {
        this(autor.getId(), autor.getNome());
    }

}
