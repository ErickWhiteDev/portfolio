function largestPrimeFactor(number){
    let i = 2;

    while (i <= number){
        if (number % i == 0){
            number /= i;
        }
        else{
            i++;
        }
    }

    return i;
}

console.log(largestPrimeFactor(2355323));