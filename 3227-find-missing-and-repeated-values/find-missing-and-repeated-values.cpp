#include <vector>
using namespace std;

class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
        int n = grid.size();
        vector<int> res(2);
        vector<int> num(n * n + 1, 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (num[grid[i][j]] == 1) {
                    res[0] = grid[i][j];
                } else {
                    num[grid[i][j]] = 1;
                }
            }
        }

        for (int i = 1; i <= n * n; i++) {
            if (num[i] == 0) {
                res[1] = i;
                break;
            }
        }

        return res;
    }
};