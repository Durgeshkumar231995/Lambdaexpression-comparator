package com.stackroute.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSort {

	// write here logic to sort a string List
	public String stringSorter(List<String> stringList, String sortingOrder) {

		if (sortingOrder == null || stringList == null) {

			return "Given stringList or sortingOrder is empty, null or blank space";

		}

		if (sortingOrder.isEmpty() || sortingOrder.isBlank()) {

			return "Given stringList or sortingOrder is empty, null or blank space";

		}

		if(sortingOrder.equals("desc")) {
			
			List<String> sortedList = stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
			
			if (sortedList.isEmpty()) {
				
				return "Given stringList or sortingOrder is empty, null or blank space";
			}
			for (String sL : sortedList) {

				if (sL.isBlank() || sL.isEmpty()) {
					return "The list contains an empty or blank space value";
				}

				return sortedList.stream().collect(Collectors.joining(", ", "[", "]"));
			}
		}
		if (sortingOrder.equals("asc")) {

			List<String> sortedName = stringList.stream().sorted().collect(Collectors.toList());

			for (String sn : sortedName) {

				if (sn.isBlank() || sn.isEmpty()) {
					return "The list contains an empty or blank space value";
				}
				if (sortedName.size() == 1) {
					return "The list contains only one value";
				}
				return sortedName.stream().collect(Collectors.joining(", ", "[", "]"));
			}
       
		} else {
			return "No sorting order present for given string 'demo' , 'asc' for ascending order sort and 'desc' for descending order sort";

		}

		return null;

	}
}
