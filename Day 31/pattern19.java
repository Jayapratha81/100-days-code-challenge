import java.util.*;
class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            for(int j=i+1;j<2*i;j++)
            {
                System.out.print("  ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
