
fun moveRobot(r: Robot, toX: Int, toY: Int){
    if(r.x < toX) {
        while (r.direction != Direction.RIGHT) r.turnRight()
        while (r.x < toX) r.stepForward()
        if(r.y < toY){
            r.turnLeft()
            while(r.y < toY) r.stepForward()
        }
        else {
            r.turnRight()
            while (r.y > toY) r.stepForward()
        }
    }
    else{
        while (r.direction != Direction.LEFT) r.turnLeft()
        while (r.x > toX) r.stepForward()
        if(r.y < toY){
            r.turnRight()
            while(r.y < toY) r.stepForward()
        }
        else {
            r.turnLeft()
            while (r.y > toY) r.stepForward()
        }
    }
}