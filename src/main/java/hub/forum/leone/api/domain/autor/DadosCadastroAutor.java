package hub.forum.leone.api.domain.autor;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroAutor(@NotBlank
                                 String nome) {
}
