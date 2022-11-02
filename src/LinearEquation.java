public class LinearEquation {
    private final int x1, y1, x2, y2;
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double roundedToHundredth(double x) {
        return Math.round(x*100)/100.0;
    }
    public void lineInfo() {
        int slopen = y2 - y1;
        int sloped = x2 - x1;
        double slope = (double) slopen/sloped;
        double yint = y1 - ((slope)*x1);
        double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println();
        System.out.println("The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")");
        if (((int) (slope)) == slope) {
            if (slope == 1) {
                if (yint < 0) {
                    System.out.println("The equation of the line between these points is: y = x - " + Math.abs(roundedToHundredth(yint)));
                }
                else if (yint == 0) {
                    System.out.println("The equation of the line between these points is: y = x");
                } else {
                    System.out.println("The equation of the line between these points is: y = x + " + roundedToHundredth(yint));
                }
            }
            else if (slope == -1) {
                if (yint < 0) {
                    System.out.println("The equation of the line between these points is: y = -x - " + Math.abs(roundedToHundredth(yint)));
                }
                else if (yint == 0) {
                    System.out.println("The equation of the line between these points is: y = -x");
                } else {
                    System.out.println("The equation of the line between these points is: y = -x + " + roundedToHundredth(yint));
                }
            } else {
                if (yint < 0) {
                    if (slope == 0) {
                        System.out.println("The equation of the line between these points is: y = -" + Math.abs(roundedToHundredth(yint)));
                    }
                    else if (slope < 0) {
                        System.out.println("The equation of the line between these points is: y = -" + (int) (Math.abs(roundedToHundredth(slope))) + "x - " + Math.abs(roundedToHundredth(yint)));
                    } else {
                        System.out.println("The equation of the line between these points is: y = " + (int) (roundedToHundredth(slope)) + "x - " + Math.abs(roundedToHundredth(yint)));
                    }
                }
                else if (yint == 0) {
                    if (slope == 0) {
                        System.out.println("The equation of the line between these points is: y = 0");
                    }
                    else if (slope < 0) {
                        System.out.println("The equation of the line between these points is: y = -" + Math.abs(roundedToHundredth(slope)) + "x");
                    } else {
                        System.out.println("The equation of the line between these points is: y = " + roundedToHundredth(slope) + "x");
                    }
                } else {
                    if (slope == 0) {
                        System.out.println("The equation of the line between these points is: y = " + roundedToHundredth(yint));
                    }
                    else if (slope < 0) {
                        System.out.println("The equation of the line between these points is: y = -" + Math.abs(roundedToHundredth(slope)) + "x + " + roundedToHundredth(yint));
                    } else {
                        System.out.println("The equation of the line between these points is: y = " + roundedToHundredth(slope) + "x + " + roundedToHundredth(yint));
                    }
                }
            }
        } else {
            if (yint < 0) {
                if (slope == 0) {
                    System.out.println("The equation of the line between these points is: y = -" + Math.abs(roundedToHundredth(yint)));
                }
                else if (slope < 0) {
                    System.out.println("The equation of the line between these points is: y = -" + Math.abs(slopen) + "/" + Math.abs(sloped)
                            + "x - " + roundedToHundredth(yint));
                } else {
                    System.out.println("The equation of the line between these points is: y = " + Math.abs(slopen) + "/" + Math.abs(sloped)
                            + "x - " + roundedToHundredth(yint));
                }
            }
            else if (yint == 0) {
                if (slope == 0) {
                    System.out.println("The equation of the line between these points is: y = 0");
                }
                else if (slope < 0) {
                    System.out.println("The equation of the line between these points is: y = -" + Math.abs(slopen) + "/" + Math.abs(sloped)
                            + "x");
                } else {
                    System.out.println("The equation of the line between these points is: y = " + Math.abs(slopen) + "/" + Math.abs(sloped)
                            + "x");
                }
            } else {
                if (slope == 0) {
                    System.out.println("The equation of the line between these points is: y = " + roundedToHundredth(yint));
                }
                else if (slope < 0) {
                    System.out.println("The equation of the line between these points is: y = -" + Math.abs(slopen) + "/" + Math.abs(sloped)
                            + "x + " + roundedToHundredth(yint));
                } else {
                    System.out.println("The equation of the line between these points is: y = " + Math.abs(slopen) + "/" + Math.abs(sloped)
                            + "x + " + roundedToHundredth(yint));
                }
            }
        }
        System.out.println("The slope of this line is: " + roundedToHundredth(slope));
        System.out.println("The y-intercept of this line is: " + roundedToHundredth(yint));
        System.out.println("The distance between the two points is: " + roundedToHundredth(distance));
        System.out.println();


    }

    public void linePlugIn(double userx) {
        int slopen = y2 - y1;
        int sloped = x2 - x1;
        double slope = (double) slopen/sloped;
        double yint = y1 - ((slope)*x1);
        double yVal = ((userx*slope) + yint);
        System.out.println();
        System.out.print("The point on the line is: (" + roundedToHundredth(userx) + ", " + roundedToHundredth(yVal) + ")");
    }
}
