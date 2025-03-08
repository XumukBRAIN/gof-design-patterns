package com.dev.gofdesignpatterns.behavioral.observer;

public class WeatherNewsRunner {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(statisticsDisplay);

        // Обновляем данные о погоде
        weatherData.setMeasurements(30, 65, 1013);
        weatherData.setMeasurements(28, 70, 1012);
        weatherData.setMeasurements(26, 90, 1011);
    }

}
