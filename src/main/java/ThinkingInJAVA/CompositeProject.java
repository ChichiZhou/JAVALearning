package ThinkingInJAVA;

import static java.lang.String.format;

public class CompositeProject {
    /**
     * 在初始化子类的时候，JAVA 会自动初始化其父类
     * 实现方法是调用父类的构造器
     * 如果父类构造器带参数，则需要使用 super 去传参数
     *
     */
}

class Game{
    Game(int i){
        System.out.println(format("The game is %s", i));
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        super(i);        // 调用父类构造器
        System.out.println("BoardGame");
    }
}

