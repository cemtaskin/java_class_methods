class Main{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.number1=10;
        calculator.number2=20;

        System.out.println("Calculation Opeartions over a class");
        System.out.println("Addition : " + calculator.add());
        System.out.println("Substraction : " + calculator.substract());
        System.out.println("Multiply : " + calculator.multiply());
        System.out.println("Division : " + calculator.div());
        
    }
}