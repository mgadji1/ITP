class Car(override val name: String, val condition: String): Vehicle() {
    override fun start() = println("Car $name started moving")
    override fun stop() = println("Car $name stopped moving")
    override fun move() = println("Car $name is moving")
    override fun toString(): String {
        return "Car: $name"
    }
}