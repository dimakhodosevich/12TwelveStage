package by.itstep.khodosevich.twelveproject.module.logic;

public class Bishop {
    public static String isValidBishopStep(int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2) {
            return "NO";
        }

        int x = x1 - x2;
        x = x > 0 ? x : -x;
        int y = y1 - y2;
        y = y > 0 ? y : -y;
        return (x == y) ? "YES" : "NO";
    }
}
