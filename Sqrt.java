public class Sqrt {
    public int mySqrt(int x) {
        if (x==0 | x==1) return x;
        else {
            int left = 0 ;
            int right = x ; 
            int m = -1 ;
            while (left <= right) {
                m = left + (right -left) /2 ;
            
                if (m == x/m) return m ;

                else if (m > x/m){
                    right = m-1 ;

                }else left = m+1 ;
            }
            return right;
        }
    }
}
