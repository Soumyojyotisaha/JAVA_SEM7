#include <bits/stdc++.h> 
using namespace std; 

int main() 
{ 
    int n; 
    cin >> n; 
    vector<int> arr(n); 
    for (int i = 0; i < n; i++) 
    { 
        cin >> arr[i]; 
    } 

    sort(arr.begin(), arr.end()); 

    int len = 0; 

    // Iterate through all triplets
    for (int i = 0; i < n - 2; ++i) 
    { 
        int j = i + 1; 
        int k = i + 2; 

        while (k < n) 
        { 
            if (arr[i] + arr[j] > arr[k]) 
            { 
                len = max(len, k - i + 1); 
                ++k; 
            } 
            else 
            { 
                ++j; 
                if (j == k) 
                { 
                    ++k; 
                } 
            } 
        } 
    } 

    cout << len << endl; 
    return 0; 
}
