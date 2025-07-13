// 기출예제

// 23년 2회 실기
// 1. 다음은 자바에 대한 문제이다. 알맞은 출력 값을 작성 하시오.

// public class Java{
//     public static void main(String[] args){
//         String str1 = "Programming";
//         String str2 = "Programming";
//         String str3 = new String("Programming");

//         System.out.println(str1 == str2);
//         System.out.println(str1 == str3);
//         System.out.println(str1.equals(str3));
//         System.out.println(str2.equals(str3));
//     }
// }

// 20년 1회 실기
// 2. 다음은 자바 소스코드이다. 출력 결과를 쓰시오.

// public class Java{
//     public static void main(String[] args){
//         int a[] = {0, 1, 2, 3};
//         for (int i : a){
//             System.out.print(i + " ");
//         }
//     }
// }

// 22년 3회 실기
// 3. 아래 자바 코드에서 출력되는 값을 작성하시오.

// class Java{
//     static int[] mkarr(){
//         int[] tmpArr = new int[4];

//         for (int i = 0; i < tmpArr.length; i++){
//             tmpArr[i] = i;
//         }
//         return tmpArr;
//     }

//     public static void main(String[] args){
//         int[] arr = mkarr();
//         for(int i : arr){
//             System.out.print(i);
//         }
//     }
// }

// 22년 2회 실기
// 4. 아래 자바 코드에서 출력되는 값을 작성하시오.

// class Java{
//     public static void main(String[] args){
//         Cond obj = new Cond(3);
//         obj.a=5;
//         int b = obj.func();
//         System.out.print(obj.a + b);
//     }
// }

// class Cond {
//     int a;
//     public Cond(int a){
//         this.a = a;
//     }
//     public int func(){
//         int b = 1;
//         for(int i = 1; i < a; i++){
//             b += a * i;
//         }
//         return a + b;
//     }
// }

// 22년 3회 실기
// 5. 아래 자바 코드에서 출력되는 값을 작성하시오.

// class Java{
//     public static void main(String[] args){
//         int a = 0;

//         for (int i = 1; i < 999; i++){
//             if(i % 3 == 0 && i % 2 == 0)
//                 a = i;
//         }
//         System.out.print(a);
//     }
// }

// 22년 3회 실기
// 6. 아래 자바 코드에서 출력되는 값을 작성하시오.

// public class Java{
//     public static void main(String[] args){
//         int result[] = new int[5];

//         int arr[] = { 77, 32, 10, 99, 50};

//         for (int i = 0; i < 5; i++){
//             result[i] = 1;

//             for (int j = 0; j < 5; j++){
//                 if(arr[i] < arr[j]){
//                     result[i]++;
//                 }
//             }
//         }
//         for (int k = 0; k < 5; k++){
//             System.out.print(result[k]);
//         }
//     }
// }

// 21년 1회 실기
// 7. 클래스 내에서 객체 생성 없이 사용할 수 있는 메소드로써 출력 결과를 작성하시오.

// public class Java{
//     public static void main(String[] args){
//         int i, j;
//         for(j=0, i=0; i <= 5; i++){
//             j+=i;
//             System.out.print(i);
//             if(i==5){
//                 System.out.print("=");
//                 System.out.print(j);
//             } else{
//                 System.out.print("+");
//             }
//         }
//     }
// }

// 20년 3회 실기
// 8. 다음은 자바 코드이다. 출력 결과를 쓰시오.

// public class Java{
//     public static void main(String[] args){
//         int i=0;
//         int sum=0;
//         while (i<10){
//             i++;
//             if(i%2 == 1)
//                 continue;
//             sum += i;
//         }
//         System.out.print(sum);  
//     }
// }

// 23년 3회 실기
// 9. 다음은 Java 코드이다. 올바른 출력 결과를 작성하시오.

// public class Java{
//     public static void main(String[] args){
//         A b = new B();
//         b.paint();
//         b.draw();
//     }
// }

