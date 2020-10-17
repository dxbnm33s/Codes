public class Hero extends Heroes {
	String name;
	int hp = 100;
	final int MAX_HP = 100;
	int mp = 50;
	final int MAX_MP = 50;
	int damage;
	int attackDamage;
	
	public Hero(String name, int hp, int mp) {
		super(name, hp, mp);
	}
	public int getMax_Hp() {
		return this.MAX_HP;
	}	
	public int getMax_Mp() {
		return this.MAX_MP;
	}
	public void attack(Monster m) {
		if(this.getHp() > 0) {
			System.out.println(this.getName() + "の攻撃！");
			attackDamage = (int)(20 * Math.random() + 1);
			m.hp -= attackDamage;
			System.out.println(attackDamage + "のダメージ！");
			if(m.hp > 0) {
				System.out.println(m.getName() + "の残り体力: " + m.getHp());
			} else {
				System.out.println(m.getName() + "を倒した！");
			}			
		}
	}
	
	public void die() {
		if(this.getHp() <= 0) {
			this.hp = 0;
			System.out.println(this.getName() + "は死んでしまった。");
			System.out.println("GAME OVER");
		}
	}
	
	
}