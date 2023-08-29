package OOP1;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Goods> basketGoods;

    public void addToBasket (Goods goods, int qty){
        if (basketGoods.contains(goods)){
            int index = basketGoods.indexOf(goods);
            basketGoods.get(index).increaseQty(qty);
        } else {
            goods.setQty(qty);
            basketGoods.add(goods);
        }
    }


    public void printBasket(){
        for (Goods goods: basketGoods
             ) {System.out.println(goods);
        }
    }

}