// class A{
//     public void paint(){
//         System.out.print("A");
//         draw();
//     }
//     public void draw() {
//         System.out.print("B");
//         draw();
//     }
// }

// class B extends A {
//     public void paint() {
//         super.draw();
//         System.out.print("C");
//         this.draw();
//     }
//     public void draw() {
//         System.out.print("D");
//     }
// }

// 20년 2회 실기
// 10. 다음은 자바 코드이다. 출력 결과를 쓰시오. 

// class A {
//     private int a;
//     public A(int a){
//         this.a = a;
//     }
//     public void display() {
//         System.out.println("a=" + a);
//     }
// }

// class B extends A {
//     public B(int a){
//         super(a);
//         super.display();
//     }
// }

// public class Java{
//     public static void main(String[] args){
//         B obj = new B(10);
//     }
// }

// 21년 2회 실기
// 11. 다음은 JAVA 관한 문제이다. 알맞는 출력값을 작성하시오.

// public class Java{
//     public static void main(String[] args){
//         Java a1 = new Java();
//         Ovr2 a2 = new Ovr2();
//         System.out.println(a1.sun(3, 2) + a2.sun(3, 2));
//     }
//     int sun(int x, int y){
//         return x + y;
//     }
// }

// class Ovr2 extends Java{
//     int sun(int x, int y){
//         return x - y + super.sun(x, y);
//     }
// }

// 23년 1회 실기
// 12. 아래 자바 코드에서 출력되는 값을 작성 하시오.

// class Parent{
//     int x = 1000;

//     Parent(){
//         this(3000);
//     }
//     Parent(int x){
//         this.x = x;
//     }
// }

// class Child extends Parent{
//     int x = 4000;

//     Child(){
//         this(5000);
//     }
//     Child(int x){
//         this.x = x;
//     }
//     int getX(){
//         return x;
//     }
// }

// public class Java{
//     public static void main(String[] args){
//         Child obj = new Child();
//         System.out.println(obj.getX());
//     }
// }

// 23년 3회 실기
// 13. 다음은 Java 코드이다. 올바른 출력 결과를 작성하시오.

// class Parent{
//     int compute(int num){
//         if(num <= 1)
//             return num;
//         return compute(num - 1) + compute(num - 2);
//     }
// }

// class Child extends Parent {
//     int compute(int num){
//         if(num <= 1)
//             return num;
//         return compute(num - 1) + compute(num - 3);
//     }
// }

// public class Java {
//     public static void main(String[] args){
//         Parent obj = new Child();
//         System.out.println(obj.compute(7));
//     }
// }

// 20년 4회 실기 
// 14. 다음은 자바 소스 코드이다. 출력 결과를 쓰시오.

// class Parent{
//     public int compute(int num){
//         if(num <= 1) return num;
//         return compute(num - 1) + compute(num - 2);
//     }
// }
// class Child extends Parent {
//     public int compute(int num){
//         if(num <= 1) return num;
//         return compute(num - 1) + compute(num - 3);
//     }
// }
// class Java{
//     public static void main(String[] args){
//         Parent obj = new Child();
//         System.out.println(obj.compute(4));
//     }
// }

// 20년 2회 실기 
// 15. 다음은 자바 코드이다. 다음 밑줄에 들어갈 키워드를 쓰시오.

// class Parent {
//     public void show() {
//         System.out.println("Parent");
//     }
// }

// class Child extends Parent {
//     public void show() {
//         System.out.println("Child");
//     }
// }
// public class Java{
//     public static void main(String[] args){
//         Parent pa = ____ Child();
//         pa.show
//     }
// }

// 23년 1회 실기 
// 16. 다음 JAVA 코드에서 알맞는 출력 값을 작성하시오.

// abstract class Vehicle {
//     String name;
//     abstract public String getName(String val);

//     public String getName() {
//         return "Vehicle name: "+name;
//     }
// }

