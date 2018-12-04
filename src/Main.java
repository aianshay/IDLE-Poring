import adversario.Inimigo;
import adversario.InimigoGang;
import itens.Item;
import player.Avatar;
import player.Mago;
import player.Espadachim;
import player.Ladrao;
import player.Arqueiro;

class Main {
  public static void main(String[] args) throws InterruptedException  {
	  
    Avatar jogador = new Mago("Gustavo");
    //Avatar jogador = new Espadachim("Joao");
    //Avatar jogador = new Ladrao("Silva");
    //Avatar jogador = new Arqueiro("Pereira");

    

    Inimigo gang = new InimigoGang();
    
    Batalha.start(jogador, gang);
    
    while(!jogador.isDead() && !gang.isDead()) {
        int danoJogador = jogador.getDano();
        int danoInimigo = gang.getDano();

        if(!jogador.isDead())
            jogador.ataca(gang,danoJogador);

        Thread.sleep(2000);

        if(!gang.isDead())
            gang.ataca(jogador,danoInimigo);

        Thread.sleep(2000);

		if(jogador.isDead())
			System.out.println("\n" + jogador.getNome() + " morreu.");
		else if (gang.isDead()) {
            System.out.println("\n" + gang.getNome() + " morreu." +"\n");

            if(jogador.getBatalhasVencidas() == 2){
                jogador.levelUp();
                jogador.setBatalhasVencidas(0);
            }

            jogador.curar();
        }
    };
    
    if(!jogador.isDead()){
	    
    	  Avatar inimigo = new Inimigo();
    	  Batalha.start(jogador,inimigo);
    	
	      while(!jogador.isDead() && !inimigo.isDead()) {
	    	
	    	int danoJogador = jogador.getDano();
	        int danoInimigo = inimigo.getDano();
	
	        if(!jogador.isDead())
	            jogador.ataca(inimigo,danoJogador);
	
	        Thread.sleep(2000);
	
	        if(!inimigo.isDead())
	            inimigo.ataca(jogador,danoInimigo);
	
	        Thread.sleep(2000);
	
			if(jogador.isDead())
				System.out.println("\n" + jogador.getNome() + " morreu.");
			else if (inimigo.isDead()) {
	            System.out.println("\n" + inimigo.getNome() + " morreu.");
	            Item i = inimigo.dropItem();
	            jogador.addItem(i);
	            jogador.contarBatalhasVencidas();
	
	            if(jogador.getBatalhasVencidas() == 2){
	                jogador.levelUp();
	                jogador.setBatalhasVencidas(0);
	            }
	
	            inimigo = new Inimigo();
	            
	            Batalha.start(jogador,inimigo);
	            
	            jogador.curar();
	        }
	    };
    }
  }
}
