package xyz.wallpanel.app.modules

import kotlinx.serialization.Serializable

@Serializable
data class WeatherInfo(
    val current_temperature: String,
    val current_conditions: String,
    var high_temperature: String,
    var low_temperature: String,
    var wind_direction: String,
    var wind_speed: String,
    var chance_of_precip: String
)