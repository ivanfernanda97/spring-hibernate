package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LuvAopExpressions {

	@Pointcut("execution(*  com.luv2code.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {}
	
	// create pointcut for getter method
	@Pointcut("execution(*  com.luv2code.aopdemo.dao.*.get*(..))")
	public void getter() {}

	// create pointcut for setter method
	@Pointcut("execution(*  com.luv2code.aopdemo.dao.*.set*(..))")	
	public void setter() {}
	
	// create pointcut: include package ... exclude getter/setter method
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoGetterSetter() {}

}
