package hub.forum.leone.api.domain.postagem.topico;

import hub.forum.leone.api.domain.postagem.Curso;
import jakarta.validation.constraints.NotNull;

public record DadosCriacaoTopico(@NotNull
                                 String titulo,
                                 @NotNull
                                 String mensagem,
                                 @NotNull
                                 Long idAutor,
                                 @NotNull
                                 Curso curso) {
}
