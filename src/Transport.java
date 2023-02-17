public abstract class Transport<T extends Driver> {

    private String make; // Марка
    private String model; // Модель
    private double engineCapacity;  // Обьем двиголеля
    private T driver; // водитель

    public Transport() { // Пустой конструктор
        super();
    }

    public Transport(String make, String model, double engineCapacity, T driver) {
        super();
        this.make = make;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.driver = driver;

    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }


    public void startMoving() {  // Метод отвечает за движение
        System.out.println("Hачать движение");
    }

    public void finishMovement() { // Метод отвечает за остановку движения
        System.out.println("Остановить движение");
    }

    public abstract Enum getType();

    public abstract void printType();


    public void passDiagnostics() {

    }


    public void bestTimeLap(String timeLap) {
        System.out.println("Лучшее время проезда круга" + timeLap);
    }

    public void maxSpeed(int maxSpeed) {
        System.out.println("Максимальная скорость " + maxSpeed + " " + " км/ч");

    }

    @Override
    public String toString() {
        return " "+ make + " "+ model + " объем двигателя "+ engineCapacity;
    }
}
