function coeff(n) {
    let c = 
    Math.floor(
        (1 / Math.sqrt(5)) * 
        (
            Math.pow(
                (1 + Math.sqrt(5)) / 2, n
            )
            -
            Math.pow(
                (1 - Math.sqrt(5)) / 2, n
            )
        )
    )

    return c;
}

function fiboEvenSum(n) {
    let sum = 0;
    let x = 0;

    while (coeff(x) <= n) {
        if (coeff(x) % 2 == 0) {
            sum += coeff(x);
        }

        x++;
    }

    return sum;
}

console.log(fiboEvenSum(4000000));