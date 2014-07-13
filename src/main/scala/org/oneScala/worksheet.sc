object worksheet{
//if
if (true) println("hello") else println("world")  //> hello
//while
var i = 0;var sum = 0                             //> i  : Int = 0
                                                  //| sum  : Int = 0
while (i<10) {
	sum += i
	i += 1
}
println(sum)                                      //> 45

//for
sum = 0
for(i <- 1 to 10)
	sum += i
println(sum)                                      //> 55

//for and until, then 10 excluded from sum.
sum = 0
for(i <- 1 until 10)
	sum += i
println(sum)                                      //> 45
//for cooperate with if
sum = 0
for(i <- 1 to 20 if i % 2 == 0 ; if i % 3 == 0)
	sum += i
println(sum)                                      //> 36
//loop for a list
sum = 0
for(i <- List(1,2,3,4))
	sum += i
println(sum)                                      //> 10

//for and yield, use for to generate the each element
val numList = for { i <- List(1,2,3,4) if i % 2 == 0 } yield i
                                                  //> numList  : List[Int] = List(2, 4)
val numList2 = for(i <- List(1,2,3,4)) yield {i}  //> numList2  : List[Int] = List(1, 2, 3, 4)


}