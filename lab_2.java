package lab_2;

import java.util.Scanner;

class SizeAr {
    int mass[];
    SizeAr(int n[]) {
        mass = n;
    }
    void Conclusion () {
        Inner inOb = new Inner();
        System.out.println("max: " + inOb.max());
        System.out.println("min: " + inOb.min());
        System.out.println("awg: " + inOb.avg());
        System.out.println("mediana: " + inOb.mediana());
        System.out.println("geom: " + inOb.sgeom());
    }
    class Inner {
        int max() {
            int m = mass[0];
            for(int i = 1; i < mass.length; i++)
                if(mass[i] > m) m = mass[i];
            return m;
        }
        int min() {
            int m = mass[0];
            for(int i=1;i<mass.length;i++)
                if(mass[i]<m) m=mass[i];
            return m;
        }
        int avg() {
            int a = 0;
            for(int i=0;i<mass.length;i++)
                a+=mass[i];
            return a / mass.length;
        }
        double mediana() {
            int m=0;
            if(mass.length%2!=0)
                m =mass[mass.length / 2];
            else
                m =(mass[mass.length/2] + mass[(mass.length/2)-1])/2;
            return m;
        }
        double sgeom() {
            double g=0;
            for(int i=0;i<mass.length;i++)
                g*=mass[i];
            return g/mass.length;
        }//не работает

    }
}

class Quicksort {

    static void qsort(int items[]) {
        quicks(items, 0, items.length - 1);
    }
    private static void quicks(int items[], int left, int right) {
        int i, j;
        int a, b;
        i=left;j=right;
        a=items[(left+right)/2];
        do {
            while((items[i]<a)&&(i<right))i++;
            while((a<items[j])&&(j>left))j--;
            if(i<=j) {
                b=items[i];
                items[i]=items[j];
                items[j]=b;
                i++;j--;
            }
        } while(i<=j);
        if(left<j) quicks(items, left, j);
        if(i<right) quicks(items, i, right);
    }
}
public class lab_2 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = s.nextInt();
        int[] ar = new int [size];
            for(int i=0;i<size;i++) {
                System.out.print("Введите элемент "+i+":");
                ar[i]=s.nextInt();
                System.out.println();
            }
        Quicksort.qsort(ar);
        SizeAr SizeArOb = new SizeAr(ar);
        SizeArOb.Conclusion();
    }
}