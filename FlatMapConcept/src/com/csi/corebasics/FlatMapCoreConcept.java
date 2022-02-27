package com.csi.corebasics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapCoreConcept {
	public static void main(String[] args) {

		List<Integer> il1=Arrays.asList(4,5,6);
		List<Integer> il2=Arrays.asList(1,2,3);
		List<Integer> il3=Arrays.asList(7,8,9);
		
		List<List<Integer>> ii1=Arrays.asList(il1,il2,il3);
		
		System.out.println(ii1);
		
		List<Integer> iList=ii1.stream().flatMap(i-> i.stream()).collect(Collectors.toList());
		
		System.out.println(iList);
	}
}
