package questao1;

import java.util.LinkedList;
import java.util.List;

import enunciado.model.Documento;
import enunciado.model.Perfil;

//Builder concreto
public class PerfilBuilderConcrete implements PerfilBuilder {
    private String nome;
    private String senha;
    private String user;
    private List<Documento> documentos;

    public PerfilBuilderConcrete() {
        this.documentos = new LinkedList<>();
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public void setUser(String user) {
        this.user = user;
    }
    
    @Override
    public void addDocumento(Documento documento) {
        this.documentos.add(documento);
    }

    public Perfil getResultado() {
        return new Perfil(nome, user, senha, documentos);
    }

}
