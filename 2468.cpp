// 2468 안전영역
// n 값은 n *n 의 땅 크기
// 안전한 영역의 최대 개수를 계산하는 프로그램
// 영역은 이어져 있으니까
// 2 <= n <=100

#include <iostream>
#include <cstring>
#include <algorithm>

using namespace std;

int max_height = 0;
int area[101][101];
bool visited[101][101];
int max_safe_area = 1;		// 1인 이유는 비가 0 만큼올때 전체가 통으로 안전영역
int x[4] = { 0,-1,1,0 };
int y[4] = { -1,0,0,1 };




void dfs(int i, int j, int rain_level);

int main() {

	int n;
	cin >> n;
	for (int i = 1; i <= n; i++) {			// area 입력
		for (int j = 1; j <= n; j++) {
			cin >> area[i][j];
			max_height = max(max_height, area[i][j]);
		}
	}

	// 비가 0 ~ 100 ?
	
	for (int rain = 1; rain <= max_height; rain++) {
		memset(visited, 0, sizeof(visited));
		int temp = 0;
		/*for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				area[i][j] -= 1;
			}
		}
		/*		for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						cout << area[i][j] << " ";
					}
					cout << "\n";
				}
				*/
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (area[i][j] > rain && visited[i][j] == false) {
					dfs(i, j, rain);
					temp++;
				}
			}
		}

		max_safe_area = max(max_safe_area, temp);
	}
	cout << max_safe_area;
}

void dfs(int i, int j, int rain_level) {
	visited[i][j] = true;
	for (int k = 0; k < 4; k++) {
		int ii = i + x[k];
		int jj = j + y[k];
		if (ii <= 0 || jj <= 0 || ii > 100 || jj > 100) {
			continue;
		}
		if (area[ii][jj] > rain_level && visited[ii][jj] == false) {
			dfs(ii, jj, rain_level);
		}
	}
}