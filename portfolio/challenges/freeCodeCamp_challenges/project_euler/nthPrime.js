function nthPrime(n) {
    let x = 1; // prime count
    let i = 1; // number being checked
    let j = 2; // divisor being checked

    while (x <= n) {
        i++;

        while (j <= Math.sqrt(i)) {
            if (i % j === 0) {
                break;
            }
            j++;
        }

        if (j > Math.sqrt(i)) {
            x++;
        }

        j = 2;
    }

    return i;
}

console.log(nthPrime(5));