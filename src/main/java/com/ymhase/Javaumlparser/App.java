package com.ymhase.Javaumlparser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	ParseEngine pe = new ParseEngine("C:\\Users\\yoges\\Downloads\\uml-parser-test-1", "C:\\Users\\yoges\\Downloads\\uml-parser-test-1\\test-1");
        pe.start();
    }
}
