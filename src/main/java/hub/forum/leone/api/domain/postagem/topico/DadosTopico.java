package hub.forum.leone.api.domain.postagem.topico;

import hub.forum.leone.api.domain.autor.DadosAutor;
import hub.forum.leone.api.domain.postagem.Curso;
import hub.forum.leone.api.domain.postagem.resposta.DadosResposta;

import java.time.LocalDateTime;
import java.util.List;

public record DadosTopico(Long id,
                          String titulo,
                          String mensagem,
                          LocalDateTime data,
                          Boolean duvidaResolvida,
                          DadosAutor autor,
                          Curso curso,
                          List<DadosResposta> respostas) {
}
