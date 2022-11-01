public class LinearEquation {
    private final int x1, y1, x2, y2;
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public void lineInfo() {
        int slopen = y2 - y1;
        int sloped = x2 - x1;
        double slope = (double) slopen/sloped;
        double yint = y1 - ((slope)*x1);
        double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")");
        System.out.println("The equation of the line between these points is: y = " + slopen + "/" + sloped
        + "x + " + yint);
        System.out.println("The slope of this line is: " + slope);
        System.out.println("The y-intercept of this line is: " + yint);
        System.out.println("The distance between the two points is: " + distance);


    }
}
