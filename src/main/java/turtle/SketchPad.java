package turtle;

public class SketchPad {
    private int[][] floor;

    public SketchPad(int floorRow, int floorColumn) {
        floor = new int[floorRow][floorColumn];

    }

    @Override
    public String toString() {
        String toBeReturn = " ";
        for (var row : floor) {
            for (var column : row) {
                if(column == 0) toBeReturn += " ";
                if(column == 1) toBeReturn +="* ";
            }
            toBeReturn+="\n";
        }
        return  toBeReturn;
    }

    public int[][] getFloor() {
        return floor;
    }
}
