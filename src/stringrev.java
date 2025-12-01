public class stringrev {
    void main(){
        String a=" akash ramesh shivram ";
        String b[]=a.split(" ");
        String c="";
        String d="";

        for(int i=b.length-1; i>0; i--)
        {
            c=c+b[i]+' ';
        }
        System.out.println(c);
        if(a.equals(b))
        {
           System.out.println("is palandrom");
        }
        else{
            System.out.println("not palandrom");
        }
        for(int j=0; j<b.length; j++)
        {
            char ch=d.charAt(j);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o' )
            {
                System.out.print(ch);
            }
        }
    }
}
