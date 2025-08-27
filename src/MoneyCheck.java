import java.util.ArrayList;
public class MoneyCheck {
    public static void main(String[] args) {
        //boolean hasCard = true;
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("2000");
        pocket.add("card");

        if (pocket.contains("card")) {
            System.out.println("택시를 타고 가라");
        }else if(Integer.parseInt(pocket.get(0))>=3000) {
            System.out.println("택시를 타고 가라");
        }else {
            System.out.println("걸어가라");
        }

    }
}
