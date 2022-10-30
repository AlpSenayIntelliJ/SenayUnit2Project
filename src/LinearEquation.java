public class LinearEquation {
    private int x1, x2, y1, y2;
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
