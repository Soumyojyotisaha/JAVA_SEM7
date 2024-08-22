#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

// Function to convert matrix to square matrix and check the condition
void checkDiagonalOccurrences(vector<vector<int>>& matrix, int k) {
    int M = matrix.size();
    int N = matrix[0].size();
    
    // Determine the size of the square matrix
    int size = max(M, N);
    
    // Convert the matrix to a square matrix
    vector<vector<int>> squareMatrix(size, vector<int>(size, 1));
    
    // Copy original matrix elements into the square matrix
    for (int i = 0; i < M; ++i) {
        for (int j = 0; j < N; ++j) {
            squareMatrix[i][j] = matrix[i][j];
        }
    }
    
    // Count occurrences of all elements
    unordered_map<int, int> countMap;
    for (int i = 0; i < size; ++i) {
        for (int j = 0; j < size; ++j) {
            countMap[squareMatrix[i][j]]++;
        }
    }
    
    // Count occurrences of diagonal elements
    unordered_map<int, int> diagonalCountMap;
    for (int i = 0; i < size; ++i) {
        diagonalCountMap[squareMatrix[i][i]]++;
    }
    
    // Check if each diagonal element occurs more than k times outside of the diagonal
    bool allPresent = true;
    for (int i = 0; i < size; ++i) {
        int diagonalElement = squareMatrix[i][i];
        int totalCount = countMap[diagonalElement];
        int diagonalCount = diagonalCountMap[diagonalElement];
        
        if (totalCount - diagonalCount <= k) {
            allPresent = false;
            break;
        }
    }
    
    // Print result
    if (allPresent) {
        cout << "Present" << endl;
    } else {
        cout << "Not Present" << endl;
    }
}

// Driver code
int main() {
    vector<vector<int>> matrix = {
        {1, 2, 3},
        {4, 5, 6}
    };
    int k = 2;
    
    checkDiagonalOccurrences(matrix, k);
    
    return 0;
}
