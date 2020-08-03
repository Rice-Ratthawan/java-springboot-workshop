public class HelloWorld1 {

    public String sayHi() {
        return "Hello World from Method";
    }

    public String sayHi(String input) {
        /* String firstLetter = name.substring(0,1);
        *  String remainLetters = name.substring(1);
        *  return "Hello "+ firstLetter.toUpperCase()+remainLetter */
        String output = input.substring(0, 1).toUpperCase() + input.substring(1);
        return "Hello"+" "+output;
    }


}
