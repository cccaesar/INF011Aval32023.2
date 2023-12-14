package questao2;

import enunciado.model.Documento;
//Decorador Base 
public class DocumentoDecorator implements Documento {

    private Documento documento;

    public DocumentoDecorator(Documento documento) {
        this.documento = documento;
    }

    @Override
    public String formatar() {
        return this.documento.formatar();
    }

    @Override
    public boolean validar() {
        return this.documento.validar();
    }

    @Override
    public Integer pontuar() {
        return this.documento.pontuar();
    }
    
}
