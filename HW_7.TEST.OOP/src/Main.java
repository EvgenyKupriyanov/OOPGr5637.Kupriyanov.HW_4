public class Main {
    public static void main(String[] args) {


        //Calculator calc = new Calculator();
        //Logger logCalc = new Logger();

        // iCalculat newСalc = new Decorator(calc, logCalc);
        iCalculat newСalc = new Decorator(new Calculator(), new Logger());
        View calcView = new View(newСalc);
        calcView.run();



    }
}