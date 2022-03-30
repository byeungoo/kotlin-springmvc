package com.example.controller.get

import com.example.model.http.UserRequest
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class GetApiController {

    @GetMapping("/hello")
    fun hello() : String {
        return "hello kotlin"
    }

    @GetMapping(path = ["/hello2", "/abcd"])
    fun hello2() : String {
        return "hello kotlin"
    }

    @GetMapping("/get-mapping/path-variable/{name}/{age}")
    fun pathVariable(@PathVariable name : String, @PathVariable age : Int) : String {
      println(name)
      println(age)
      return name;
    }

    @GetMapping("/get-mapping/path-variable2/{name}/{age}")
    fun pathVariable2(@PathVariable(value ="name") _name : String, @PathVariable age : Int) : String {
        val name = "kotlin"
        println("${name} , ${age}")
        println(_name)
        return name;
    }

    @GetMapping("/get-mapping/query-param")
    fun queryParam(@RequestParam name: String, @RequestParam(value = "age") age : Int) : String {
        println("${name} , ${age}")
        return name + " " + age;
    }

    @GetMapping("/get-mapping/query-param/object")
    fun queryParamObject(userRequest: UserRequest) : UserRequest {
        println(userRequest)
        return userRequest
    }

    @GetMapping("/get-mapping/query-param/map")
    fun queryParamMap(@RequestParam map : Map<String, Any>) : Map<String, Any> {
        println(map)
        return map;
    }

}