package LeetCode;

public class LeetCode_190 {
    
    public int reverseBits(int n) {
        int res = 0;
        for(int i = 0; i < 32; i++, n >>= 1){
            res = res << 1 | (n & 1);
        }
        return res;
    }
	public int reverseBits_self_wrong(int n) {
        int res=-1;
        while(n!=0)
        {
            if((n&1)!=1)
            {
                res=res>>>1;
            }else if((n&1)!=1){
                res=res>>1;
            }
        }
        return res;
    }
}
