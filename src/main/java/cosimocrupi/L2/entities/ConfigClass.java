package cosimocrupi.L2.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class ConfigClass {
/*----------------------------------------TOPPINGS----------------------------------*/
    @Bean(name = "pomodoro")
    public Toppings toppingPomo(){
        return new Toppings("Pomodoro", 20, 0);
    }
    @Bean(name = "mozzarella")
    public Toppings toppingMozz(){
        return new Toppings("Mozzarella", 20, 0.69);
    }
    @Bean(name = "cipolla")
    public Toppings toppingCipolla(){
        return new Toppings("Cipolla", 22, 0.69);
    }
    @Bean(name = "salame")
    public Toppings toppingSalame(){
        return new Toppings("Salame", 86, 0.99);
    }
    @Bean(name = "ananas")
    public Toppings toppingAnanas(){
        return new Toppings("Ananas", 24, 0.79);
    }
    /*----------------------------------------BEVANDE----------------------------------*/

    @Bean(name = "Gassosa")
    public Bevanda gassosa(){
        return new Bevanda("Gassosa(0.33l)", 128, 1.29);
    }
    @Bean(name = "Acqua")
    public Bevanda acqua(){
        return new Bevanda("Acqua(0.5l)", 0, 1.29);
    }
    @Bean(name = "Vino")
    public Bevanda vino(){
        return new Bevanda("Vino(0.75l 13%)", 607, 7.49);
    }
    /*----------------------------------------PIZZE----------------------------------*/
    @Bean(name = "Margherita")
    public Pizza margherita(){
        List<Toppings> ingredienti=new ArrayList<>();
        ingredienti.add(toppingPomo());
        ingredienti.add(toppingMozz());
        return new Pizza("Margherita", ingredienti);
    }
    @Bean(name = "Hawaiian Pizza")
    public Pizza hawaiian(){
        List<Toppings> ingredienti=new ArrayList<>();
        ingredienti.add(toppingPomo());
        ingredienti.add(toppingMozz());
        ingredienti.add(toppingAnanas());
        return new Pizza("Hawaiian Pizza", ingredienti);
    }
    @Bean(name = "Pizza salame")
    public Pizza salame(){
        List<Toppings> ingredienti=new ArrayList<>();
        ingredienti.add(toppingPomo());
        ingredienti.add(toppingMozz());
        ingredienti.add(toppingSalame());
        return new Pizza("Pizza salame", ingredienti);
    }
    /*----------------------------------------MENU----------------------------------*/
    @Bean(name = "Menù")
    public Menu menu(){
        List<Pizza> pizze= new ArrayList<>();
        List<Toppings> ingredienti= new ArrayList<>();
        List<Bevanda> bevande= new ArrayList<>();

        pizze.add(margherita());
        pizze.add(hawaiian());
        pizze.add(salame());

        bevande.add(gassosa());
        bevande.add(acqua());
        bevande.add(vino());

        ingredienti.add(toppingPomo());
        ingredienti.add(toppingMozz());
        ingredienti.add(toppingSalame());
        ingredienti.add(toppingCipolla());
        ingredienti.add(toppingAnanas());

        return new Menu(pizze, bevande, ingredienti);
    }


}
