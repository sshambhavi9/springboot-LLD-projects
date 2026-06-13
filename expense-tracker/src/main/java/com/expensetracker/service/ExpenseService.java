package com.expensetracker.service;

import com.expensetracker.entity.Expense;

import java.util.List;

public interface ExpenseService {

    Expense createExpense(Expense expense);

    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);
}