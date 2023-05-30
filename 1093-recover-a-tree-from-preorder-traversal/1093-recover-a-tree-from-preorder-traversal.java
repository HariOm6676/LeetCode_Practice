class Solution {
	int index = 0;
	public TreeNode recoverFromPreorder(String s) {
		return helper(s, 0);
	}
  int j=0;
	public TreeNode helper(String s, int depth) {
						int d=0;
            String n="";
						while(j<s.length() && s.charAt(j)=='-'){
                d+=1;
                j+=1;
						}
						if(depth!=d)
				{
					j-=d;
					return null;
				}
						
            while(j<(s.length())  && s.charAt(j)!='-'){
                n+=(s.charAt(j));
                j+=1;
						}
      
		//  System.out.println(n+"   "+d);
    TreeNode node = new TreeNode(Integer.parseInt(n));
		node.left = helper(s, depth + 1);
		node.right = helper(s, depth + 1);

		return node;
	}
}