package com.demo.reflect;

import com.demo.domain.Person;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by simpletour_Jenkin on 2016/3/28.
 */
public class Reflector {
    public static void main(String[] args) throws Exception{
        Set<String> ss = new HashSet<>();
        ss.add("foo");
        Iterator it = ss.iterator();
        Method method = it.getClass().getMethod("hasNext");
        System.out.println(method.invoke(it));

//        ((Object)Person.member).hashCode();
    }
}
