package methodoverriding24;

 class Test2  {
     public static void main(String args[]){
         SBI s=new SBI();
         ICICI i=new ICICI();
         AXIS b=new AXIS();
         System.out.println("SBI Rate of Interest: "+s.getRateOfinterest());
         System.out.println("ICICI Rate of Interest: "+i.getRateOfinterest());
         System.out.println("AXIS Rate of Interest: "+b.grtRateOfinterest());
     }
}