// class Car extends Vehicle {
//     private String name;
//     public Car(String val) {
//         name=super.name=val;
//     }
//     public String getName(String val) {
//         return "Car name :" + val;
//     }
//     public String getName(byte val[]) {
//         return "Car anem: " + val;
//     }
// }

// public class Java { 
//     public static void main(String[] args) {
//         Vehicle obj = new Car("Spark");
//         System.out.println(obj.getName());
//     }
// }

// 20년 3회 실기
// 17. 다음은 자바 코드이다. 출력 결과를 쓰시오.

// abstract class Vehicle {
//     String name;
//     abstract public String getName(String val);

//     public String getName() {
//         return "Vehicle name: "+name;
//     }
//     public void setName(String val) {
//         name = val;
//     }
// }

// class Car extends Vehicle {
//     private String name;
//     public Car(String val) {
//         setName=val;
//     }
//     public String getName(String val) {
//         return "Car name :" + val;
//     }
//     public String getName(byte val[]) {
//         return "Car anem: " + val;
//     }
// }

// public class Java { 
//     public static void main(String[] args) {
//         Vehicle obj = new Car("Spark");
//         System.out.print(obj.getName());
//     }
// }

// 21년 3회 실기
// 18. 다음 Java 코드에 대한 알맞는 출력값을 쓰시오.

// class Connection {
//     private static Connection _inst = null;
//     private int count = 0;

//     static public Connection get() {
//         if(_inst == null) {
//             _inst = new Connection();
//             return _inst;
//         }
//         return _inst;
//     }
//     public void count() {
//         count++;
//     }
//     public int getCount() {
//         return count;
//     }
// }
// public class Java {
//     public static void main(String[] args) {
//         Connection conn1 = Connection.get();
//         conn1.count();
//         Connection conn2 = Connection.get();
//         conn2.count();
//         Connection conn3 = Connection.get();
//         conn3.count();

//         System.out.print(conn1.getCount());
//     }
// }

// 22년 2회 실기
// 19. 아래 자바 코드에서 출력되는 값을 작성하시오.
// class Java {
//     public static void main(String[] args) {
//         int i = 3;
//         int k = 1;

//         switch(i) {
//             case 1: k += 1;
//             case 2: k++;
//             case 3: k = 0;
//             case 4: k += 3;
//             case 5: k -= 10;
//             default: k--;
//         }
//         System.out.print(k);
//     }
// }

// 21년 2회 실기
// 20. 클래스 내에서 객체 생성 없이 사용할 수 있는 메소드로써 출력 결과를 작성하시오.
// [출력결과]
// positive

// public class Java {
//     public static void main(String[] args) {
//         System.out.print(Java.check(1));
//     }
//     (____) String check(int num) {
//         return (num >= 0) ? "positive" : "negative";
//     } 
// }

// 21년 1회 실기
// 21. 다음은 JAVA 관한 문제이다. 알맞는 출력값을 작성하시오.

// public class Java {
//     public static void main(String[] args){
//         int[][] arr = new int[][] {{45, 50, 75}, {85}};
//         System.out.println(arr[0].length);
//         System.out.println(arr[1].length);
//         System.out.println(arr[0][0]);
//         System.out.println(arr[0][1]);
//         System.out.println(arr[1][0]);
//     }
// }

// 22년 1회 실기
// 22. 다음 Java 코드 중에서 밑줄에 들어갈 알맞는 코드를 작성하시오.

// class Car implements Runnable {
//     int a;

//     public void run() {
//         System.out.println("message");
//     }
// }
// public class Java {
//     public static void main(String[] args) {
//         Thread t1 = new Thread(new ___());
//         t1.start();
//     }
// }

// 23년 3회 실기
// 23. 다음 자바 코드를 실행할 경우 에러가 발생이 된다. 에러가 발생하는 라인명을 작성하시오.

// class Person {
//     private String name;
//     public Person(String val) {
//         name = val;
//     }
//     public static String get() {
//         return name;
//     }
//     public void print() {
//         System.out.println(name);
//     }
// }
// public class Java {
//     public static void main(Strint[] args) {
//         Person obj = new Person("Kim");
//         obj.print();
//     }
// }

