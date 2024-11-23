fun main() {
    val car1 = Car("Car1", "Good")
    val car2 = Car("Car2", "Bad")
    val bus1 = Bus("Bus1", "Normal")
    val bus2 = Bus("Bus2", "Not good")
    val bike1 = Bike("Bike1", "Not bad")
    val bike2 = Bike("Bike2", "Broken")
    val garage1 = Garage()
    garage1.addVehicle(car1)
    garage1.addVehicle(car2)
    garage1.addVehicle(bus2)
    println(garage1.getVehicles())
    garage1.addVehicle(bike1)
    garage1.removeVehicle(car1)
    println(garage1.getVehicles())
    val service1 = Service()
    service1.checkCarCondition(car1)
    service1.checkCarCondition(car2)
    service1.checkBusCondition(bus1)
}