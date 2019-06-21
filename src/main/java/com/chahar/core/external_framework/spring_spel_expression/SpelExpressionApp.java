package com.chahar.core.external_framework.spring_spel_expression;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class SpelExpressionApp {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		SpelExpressionParser parser = new SpelExpressionParser();
		StandardEvaluationContext ctx = new StandardEvaluationContext();

		ctx.setVariable("cores", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
		ctx.setVariable("employee", new SalariedEmployee(100, "yash@gmail.com", "yash", "chahar"));
		ctx.setVariable("performCheck",
				SpelExpressionApp.class.getMethod("performValidation", new Class[] { Integer.class }));

		/*
		 * String expression = "#cores * 2"; Expression expr =
		 * parser.parseExpression(expression); Integer result = (Integer)
		 * expr.getValue(ctx, Integer.class);
		 */

		// String expression = "#employee.email != null";
		// String expression = "#employee.email == null";
		// String expression = "#employee.firstName eq 'yash1'";
		// Expression expr = parser.parseExpression(expression);
		// Boolean result = (Boolean) expr.getValue(ctx, Boolean.class);

		String expressionStatement = "#employee.id != null && #performCheck(#employee.id) >= 1000";
		Expression expr = parser.parseExpression(expressionStatement);
		Boolean result = (Boolean) expr.getValue(ctx, Boolean.class);
		System.out.println(result);
	}

	public static Integer performValidation(final Integer param) {
		System.out.println("performValidation method called with Parametes:" + param);
		Integer result = param * 10;
		return result;
	}

}
