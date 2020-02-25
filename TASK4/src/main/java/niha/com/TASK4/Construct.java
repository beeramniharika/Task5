package niha.com.TASK4;


import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.PrintStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
public class Construct{
  private static final Logger LOGGER=LogManager.getLogger(Construct.class);
  public static void main(String args[]) {
   Scanner sc=new  Scanner(System.in);
   LOGGER.debug("Enter material type:Standard/Above Standard/High Standard:");
   String materialtype=sc.nextLine();
   int cost;
   LOGGER.info("Enter total area of house in yards:");
   int totalareaofhouse=sc.nextInt();
   LOGGER.error("Enter fully automated home or not:Yes/No");
   String answer=sc.next();
   if("Standard".equals(materialtype)){
         cost=1200*totalareaofhouse;
         LOGGER.info(cost);
    }
    else if("Above Standard".equals(materialtype)){
         cost=1500*totalareaofhouse;
         LOGGER.info(cost);
    }
    else if("High Standard".equals(materialtype)){
         if("Yes".equals(answer)){
              cost=2500*totalareaofhouse;
              LOGGER.warn(cost);
          }
    else{
         cost=1800*totalareaofhouse;
         LOGGER.fatal(cost);
       }
    }
    else{
         LOGGER.debug("Enter correct type of material standards");
    }

  }
}