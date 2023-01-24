function sym(...args) {
  let symArr = [...new Set(args[0])];
  let temp = [];

  for (let i = 1; i < args.length; i++){
    temp = [...new Set(args[i])];
    [symArr, temp] = [symArr.filter(x => !temp.includes(x)), temp.filter(x => !symArr.includes(x))];
    symArr = symArr.concat(temp);
  }

  return symArr;
}

sym([1, 2, 3], [5, 2, 1, 4]);