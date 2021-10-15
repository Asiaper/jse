package m02.s10;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i < args.length) {
//        	String s = " The argument " + i + " is "+ args[i];
        	String s = " The argument ";
        	s = s + i;
        	s = s + " is ";
        	s = s + args [i];
        	
            System.out.println(s);
            System.out.println("The argument " + i + " is " + args [i]);
            i += 1;
            // i++;
            // ++i;
            // i = i + 1;
        }

        System.out.println("done!");
    }
}
