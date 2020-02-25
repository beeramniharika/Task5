package niha.com.SICI;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.PrintStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
public class App{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
  Double PrincipalAmount;
  Double Time;
  Double Rate;
  Double SimpleInterest;
  Double CompoundInterest;
  LOGGER.debug("Enter Principal Amount:");
  PrincipalAmount=sc.nextDouble();
  LOGGER.info("Enter Time:");
  Time=sc.nextDouble();
  LOGGER.error("Enter Rate:");
  Rate=sc.nextDouble();
  SimpleInterest=((PrincipalAmount*Time*Rate)/100);
  LOGGER.warn("Simple Interest is "+SimpleInterest);
  CompoundInterest=PrincipalAmount*(Math.pow((1+Rate/100),Time));
  LOGGER.fatal("Compound Interest is "+CompoundInterest);

}
}
