import java .math.BigDecimal;
public class Task05 {
        public static void main(String[] args) {
            double priceWithoutVat = 9.99;
            System.out.println("Price without VAT: " + priceWithoutVat);

            double priceWithVat= priceWithoutVat * 1.22;
            System.out.println("Price with VAT "+ priceWithVat);

            double valueWithVat= priceWithVat*10000;
            System.out.println("Value with VAT: "+ valueWithVat);

            double priceWithoutVat2= valueWithVat/1.22;
            System.out.println("Value without VAT: "+ priceWithoutVat2);

            System.out.println("");
            System.out.println("After using Big decimal");

            BigDecimal PriceWithoutVatBD= new BigDecimal("9.99");
            System.out.println("Price without VAT: "+ PriceWithoutVatBD);

            BigDecimal PriceWithVatBD= PriceWithoutVatBD.multiply(new BigDecimal(1.23));
            BigDecimal bigDecimal = PriceWithVatBD = PriceWithVatBD.setScale(2, BigDecimal.ROUND_HALF_EVEN);
            System.out.println("Price with VAT rounded: "+ PriceWithVatBD);

            BigDecimal ValueWithVAT= PriceWithVatBD.multiply(new BigDecimal(10000));
            System.out.println("Value with VAT: "+ ValueWithVAT);

            BigDecimal PriceWithoutVAT2=ValueWithVAT.divide(new BigDecimal("1.23"),BigDecimal.ROUND_HALF_EVEN);

        }
}
