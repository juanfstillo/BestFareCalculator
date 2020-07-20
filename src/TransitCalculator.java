class TransitCalculator {
 protected int numD;
 protected int rides;
 String[] pay = {"Pay-per-ride","7-day Unlimited","30-day Unlimited"};
  Double[] prices = {2.75, 33.00, 127.00};

TransitCalculator(int numD, int rides){
if(numD>0 && numD<30 && rides>1){
 this.numD = numD;
 this.rides = rides;
}else{
  System.out.print("Invalid input");
}
}
public double unlimited7Price(){
  int passNum = numD/7;
  if(numD%7==0)passNum++;
  double TotalCost7 = passNum * prices[1];
  return TotalCost7 ; 
}
public double[] getRidePrices(){
double ridePrices[]={prices[0],unlimited7Price(),prices[2]};
return ridePrices;}

public String getBestFare(){
  int num = 0;
  for(int i=1; i<=2;i++){
    if(getRidePrices()[i]<getRidePrices()[num])
    {num = i;}
  }
    return "You should get the "+ pay[num]+" option at " +getRidePrices()[num]/rides+ " per ride";
  }


public static void main(String[] args){
  TransitCalculator one = new TransitCalculator(20,400);
  System.out.println(one.getBestFare());

}
}