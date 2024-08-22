#include<bits/stdc++.h>
using namespace std;
int count(vector<int>adj[],int src,int n)
{
    int dist[n];
    bool visited[n];
    for(int i=0;i<n;i++)
    {
        dist[i]=INT_MAX;
        visited[i]=false;
    }
    dist[src]=0;

    queue<int>q;
    q.push(src);
    visited[src]=true;
    int count=0;

    while(!q.empty())
    {
        int curr=q.front();
        q.pop();

        for(int neighbor:adj[curr])
        {
            if(!visited[neighbor])
            {
                visited[neighbor]=true;
                dist[neighbor]=dist[curr]+1;

                if(dist[neighbor]<=2)
                count++;
                q.push(neighbor);
            }
        }
    }
    return count;
}

void addEdge(vector<int>adj[],int u,int v)
{
    adj[u].push_back(v);
    adj[v].push_back(u);
}
int main() {
    int n = 7; // Number of vertices
    vector<int> adj[n];
    
    addEdge(adj, 0, 1);
    addEdge(adj, 0, 2);
    addEdge(adj, 1, 2);
    addEdge(adj, 1, 3);
    addEdge(adj, 2, 3);
    addEdge(adj, 3, 4);
    addEdge(adj, 3, 5);
    addEdge(adj, 4, 6);
    addEdge(adj, 5, 6);
    
    int source = 0;
    int result = count(adj, source, n);
    
    cout << "Number of neighbors within 2 edges from node " << source << " is: " << result << endl;
    
    return 0;
}