package fp.daw.exprog20210902;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ejercicio4 {

	public static void main(String[] args) {
	Queue<Integer>lista=new LinkedList<Integer>(List.of(1, 8, 7, 2, 9, 18, 12, 0));
   imparesInvertidos(lista);
   System.out.println(lista);
	}
	
	public static void imparesInvertidos(Queue<Integer>l) {
		Deque<Integer>aux=new ArrayDeque<Integer>();
		for(int i=0;i<l.size();i++) {
			if(i%2!=0) {
				aux.push(l.poll());
			}
		}
	
		while(!aux.isEmpty()) {
			l.peek();
			l.offer(aux.pop());
				
					
		
			
		}
		
		}
		}
		
		
	


