interface Movable {
    fun move(dx: Int, dy: Int)
}

class Point(var x: Int, var y: Int) : Movable {
    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

    // Реализация toString для вывода информации о точке
    override fun toString(): String = "($x, $y)"
}

class CloudOfPoints(val points: MutableList<Point>) : Movable {
    override fun move(dx: Int, dy: Int) {
        for (point in points) {
            point.move(dx, dy)
        }
    }
}

fun main() {
    val p1 = Point(3, 7)
    println("Точка до перемещения: $p1")
    p1.move(5, 10)
    println("Точка после перемещения: $p1")

    val cloud = CloudOfPoints(mutableListOf(
        Point(0, 0),
        Point(1, 1),
        Point(-1, -1)
    ))
    println("Облако точек до перемещения:")
    cloud.points.forEach { println(it) }
    cloud.move(2, 2)
    println("\nОблако точек после перемещения:")
    cloud.points.forEach { println(it) }
}