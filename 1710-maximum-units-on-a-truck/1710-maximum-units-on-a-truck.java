class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int totalboxes=0;
        int remain=truckSize;
        for(int i=0;i<boxTypes.length;i++)
        {
           int boxesAvailable=boxTypes[i][0];
           int unitsPerBox=boxTypes[i][1];
           int take=Math.min(boxesAvailable,remain);
           totalboxes+=take*unitsPerBox;
           remain-=take;
           if(remain==0)
           {
           break;
           }
        }
    return totalboxes;
    }
}