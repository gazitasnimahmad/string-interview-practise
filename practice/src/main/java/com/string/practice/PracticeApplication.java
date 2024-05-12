package com.string.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);

		String name = "hammaddddhufifksddsds";

		// problem 1. printDuplicate in a string
		printDuplicate(name);

		// problem 2. check if two string are anagrams - ex, silent and listen are anagrams
		String first = "silent";
		String second = "listen";
		boolean isAnagram = checkAnagrams(first, second);
		System.out.println(isAnagram == true ? "yes, its an anagram" : "nope, its not an anagram");

	}

	private static boolean checkAnagrams(String first, String second) {
		return false;
	}

	private static void printDuplicate(String name){
		char[] nameArr = name.toCharArray();
		Map<Character, Integer> countMap = new HashMap<>();
		for(int i =0; i<nameArr.length ;i++){
			if(countMap.containsKey(nameArr[i])){
				countMap.put(nameArr[i],countMap.get(nameArr[i])+1);
			} else {
				countMap.put(nameArr[i],1);
			}
		}
		Set<Map.Entry<Character,Integer>> entrySet = countMap.entrySet();
		for(Map.Entry<Character, Integer> entry : entrySet){
			if(entry.getValue() > 1)
				System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
