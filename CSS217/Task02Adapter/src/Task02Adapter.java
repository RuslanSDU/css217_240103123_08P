public class Task02Adapter implements ICelsiusSensor {

    private final FahrenheitSensor sensor;

    public Task02Adapter(FahrenheitSensor sensor) {
        this.sensor = sensor;
    }


    public double getTemperatureInCelsius() {
        String raw = sensor.readRawTemperature();
        String cleaned = raw.trim();
        if (cleaned.endsWith("F") || cleaned.endsWith("f")) {
            cleaned = cleaned.substring(0, cleaned.length() - 1).trim();
        }

        double fahrenheit = Double.parseDouble(cleaned);

        double celsius = (fahrenheit - 32) * (5.0 / 9.0);

        return Math.round(celsius * 100.0) / 100.0;
    }
}