package beggnierjava;

public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Jagreet");
        sb.append(" Dangi");
        sb.deleteCharAt(4);
        System.out.println(sb);
    }
}
