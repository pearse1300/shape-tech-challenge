package com.company;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DecimalFormat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class MainTests {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    private Main main;
    @Test
    @DisplayName("finding out volume of sphere when radius is 1")
    public void testSphereRadius1(){
        assertEquals("4.19", df2.format(main.sphere(1)));
    }

    @Test
    @DisplayName("finding out volume of sphere when radius is 5")
    public void testSphereRadius5(){
        assertEquals("523.6", df2.format(main.sphere(5)));
    }

    @Test
    @DisplayName("finding out volume of cube when width is 1")
    public void testCubeWidth1(){
        assertEquals("1", df2.format(main.cube(1)));
    }

    @Test
    @DisplayName("finding out volume of cube when width is 5")
    public void testCubeWidth5(){
        assertEquals("125", df2.format(main.cube(5)));
    }

    @Test
    @DisplayName("finding out volume of tetrahedron when edge is 1")
    public void testTetrahedronWidth1(){
        assertEquals("0.12", df2.format(main.tetrahedron(1)));
    }

    @Test
    @DisplayName("finding out volume of tetrahedron when edge is 5")
    public void testTetrahedronWidth5(){
        assertEquals("14.73", df2.format(main.tetrahedron(5)));
    }
}
