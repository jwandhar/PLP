package com.cg.expensebean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "expense")
public class ExpenseBean {
	@Id
	int expenseCode;
	@NotNull
//	@Size(min = 3, max = 15, message = "Name should have atleast 3 characters")
	private String expenseType;

	@NotNull
//	@Size(min = 15, max = 100, message = "Name should have atleast 15 characters")
	String expenseDescription;

	public int getExpenseCode() {
		return expenseCode;
	}

	public void setExpenseCode(int expenseCode) {
		this.expenseCode = expenseCode;
	}

	public String getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public String getExpenseDescription() {
		return expenseDescription;
	}

	public void setExpenseDescription(String expenseDescription) {
		this.expenseDescription = expenseDescription;
	}

}
