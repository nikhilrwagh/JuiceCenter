
import static org.mockito.Mockito.doNothing;
import Service.JuiceCalculator;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class JuiceCalculatorTest {

    @InjectMocks
    JuiceCalculator juiceCalculator;

    @Test
    public void getSingleOrderCost(){

        String[] arr = {"a","a"};
//        doNothing().when(juiceCalculator).getOrders(arr);
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
