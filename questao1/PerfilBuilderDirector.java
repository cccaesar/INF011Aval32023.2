package questao1;

//Diretor
public class PerfilBuilderDirector {

    private PerfilBuilder builder;

    public void setBuilder(PerfilBuilder builder) {
        this.builder = builder;
    }

    public void buildPerfil(String nome) {
        builder.setNome(nome);
        builder.setSenha(nome);
        builder.setUser(nome);
    }

    public void buildPerfilWithUser(String nome, String user) {
        builder.setNome(nome);
        builder.setSenha(nome);
        builder.setUser(user);
    }

    public void buildPerfilWithUserSenha(String nome, String user, String senha) {
        builder.setNome(nome);
        builder.setSenha(senha);
        builder.setUser(user);
    }

    public void buildPerfilWithSenha(String nome, String senha) {
        builder.setNome(nome);
        builder.setSenha(senha);
        builder.setUser(nome);
    }

}
