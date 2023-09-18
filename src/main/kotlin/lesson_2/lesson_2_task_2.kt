package lesson_2

fun main(){
    val worker = 50
    val salaryWorker = 30000
    val trainee = 30
    val salaryTrainee = 20000
    val salaryAllWorker = worker * salaryWorker
    val salaryAll = salaryWorker + (trainee * salaryTrainee)
    val medianSalary = (salaryWorker + salaryTrainee)/2

    println(salaryAllWorker)
    println(salaryAll)
    println(medianSalary)
}