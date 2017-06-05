package com.slowlizard.command;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Invoker  invoker=new Invoker();
       invoker.setCommand(new CreateCommand(new Receiver()));
       invoker.run();
    }
}