// 23년 2회 실기
// 24. 다음은 JAVA 코드 문제이다.
// 가지고 있는 돈이 총 4620원일 경우
// 1000원, 500원, 100원, 10원의 지폐 및 동전을 이용하여 보기의 조건에
// 맞춰 최소한의 코드를 통해 괄호안을 작성하시오.
// [보기]
// 아래 주어진 항목들을 갖고 괄호안의 코드를 작성
// 변수 : m
// 연산자 : / , %
// 괄호 : [ , ] , ( , )
// 정수 : 1000, 500, 100, 10

// public class Java {
//     public static void main(String[] args) {
//         m = 4620;

//         a = (            );
//         b = (            );
//         c = (            );
//         d = (            );

//         System.out.println(a);  // 천원짜리 4장
//         System.out.println(b);  // 오백원짜리 1개
//         System.out.println(c);  // 백원짜리 1개
//         System.out.println(d);  // 십원짜리 2개
//     }
// }

// 22년 1회 실기
// 25. 아래 자바 코드에서 출력되는 값을 작성하시오.

// class A {
//     int a;
//     int b;
// }

// public class Java {
//     static void func1(A m){
//         m.a *= 10;
//     }
//     static void func2(A m) {
//         m.a += m.b;
//     }
//     public static void main(String[] args) {
//         A m = new A();

//         m.a = 100;
//         func1(m);
//         m.b = m.a;
//         func2(m);

//         System.out.printf("%d", m.a);
//     }
// }

// 20년 4회 실기
// 26. 다음은 n이 10일 때, 10을 2진수로 변환하는 자바 소스 코드이다. 1,2에 알맞는 값을 적으시오.
// [출력결과] : 00001010

// public class Java {
//     public static void main(String[] args) {
//         int[] a = new int[8];
//         int i = 0; 
//         int n = 10;
//         while (  1.  ) {
//             a[i++] = (  2. );
//             n /= 2;
//         }
//         for(i=7; i >= 0; i--) {
//             System.out.println(a[i]);
//         }
//     }
// }

// 21년 3회 실기
// 27. 다음 Java 코드에 대한 알맞는 출력값을 쓰시오.

// public class Java {
//     public static void main(String[] args) {
//         int a = 3, b = 4, c = 3, d = 5;
//         if ((a == 2 | a == c) & !(c > d) & (1 == b ^ c != d)) {
//             a = b + c;
//             if (7 == b ^ c != a) {
//                 System.out.println(a);
//             } else{
//                 System.out.println(b);
//             }
//         } else {
//             a = c + d;
//             if (7 == c ^ d != a) {
//                 System.out.println(a);
//             } else {
//                 System.out.println(d);
//             }
//         }
//     }
// }

// 20년 4회 실기
// 28. 다음은 자바 소스 코드이다. 출력 결과를 보고 , 1,2에 알맞는 값을 적으시오.
// [출력 결과]
// 1 4 7 10 13
// 2 5 8 11 14
// 3 6 9 12 15

// public class Java {
//     public static void main(String[] args) {
//         int[][] a = new int[( 1. )][(  2. )];
//         for(int i = 0; i < 3; i++) {
//             for(int j = 0; j < 5; j++) {
//                 a[i][j] = j*3+(i+1);
//                 System.out.print(a[i][j]+"");
//             }
//             System.out.println();
//         }
//     }
// }

// 23년 1회 실기
// 29. 아래 자바 코드에서 출력되는 값을 작성하시오.

// class Static {
//     public int a = 20;
//     static int b = 0;
// }
// public class Java {
//     public static void main(String[] args) {
//         int a;
//         a = 10;
//         Static.b = a;

//         Static st = new Static();

//         System.out.println(Static.b++);
//         System.out.println(st.b);
//         System.out.println(a);
//         System.out.print(st.a);
//     }
// }