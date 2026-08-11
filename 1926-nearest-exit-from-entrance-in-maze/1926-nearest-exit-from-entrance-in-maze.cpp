class Solution {
public:
   const int d[5] = {0,1,0,-1,0};
    int nearestExit(vector<vector<char>>& maze, vector<int>& e) {
        int r = maze.size(), c = maze[0].size();
        queue<tuple<int, int, int>> q;
        q.push(make_tuple(e[0], e[1], 0));
        maze[e[0]][e[1]] = '+'; //Mark as visited
        while(!q.empty()){
            auto[row, col, steps] = q.front(); q.pop();
            if(row == 0 || row == r-1 || col == 0 || col == c-1){
                if(!(row == e[0] && col == e[1])){
                return steps;
                }
            }
            for(int i=0; i<4; i++){
                int ar = row + d[i], ac = col + d[i+1];
                if(ar >= 0 && ar < r && ac >= 0 && ac < c && maze[ar][ac] == '.'){
                    q.push(make_tuple(ar,ac,steps+1));
                    maze[ar][ac] = '+';
                }
            }
        }
        return -1;
    }
};