public class Location {
    private int column;
    private int row;
    private double maxValue;

    public Location() {
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }



    public void setColumn(int column) {
        this.column = column;
    }

    private void setRow(int row) {
        this.row = row;
    }

    public static Location locateLargest(double[][] a) {
        Location location = new Location();
        double max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max <= a[i][j]) {
                    max = a[i][j];
                    location.setRow(i);
                    location.setColumn(j);
                    location.setMaxValue(max);
                }
            }
        }
        return location;
    }

}