package cosimocrupi.L2.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Elemento {
    protected String nome;
    protected int calorie;
    protected double prezzo;

    public Elemento(String nome, int calorie, double prezzo){
        this.nome=nome;
        this.calorie=calorie;
        this.prezzo=prezzo;
    }
}
