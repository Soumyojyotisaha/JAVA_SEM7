#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

// Function to find the largest prime factor of a positive integer 'n'
int maxPrimeFactors(long long n) {
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

// Function to find the maximum magic number in the array
int findMaxMagicNumber(vector<int>& A) {
    int n = A.size();
    
    // Sort the array to easily find the count of elements smaller than each element
    vector<int> sortedA = A;
    sort(sortedA.begin(), sortedA.end());
    
    int maxMagicNumber = 0;
    
    // Iterate over each element in the original array
    for (int i = 0; i < n; ++i) {
        // Number of elements strictly smaller than A[i]
        int x = lower_bound(sortedA.begin(), sortedA.end(), A[i]) - sortedA.begin() - 1;
        
        // Compute the magic number for the current element
        int magicNumber = (x == 0) ? 0 : (x == 1) ? 1 : maxPrimeFactors(x);
        
        // Update the maximum magic number found
        maxMagicNumber = max(maxMagicNumber, magicNumber);
    }
    
    return maxMagicNumber;
}

int main() {
    vector<int> A = {1, 4, 5, 6};
    cout << "Maximum magic number: " << findMaxMagicNumber(A) << endl;

    return 0;
}

