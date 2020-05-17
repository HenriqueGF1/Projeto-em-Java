package br.com.controle;

public class LavarCarro {

    int CodigoLavagem;
    String TipoLavagem;
    Double ValorServico;
    Double NotaServico;

    public int getCodigoLavagem() {
        return CodigoLavagem;
    }

    public void setCodigoLavagem(int CodigoLavagem) {
        this.CodigoLavagem = CodigoLavagem;
    }

    public String getTipoLavagem() {
        return TipoLavagem;
    }

    public void setTipoLavagem(String TipoLavagem) {
        this.TipoLavagem = TipoLavagem;
    }

    public Double getValorServico() {
        return ValorServico;
    }

    public void setValorServico(Double ValorServico) {
        this.ValorServico = ValorServico;
    }

    public Double getNotaServico() {
        return NotaServico;
    }

    public void setNotaServico(Double NotaServico) {
        this.NotaServico = NotaServico;
    }
}
