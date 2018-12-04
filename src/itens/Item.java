package itens;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private String nome;
    private String tipo;

    public Item(String nome){
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public static Item obterItem() {
    	List<Item> itens = new ArrayList<>();
    	
    	Item escudo = new Escudo("Escudo de Prata");
    	Item cajado = new Cajado("Cajado da Esperança");
    	Item arco = new Arco("Arco do Terror");
    	Item espada = new Espada("Espada da Liberdade");
    	Item revolver = new Revolver("Canhão portátil");
    	
    	itens.add(escudo);
    	itens.add(cajado);
    	itens.add(arco);
    	itens.add(espada);
    	itens.add(revolver);
    	
    	return itens.get((int)(Math.random()*5));
    }
}
