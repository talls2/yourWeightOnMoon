import java.text.*;
public class MoonWeight {
    public static void main(String[] args) {
        double weight = 86;
        double moonWeight = weight * 0.17;
        DecimalFormat f = new DecimalFormat("#.##");
        System.out.println("your weight on earth is: " + f.format(weight) +", and your weight on moon is: "
                + f.format(moonWeight));
    }

}
