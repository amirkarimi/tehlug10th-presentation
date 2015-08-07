package com.example

case class Person(name: String, age: Int)
case class Course(name: String, teacher: Person)

object patternMatching {
	val course = Course(“Test”, Person(“Amir”, 29))
	course match {
		case Course(“Test”, _) => println(“The course name is Test”)
		case Course(_, Person(“Amir”, _)) => println(“The teacher name is Amir”)
		case Course(_, Person(_, age)) if age > 20 => println(“The teacher is old”)
		case _ => println(“else”)
	}
}
