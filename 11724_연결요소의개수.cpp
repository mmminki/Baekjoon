// 연결 요소의 개수

/*#include <iostream>
#include <queue>

using namespace std;

int n, m;
int map[1001][1001];
int visited[1001];
int answer = 0;

queue <int> q;
void bfs();

int main() {
	cin >> n >> m;

	for (int i = 1; i <= m; i++) {
		int temp_1, temp_2;
		cin >> temp_1 >> temp_2;
		map[temp_1][temp_2] = 1;
		map[temp_2][temp_1] = 1;
	}

	bfs();
	cout << answer;

}

void bfs() {
	for (int i = 1; i <= n; i++) {
		if (visited[i] != 1) {
			answer++;
			q.push(i);
			visited[i] = 1;
			while (!q.empty()) {
				int v = q.front();
				q.pop();
				for (int j = 1; j <= n; j++) {
					if (visited[j] != 1 && map[v][j] == 1) {
						q.push(j);
						visited[j] = 1;
					}
				}
			}
		}
	}
}*/

#include <iostream>

using namespace std;

int n, m;

int map[1001][1001];
int visited[1001];
int answer = 0;
void dfs(int v);

int main() {
	cin >> n >> m;

	for (int i = 1; i <= m; i++) {
		int temp_1, temp_2;
		cin >> temp_1 >> temp_2;
		map[temp_1][temp_2] = 1;
		map[temp_2][temp_1] = 1;
	}

	for (int j = 1; j <= n; j++) {
		if (visited[j] == 0) {
			dfs(j);
			answer++;
		}
	}
	cout << answer;
}

void dfs(int v) {
	visited[v] = 1;
	for (int i = 1; i <= n; i++) {
		if (visited[i] != 1 && map[v][i] == 1) {
			dfs(i);
		}
	}
}