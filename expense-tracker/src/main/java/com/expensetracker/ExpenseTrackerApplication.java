package com.expensetracker;

import com.expensetracker.entity.Expense;
import com.expensetracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class ExpenseTrackerApplication implements CommandLineRunner {

	@Autowired
	private ExpenseRepository expenseRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerApplication.class, args);
	}

	@Override
	public void run(String... args) {
		expenseRepository.save(new Expense(500.0, "Food"));
		expenseRepository.save(new Expense(1200.0, "Travel"));

		System.out.println("Data inserted!");
	}
}