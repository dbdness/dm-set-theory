// ABOUT -- This is a exapmle of sets in JavaScript.

var car = ["wheels", "brakes", "motor", ]
var bicycle = ["wheels", "brakes", "saddle"]

var setA = new Set(car);
var setB = new Set(bicycle);

// === MEMBERSHIP ===
// Here we are just checking if setA has "saddle".
console.log(setA.has("saddle")); // Should return 'false'.



// === INTERSECTION ===
// Here we are saying, if a given set has the element of anySet, then add it to a new set called 'intersection' which we return.
Set.prototype.intersection = function(anySet){
    var intersection = new Set();
    for(var element of anySet){
        if (this.has(element)) {
            intersection.add(element);
        }
    }
    return intersection;
}

console.log("Intersection:", setB.intersection(setA)); // Should return 'Intersection: Set { 'wheels', 'brakes' }'.



// === UNION FUNCTION === 
// Here we create a function that puts an element of anySet on a given set.
Set.prototype.union = function (anySet) {
    var union = new Set(this);
    for(var element of anySet){
        union.add(element);
    }
    return union;
}

console.log("Union", setA.union(setB)); // Should return 'Union Set { 'wheels', 'brakes', 'motor', 'saddle' }'


