package questao1;

import java.util.List;

import enunciado.model.Documento;

// Interface Builder
public interface PerfilBuilder {

    public void setNome(String nome);
    public void setSenha(String senha);
    public void setUser(String user);
    public void addDocumento(Documento documento);
}