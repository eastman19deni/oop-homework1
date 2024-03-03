package units;


public class Position {
    protected Integer x, y;

        public Position(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    
    // public List<Integer> getPosition (){
    //     List<Integer> list = new ArrayList<>();
    //     list.add(x);
    //     list.add(y);
    //     return list;
    // }

    public int getX() {return x;}

    public int getY() {return y;}
    public String toString(){ return x + "," + y;}
    
    public void setPosition(int value1, int value2) {
        this.x = value1;
        this.y = value2;
    }
   

    /**
 * @param position - координаты персонажа
 * @return - Возвращает расстояние до цели
 */

 public double getDistanse (Position target) {
    double targetDistanse = 0;
        targetDistanse = Math.sqrt(Math.pow(x - target.x, 2) + Math.pow(y - target.y, 2));
    return targetDistanse;
}


public Position getDiff(Position targetPos) {
    Position dif = new Position(x - targetPos.x, y - targetPos.y);
    return dif;
}

public boolean equals(Position target) {
    return x == target.getX() && y == target.getY(); 
}
  
}