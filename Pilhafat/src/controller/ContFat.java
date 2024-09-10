package controller;
import stack.Pilha;
public class ContFat {
	public ContFat() {
		super();
	}
	stack.Pilha p = new Pilha(null);
	
	public int fatorial(int num) throws Exception {

		for (int i = 1; i < num; i++) {
			if (p.isEmpty()) {
				p.push(num);
			} else {
				p.push(p.top() * i);
			}
					
		}
		return p.pop();
		
	}
}
