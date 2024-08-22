#include<iostream>
using namespace std;

int maxPrimeFactors(long long n)
{
    /*
     * Find the largest prime factor of a positive integer
     * 'n'
     * @param n: positive integer (1 <= n <= 10^15)
     * @return: largest prime factor of n
     */
    int largest_prime = -1;
    for (int i = 2; i * i <= n; i++) {
        while (n % i == 0) {
            largest_prime = i;
            n = n / i;
        }
    }
    if (n > 1) {
        largest_prime = n;
    }
    return largest_prime;
}

int main()
{
    long long n = 15;
    cout << maxPrimeFactors(n) << endl;

    n = 25698751;
    cout << maxPrimeFactors(n) << endl;

    return 0;
}