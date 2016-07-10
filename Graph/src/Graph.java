import java.util.Iterator;
import java.util.LinkedList;

class Graph {

	int v;
	LinkedList<Integer> adj[];
	public Graph(int v)
	{
		this.v=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adj[i]=new LinkedList<Integer>();
		}
	}
	void addEdge(int v,int e)
	{
		adj[v].add(e);
	}
	public boolean findRoute(int s,int e)
	{
		
		boolean[] visited=new boolean[v];
		visited[s]=true;
		LinkedList<Integer> queue=new LinkedList<Integer>();
		queue.add(s);
		Iterator<Integer> i;
		while(queue.size()!=0)
		{
		  s=queue.poll();
		  int n;
		  i=adj[s].listIterator();
		  while(i.hasNext())
		  {
			  n=i.next();
			  if(n==e)
				  return true;
			  if(!visited[n])
			  {
				  visited[n]=true;
				  queue.add(n);
			  }
		  }
		  
		}
		return false;
	}
	
}
