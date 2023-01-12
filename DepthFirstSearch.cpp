#include <bits/stdc++.h>
using namespace std;
 
class DepthFirstSearch{
public:
    map<int, bool> visited;
    map<int, list<int> > adj;
 
    void addEdge(int v, int w);

    void DFS(int v);
};
 
void DepthFirstSearch::addEdge(int v, int w)
{
    adj[v].push_back(w);
}
 
void DepthFirstSearch::DFS(int v)
{
    visited[v] = true;
    cout << v << " ";

    list<int>::iterator i;
    for (i = adj[v].begin(); i != adj[v].end(); ++i)
        if (!visited[*i])
            DFS(*i);
}
 
int main()
{
    DepthFirstSearch g;
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);
 
    cout << "Depth First Traversal \n";
 
    g.DFS(0);
 
    return 0;
}
