package chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LesDatesTimes {

	public static void main(String[] args) {
		
		//Part 1 : Creating Date & Time
		
		/*
		LocalDate ld = LocalDate.now(); //now() : c'est une méthode de classe(méthode statique)
		System.out.println(ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);*/
		
		//LocalDate bd = LocalDate.of(2004, 12, 12);
		/*
		LocalDate bd = LocalDate.of(2004, Month.JULY, 12);
		System.out.println(bd);
		LocalTime lt= LocalTime.of(10, 15);
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.of(bd, lt);
		System.out.println(ldt);
		
		LocalDateTime ldt2 = LocalDateTime.of(2008, Month.APRIL, 2, 11, 30);
		System.out.println(ldt2);
		*/
		
		// Part 2 : Manipulating Date & Time
		/*
		LocalDate date = LocalDate.of(2000, Month.JANUARY, 30);
		System.out.println(date);
		date = date.plusMinutes(1); 
		//date = date.plusMonths(1);
		
		System.out.println(date.plusMonths(1));
		System.out.println(date);*/
		/*
		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date2, time).minusDays(1).minusHours(10).minusSeconds(30); 
		System.out.println(dateTime);
		
		Period wrong = Period.ofYears(1).ofWeeks(1);
		//Period p = Period.of(2, 3, 10);
		System.out.println(dateTime.plus(wrong));*/
	    
		// Part 3 : Formatting Date & Time
		/*
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 21);
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfYear()); 
		System.out.println(date.getYear()); */
		/*
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		DateTimeFormatter myFormatF = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter myFormatM = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter myFormatS = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		
		DateTimeFormatter myFormatT = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		
		
		System.out.println(date);
		System.out.println(date.format(myFormatF));
		System.out.println(myFormatF.format(date));
		System.out.println(date.format(myFormatM));
		System.out.println(date.format(myFormatS));
		
		System.out.println(time);
		System.out.println(time.format(myFormatT));
		*/
		/*
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime2 = LocalDateTime.of(date, time);
		System.out.println(dateTime2);
		
		DateTimeFormatter myFormatS = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(dateTime2.format(myFormatS));*/
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		String d1 = "07 10 2021";
		String d2 = "12 11 2021";
		LocalDate d = LocalDate.parse(d1,f);
		System.out.println(d);
		
	}

}
