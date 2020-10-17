public class Wizard extends Heroes {
	String name;
	public int hp;
	public int mp;
	int damage;
	int attackDamage;
	int heal = 20;
	public Wizard(String name, int hp, int mp) {
		super(name, hp, mp);
	}
	public void attack(Monster m) {
		if(this.getHp() > 0) {
			System.out.println(this.getName() + "の攻撃！");
			attackDamage = (int)(5 * Math.random() + 1);
			m.hp -= attackDamage;
			System.out.println(m.getName() + "に" + attackDamage + "のダメージ！");
			if(m.hp > 0) {
				System.out.println(m.getName() + "の残り体力: " + m.getHp());
			} else {
				System.out.println(m.getName() + "を倒した！");
			}
		}
	}
	
	public void heal(Heroes h) {
		if(this.getHp() > 0) {
			
			while(this.getMp() < 5) {
				System.out.println("MPが足りない。");
				continue;
			} 
			if(this.getMp() >= 5) {
				this.mp -= 5;
				System.out.println(this.getName() + "はヒールを唱えた！");
				 h.hp += heal;
				if(h.getHp() >= 100) {
					h.hp = 100;
					System.out.println(h.getName() + "の残り体力: " + h.getHp());
				} else {
					System.out.println(h.getName() + "の残り体力: " + h.getHp());
				}
				
			}
		}
	}
}