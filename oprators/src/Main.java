public class Main {
public static void main(String[] args) {
      // arithmetical operator
    int a = 200;
    int b1 = 2 + a;
    System.out.println(b1);
       // assignment operator
    int b = 66;
    b+=5;
    b*=6;
    b/=3;
    System.out.println(b);
       //comparison operator
    System.out.println(66==66);
    System.out.println(66>44);
    System.out.println(34<4);
    System.out.println(77==66);
        // logical operator(&&)(||)
    System.out.println(45>5&&66<88);
   // and(&&) wale main sari baate sach hogi tabhi true ayega
   // ex--> 10 main se 10 baate sach hogi tabhi true hoga age
   // 9 baate sach ek glt to pura glt hoga
    System.out.println(34>5&&55>8&&66>7&&2<1);
    System.out.println(44>5||33<22);
    //or(||) wale main koi bhi true hone par true hota h
                //bitwise operator(&)(|)
    // & done 1 ho to ek hoga ; | aur wale main ek bhi 1 ho to 1 ho jata h
    System.out.println(2&3);
   // 2=10
    // 3=11
  //________
    //  10
    System.out.println(2|3);
    //2=10
    //3=11
    //--------
      // 11
}
}