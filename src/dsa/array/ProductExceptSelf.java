/**
 * CALIBO INC ("COMPANY") CONFIDENTIAL
 * Copyright (C) 2024 Calibo Inc, All Rights Reserved.
 * <p>
 * NOTICE:  All information contained herein is, and remains the property of COMPANY. The intellectual and technical
 * concepts contained herein are proprietary to COMPANY and may be covered by Indian and Foreign Patents, patents in
 * process, and are protected by trade secret or copyright law. Dissemination of this information or reproduction of
 * this material is strictly forbidden unless prior written permission is obtained from COMPANY.
 */


package dsa.array;

/**
 * The Class ProductExecptSelf.
 * @author Jaya Prasad.
 */

public class ProductExceptSelf {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		int[] result = productExceptSelf(nums);
		for (int i : result) {
			System.out.print(i + " ");
		}
	}

	public static int[] productExceptSelf(int[] nums) {
		int n=nums.length;
		int[] prefProduct=new int[n];
		int[] suffProduct=new int[n];
		int[] res=new int[n];

		prefProduct[0]=1;
		for(int i=1;i<n;i++)
			prefProduct[i]=nums[i-1] * prefProduct[i-1];

		suffProduct[n-1]=1;
		for(int j=n-2;j>=0;j--)
			suffProduct[j]=nums[j+1] * suffProduct[j+1];


		for(int i=0;i<n;i++)
			res[i]=prefProduct[i] * suffProduct[i];


		return res;
	}
}
