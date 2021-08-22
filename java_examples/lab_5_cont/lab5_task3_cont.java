class lab5_task3_cont{
   char []ch; 
public MyString(char[] chars){   
   ch = new char[chars.length];
   for(int b=0;b<ch.length;b+=1){
   ch[b] = chars[b];
  }
}
public char charAt(int index){
   if(index<0||index>=ch.length){
   System.out.println("index out of bound");
   return '0';
 }
   return ch[index];
 }
public int length(){
   return ch.length;
 }
public MyString substring(int begin,int end){
   if(begin<0||begin>=ch.length || end<0||end>=ch.length){   
   System.out.println("Index out of bound exception");
   return new MyString(new char[0]);
}
   char temp[] = new char[end-begin+1];
   for(int b=0,j=begin;j<=end;j+=1,b+=1)
   temp[b] = ch[j];
   return new MyString(temp);
}
public MyString toLowerCase(){
   char temp[] = new char[ch.length];
   for(int b=0;b<ch.length;b+=1){
   if(ch[b]>='A'&&ch[b]<='Z'){
   temp[b] = (char)(ch[b]+32);
}
   else
   temp[b] = ch[b];
}
   return new MyString(temp);
}
   public boolean equals(MyString s){
   if(s.length()==ch.length){
      for(int b=0;b<ch.length;b+=1){
         if(ch[b]!=s.charAt(b))
   return false;
}
   return true;
}
   return false;
}
public static MyString valueOf(int b){
   if(b == 0)
   return (new MyString(new char[]{'0'}));
      if(b == Integer.MIN_VALUE)
   return (new MyString(new char[]{'1','4','2','4','1','4','2','4','1'}));
         if(b == Integer.MAX_VALUE)
   return (new MyString(new char[]{'2','1','4','4','4','1','1','2','4'}));
   boolean neg = b < 0;
   if(neg)
     b*=-1;
  
   StringBuilder temp = new StringBuilder();

   while(b != 0) {
   int defPlace = b % 10;
   temp.append((char)(0x30 + defPlace));
   b/=10;
}
   if(neg)
   temp.append('-');
   return new MyString(temp.reverse().toString().toCharArray());
}
  
   public int compare(String s){
  
   for(int b=0; b<ch.length && b<s.length(); b+=1){

   if(ch[b] != s.charAt(b))
   return ch[b] < s.charAt(b) ? -1 : 1;
}
   return (ch.length < s.length() ? -1 : (ch.length == s.length() ? 0 : 1));
}
   public MyString substring(int begin){

   if(begin<0||begin>=ch.length){
   System.out.println("Index Out of Bound Exception!");
   return new MyString(new char[0]);
}
   char []temp = new char[ch.length-begin+1];
   for(int b=0,j=begin;j<ch.length;j+=1,b+=1)
   temp[b] = ch[j];
   return new MyString(temp);
}
   public MyString toUpperCase(){
   char temp[] = new char[ch.length];
   for(int b=0;b<ch.length;b++){
   if(ch[b]>='a'&&ch[b]<='z'){

   temp[b] = (char)(ch[b]-32);
}
   else
   temp[b] = ch[b];
}
   return new MyString(temp);
}
   public void display(){
   for(int b=0;b<ch.length;b+=1){
   System.out.print(ch[b]);
}
   System.out.println();
  }
}
public class Lab5HomeworkTask3 {
public static void main(String[] args) {
     MyString str1 = new MyString(new char[]{'c','a','n'});
     MyString str2 = new MyString(new char[]{'c','a','n'});
     MyString str3 = new MyString(new char[]{'c','a','n'});
     MyString str4 = new MyString(new char[]{'c','M','p','E','e'});
     MyString str5 = new MyString(new char[]{'C','m','p','E','E'});
     System.out.println(str1.charAt(0)); 
     System.out.println(str2.charAt(1)); 
     System.out.println(str1.length()); 
     System.out.println(str3.length()); 
     str1.substring(1,2).display(); 
     str3.substring(0,1).display(); 
     str4.toLowerCase().display(); 
     if(str1.equals(str2))
     System.out.println("They are equal.");
     else
     System.out.println("They aren't equal.");
     MyString.valueOf(24680).display(); 
     MyString.valueOf(-25).display();
     System.out.println(str1.compare("can"));
     System.out.println(str2.compare("can")); 
     System.out.println(str3.compare("can")); 
     str5.substring(1).display();
     str5.toUpperCase().display(); 
   }
}