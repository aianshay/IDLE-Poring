package itens;

public class Espada extends Item {

    private int adicionalForca;

    public int getAdicionalForca() {
        return adicionalForca;
    }

    public void setAdicionalForca(int adicionalForca) {
        this.adicionalForca = adicionalForca;
    }

    public Espada(String nome){
        super(nome);
        setTipo("espadachim");
        this.adicionalForca = 5;
    }
}
