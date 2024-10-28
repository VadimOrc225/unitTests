package seminars.second.hw;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Vehicle vehicle;
    Car car;
    Motorcycle moto;

    @BeforeEach
    void setup() {
        car = new Car("Volvo", "V40", 2012);
        moto = new Motorcycle("Honda", "С35", 1989);
    }

    /**
    // проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    */
    
    @Test
    void carIsVehicle(){
        System.out.println(car instanceof Vehicle);
        assertThat(car instanceof Vehicle).isEqualTo(true);
    }

    /**
     // проверка того, объект Car создается с 4-мя колесами
     */

    @Test
    void carHas4wheels(){
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    /**
     // проверка того, объект Motorcycle создается с 2-мя колесами
     */

    @Test
    void motoHas2wheels(){
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    /**
     // проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
     */

    @Test
    void carHasSpeed(){
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }
    /**
     // проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
     */

    @Test
    void motoHasSpeed(){
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    /**
     // проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта)
     //машина останавливается (speed = 0)
     */

    @Test
    void carHasSpeedInParking(){
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    /**
    // проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта)
    // мотоцикл останавливается (speed = 0)
     */

    @Test
    void motoHasSpeedInParking(){
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }
}