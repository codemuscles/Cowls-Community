/* Leetcode 1531 question link - https://leetcode.com/problems/string-compression-ii/
  Applied Dynamic Programming conecpt in this question - Memoization  */
// code-

int dp[101][27][101][101];
class Solution {
    
    int f(int ind,string &s,int prev,int len,int k){
        if(k<0) return INT_MAX;
        if(ind>=s.size()) return 0;
        if(dp[ind][prev][len][k]!=-1) return dp[ind][prev][len][k];
        int not_pick=f(ind+1,s,prev,len,k-1);
        int pick=0;
        if(s[ind]-'a'== prev){
            if(len==1 || len==9 || len==99){
                pick+=1;
            }
            pick=pick+f(ind+1,s,prev,len+1,k);
        }
        else{
            pick=1+f(ind+1,s,s[ind]-'a',1,k);
        }
        return dp[ind][prev][len][k]=min(pick,not_pick);
    }
public:
    int getLengthOfOptimalCompression(string s, int k) {
        int n=s.length();
        memset(dp,-1,sizeof(dp));
        return f(0,s,26,0,k);
    }
};
