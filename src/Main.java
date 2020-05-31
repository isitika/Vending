import static java.lang.StrictMath.random;


public class Main{


    public static void main(String args[]) {
        double r= 200;
        double circle=0;
        double sq=0;
        int i=0;


        while(i==0)
        {
            for(int j=0;j<1000000;j++)
            {
                double x= random()*r;
                double y= random()*r;

                double d= x*x+y*y;
                sq++;
                if(d<r*r)
                {
                    circle++;
                }
            }
            System.out.println((double)4*circle/sq);

        }




    }
}


