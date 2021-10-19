class ManufacturingController {
    static int noOfRequestedProducts;
    public static String requestProduct(String product) {
        // write your code here
        noOfRequestedProducts++;
        String ans = noOfRequestedProducts + ". ";
        ans += "Requested " + product;
        return ans;
    }

    public static int getNumberOfProducts() {
        // write your code here
        return noOfRequestedProducts;
    }
}
