package player;

import itens.Cajado;
import itens.Item;

public class Mago extends Avatar {

    public Mago(String nome){
        super(nome);

        Item cajado = new Cajado("Cajado das Trevas");
        getMochila().add(cajado);

        setAgilidade(7);
        setDestreza(6);
        setForca(3);
        setSorte(5 + ((Cajado) cajado).getAdicionalInteligencia());
        setInteligencia(9);
    }

	public Mago(){
        this("Sem nome");
	}
}