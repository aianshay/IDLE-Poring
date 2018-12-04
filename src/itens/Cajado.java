package itens;

public class Cajado extends Item {

    private int adicionalInteligencia;

    public int getAdicionalInteligencia() {
        return adicionalInteligencia;
    }

    public void setAdicionalInteligencia(int adicionalInteligencia) {
        this.adicionalInteligencia = adicionalInteligencia;
    }

    public Cajado(String nome){
        super(nome);
        this.adicionalInteligencia = 5;
        setTipo("mago");
    }
}
