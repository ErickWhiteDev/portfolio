function updateInventory(arr1, arr2) {
    let quantities = [];
    let items = [];

    for (let i in arr1){
        quantities.push(arr1[i][0]);
        items.push(arr1[i][1]);
    }

    for (let i in arr2){
        let index = items.findIndex(x => x === arr2[i][1]);
        if (index === -1){
            quantities.push(arr2[i][0]);
            items.push(arr2[i][1]);
        }
        else{
            quantities[index] += arr2[i][0];
        }
    }

    for (let i = 0; i < quantities.length; i++){
        quantities[i] = [quantities[i]];
        quantities[i].push(items[i]);
    }

    return quantities.sort((a, b) => a[1] > b[1] ? 1 : -1);
}

// Example inventory lists
var curInv = [
    [21, "Bowling Ball"],
    [2, "Dirty Sock"],
    [1, "Hair Pin"],
    [5, "Microphone"]
];

var newInv = [
    [2, "Hair Pin"],
    [3, "Half-Eaten Apple"],
    [67, "Bowling Ball"],
    [7, "Toothpaste"]
];

console.log(updateInventory(curInv, newInv));