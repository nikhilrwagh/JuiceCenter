package Service;

import Entity.MenuList;

import java.util.*;

public class JuiceCalculator {

    public void getOrders(String[] orders){

        for (String order : orders){

            calculateCost(order);

        }



    }

    public Double calculateCost(String order){
        Double exclusionCost= new Double(0);
        Double cost = new Double(0);
        try {
            if (validateOrder(order)){
                String orderName = order.split(",")[0];
                cost = MenuList.getByMenuName(orderName).getCost();

                if (order.split(",").length > 1){
                    String[] exclusions = order.split(",");
                    Map<String,Double> ingredients = MenuList.getByMenuName(orderName).getIngredientsCost();
                    for (int i=1;i<exclusions.length; i++) {
                        exclusionCost += ingredients.get(exclusions[i].replace("-",""));

                    }
                }

                System.out.println("Your total cost of "+ orderName + " is " + (cost - exclusionCost)  +"$.");
                                    }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cost;
    }

    public void getOrders(String orders){
            calculateCost(orders);
    }

    public boolean validateOrder(String order) throws Exception {

        boolean isValid = true;
        if (order.split(",").length > 1){
            String[] customOrder = order.split(",");
            String menuName = customOrder[0];
            if (customOrder.length - 1 == MenuList.getByMenuName(menuName).getIngredientsCost().size()) {
                isValid = false;
                throw new Exception("An order cannot have all the ingredients in exclusion for a menu item");
            }
        }
        if (order == null || order.isEmpty()){
            isValid = false;
            throw new Exception("An order should have atleast one menu item");
        }

        return isValid;
    }

}
