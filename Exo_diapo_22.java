public class Point
{
    double x, y;
    Point (double x, double y)
    {
        this.x=x;
        this.y=y;
    }


    Point(Point p)
    {
        this.x = p.x;
        this.y = p.y;
    }

    Point()
    {
        this.x=0;
        this.y=0;
    }


    void afficher() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }



     double distance(Point p){
        return Math.sqrt((this.x- p.x)*(this.x-p.x)
                + ( this.y-p.y) * (this.y-p.y));
    }

    void deplacer (double dx, double dy)
    {
        this.x=this.x+ dx;
        this.y=this.y+dy;
    }
}

class TestPoint {
    public static void main(String[] args){
        Point p1 = new Point(3, 4);
        Point p2 = new Point();
        Point p3 = new Point(p1);
        System.out.println("P2: " +p2.x+","+p2.y);
        p3.afficher();
        System.out.println(p1.distance(p2));
        p3.deplacer(-3,-2);
        p3.afficher();
    }
}
