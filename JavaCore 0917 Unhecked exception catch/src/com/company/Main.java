package com.company;

/*

0918 All of their own, even exceptions
There are four classes MyException, MyException2, MyException3, MyException4.
Inherit classes so that you get any two checked exceptions and any two unchecked exceptions.
Hint:
Examine carefully the classes Exception1, Exception2, Exception3 from the second task of this block.

Requirements:
1. There must be 4 nested classes in the Solution class: MyException, MyException2, MyException3, and MyException4.
2. All nested classes must be inherited from exception classes.
3. Two classes out of four must be checked with exceptions.
4. Two classes of four should be unchecked by exceptions.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.util.*;


public class Main {
    public static void main(String[] args) {}
    static class MyException extends Exception {}
    static class MyException2 extends MyException {}
    static class MyException3 extends RuntimeException {}
    static class MyException4 extends MyException3 {}
}





