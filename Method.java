public class Method {

        // no parameter
        public void display() {
            System.out.println("Method without parameter");
        }

        // single parameter
        public void display(int a) {
            System.out.println("Method with a single parameter: " + a);
        }

    // Sum method
    public static int sum(int num1, int num2) {

        return num1 + num2;
    }
        public static void main(String[] args) {


            Method obj = new Method();

            //  no parameter
            obj.display();

            // single parameter
            obj.display(10);

            int sum1;

            sum1 = (5 + 10);


            System.out.println("Addition of num1 and num2 : " + sum1);
        }
    }

