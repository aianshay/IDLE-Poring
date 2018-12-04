package itens;

public class Revolver extends Item{

    private int adicionalDestreza;

    public int getAdicionalDestreza() {
        return adicionalDestreza;
    }

    public void setAdicionalDestreza(int adicionalDestreza) {
        this.adicionalDestreza = adicionalDestreza;
    }

    public Revolver(String nome){
        super(nome);
        setTipo("ladrao");
        this.adicionalDestreza = 5;
    }
}
