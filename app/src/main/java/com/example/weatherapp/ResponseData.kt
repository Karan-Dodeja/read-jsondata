package com.example.weatherapp

data class ResponseData (
    val message: String,
    val user_id: Int,
    val name: String,
    val email: String,
    val mobile: Long,
    val profile_details: ProfileDetails,
    val data_list: List<DataListDetails>
)

data class ProfileDetails (
    val is_profile_completed: Boolean,
    val rating: Double
)

data class DataListDetails (
    val id: Int,
    val value: String
)