public abstract class Monster {
	String name;
	int hp;
	int mp;
	int damage;
	int monsterAttack;
	public Monster(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getMp() {
		return this.mp;
	}
	public abstract void attack(Heroes h);

	public String toString() {
		return "敵名: " + this.getName() + "体力:" + this.getHp(); 
	}
	
	public void run() {
		System.out.println(this.getName() + "は逃げ出した！");
		System.out.println("ゲーム終了。");
	}
	
	public void die() {
		if(this.getHp() <= 0) {
			System.out.println(this.getName() + "は死んだ");
		}
		
	}
}