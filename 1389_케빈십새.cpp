// 1389 ÄÉºó º£ÀÌÄÁ Çü´Ô

#include <iostream>
#include <queue>
#include <cstring>
using namespace std;

int n, m;
int visited[101];
int map[101][101];
int kevin[101][101];
int answer[101];
int bfs(int v);

queue <int> q;

int main() {
	cin >> n >> m;

	for (int i = 0; i < m; i++) {
		int temp_1, temp_2;
		cin >> temp_1 >> temp_2;
		map[temp_1][temp_2] = 1;
		map[temp_2][temp_1] = 1;
	}
	int min_person = 1;
	for (int j = 1; j <= n; j++) {
		answer[j] = bfs(j);
		//cout << answer[j] << " ";
		if (answer[j] < answer[min_person]) {
			min_person = j;
		}
	}
	/*for (int k = 1; k <= n; k++) {
		for (int l = 1; l <= n; l++) {
			cout << kevin[k][l] << " ";
		}
		cout << "\n";
	}*/
	cout << min_person;
}

int bfs(int v) {
	int count = 0;
	q.push(v);
	visited[v] = 1;
	while (!q.empty()) {
		int start = q.front();
		q.pop();
		for (int i = 1; i <= n; i++) {
			if (map[start][i] == 1 && visited[i] == 0) {
				visited[i] = 1;
				q.push(i);
				kevin[v][i] = kevin[v][start] + 1;
			}
		}
	}
	int value = 0;
	for (int j = 1; j <= n; j++) {
		value += kevin[v][j];
	}
	memset(visited, 0, sizeof(visited));
	return value;
}