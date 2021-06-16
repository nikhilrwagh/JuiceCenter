import Service.JuiceCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {


    JuiceCalculator juiceCalculator = new JuiceCalculator();
    public static void main(String[] args) {


        JuiceCalculator juiceCalculator = new JuiceCalculator();
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        String orders = null;
        try {
            orders = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        juiceCalculator.getOrders(orders);



    }
    public void getOrderCost(String order){
        juiceCalculator.calculateCost(order);
    }

    public boolean isOrderCorrect(String order) throws Exception {
       return  juiceCalculator.validateOrder(order);
    }


    public void processOrders(String[] orders){
        juiceCalculator.getOrders(orders);
    }

}
