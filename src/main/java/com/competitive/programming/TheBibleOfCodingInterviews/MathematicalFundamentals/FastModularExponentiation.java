
package com.competitive.programming.TheBibleOfCodingInterviews.MathematicalFundamentals;

//Complexity = O(Log(n))
public class FastModularExponentiation {

    long recursive(long a, long n, int mod){
        if(n == 0) return 1;
        if(n % 2 == 0) return recursive((a * a) % mod, n/2, mod);
        return (a * recursive(a, n-1,mod)) % mod;
    }

    long iterative(long a, long n, int mod){
        long result = 1;
        while(n > 0){
            if(n % 2 == 0){
                a = (a * a) % mod;
                n /= 2;
            }
            else {
                result = (a * result) % mod;
                n--;
            }

        }
        return result;
    }
}
