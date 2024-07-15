package hub.forum.leone.api.domain.postagem.topico;

import hub.forum.leone.api.domain.autor.DadosAutor;
import hub.forum.leone.api.domain.postagem.Curso;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico (
        Long id,

        String titulo,
        String mensagem,
        LocalDateTime data,
        Boolean duvidaResolvida,
        DadosAutor autor,
        Curso curso
) {
    public DadosDetalhamentoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getData(), topico.getDuvidaResolvida(), new DadosAutor(topico.getAutor()), topico.getCurso());
    }
}
