package com.testing1090.testing1090;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class Testing1090Application {

	public static void main(String[] args) {
		SpringApplication.run(Testing1090Application.class, args);

        Map<String, Integer> map = new HashMap<>();
        map.put("tinoj", 45);
        map.put("anu", 56);
        map.put("aashis", 98);
        map.put("govind", 28);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, Comparator.comparing(Map.Entry::getKey));

        entries.forEach(System.out::println);
        System.out.println("**********************************");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out:: println);
        System.out.println("**********************************");
        Map<Booke, Long> bookMap = new HashMap<>();
        bookMap.put(new Booke(12L, "tinoj", "dev"), 45L);
        bookMap.put(new Booke(12L, "anu", "blr"), 56L);
        bookMap.put(new Booke(12L, "aashis", "home"), 98L);
        bookMap.put(new Booke(12L, "govind", "Bollywood"), 28L);

        List<Map.Entry<Booke, Long>> bookEntries = new ArrayList<>(bookMap.entrySet());
        Collections.sort(bookEntries, (o1,  o2) -> o2.getKey().getDept().compareTo(o1.getKey().getDept()));

        bookEntries.forEach(System.out::println);
        System.out.println("**********************************");
        bookMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Booke::getDept).reversed())).forEach(System.out::println);
        System.out.println("**********************************");
        bookMap.forEach(System.out::println);
    }

}
