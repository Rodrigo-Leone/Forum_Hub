package hub.forum.leone.api.domain.postagem.resposta;

import hub.forum.leone.api.domain.autor.DadosAutor;

import java.time.LocalDateTime;

public record DadosResposta(Long id,
                            String mensagem,
                            LocalDateTime data,
                            DadosAutor autor) {
}
