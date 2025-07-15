package cosimocrupi.L2.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Pizza extends Elemento{
    protected List<Toppings> toppings;


    public Pizza(String nome, List<Toppings> toppings) {
        super(nome, 750, 5);
        this.nome=nome;
        this.toppings = toppings;
        this.calorie=setCalorie(toppings);
        this.prezzo=prezzoTot(toppings);
    }
    public int setCalorie(List<Toppings> toppings){
        int calorie=750;
        if (toppings != null){
            for (Toppings topping : toppings) {
                calorie += topping.getCalorie();
            }
        }
        return calorie;
    }
    public double prezzoTot( List<Toppings> toppings){
        double prezzoT=5;
        if (toppings != null){
            for (Toppings topping : toppings){
                prezzoT += topping.getPrezzo();
            }
        }
        return prezzoT;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings=" + toppings +
                ", nome='" + nome + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
