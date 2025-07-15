package cosimocrupi.L2.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bevanda extends Elemento{
    public Bevanda(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
    }

    @Override
    public String toString() {
        return "Bevanda{" +
                "prezzo=" + prezzo +
                ", calorie=" + calorie +
                ", nome='" + nome + '\'' +
                '}';
    }
}
