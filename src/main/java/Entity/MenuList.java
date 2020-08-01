package Entity;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public enum MenuList {

    CHAI("Chai", 4.0,
            new HashMap<String,Double>(){
            {
                put("milk",1.0);
                put("sugar",0.5);
                put("water",0.5);
            }
        }),
    COFFEE("Coffee", 5.0, new HashMap<String,Double>(){
            {
                put("milk",1.0);
                put("sugar",0.5);
                put("water",0.5);
            }
        }),
    BANANA_SMOOTHIE("Banana Smoothie",6.0,new HashMap<String,Double>(){
        {
            put("milk",1.0);
            put("sugar",0.5);
            put("water",0.5);
        }
    }),
    STRAWBERRY_SHAKE("Strawberry Shake",7.0,new HashMap<String,Double>(){
        {
            put("milk",1.0);
            put("sugar",0.5);
            put("water",0.5);
        }
    }),
    MOJITO("Mojito",8.5,new HashMap<String,Double>(){
        {
            put("mint",0.5);
            put("sugar",0.5);
            put("water",0.5);
            put("soda",0.5);
        }
    });

    private String menuName;
    private double cost;
    private Map<String,Double> ingredientsCost;

//    public void setMenuName(String menuName) {
//        this.menuName = menuName;
//    }
//
//    public void setCost(double cost) {
//        this.cost = cost;
//    }
//
//    public void setIngredientsCost(Map<String, Double> ingredientsCost) {
//        this.ingredientsCost = ingredientsCost;
//    }

    public String getMenuName() {
        return menuName;
    }

    public double getCost() {
        return cost;
    }

    public Map<String, Double> getIngredientsCost() {
        return ingredientsCost;
    }

    MenuList(String menuName, double cost, Map<String,Double> ingredientsCost) {
        this.menuName = menuName;
        this.cost = cost;
        this.ingredientsCost =ingredientsCost;
    }


    public static MenuList getByMenuName(String name) {
        return EnumSet.allOf(MenuList.class).stream().filter(it -> it.menuName.equalsIgnoreCase(name)).findFirst().orElse(null);
//        for (MenuList list : MenuList.values()) {
//            if (list.getMenuName().equalsIgnoreCase(name)) {
//                return list;
//            }
//        }
//        return null;
    }

        }
