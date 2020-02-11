package CLI;

public class Change {
    private int[] notes;
    private int[] coins;

    Change(int[] notes, int[] coins){
        this.notes = notes;
        this.coins = coins;
    }

    Change(){}

    public int[] getCoins() {
        return coins;
    }

    public int[] getNotes() {
        return notes;
    }

    public void denChange(int amount){
        int changeAMT;
        int leftAMT = amount;
        System.out.println("The change returned to the customer is:");
        System.out.println("____________________________________");
        if(leftAMT >= 10000) {
            changeAMT = leftAMT / 10000;
            leftAMT = leftAMT % 10000;
            System.out.println("| Number of 100 dollar notes : "+ changeAMT + " |");
        }
        if (leftAMT >= 5000) {
            changeAMT = leftAMT / 5000;
            leftAMT = leftAMT % 5000;
            System.out.println("| Number of  50 dollar notes : "+ changeAMT + " |");
        }
        if (leftAMT >= 2000) {
            changeAMT = leftAMT / 2000;
            leftAMT = leftAMT % 2000;
            System.out.println("| Number of  20 dollar notes : "+ changeAMT + " |");
        }
        if (leftAMT >= 1000) {
            changeAMT = leftAMT / 1000;
            leftAMT = leftAMT % 1000;
            System.out.println("| Number of  10 dollar notes : "+ changeAMT + " |");
        }
        if (leftAMT >= 500) {
            changeAMT = leftAMT / 500;
            leftAMT = leftAMT % 500;
            System.out.println("| Number of   5 dollar notes : "+ changeAMT + " |");
        }
        if (leftAMT >= 200) {
            changeAMT = leftAMT / 200;
            leftAMT = leftAMT % 200;
            System.out.println("| Number of   2 dollar coins : "+ changeAMT + " |");
        }
        if (leftAMT >= 100) {
            changeAMT = leftAMT / 100;
            leftAMT = leftAMT % 100;
            System.out.println("| Number of   1 dollar coins : "+ changeAMT + " |");
        }
        if (leftAMT >= 50) {
            changeAMT = leftAMT / 50;
            leftAMT = leftAMT % 50;
            System.out.println("| Number of  50 cents  coins : "+ changeAMT + " |");
        }
        if (leftAMT >= 20) {
            changeAMT = leftAMT / 20;
            leftAMT = leftAMT % 20;
            System.out.println("| Number of  20 cents  coins : "+ changeAMT + " |");
        }
        if (leftAMT >= 10) {
            changeAMT = leftAMT / 10;
            leftAMT = leftAMT % 10;
            System.out.println("| Number of  10 cents  coins : "+ changeAMT + " |");
        }
        if (leftAMT >= 5) {
            changeAMT = leftAMT / 5;
            leftAMT = leftAMT % 5;
            System.out.println("| Number of  5 cents  coins : "+ changeAMT + " |");
        }
        System.out.println("____________________________________");
    }
}