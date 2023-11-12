import java.util.Stack;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        String msg = "-+u+s+c-+e+r+t-+a-+i-+s+t+r-+y+u-+l+e+s";
        System.out.println("Afisare cate un caracter pe fiecare linie, Task 1.");
        //charAt(); The charAt() method returns the character at the specified index in a string.
        //The index of the first character is 0, the second character is 1, and so on.
        //Throws:	IndexOutOfBoundsException - if index is negative or not less than the length of the specified string
        for(int i=0; i<msg.length(); i++){
            System.out.println(msg.charAt(i));
        }
        System.out.println("Sfarsit Task 1.");
        System.out.println("Inceput Task 2.");
        for(int i=0; i<msg.length(); i++){
            if(msg.charAt(i)=='+' || msg.charAt(i)=='-'){
                System.out.println(msg.charAt(i));
            }
        }
        System.out.println("Sfarsit Task 2.");
        System.out.println("Inceput Task 3.");
        //creare obiect de tip Stack
        Stack<Character> stiva=new Stack<>();
        //Character i=0;
        int i=0;
        do{
            i++;
            if(msg.charAt(i)=='+'){
                System.out.println("Inserare in Stiva.");
               // stiva.push(i); Daca am i de tip Character
                stiva.push(msg.charAt(i+1));//Pushes an item onto the top of this stack.
            }
            else if(msg.charAt(i)=='-' && !(stiva.isEmpty())){
                System.out.println("Caracter eliminat din stiva.");
                stiva.pop();//Removes the object at the top of this stack and returns that object as the value of this function.
            }
        }while(i<msg.length()-1);
        System.out.println("Elemente ramase in stiva: "+stiva.size());
        System.out.println("Mesajul afisat de elementele ramase: ");
        StringBuilder mesajRamas=new StringBuilder();//este o clasa
        //The principal operations on a StringBuilder are the append and insert methods, which are overloaded so as to accept data of any type.
        while(!(stiva.isEmpty())){
            mesajRamas.insert(0,stiva.pop());
        }
        System.out.println(mesajRamas);
        System.out.println("Sfarsit Task 3.");
        /*StringBuilder este o clasă specializată pentru construirea și modificarea eficientă a șirurilor de caractere. Acesta permite adăugarea, ștergerea și modificarea conținutului șirului de caractere fără a crea șiruri intermediare noi. Acest lucru face ca operațiile de construcție a șirului să fie mai rapide și mai eficiente.
        În codul tău, atunci când dorești să aduni caracterele rămase din stivă, folosind StringBuilder, efectuezi următoarele operații:
        Inițializezi un obiect StringBuilder gol cu StringBuilder remainingMessage = new StringBuilder();.
        În interiorul buclei while, pentru fiecare caracter rămas în stivă, îl adaugi la începutul șirului de caractere folosind insert(0, caracter). Acest lucru asigură că caracterele sunt adăugate în ordinea corectă.
        După ce ai terminat de construit șirul de caractere dorit, îl obții ca un șir de caractere normal cu toString() și îl afișezi folosind System.out.println(remainingMessage.toString());.
        Folosirea StringBuilder în acest mod este mai eficientă din punct de vedere al performanței decât să construiești șiruri de caractere folosind + sau concatenare repetată, deoarece minimizează crearea de șiruri intermediare și alocația repetată de memorie.*/
        System.out.println("Inceput Task 4.");
        // Adaugarea elementelor in stiva
        for (int j = 0; j < msg.length(); j++) {
            if (j<msg.length()-1 && msg.charAt(j) == '+') {
                stiva.push(msg.charAt(j + 1));
            }
        }
        Iterator<Character> iterator= stiva.iterator();
        while(iterator.hasNext()){
            Character element=iterator.next();
            System.out.println(element);
        }
    }
}
/*n acest exemplu, am creat un obiect Iterator pentru stivă și am folosit un ciclu while pentru a parcurge elementele rămase în stivă. Astfel, elementele stivei sunt afișate pe câte o linie, similar cu cum ai parcurge o colecție obișnuită.
Up-casting-ul se face automat deoarece Stack este o subclasă a clasei Vector în Java, și implicit, Stack poate fi tratat ca o colecție.*/