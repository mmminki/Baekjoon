// 10451 순열 사이클

#include <iostream>
#include <queue>
#include <cstring>

using namespace std;

int map[1001];
int ans_count = 0;
int visited[1001];
int t, n;
queue <int> q;
void bfs();

int main() {
	
	cin >> t;
	for (int j = 0; j < t; j++) {
		cin >> n;
		for (int i = 1; i <= n; i++) {
			cin >> map[i];
		}
		bfs();
		cout << ans_count << "\n";
		memset(map, 0, sizeof(map));
		memset(visited, 0, sizeof(visited));
		ans_count = 0;
	}
}

void bfs() {
	for (int i = 1; i <= n; i++) {
		if (visited[i] != 1) {
			q.push(i);
			visited[i] = 1;
			while (!q.empty()){
				int v = q.front();
				q.pop();
				int temp = map[v];
				if (visited[temp] == 1) {
					break;
				}
				else {
					visited[temp] = 1;
					q.push(temp);
				}
			}
			ans_count++;
		}
	}
}