package by.itstep.khodosevich.twelveproject.module.logic;

public class King {
    public static String isValidKingStep(int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2) {
            return "NO";
        }

        if(x2<1 || x2>8 || y2<1 || y2>8){
            return "NO";
        }

        return ((y1 + 1 == y2 || y1 - 1 == y2 || y1 == y2)
                && (x1 - 1 == x2 || x1 + 1 == x2 || x1 == x2)) ? "YES" : "NO";
    }
}
