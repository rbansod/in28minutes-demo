package com.in28minutes.springboot.web.in28minutesdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearch(int[] nums,int numberToSearchFor) {
		nums = sortAlgorithm.sortAlgo(nums);
		System.out.println(sortAlgorithm);
		//Search
		return binarySearch(numberToSearchFor, nums, 0, nums.length-1);
	}
	public int binarySearch(int numberToSearchFor, int[] nums, int low, int high) {
		if(low>=high) return -1;
		while(low<high) {
			int mid = low + ((high-low)/2);
			if(numberToSearchFor<nums[mid]) {
				return binarySearch(numberToSearchFor, nums, low, mid-1);
			}
			else if(numberToSearchFor>nums[mid]) {
				return binarySearch(numberToSearchFor, nums, mid+1, high);
			}
			else {return mid;}
		}
		return -1;
	}
	
}
