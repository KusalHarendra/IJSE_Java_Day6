class AddressMethod{
    public static void printAddress(){          //Sub method
        System.out.println("No 344/A,");
        System.out.println("Galle Road, Kalutara North,");
        System.out.println("Kalutara");
    }    
    public static void main(String [] args){        //main method
        printAddress();                             //calling to sub method
    }
}