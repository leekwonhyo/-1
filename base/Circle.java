package base;


/**
 * 여기에 Circle 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Circle
{
    int x;
    int y;
    int radius;
    
    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public boolean equals(Object obj){
        Circle c = (Circle)obj;
        if (this.x == c.x && this.y == c.y){
            return true;
        }
        else{
            return false;
        }
    }
}
