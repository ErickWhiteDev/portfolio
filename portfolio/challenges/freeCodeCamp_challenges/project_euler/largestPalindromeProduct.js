function largestPalindromeProduct(n) {
    let largest = 0;

    let min = 10 ** (n - 1);
    let max = 10 ** n;

    for (let i = min; i < max; i++){
      for (let j = i; j < max; j++){
        if ((i * j) > largest && (i * j).toString() === (i * j).toString().split("").reverse().join("")){
          largest = i * j;
        }
      }
    }
  
    return largest;
}
