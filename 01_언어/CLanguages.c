/* 실행 순서
1. Users/oakmi/공부/jeongchogi/01_언어 <- 여기까지 경로 이동 후 
2. clang -o CLanguages CLanguages.c
3. ./CLanguages
*/

// [기출 예제]
// 20년 3회 실기
// 1. 다음 C언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오.
// (단, 출력물의 출력 서식을 준수하시오.)

// #include <stdio.h>

// int r1() {
//     return 4;
// }
// int r10() {
//     return(30+r1());
// }
// int r100() {
//     return (200+r10());
// }
// int main() {
//     printf("%d\n", r100());
//     return 0;
// }

// 23년 3회 실기
// 2. 다음 C 프로그램 출력 결과 구하기

// #include <stdio.h>

// int test(int n) {
//     int i, sum = 0;

//     for(i = 1; i <= n / 2; i++) {
//         if(n % i == 0)
//         sum += i;
//     }
//     if (n == sum)
//         return 1;
//     return 0;
// }

// int main() {
//     int i, sum = 0;

//     for (i = 2; i <= 100; i++){
//         if(test(i))
//         sum += i;
//     }
//     printf("%d ", sum);
//     return 0;
// }

// 22년 3회 실기
// 3. 다음 C언어로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오.

// #include <stdio.h>

// int main() {
//     int n;
//     int k;
//     int s;
//     int el = 0;

//     for(n=6; n<=30; n++) {
//         s=0;
//         k=n/2;
//         for(int j=1; j <= k; j++) {
//             if (n%j==0){
//                 s=s+j;
//             }
//         }
//         if(s==n){
//             el++;
//         }
//     }
//     printf("%d", el);
//     return 0;
// }

// 23년 2회 실기
// 4. 다음 C 프로그램 출력 결과 구하기

// #include <stdio.h>

// int main() {
//     int n[3] = {73, 95, 82};
//     int i, sum = 0;

//     for(i = 0; i < 3; i++){
//         sum += n[i];
//     }

//     switch (sum / 30)
//     {
//     case 10:
//     case 9:
//         printf("A");
//     case 8:
//         printf("B");
//     case 7:
//     case 6:
//         printf("C");
//     default:
//         printf("D");
//     }
// }