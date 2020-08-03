public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //New Object/Create Instance
        HelloWorld h = new HelloWorld();
        //variable name result type string get value from method sayHi
        String result = h.sayHi();
        System.out.println(result);
    }

    private String sayHi() {
        return "Hello World from Method";
    }


}
