package com.example

object patternMatching {

	case class Person(name: String, age: Int)
	case class Course(name: String, teacher: Person)
	
	def guard(block: => Int) {
		if (true) {
			block
		} else {
			0
		}
	}                                         //> guard: (block: => Int)Unit
	
	
	val course = Course("Test2", Person("A2mir", 9))
                                                  //> course  : com.example.patternMatching.Course = Course(Test2,Person(A2mir,9))
                                                  //| 
	course match {
		case Course("Test", _) => {
			println("The course name is Test")
		}
		case Course(_, Person("Amir", _)) => {
			println("The teacher name is Amir")
		}
		case Course(_, Person(_, age)) if age > 20 => {
			println("The teacher is old")
		}
		case _ => println("else")
	}                                         //> else
}