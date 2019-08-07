package dz.cirta.designspattern.builderPattern;

public class BuilderDemo {
    public static void main (String [] args){
        LunchOrder order = new LunchOrder.Builder()
                .bread("Wheat")
                .condiments("Lotuce")
                .dressing("Mayo")
                .meat("Turkey")
                .build();

        System.out.println(order.getBread());
        System.out.println(order.getCondiments());
        System.out.println(order.getDressing());
        System.out.println(order.getMeat());
    }

}
