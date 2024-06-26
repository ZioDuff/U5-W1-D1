package JacopoDemaio.U5_W1_D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
// estendo la classe padre Alimento perchè tutti hanno in comuni gli stessi attributi
public class Drink extends Alimento {

//    ATTRIBUTI

    private String name;

//    COSTRUTTORE


    public Drink(double calorie, double prezzo, String name) {
        super(calorie, prezzo);
        this.name = name;
    }

// anche qua il toString lo faccio a mano
    @Override
    public String toString() {
        return
                name + "                " +
                        super.toString();
    }
}
