public class Slime extends Monster {

	String name = "スライム";
	int hp = 10;
	int mp = 5;
	
	public Slime(String name, int hp, int mp) {
		super(name, hp, mp);
	}
	public String toString() {
		return "敵名: " + this.name + "体力:" + this.hp; 
	}
	public void attack(Heroes h) {
		if(this.getHp() > 0) {
			System.out.println(this.name + "のぶつかる攻撃！");
			monsterAttack = (int)(5 * Math.random() + 1);
			h.hp -= monsterAttack;
			System.out.println(h.getName() + "に" + monsterAttack + "のダメージ！");
			if(h.hp > 0) {
				System.out.println(h.getName() + "の残り体力:" + h.getHp());
			}
		}
	}
}