import Service.JuiceCalculator;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JuiceCalculatorTest {
    JuiceCalculator juiceCalculator = new JuiceCalculator();
    @Test
    public void getSingleOrderCost(){


        String[] arr ={"Chai","Coffee,-milk,-water"};
        juiceCalculator.getOrders(arr);

    }

    @Test
    public void eachOrderShouldHaveAtleastOneMenuItem(){
        juiceCalculator.getOrders("");
    }

    @Test
    public void order_without_exclusion(){
        juiceCalculator.getOrders("Chai");
    }

}
