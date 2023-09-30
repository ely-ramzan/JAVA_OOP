public class TestProduct {
    public static void main(String[] args) {
        Product product1 = new Product("Candy",67.5,4,new Date(2,9,2003));
        // System.out.println(product1);
        product1.setDate(new Date (10,2,2001));
        Product product2 = new Product("Super",88.4,3,new Date(1,6,2004));

        System.out.println(product1.recentProduct(product1,product2));
    }
}
