package com.sujy.flink.sql.mysql;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.String.format;

public class JdbcDialect {

    public String quoteIdentifier(String identifier) {
        return "\"" + identifier + "\"";
    }


    public String getUpdateStatement(String tableName, String[] fieldNames, String[] conditionFields) {
        String setClause = Arrays.stream(fieldNames)
                .map(f -> format("%s = :%s", quoteIdentifier(f), f))
                .collect(Collectors.joining(", "));
        String conditionClause = Arrays.stream(conditionFields)
                .map(f -> format("%s = :%s", quoteIdentifier(f), f))
                .collect(Collectors.joining(" AND "));
        return "UPDATE " + quoteIdentifier(tableName) +
                " SET " + setClause +
                " WHERE " + conditionClause;
    }

    public String getDeleteStatement(String tableName, String[] conditionFields) {
        String conditionClause = Arrays.stream(conditionFields)
                .map(f -> format("%s = :%s", quoteIdentifier(f), f))
                .collect(Collectors.joining(" AND "));
        return "DELETE FROM " + quoteIdentifier(tableName) + " WHERE " + conditionClause;
    }


    @Test
    public void test(){

        String[] fieldNames = {"id","name","bl_id","repay","price"};
        String[] conditionFields = {"id","name","bl_id"};

        String test = getUpdateStatement("test", fieldNames, conditionFields);
        System.out.println(test);
    }

    @Test
    public void test1(){
        String[] fieldNames = {"id","name","bl_id","repay","price"};
        String collect = Arrays.stream(fieldNames).map(f -> format("%s", f)).collect(Collectors.joining(","));
        System.out.println(collect);
    }

    @Test
    public void forEachTest(){
        Map<String,String> hashMap = new HashMap();
        hashMap.put("a","a");
        hashMap.put("b","b");
        hashMap.put("c","c");
        hashMap.put("d","d");

        hashMap.forEach((k,v)->{
            System.out.println(k+ "  "+ v);
        });

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bb");
        Stream<String> stringStream = list.stream().filter(x-> !x.isEmpty()).map(x ->x + "a");
        stringStream.forEach(System.out::println);


    }


}
