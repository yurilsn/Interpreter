package Classes;

public class Somar implements Operador{
    private Operador esquerda;
    private Operador direita;

    public Somar(Operador direita, Operador esquerda) {
        this.direita = direita;
        this.esquerda = esquerda;
    }

    @Override
    public int interpretar(){
        return this.esquerda.interpretar() + this.direita.interpretar();
    }
}
