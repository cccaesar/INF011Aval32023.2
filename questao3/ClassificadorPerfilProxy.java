package questao3;

import enunciado.model.Perfil;
import enunciado.model.service.Classificador;
import enunciado.model.service.ClassificadorPerfil;
import enunciado.model.service.NivelPerfil;

public class ClassificadorPerfilProxy implements Classificador{

    private ClassificadorPerfil classificadorService;
    private Perfil perfil;
    private String user;
    private String pwd;

    public void setUser(String user) {
        this.user = user;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public ClassificadorPerfilProxy(Perfil perfil) {
        this.classificadorService = new ClassificadorPerfil(perfil);
    }

    @Override
    public NivelPerfil nivel() {
        if(this.perfil.getPwd() == this.pwd && this.perfil.getUser() == this.user) {
            return this.classificadorService.nivel();
        }
        return NivelPerfil.DESCONHECIDO;
    }

    @Override
    public Perfil getPerfil() {
        return this.perfil;
    }
    
}
