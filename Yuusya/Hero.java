public class Hero {
    String name; //名前の宣言
    int hp; //HPの宣言
    Sword sword;

    public void attack() {
        System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
        System.out.println("敵に5ポイントのダメージを与えた！");
    }

    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した！");
    }
    public void sit(int sec) {
        this.hp += sec;
        System.out.println
            (this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した！");
    }
    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("５のダメージ！");
    }
    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
}