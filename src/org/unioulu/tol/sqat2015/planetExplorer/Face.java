package org.unioulu.tol.sqat2015.planetExplorer;

public enum Face {
      NORTH, SOUTH, EAST, WEST;
    
	public static Face rightOf(Face face){
    	  switch(face){
    		  case NORTH:return EAST;
    		  case EAST:return SOUTH;
    		  case SOUTH:return WEST;
    		  case WEST:return NORTH;
    		  default:return NORTH;
    		  	  
    	  }
      }
	public static Face leftOf(Face face){
  	  switch(face){
  		  case NORTH:return WEST;
  		  case WEST:return SOUTH;
  		  case SOUTH:return EAST;
  		  case EAST:return NORTH;
  		  default:return NORTH;
  		  }
  	  }
}
