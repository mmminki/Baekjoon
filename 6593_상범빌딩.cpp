// 6593 鼻彰網註 驍轎
// 3離錳 寡翮?

#include <iostream>
#include <queue>
#include <vector>
#include <array>

#define MAXNUM 30
char map[MAXNUM][MAXNUM][MAXNUM];
int visited[MAXNUM][MAXNUM][MAXNUM];
void bfs();

std::queue<int[3]> q;


class start_index {
private:
	
public:
	int start_l, start_r, start_c, exit_l, exit_r, exit_c;

	void set_start(int input_l, int input_r, int input_c) {
		start_l = input_l;
		start_r = input_r;
		start_c = input_c;
	}
	void set_exit(int input_l, int input_r, int input_c) {
		exit_l = input_l;
		exit_r = input_r;
		exit_c = input_c;
	}
};



int main() {
	int l = 1, r = 1, c = 1;	// l : 類 熱, r : 陝 類 ч 熱, c : 陝 類 翮 熱
	int start_l, start_r, start_c, exit_l, exit_r, exit_c;
	start_index a;
	while (l != 0 && r != 0 && c != 0) {
		memset(map, '\0', sizeof(map));
		memset(visited, 0, sizeof(visited));
		std::cin >> l >> r >> c;

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < r; j++) {
				for (int k = 0; k < c; k++) {
					std::cin >> map[i][j][k];
					if (map[i][j][k] == 'S') {
						a.set_start(i, j, k);
					}
					else if (map[i][j][k] == 'E') {
						a.set_exit(i, j, k);
					}
				}
			}
		}
	}
	for (int i = 0; i < l; i++) {
		for (int j = 0; j < r; j++) {
			for (int k = 0; k < c; k++) {
				std::cout << map[i][j][k];
			}
		}
	}
}

void bfs(start_index a) {
	int l = a.start_l;
	int r = a.start_r;
	int c = a.start_c;
	q.push({ l,r,c });
	visited[l][r][c] = 1;
	while (!q.empty()) {
		int *temp = q.front();
		q.pop();
		if (temp[0] + 1 < visited[temp[0] + 1][temp[1]][temp[2]] == 0 && map[temp[0] + 1][temp[1]][temp[2]] == '.') { // 嬪類
			q.push({ temp[0] + 1,temp[1], temp[2] });
			visited[temp[0] + 1][temp[1]][temp[2]] = 1;
		}
		if (visited[temp[0]][temp[1] - 1][temp[2]] == 0 && map[temp[0] + 1][temp[1]][temp[2]] == '.') { // 鼻
			q.push({ temp[0],temp[1] - 1, temp[2] });
			visited[temp[0]][temp[1] - 1][temp[2]] = 1;
		}
		if (visited[temp[0]][temp[1]+1][temp[2]] == 0 && map[temp[0] + 1][temp[1]][temp[2]] == '.') { // ж
			q.push({ temp[0],temp[1] +1, temp[2] });
			visited[temp[0]][temp[1] +1][temp[2]] = 1;
		}
		if (visited[temp[0]][temp[1]][temp[2]-1] == 0 && map[temp[0] + 1][temp[1]][temp[2]] == '.') { // 謝
			q.push({ temp[0],temp[1], temp[2]-1 });
			visited[temp[0]][temp[1]][temp[2]-1] = 1;
		}
		if (visited[temp[0]][temp[1]][temp[2] + 1] == 0 && map[temp[0] + 1][temp[1]][temp[2]] == '.') { // 辦
			q.push({ temp[0],temp[1], temp[2] + 1 });
			visited[temp[0]][temp[1]][temp[2] + 1] = 1;
		}
	}
}

