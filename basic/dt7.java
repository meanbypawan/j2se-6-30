/*
   c/cpp: char
     char x = 'A'; // 1-byte
     a. in c char variable allocate 1 byte memory
     b. 1-byte = 8 bit = 2^8 = 256 character supported
     c. 8-bit wide : ASCII - 7, 8
   java: char
     a. in java char variable allocate 2 byte memory
     b. 2-byte = 16 bit = 2^16 = 65536 supported
     c. Unicode (16-bit hexadecimal code)

     Integere Data Representation
      a. Decimal Integer (0-9)
      b. Octal (0-7)
      c. Hexadecimal(0-9, a, b, c, d,e,f)
 */
class TestMain{
    public static void main(String args[]){
       int x = 95; // Decimal Integer
       int y = 065; // Octal
       int z = 0x95; // Hexa Decimal
       System.out.println(x);
       System.out.println(y);
       System.out.println(z);
    }
}