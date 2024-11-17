enum class Direction {
    UP, DOWN, RIGHT, LEFT
}

class Robot() {
    var x = 0
    var y = 0
    var direction: Direction = Direction.UP

    constructor(x:Int, y:Int, direction: Direction) : this() {
        this.x = x
        this.y = y
        this.direction = direction
    }

    fun turnLeft() {
        when (direction) {
            Direction.UP -> {direction = Direction.LEFT; return}
            Direction.DOWN -> {direction = Direction.RIGHT; return}
            Direction.RIGHT -> {direction = Direction.UP; return}
            Direction.LEFT -> {direction = Direction.DOWN; return}
        }
    }
    fun turnRight() {
        when (direction) {
            Direction.UP -> {direction = Direction.RIGHT; return}
            Direction.DOWN -> {direction = Direction.LEFT; return}
            Direction.RIGHT -> {direction = Direction.DOWN; return}
            Direction.LEFT -> {direction = Direction.UP; return}
        }
    }
    fun stepForward() {
        when (direction) {
            Direction.UP -> y++
            Direction.DOWN -> y--
            Direction.RIGHT -> x++
            Direction.LEFT -> x--
        }
    }

    override fun toString(): String {
        return "x: $x, y: $y, dir: $direction"
    }

}