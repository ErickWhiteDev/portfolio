function findPythagoreanTriplets(x) {
    let result = [];
    let i = 1;
    let j = 1;
    let k = 1;

    while (i <= x) {
        while (j <= x) {
            while (k <= x) {
                if (i ** 2 === 2 * j * k) {
                    result.push([i + j, i + k, i + j + k].sort());
                }
                k++;
            }
            k = 1;
            j++;
        }
        j = 1;
        i++;
    }

    return result;
}

function specialPythagoreanTriplet(n) {
    return findPythagoreanTriplets(Math.ceil(n / 3)).map(x => [x.reduce((a, b) => a + b), x.reduce((a, b) => a * b)]).filter(x => x[0] === n)[0][1];
}

console.log(specialPythagoreanTriplet(120))