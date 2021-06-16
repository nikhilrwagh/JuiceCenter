//import org.mockito.Mockito.then
import Entity.MenuList;
import Service.JuiceCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.StringTokenizer;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AppTest {

    @Mock
    JuiceCalculator juiceCalculator;

    @InjectMocks
    App app;


    String[] orders  = {"chai","coffee","juice"} ;


    @Test
    public void appTest(){
         when(juiceCalculator.calculateCost("chai")).thenReturn(100.00);
         app.getOrderCost("chai");
    }


    @Test
    public void validateOrdertest() throws Exception {
        doReturn(true).when(juiceCalculator).validateOrder("coffee,tea,milk");
        app.isOrderCorrect("coffee");
    }


    @Test
    public void processOrders(){
        doNothing().when(juiceCalculator).getOrders(orders);
        app.processOrders(orders);
    }

}
