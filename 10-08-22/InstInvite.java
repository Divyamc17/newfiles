import java.nio.charset.Charset;
class InstInvite{
  public static void main (String[] in){
	 
    //String()	 
   String state =new String();
   System.out.println(new String(state));
   
   //String(byte[] bytes);
    byte[] bytes = new byte[]{68,73,86,89,65};
    System.out.println(new String(bytes, Charset.forName("ASCII")));
    
  // String(byte[] bytes, int offset, int length)
     byte[] byt=new byte[]{68,73,86,89,65};
	 String see=new String(byt,1,3);
    System.out.println(see);
  
   //String(byte[] bytes, int offset, int length, Charset charset);
   byte[] nam=new byte[]{68,73,46,49,65};
   String sees=new String(nam,1,3, Charset.forName("ASCII"));
   System.out.println(sees);
   
   	//String(byte[] bytes, int offset, int length, String charsetName);
   // byte[] show=new byte[] {68,73,86,89,65};
    //  String stg="ASCII"
	//String shows=new String(show,1,3,"ASCII");
	//System.out.println(shows);

    //String(byte[] bytes, String charsetName);
     byte[] number=new byte[]{68,73,86,89,65};
	 String opn="eng";
	 String num=new String (number,opn);
	 System.out.println(num);

   
  }
}