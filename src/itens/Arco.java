package itens;

public class Arco extends Item {

    private int adicionalAgilidade;

    public int getAdicionalAgilidade() {
        return adicionalAgilidade;
    }

    public void setAdicionalAgilidade(int adicionalAgilidade) {
        this.adicionalAgilidade = adicionalAgilidade;
    }

    public Arco(String nome){
        super(nome);
        setTipo("arqueiro");
        this.adicionalAgilidade = 5;
    }
}
