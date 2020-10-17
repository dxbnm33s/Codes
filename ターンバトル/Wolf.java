public class Wolf extends Monster {

	String name = "狼人間";
	int hp = 20;
	int mp = 10;
	
	public Wolf(String name, int hp, int mp) {
		super(name, hp, mp);
	}
	public String toString() {
		return "敵名: " + this.name + "体力:" + this.hp; 
	}
	public void attack(Heroes h) {
		if(this.getHp() > 0) {
			System.out.println(this.name + "の噛み砕く！");
			monsterAttack = (int)(15 * Math.random() + 1);
			h.hp -= monsterAttack;
			System.out.println(h.getName() + "に" + monsterAttack + "のダメージ！");
			if(h.hp > 0) {
				System.out.println(h.getName() + "の残り体力:" + h.getHp());
			}
		}
	}
}