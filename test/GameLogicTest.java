import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class GameLogicTest {
    public static GameLogic gameLogic=new GameLogic();
    int[][] Map;
    @BeforeEach
    void setUp() {
        gameLogic.setHeight(4);
        gameLogic.setWidth(4);
        int[][] map={{1,0,0,1},{1,1,0,0},{1,1,0,1},{1,0,1,0}};
        Map=map;//测试矩阵
    }

    @Test
    void setLifeState() {
        gameLogic.setLifeState(Map);
        //findNextState()无错误则该函数无错误
    }

    @Test
    void findNextState() {
        assertEquals(1,gameLogic.findNextState(0,0,Map));
        assertEquals(1,gameLogic.findNextState(0,1,Map));
        assertEquals(0,gameLogic.findNextState(0,2,Map));
        assertEquals(0,gameLogic.findNextState(0,3,Map));
        assertEquals(0,gameLogic.findNextState(1,0,Map));
        assertEquals(0,gameLogic.findNextState(1,1,Map));
        assertEquals(0,gameLogic.findNextState(1,2,Map));
        assertEquals(0,gameLogic.findNextState(1,3,Map));
        assertEquals(0,gameLogic.findNextState(2,0,Map));
        assertEquals(0,gameLogic.findNextState(2,1,Map));
        assertEquals(0,gameLogic.findNextState(2,2,Map));
        assertEquals(0,gameLogic.findNextState(2,3,Map));
        assertEquals(1,gameLogic.findNextState(3,0,Map));
        assertEquals(0,gameLogic.findNextState(3,1,Map));
        assertEquals(1,gameLogic.findNextState(3,2,Map));
        assertEquals(0,gameLogic.findNextState(3,3,Map));
    }

    @Test
    void getWidth() {
        assertEquals(3,gameLogic.getWidth());
    }

    @Test
    void getHeight() {
        assertEquals(3,gameLogic.getHeight());
    }

    @Test
    void setWidth() {
        gameLogic.setWidth(10);
        assertEquals(10,gameLogic.getWidth());
    }

    @Test
    void setHeight() {
        gameLogic.setHeight(10);
        assertEquals(10,gameLogic.getHeight());
    }
}