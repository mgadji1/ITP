class Garage {
    private var vehicles: MutableList<Vehicle> = mutableListOf()
    fun addVehicle(vehicle: Vehicle) {
        vehicles.add(vehicle)
    }
    fun removeVehicle(vehicle: Vehicle) {
        vehicles.remove(vehicle)
    }
    fun getVehicles(): List<Vehicle> {
        return vehicles
    }
}