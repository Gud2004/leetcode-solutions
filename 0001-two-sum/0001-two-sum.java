class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[]ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            int sum=nums[i];
            int searching=target-sum;
            if(map.containsKey(searching)){
                ans[0]=map.get(searching);
                ans[1]=i;
                return ans;
            }
            map.put(sum,i);
        }

return ans;
    }
}


























//         int n=nums.length;
//         int[]ans=new int[2];
//         ans[0]=-1;
//         ans[1]=-1;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i]+nums[j]==target){
//                     ans[0]=i;
//                     ans[1]=j;
//                     return ans;
//                 }
//             }
//         }
//         return ans;
//     }
// }

































//         int n=nums.length;
//         int[] arr=new int[2];
//         arr[0]=-1;
//         arr[1]=-1;
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<n;i++){
//             int sum=nums[i];
//             int seen=target-sum;
//             if(map.containsKey(seen)){
//                 arr[0]=map.get(seen);
//                 arr[1]=i;
//                 return arr;
//             }
//             map.put(nums[i],i);
//         }
//         return arr;
//     }
// }
























    //     int n=nums.length;
    //     int[] arr=new int[2];
    //     arr[0]=-1;
    //     arr[1]=-1;
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(nums[i]+nums[j]==target){
    //                 arr[0]=i;
    //                 arr[1]=j;
    //                 return arr;
    //             }
    //         }
    //     }
    //     return arr;

    //     }
        
    // }
