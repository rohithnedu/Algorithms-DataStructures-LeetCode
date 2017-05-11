

/*  
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

*/




   public List<List<Integer>> generate(int numRows) {
   
   
      List<List<Integer>> allRows = new List<List<Integer>>();
	  List<Integer> row = new List<Integer>();
	  
	  
	  for( int i = 0 ; i < numRows ;i++) {
	  
	        row.add(0,1);
	  
	       for( j=1 ; j < row.Size() - 1;j++) {
		      row.set(j,row.get(j) + row.get(j+1));
		   
		   }
		   
		   alRows.add(new ArrayList<Integer>(row));
	  
	  }
	  
	  return allRows;
	  
        
    }