// 2606 바이러스
// 연결된 컴퓨터들은 바이러스 전파됨
#include <iostream>
#include <queue>
using namespace std;

bool visited[101];
int map[101][101];
int n, v;
queue<int> q;


int bfs(int i) {
    int count = 0;
    visited[i] = true;
    q.push(i);

    while (!q.empty()) {
        int temp = q.front();
        q.pop();
        for (int i = 1; i <= n; i++) {
            if (map[temp][i] == 1 && visited[i] == false) {
                visited[i] = true;
                q.push(i);
                count++;
            }
        }

    }
    return count;
}

int main() {
    int answer;
    cin >> n >> v;
    int x, y;
    for (int i = 1; i <= v; i++) {
        cin >> x >> y;
        map[x][y] = 1;
        map[y][x] = 1;
    }
    answer = bfs(1);
    cout << answer;
    /*for (int i = 1; i <= n; i++) {
       for (int k = 1; k <= n; k++) {
          cout << map[i][k] << " ";
       }
       cout << "\n";
    }*/


}