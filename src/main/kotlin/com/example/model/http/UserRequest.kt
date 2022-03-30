package com.example.model.http

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)  // 스네이크 케이스로 매핑
data class UserRequest(var name:String?=null,
                       var age:Int?=null,
                       var email:String?=null,
                       var address:String?=null,

                       //@JsonProperty("phone_number")
                       var phoneNumber:String?=null
)