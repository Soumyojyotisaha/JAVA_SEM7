#include <iostream>
#include <sstream>  // For istringstream
#include <string>
using namespace std;

string checkPresence(const string& S1, const string& S2, char C) {
    if (C == 'Y') {
        // Check if S2 is present as a complete word in S1
        istringstream iss(S1);
        string word;
        
        while (iss >> word) {
            if (word == S2) {
                return "present";
            }
        }
        return "not present";
    } else if (C == 'N') {
        // Check if S2 is present as a substring in S1
        if (S1.find(S2) != string::npos) {
            return "present";
        }
        return "not present";
    }
    
    return "Invalid input for C";
}

int main() {
    string S1;
    string S2;
    char C;

    // Example 1
    S1 = "geeksforgeeks is the best";
    S2 = "geeks";
    C = 'Y';
    cout << "Example 1: " << checkPresence(S1, S2, C) << endl; // Output: not present

    // Example 2
    S1 = "geeksforgeeks is the best";
    S2 = "geeks";
    C = 'N';
    cout << "Example 2: " << checkPresence(S1, S2, C) << endl; // Output: present

    return 0;
}
