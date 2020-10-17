import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Hero h = new Hero("Take", 100, 50);
		Wizard wi = new Wizard("Sara", 80, 100);
		Goblin g = new Goblin("ゴブ太郎", 30, 10);
		Slime s = new Slime("スラ二郎", 10, 5);
		Wolf w = new Wolf("狼人間", 20, 10);
		int count = 0;
		System.out.println(g.getName() + "," + s.getName() + "," + w.getName() + "が現れた！");
		Scanner sc = new Scanner(System.in);
		int line;
		while((g.getHp() > 0) || (s.getHp() > 0) || (w.getHp() > 0)) {
			if(count % 2 == 0) {
				System.out.println(h.getName());
				System.out.println("何をする？　1:たたかう 2:逃げる");
				line = sc.nextInt();
				if(line == 1) {
					System.out.println("1: " + g.getName() + " 2: " + s.getName() +  " 3: " + w.getName());
					int line2 = sc.nextInt();
					if(line2 == 1) {
						h.attack(g);
						if(g.getHp() <= 0) {
							System.out.println(g.getName() + "を倒した！");
							g.die();
						}
					}
					if(line2 == 2) {
						h.attack(s);
						if(s.getHp() <= 0) {
							System.out.println(s.getName() + "を倒した！");
							s.die();
						}	
					}
					if(line2 == 3) {
						h.attack(w);
						if(w.getHp() <= 0) {
							System.out.println(w.getName() + "を倒した！");
							w.die();
						}
					}
				}else if(line == 2) {
					h.run();
					wi.run();
					break;
				} else {
					System.out.println("1か2を入力してくれ。");
					continue;
				}
				System.out.println(wi.getName());
				System.out.println("何をする？　1:たたかう　2:魔法　3:逃げる");
				int line3 = sc.nextInt();
				if(line3 == 1) {
					System.out.println("1: " + g.getName() + " 2: " + s.getName() +  " 3: " +w.getName());
					int line4 = sc.nextInt();
					if(line4 == 1) {
						wi.attack(g);
						if(g.getHp() <= 0) {
							System.out.println(g.getName() + "を倒した！");
							g.die();
						}
					}
					if(line4 == 2) {
						wi.attack(s);
						if(s.getHp() <= 0) {
							System.out.println(s.getName() + "を倒した！");
							s.die();
						}	
					}
					if(line4 == 3) {
						wi.attack(w);
						if(w.getHp() <= 0) {
							System.out.println(w.getName() + "を倒した！");
							w.die();
						}
					}
					count++;
				}
				if(line3 == 2) {
					System.out.println("1: " + h.getName() + " 2: " + wi.getName());
					int line5 = sc.nextInt();
					if(line5 == 1) {
						wi.heal(h);
					}
					if(line5 == 2) {
						wi.heal(wi);
					}
					count++;
				}
				if(line3 == 3) {
					wi.run();
					h.run();
					break;
				}
				continue;
			}
				

				
				
			if(count % 2 != 0) {
				if(g.getHp() > 0) {
					int random1 = (int)(2 * Math.random()) + 1;
					if(random1 == 1) {
						g.attack(h);
					} else {
						g.attack(wi);
					}
					System.out.println("");
				}
				if(s.getHp() > 0) {
					int random2 = (int)(2 * Math.random()) + 1;
					if(random2 == 1) {
						s.attack(h);
					} else {
						s.attack(wi);
					}
					System.out.println("");
				}
				if(w.getHp() > 0){
					int random3 = (int)(2 * Math.random()) + 1;
					if(random3 == 1) {
						w.attack(h);
					} else {
						w.attack(wi);
					}
					System.out.println("");
				}
				
				if(h.getHp() <= 0) {
					h.die();
					break;
				}
				count++;
				continue;
			
			}					
		}
			
		if((g.getHp() <= 0) && (s.getHp() <= 0) &&(w.getHp() <= 0)) {
			System.out.println("戦いに勝利した！");
			int keiken = (int)(26 * Math.random() + 5);
			System.out.println("経験値" + keiken + "を手に入れた！");
			System.out.println("GAME CLEAR！");
		}
		
		
		System.out.println("\n\n");
		
		System.out.println("　　終　　");
		System.out.println("制作・著作");
		System.out.println("━━━━━━━━━━");
		System.out.println("　 ⓃⒽⓀ　");

	}
}	

