package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.expenseException.ExpenseException;
import com.cg.expensebean.ExpenseBean;
import com.cg.service.IExpenseService;

@RestController
public class ExpenseController {

	public ExpenseController() {
	}

	@Autowired
	IExpenseService service;

	@PostMapping(path = "/addExpense")
	String addExpense(@RequestBody @Valid ExpenseBean expense) {
		return service.addInfo(expense);
	}

	@GetMapping(path = "/getExpense/{expenseCode}")
	ExpenseBean getExpense(@PathVariable("expenseCode") int expenseCode) {
		return service.getInfo(expenseCode);
	}

	@PutMapping(path = "/modify")
	String updateExpense(@RequestBody ExpenseBean expense) {
		service.updateExpense(expense);
		return "success";
	}

	@GetMapping("/getAll")
	public List<ExpenseBean> getAll() {
		return service.getAll();
	}

	@DeleteMapping("/delete/{expenseCode}")
	public String deleteExpense(@PathVariable int expenseCode) {
		service.deleteExpense(expenseCode);
		return "success";
	}
}
