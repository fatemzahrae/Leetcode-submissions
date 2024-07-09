import java.math.BigDecimal;
import java.math.RoundingMode;

class averageWaitingTime {
    
    public double averageWaitingTimee(int[][] customers) {

        BigDecimal totalWaitingTime = BigDecimal.valueOf(customers[0][1]) ;
        int lastServe = customers[0][0] + customers[0][1] ;

        if (customers.length == 1 ) return customers[0][1] ;
        else{
            for (int i=1 ; i<customers.length ; i++ ){
                int wait = lastServe - customers[i][0] ;
                if (wait >= 0){
                    totalWaitingTime = totalWaitingTime.add(BigDecimal.valueOf(wait + customers[i][1])) ;
                    lastServe += customers[i][1] ;
                }
                else {
                    totalWaitingTime = totalWaitingTime.add(BigDecimal.valueOf( customers[i][1]) );
                    lastServe = customers[i][0] + customers[i][1] ;
                }
                
            }
            BigDecimal numberOfCustomers = BigDecimal.valueOf(customers.length);
            BigDecimal averageWaitingTime = totalWaitingTime.divide(numberOfCustomers, 10, RoundingMode.HALF_UP);
            
            return averageWaitingTime.doubleValue();
        }
    }
}