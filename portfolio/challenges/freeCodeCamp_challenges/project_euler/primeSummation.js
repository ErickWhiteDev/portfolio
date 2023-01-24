function checkPrime(n) {
    let i = 2; // divisor being checked

    while (i <= Math.sqrt(n)) {
        if (n % i === 0) {
            return false;
        }

        i++;
    }

    return true;
}

function primeSummation(n) {
    return [...Array(n).keys()].filter(x => x > 1).filter(x => checkPrime(x)).reduce((a, b) => a + b);
}

console.log(primeSummation(2000000))
