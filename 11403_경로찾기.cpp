// 11403 경로찾기

// 그래프 G 의 모든 정점(i, j)에 대해서 i에서 j로 가는 길이가 양수인 경로가 있는지 구하는 프로그램

#include <iostream>
#include <vector>
#include <queue>
#include <cstring>

#define MAXNUM 100

using namespace std;

int visited[MAXNUM];
int path[MAXNUM][MAXNUM];
int graph[MAXNUM][MAXNUM];
int n;

queue<int> q;
void bfs(int start);

int main() {
	memset(path, 0, sizeof(path));
	memset(graph, 0, sizeof(path));
	cin >> n;

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			cin >> graph[i][j];
		}
	}
	for (int k = 0; k < n; k++) {
		bfs(k);
	}
	for ( int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			cout << path[i][j] << " ";
		}
		cout << "\n";
	}
}


void bfs(int start) {
	q.push(start);
	memset(visited, 0, sizeof(visited));
	while (!q.empty()) {
		int v = q.front();
		q.pop();
		for(int i = 0; i<n; i++){
			if (visited[i] != 1 &&  graph[v][i] == 1) {
				visited[i] = 1;
				q.push(i);
				path[start][i] = 1;
			}
		}
	}
}