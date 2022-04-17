package main

import "fmt"

func main() {
	//concat strings
	fmt.Println("go" + "lang")

	//int and float math operations
	fmt.Println("1+1 =", 1+1)
	fmt.Println("7.0/3.0 =", 7.0/3.0)

	//bool
	fmt.Println(true && false)
	fmt.Println(true || false)
	fmt.Println(!true)

	//variables
	var a = "initial"
	fmt.Println(a)

	var b, c int = 1, 2
	fmt.Println(b, c)

	var d = true
	fmt.Println(d)

	var e int
	fmt.Println(e)

	f := "apple"
	fmt.Println(f)
}
