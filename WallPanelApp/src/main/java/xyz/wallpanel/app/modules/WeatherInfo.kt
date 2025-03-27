package xyz.wallpanel.app.modules

import kotlinx.serialization.Serializable

@Serializable
data class WeatherInfo(
    val current_temperature: String,
    val current_conditions: String,
    //var highTemperature: String,
    //var lowTemperature: String,
    //var windDirection: String,
    //var windSpeed: String,
    //var chanceOfPrecip: String
)