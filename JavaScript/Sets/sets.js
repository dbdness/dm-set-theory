var car = ["wheels", "brakes", "motor", ]
var bicycle = ["wheels", "brakes", "saddle"]

var setA = new Set(car);
var setB = new Set(bicycle);

// Here we are just checking if setA has "saddle".
console.log(setA.has("saddle")); // Should return 'false'.

// UNION FUNCTION: 
// Here we create a function that puts an element of anySet on a given set.
Set.prototype.union = function (anySet) {
    var union = new Set(this);
    for(var element of anySet){
        union.add(element);
    }
    return union;
}

console.log("Union", setA.union(setB)); // Should return 'Union Set { 'wheels', 'brakes', 'motor', 'saddle' }'

