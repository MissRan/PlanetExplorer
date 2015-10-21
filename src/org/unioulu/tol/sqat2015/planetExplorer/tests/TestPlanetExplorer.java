package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.Face;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {
	private int deployX;
	private int deployY;
	private Face planetExplorerFace;
	private PlanetExplorer planetExplorer;
	
	@Before
	public void setUp()
	{
		deployX = 1;
		deployY = 2;
		planetExplorerFace = Face.NORTH;
		planetExplorer = new.planetExplorer();
	}

	@Test
	public void testThePlanetExplorerCanBeDeployed() {
		planetExplorer.deploy(deployX, deployY, planetExplorerFace);
		Assert.assertEquals(1,planetExplorer.x());
		Assert.assertEquals(2,planetExplorer.y());
		Assert.assertEquals(Face.NORTH, PlanetExplorer.face());
		
	}
	
	@Test
	public void testThePlanetExplorerfaceNorthAfterTurnLeftFaceWest(){
		planetExplorer.deploy(deployX,deployY, Face.NORTH);
		planetExplorer.turnLeft();
		Assert.assertEquals(Face.WEST,PlanetExplorer.face());
		
	}
	
	@Test
	public void testThePlanetExplorerfaceNorthAfterTurnRightFaceEast(){
		planetExplorer.deploy(deployX,deployY, Face.NORTH);
		planetExplorer.turnRight();
		Assert.assertEquals(Face.EAST,PlanetExplorer.face());
		
	}
	@Test
	public void testThePlanetExplorerWouldMoveWhenCommandIsForword(){
		planetExplorer.deploy(deployX,deployY, Face.NORTH);
		planetExplorer.forword();
		Assert.assertEquals(deployX, planetExplorer.x());
		Assert.assertEquals(deployY +1, planetExplorer.y());
		Assert.assertEquals(Face.NORTH,PlanetExplorer.face());
		
		
	}
	@Test
	public void testThePlanetExplorerWouldMoveWhenCommandIsBackward(){
		planetExplorer.deploy(deployX,deployY, Face.NORTH);
		planetExplorer.backward();
		Assert.assertEquals(deployX, planetExplorer.x());
		Assert.assertEquals(deployY -1, planetExplorer.y());
		Assert.assertEquals(Face.NORTH,PlanetExplorer.face());
		
		
	}
}
