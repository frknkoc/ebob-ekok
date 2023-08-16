import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);

        while (1 > 0){
            System.out.println("İlk sayıyı giriniz :");
            n1 = input.nextInt();
            System.out.println("İkinci sayıyı giriniz :");
            n2 = input.nextInt();
            System.out.println("Yapmak istediğiniz işlemi seçiniz :\n1- Ebob\n2- Ekok");
            select = input.nextInt();
            int ebob = 1, ekok = 1;
            if (select == 1){
                if ( n1 < n2) {
                    for (int i = 1; i <= n1; i++){
                        if (n1%i == 0 && n2%i == 0){
                            ebob = i;
                        }
                    }
                    System.out.println(n1 + " ve " + n2 + "'nin Ebob'u " + ebob);
                } else if (n1>n2) {
                    for (int i = 1; i <= n2; i++){
                        if (n1%i == 0 && n2%i == 0){
                            ebob = i;
                        }
                    }
                    System.out.println(n1 + " ve  " + n2 + " 'nin Ebob'u " + ebob);
                } else {
                    for (int i = 1; i <= n1; i++){
                        if (n1%i == 0 && n2%i == 0){
                            ebob  = i;
                        }
                    }
                    System.out.println(n1 + " ve  " + n2 + " 'nin Ebob'u " + ebob);
                }
            } else if (select == 2){
                if ( n1 < n2) {
                    for (int i = 1; i <= n1; i++){
                        if (n1%i == 0 && n2%i == 0){
                            ebob = i;
                        }
                    }
                    ekok = (n1 * n2) / ebob;
                    System.out.println(n1 + " ve " + n2 + "'nin Ekok'u " + ekok);
                } else if (n1>n2) {
                    for (int i = 1; i <= n2; i++){
                        if (n1%i == 0 && n2%i == 0){
                            ebob = i;
                        }
                    }
                    ekok = (n1 * n2) / ebob;
                    System.out.println(n1 + " ve " + n2 + "'nin Ekok'u " + ekok);
                } else {
                    for (int i = 1; i <= n1; i++){
                        if (n1%i == 0 && n2%i == 0){
                            ebob  = i;
                        }
                    }
                    ekok = (n1 * n2) / ebob;
                    System.out.println(n1 + " ve " + n2 + "'nin Ekok'u " + ekok);
                }
            } else {
                System.out.println("Lütfen 1 veya 2'yi seçiniz");
            }
        }
    }
}