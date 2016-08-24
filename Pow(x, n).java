public class Solution {
    public double pow(double x, int n) {
        if(n==0x80000000) return pow(x, n/2)*pow(x, n/2);
        if(n==0) return 1;
        if(n==1) return x;
        if(n<0) return 1.0/pow(x, -n);
        double h = pow(x, n/2);
        if(n%2==0) return h*h;
        else return h*h*x;
    }
}
