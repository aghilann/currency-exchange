package com.example.limitsservice.Beans

class Limits() {

    var minimum: Int = 0
    var maximum: Int = 0

    constructor(minimum: Int, maximum: Int) : this() {
        this.minimum = minimum
        this.maximum = maximum
    }
}
