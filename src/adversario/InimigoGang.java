package adversario;

import java.util.ArrayList;
import java.util.List;

public class InimigoGang extends Inimigo {
	
	List<Inimigo> grupoInimigos = new ArrayList<>();
	
	public InimigoGang() {
	super("Gang de Goblins",500);
	
	Inimigo um = new Inimigo();
	Inimigo dois = new Inimigo();
	Inimigo tres = new Inimigo();
	
	grupoInimigos.add(um);
	grupoInimigos.add(dois);
	grupoInimigos.add(tres);
	
	}
	
	@Override
	public int getDano(){

		int danoTotal = 0;
		
		for (Inimigo i : grupoInimigos) {
			danoTotal = danoTotal + i.getDano();
		}
		
        return danoTotal/2 ;
    }
	
	
}
