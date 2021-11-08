public class BonusMilesService {
    int calculate(int cost) {
        double milePrice = 20;
        int milesBalance = (int) (cost / milePrice);
        return milesBalance;
    }
}
