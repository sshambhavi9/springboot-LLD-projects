package com.expensetracker.service.impl;

import com.expensetracker.entity.Expense;
import com.expensetracker.repository.ExpenseRepository;
import com.expensetracker.service.ExpenseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// Marks this as a Spring service component
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;

    // ✅ Constructor Injection (Best Practice)
    public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    // ✅ Create Expense
    @Override
    public Expense createExpense(Expense expense) {

        // Example business logic
        if (expense.getAmount() <= 0) {
            throw new RuntimeException("Amount must be greater than 0");
        }

        return expenseRepository.save(expense);
    }

    // ✅ Get All Expenses
    @Override
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    // ✅ Get Expense by ID
    @Override
    public Expense getExpenseById(Long id) {
        return expenseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Expense not found"));
    }
}