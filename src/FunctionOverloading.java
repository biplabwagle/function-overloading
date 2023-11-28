public class FunctionOverloading {
    public static void main(String[] args) {
    /*
        "Function overloading" refers to the situation in which two or more functions
        share the same name but have different types or counts of parameters.
        Because of this capability, a single function name can be utilized,
        depending on the context in which it is called, for several purposes.
        It is a type of polymorphism that is frequently employed to improve
        the readability and structure of code. Below we have different print methods
        which gets invoked based on the type of parameter that is passed.
     */
        FunctionOverloading fo = new FunctionOverloading();
        //Printing single message
        fo.print("Single Message");
        //Printing array of message
        fo.print(new String[]{"First message", "Second message"});
        //Printing single character
        fo.print('B');
        //Printing an int concatenated to string
        fo.print(1);
        //Printing a double value concatenated to string
        fo.print(1.34);
    }
    public void print(String message) {
        System.out.println("Printing message: " + message);
    }

    public void print(String[] messages) {
        String allMessages ="";
        for(String message : messages){
            System.out.println(allMessages += message + " ");
        }
        System.out.println("Printing messages: " + allMessages);
    }

    public void print(char c ){
        System.out.println("Printing character:" + c);
    }

    public void print(int i){
        System.out.println("Printing integer: " + i );
    }
    public void print(double d){
        System.out.println("Printing double: " + d);
    }
}