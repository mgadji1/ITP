class Bike(override val name: String, val condition: String): Vehicle() {
    override fun start() = println("Bike $name started moving")
    override fun stop() = println("Bike $name stopped moving")
    override fun move() = println("Bike $name is moving")
    override fun toString(): String {
        return "Bike: $name"
    }
}