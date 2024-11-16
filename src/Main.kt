//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun isPrime(number: Int):Boolean{
    if (number<2)return false
    for (i in 2 until number){
        if (number%i==0)return false
    }
    return true
}
fun main() {
    for (number in 100..500){
        if (isPrime(number)){
            println(number)
        }
    }
}