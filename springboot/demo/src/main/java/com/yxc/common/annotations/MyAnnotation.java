package com.yxc.common.annotations;

import java.lang.annotation.*;

/**
 * @Retention:定义注解的生命周期，分为以下三种：
 *   SOURCE:源码级别，在class中不包含
 *   CLASS：编译级别，注解会在class字节码文件中存在，但运行时无法获得
 *   RUNTIME：运行期级别，会在class字节码文件中存在，在运行时可以通过反射获取到
 * @Target：定义注解修饰的目标：
 *    ElementType.TYPE：接口、类、枚举、注解
 *    ElementType.FIELD：字段、枚举的常量
 * 　 ElementType.METHOD：方法
 *　  ElementType.PARAMETER：方法参数
 * 　 ElementType.CONSTRUCTOR：构造函数
 * 　 ElementType.LOCAL_VARIABLE：局部变量
 * 　 ElementType.ANNOTATION_TYPE：注解
 * 　 ElementType.PACKAGE：包
 * @Document：说明该注解将被包含在javadoc中
 *
 * @Inherited：说明子类可以继承父类中的该注解
 * 注解定义完了，用切面起作用
 * **/
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnnotation {
    String value() default "";
}
