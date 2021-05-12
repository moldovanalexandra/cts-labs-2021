package ro.ase.acs.main;

import ro.ase.acs.decorator.Car;
import ro.ase.acs.decorator.Vehicle;
import ro.ase.acs.decorator.VehicleWithAlarm;
import ro.ase.acs.decorator.VehicleWithParkingSensors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car("red", 300, 4);
        //car.start();
        //car.stop();
        //Vehicle carWithAlarm = new VehicleWithAlarm(car);
        VehicleWithAlarm carWithAlarm = new VehicleWithAlarm(car);
        carWithAlarm.start();
        carWithAlarm.stop();
        carWithAlarm.activateAlarm();
        //nu merge pt vehicle
        //obiectul din decorarea unei derivari nu poate sa acceseze decat metodele din interfata

        Vehicle carWithParkingSensors = new VehicleWithParkingSensors(car, 5);
        //carWithParkingSensors.start();
        //nu merge sa activez alarma pt ca e de tip Vehicle si vechicle nu are alarma sad reacts only

        //daca se cere un singur decorator nu mai e nevoie de abstract
        //verificare cand avem 2 decorator

        Vehicle carWithAlarmAndParkingSensors = new VehicleWithAlarm(carWithParkingSensors);
        carWithAlarmAndParkingSensors.start();
        carWithAlarmAndParkingSensors.stop();
        
        //clasa anonima
        Vehicle vehicle = new Vehicle() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        };
    }
}
