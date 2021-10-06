class Vehicle
  {
     protected String brand = "Ford";
       public void honk()
       {
          System.out.println("TUTU, YUUY!");
          }
}
        

Class Car extends Vehicle
     {
       private String modelname = "Mustang";
        public static void main(String args[])
                {
                    Car myCar = new car();
                       mycar.honk();
            
                System.out.println(myCar.brand + " " + myCar.modelname);
}
}				