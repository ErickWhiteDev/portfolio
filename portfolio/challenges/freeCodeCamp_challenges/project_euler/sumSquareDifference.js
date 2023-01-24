function sumSquareDifference(n) {
    return Math.pow(([...Array(n + 1).keys()].reduce((a, b) => a + b)), 2) - [...Array(n + 1).keys()].map(x => Math.pow(x, 2)).reduce((a, b) => a + b);
}

console.log(sumSquareDifference(10))