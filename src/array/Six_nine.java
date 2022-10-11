package array;

public class Six_nine {
    public int mySqrt(int x){
        if(x==0) return 0;
        int low=1;
        int high=x;
        int ans=-1;
        while (low<=high){
            int mid=low+((high-low)/2);
            if((long)(mid*mid)<=x){
                ans=mid;
                low=mid+1;
            }else high=mid-1;
        }
        return ans;
    }
public boolean isPerfectSquare(int num) {
    int low=0;
    int high=num;
    while (low<=high){
        int mid=low+(high-low)/2;
        Long square =(long)(mid * mid);
        if(square<num) {low=mid+1;}
        else if(square>num) {high=mid-1;}
        else {return true;}
    }
    return false;
}

}
