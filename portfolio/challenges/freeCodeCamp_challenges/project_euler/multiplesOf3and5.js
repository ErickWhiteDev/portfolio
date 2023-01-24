function multiplesOf3and5(number) {
    return [...Array(number).keys()].filter(x => ((x % 5 == 0) || (x % 3 == 0))).reduce((a, b) => a + b);
}

console.log(multiplesOf3and5(15));