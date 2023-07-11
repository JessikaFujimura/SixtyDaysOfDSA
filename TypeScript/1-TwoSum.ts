const nums = [1,2,3,4,0,5];
const target = 8;

function sumTwo(nums, target){
    let result = [2];
    const numMap = new Map();
    for(let i = 0; i < nums.length ; i++){
        const rest = target - nums[i];
        if(numMap.has(rest)) {
            const pos2 = numMap.get(rest);
            result = [pos2, i];        
        } 
        numMap.set(nums[i], i)
    }
    console.log(result);
}
sumTwo(nums, target);

