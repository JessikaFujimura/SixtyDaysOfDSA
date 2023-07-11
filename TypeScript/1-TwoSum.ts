// Two Sum
// Given an array of integers nums and an integer target , return indices of the two numbers such that they add up to target
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

const nums = [1,2,3,4,0,5];
const target = 5;

function sumTwo(nums, target){
    let result;
    for(let i = 0; i < nums.length ; i++){
        const rest = target - nums[i];
        const pos2 = nums.findIndex(j => j === rest);
        if(pos2 !== -1){
            result = [i, pos2];
        }
    }
    console.log(result);
}
sumTwo(nums, target);

