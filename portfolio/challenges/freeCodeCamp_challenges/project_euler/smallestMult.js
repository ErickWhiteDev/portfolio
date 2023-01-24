function smallestMult(n) {
    const gcd = (a, b) => b == 0 ? a : gcd(b, a % b);

    return [...Array(n + 1).keys()].filter(x => x > 0).reduce((a, b) => a * b / gcd(a, b), 1);
}

console.log(smallestMult(20))