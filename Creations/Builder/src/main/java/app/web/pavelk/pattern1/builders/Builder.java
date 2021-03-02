package app.web.pavelk.pattern1.builders;

import app.web.pavelk.pattern1.cars.CarType;
import app.web.pavelk.pattern1.components.Engine;
import app.web.pavelk.pattern1.components.GPSNavigator;
import app.web.pavelk.pattern1.components.Transmission;
import app.web.pavelk.pattern1.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
