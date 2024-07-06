import java.util.StringJoiner;
class TestMain{
    public static void main(String args[]){
        String s1 = "c";
        String s2 = "h";
        String s3 = "e";
        String s4 = "e";
        String s5 = "k";
        String s6 = "u";
        // "c.h.e.e.k.u" "c h e e k u"
        StringJoiner sj = new StringJoiner(".","[","]");
        sj.add(s1);
        sj.add(s2);
        sj.add(s3);
        sj.add(s4);
        sj.add(s5);
        sj.add(s6);
        String result = sj.toString();
        System.out.println(result);
    }
}