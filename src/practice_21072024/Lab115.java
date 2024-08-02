package practice_21072024;

public class Lab115 {
    public static void main(String[] args) {
              function_type1();

       String name =  function_type2();
        System.out.println(name);

        function_type3("Rajkumar");

        int res = function_type4(4,3);
        System.out.println(res);

    }

   // without parameter without function
    static  void function_type1(){
        System.out.println("without parameter without function");
    }

    // without parameter with return type
    static String function_type2(){
        return "Rajkumar";
    }


    //with paramater without return type
    static void function_type3(String name){
        System.out.println("name is: " + name);
    }

    // with parameter with return type

    static int function_type4(int a, int b){
        return a+b;
    }
}
