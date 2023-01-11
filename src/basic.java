public class basic {
    public static void main(String[] args) {

        String a="hello";
        System.out.println(a.endsWith("hy"));
        System.out.println(a.charAt(2));
        System.out.println(a.indexOf('e'));
        System.out.println(a.contentEquals("hello"));
        System.out.println(a.startsWith("hy"));

        String name="hello <|name|>, thanks a lot";
        System.out.println(name.replace("<|name|>","mahesh"));

        System.out.println(("hello harry  \n how your day\n thank you"));

    }
}
