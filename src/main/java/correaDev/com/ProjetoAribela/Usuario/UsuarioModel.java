package correaDev.com.ProjetoAribela.Usuario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioModel {

    Long id;
    String nome;
    String email;
    String senha;

}
