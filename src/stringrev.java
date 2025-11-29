public class stringrev {
    void main(){
        String a=" akash ramesh shivram ";
        String b[]=a.split(" ");
        String c="";

        for(int i=b.length-1; i>0; i--)
        {
            c=c+b[i]+' ';
        }
        System.out.println(c);
    }
}
