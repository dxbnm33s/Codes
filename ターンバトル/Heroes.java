public abstract class Heroes {
	String name;
	int hp;
	int mp;
	int MAX_HP;
	int MAX_MP;
	int damage;
	int attackDamage;
	public Heroes(String name, int hp, int mp) {
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
	public int getMax_Hp() {
		return this.MAX_HP;
	}
	public int getMax_Mp() {
		return this.MAX_MP;
	}
	public abstract void attack(Monster m);
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
		System.out.println("GAME OVER \n" + this.name + "の残り体力は" + this.hp);
	}
	
}