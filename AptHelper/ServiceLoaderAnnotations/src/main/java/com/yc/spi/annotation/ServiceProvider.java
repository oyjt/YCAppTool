package com.yc.spi.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: 杨充
 * @email : yangchong211@163.com
 * @time : 2021/04/15
 * @desc : 接口注解类
 * @revise :
 */
//@Target用来表示这个注解可以使用在哪些地方。比如：类、方法、属性、接口等等。
//这里ElementType.TYPE 表示这个注解可以用来修饰：Class, interface or enum declaration。
//当你用ContentView修饰一个方法时，编译器会提示错误。
@Target(ElementType.TYPE)
//@Retention用来修饰这是一个什么类型的注解。这里表示该注解是一个运行时注解。
@Retention(RetentionPolicy.RUNTIME)
//这里的interface并不是说 ServiceProvider 是一个接口。
//就像申明类用关键字class。申明枚举用enum。申明注解用的就是@interface。
public @interface ServiceProvider {

    /**
     * 返回值表示这个注解里可以存放什么类型值。
     * Returns provided interfaces
     */
    Class<?>[] value();

    /**
     * Returns the priority
     */
    int priority() default 0;

    /**
     * Returns the alias
     */
    String alias() default "";

}
