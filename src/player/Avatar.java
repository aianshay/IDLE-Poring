package player;

import java.util.ArrayList;
import java.util.List;

import itens.Item;

public class Avatar{

    private String nome = "Sem nome";
    private int hp;
    private int defaultHp = 500;
    private int xp;
    private int level;
    private int agilidade;
    private int forca;
    private int destreza;
    private int sorte;
    private int inteligencia;
    private int batalhasVencidas = 0;

    private List<Item> mochila = new ArrayList<>();

    public List<Item> getMochila() {
        return mochila;
    }

    public void setMochila(List<Item> mochila) {
        this.mochila = mochila;
    }

    public void contarBatalhasVencidas(){
        this.batalhasVencidas = this.batalhasVencidas + 1;
    }

    public void curar(){
        int newHp = this.getHp() + (int)(0.5 * this.getXp());

        if(newHp > defaultHp)
            this.setHp(defaultHp);
        else
            this.setHp(newHp);
    }


    public void addItem(Item i){
        this.mochila.add(i);
        System.out.println(getNome() + " adicionou o item " + i.getNome() + " à mochila.");
    }

    public Item dropItem(){
        Item i = mochila.get(0);
        this.mochila.remove(0);
        System.out.println(getNome() + " dropou o item " + i.getNome());
        return i;
    }

    public void levelUp(){
        this.level = this.level + 10;
        this.defaultHp = defaultHp + 30;
        this.setHp(defaultHp);
        System.out.println(getNome() + " upou para o nível " + getLevel());
    }

    public int getBatalhasVencidas() {
        return batalhasVencidas;
    }

    public void setBatalhasVencidas(int batalhasVencidas) {
        this.batalhasVencidas = batalhasVencidas;
    }

    public int getDefaultHp() {
        return defaultHp;
    }

    public void setDefaultHp(int defaultHp) {
        this.defaultHp = defaultHp;
    }

    public int getDano(){

        int dano = ((int)(Math.random()*getSorte()) * (int)(0.5 * (getAgilidade() + getDestreza() +
                                                                    getForca() + getInteligencia() + getSorte()))) + 1;
        return dano;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getSorte() {
        return sorte;
    }

    public void setSorte(int sorte) {
        this.sorte = sorte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHp() {
        if(hp <= 0)
            return 0;
        else
            return hp;
    }

    public void ataca(Avatar inimigo, int dano){

        System.out.println("\nAtaque de " + getNome() + " com dano de " + dano + " em " + inimigo.getNome());
        inimigo.setHp(inimigo.getHp() - dano);
        System.out.println("HP de " + inimigo.getNome() + ": " + inimigo.getHp());
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Avatar(String nome){
        this();
        this.nome = nome;
    }

    public Avatar(){
        this.hp = 500;
        this.xp = 80;
        this.level = 10;
    }

    public boolean isDead(){
        if (hp <= 0)
            return true;
        else
            return false;
    }
}
	