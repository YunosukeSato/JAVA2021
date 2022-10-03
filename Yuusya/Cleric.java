//import java.util.*;

public class Cleric {
    String name = "クレリック";
    int hp = 50;
    final int HP = 50;
    int mp = 10;
    final int MP = 10;
    
    public void selfAid() {
        System.out.println(this.name + "はセルフエイドを唱えた！");
        this.mp -= 5;
        this.hp = this.HP;
        System.out.println("HPが最大まで回復した！");
    }
    
    public int pray(int sec) {
        System.out.println(this.name + "は" + sec + "秒間天に祈った！");
        
        //論理上の回復量を乱数を用いて決定する
        int recover = new java.util.Random().nextInt(3) + sec;
        
        //実際の回復量を計算する
        int recoverActual = Math.min(this.MP - this.mp, recover);

        this.mp += recoverActual;
        System.out.println("MPが" + recoverActual + "回復した！");
        return recoverActual;
    }
}