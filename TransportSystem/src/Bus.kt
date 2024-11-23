class Bus(override val name: String, val condition: String): Vehicle() {
    override fun start() = println("Bus $name started moving")
    override fun stop() = println("Bus $name stopped moving")
    override fun move() = println("Bus $name is moving")
    override fun toString(): String {
        return "Bus: $name"
    }
}