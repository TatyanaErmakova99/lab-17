public class Main {

    private static String srcFile;

    private static String dstFile;

    private static int buffer;

    public static void main(String[] args) {

	    for(String str: args){

	        String[] key_val = str.split("=");

	        if(key_val[0].compareTo("--srcfile") == 0)

	            srcFile = key_val[1];

            if(key_val[0].compareTo("--dstfile") == 0)

                dstFile = key_val[1];

            if(key_val[0].compareTo("--buffer") == 0)

                buffer = Integer.parseInt(key_val[1]);

        }

        System.out.println(srcFile);

        System.out.println(dstFile);

        System.out.println(buffer);

    }

}