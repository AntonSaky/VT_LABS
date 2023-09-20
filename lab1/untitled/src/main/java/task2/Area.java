package task2;

public class Area {
    //first rectangle(fr)
    private final int fr_TOP= 5;
    private final int fr_BOTTOM = 0;
    private final int fr_LEFT = -4;
    private final int fr_RIGHT = 4;
    //second rectangle(sr)
    private final int sr_TOP = 0;
    private final int sr_BOTTOM = -3;
    private final int sr_LEFT = -6;
    private final int sr_RIGHT = 6;

    private boolean isInFirstArea(double x, double y){
        return (x >= fr_LEFT && x <= fr_RIGHT) && (y >= fr_BOTTOM && y <= fr_TOP);
    }

    private boolean isInSecondArea(double x, double y){
        return (x >= sr_LEFT && x <= sr_RIGHT) && (y >= sr_BOTTOM && y <= sr_TOP);
    }

    protected boolean isInArea(double x, double y){
        return isInFirstArea(x, y) || isInSecondArea(x, y);
    }
}
