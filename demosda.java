package 实训作业;

import java.util.Scanner;

public class paixun {

	private static final long StartTime = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t = new int[50];
		int [] temp= new int[t.length];
		   System.out.println();
		   System.out.print("随机产生的数为: ");
		   for (int i = 0; i < 50; i++) {
		int random = (int) (1 + Math.random() * 100);
			t[i] = random;
			System.out.print(+random + " ");
		}
		    System.out.println();
            System.out.println("请输入排序方法:");
			System.out.println("1-直接插入排序:");
			System.out.println("2-希尔排序:");
			System.out.println("3-冒泡排序:");
			System.out.println("4-快速排序:");
			System.out.println("5-直接选择排序:");
			System.out.println("6-堆排序:");
			System.out.println("7-双向冒泡排序:");
			Scanner s = new Scanner(System.in);
			int xz = s.nextInt();
			switch (xz) {
			case 1:
				insertSort(t);
			System.out.print("排序后:");
				 for (int bb: t){
			    System.out.print(bb+" ");
				 }  // array.insertSort();
				break;
				
			case 2:
				ShellSort(t);
				System.out.print("排序后:");
				 for (int cc: t){
			    System.out.print(cc+" ");
				 }  // array.shellSort();
				break;
				
			case 3:
				bubbleSort(t);
				System.out.print("排序后:");
				 for (int dd: t){
				System.out.print(dd+" ");
				 } // array.bubbleSort();
				break;
				
			case 4:
				quicksort(t);
				System.out.print("排序后:");
				 for (int ee: t){
			    System.out.print(ee+" ");
				 } // array.quickSort();
				 break;
				 
			case 5:
				selectSort(t);
				System.out.print("排序后:");
				 for (int gg: t){
			    System.out.print(gg+" ");
				 } // array.selectSort();
				break;
				
			case 6:
				heapSort(t);
				System.out.print("排序后:");
				 for (int hh: t){
			    System.out.print(hh+" ");
				 } // array.heapSort();
				break;
				
			case 7: 
				orderAsc1(t);
				System.out.print("排序后:");
				 for (int jj: t){
			    System.out.print(jj+" ");
				 } // array.mergeSort();
				break;
				}
         System.out.println("排序后:");
		// array.display();
	     }
      private static void selectSort(int[] t) {
		// TODO Auto-generated method stub
		
	}
	public static void insertSort(int[] a) {
    	  long StartTime=System.nanoTime(); 
     	  int compareCount=0;
     	  int moveCount=0;
		if (a != null) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i;
		if (a[j - 1] > temp) {
		  while (j >= 1 && a[j - 1] > temp) {
			a[j] = a[j - 1];
			j--;
			compareCount+=2;
			moveCount++;
	}
		  }
          a[j] = temp;
          compareCount+=2;
			moveCount++;
		}
		}

		long endTime=System.nanoTime();
		long totalTime=endTime-StartTime;
		System.out.println("直接插入排序用时为："+totalTime+"纳秒");
		System.out.println("对比次数："+compareCount);
		System.out.println("移动次数："+moveCount);
      }

     public static void ShellSort (int [] a) {
    	 long StartTime=System.nanoTime(); 
    	 int compareCount=0;
    	 int moveCount=0;
    	
	  int len=a.length;
	  int i,j;
	  int h;
	  int temp;
	for(h=len/2;h>0;h=h/2){
	for(i=h;i<len;i++) {
		temp=a[i];
	for(j=i-h;j>=0;j-=h) {
	if (temp<a[j]) {
		a[j+h]=a[j];
		 compareCount+=2;
			moveCount++;
	}
		else
		break;
	}
		a[j+h]=temp;
		 compareCount+=2;
			moveCount++; 
	}	
	 
		
	}
	long endTime=System.nanoTime();
	long totalTime=endTime-StartTime;
	System.out.println("希尔排序用时为："+totalTime+"纳秒");
	System.out.println("对比次数："+compareCount);
	System.out.println("移动次数："+moveCount);	
}
   public static void bubbleSort(int array[]) {
	  long StartTime=System.nanoTime(); 
  	  int compareCount=0;
  	  int moveCount=0;
	int temp=0;
	int n=array.length;
	for (int i=n-1;i>=0;i--) {
	for (int j=0;j<i;j++) {
	 if(array[j]>array[j+1]) {
		temp=array[j];
		array[j]=array[j+1];
	    array[j+1]=temp;
	    compareCount+=2;
		moveCount++;
			}
		}
	
	
	}
	long endTime=System.nanoTime();
	long totalTime=endTime-StartTime;
	System.out.println("冒泡排序用时为："+totalTime+"纳秒");
	System.out.println("对比次数："+compareCount);
	System.out.println("移动次数："+moveCount);
	
   }
   public static void quicksort(int array[]) {
       sort(array,0,array.length-1);
}
   
   public static void sort(int array[], int low,int high) {
	  long StartTime=System.nanoTime(); 
  	  int compareCount=0;
  	  int moveCount=0;
	  int i,j;
	  int index;
        if(low>=high)
	    return;
        i=low;
        j=high;
        index=array[i];
     while(i<j) {
	 while(i<j && index <=array[j])
		j--;
       if(i<j)
       array[i++]=array[j];
      
       while(i<j && index >array[i])
         i++;
       compareCount+=2;
       moveCount++;
        if(i<j)
        array[j--]=array[i];
       
         }
           array[i]=index;
           moveCount++;
           sort(array, low, i-1);
           sort(array, i+1, high);
        long endTime=System.nanoTime();
   		long totalTime=endTime-StartTime;
   		System.out.println("快速排序用时为："+totalTime+"纳秒");
   		System.out.println("对比次数："+compareCount);
   		System.out.println("移动次数："+moveCount);
   		
}
  /* public static void  quickSort(int [] z,int low,int height){
	   int i;
	  	  int j;
	  	  int temp;
	  	  if(low>height) return;
	  	   i=low; j=height;
	  	   temp =z[i];
	   	  int moveCount = 0;
	   	int compareCount=0;
		while(i<j){
	  		while(i<j&&z[j]>temp) j-- ;
	  		if(i<j){z[i]=z[j];i++;}
	  		compareCount = 2;
	  		moveCount++;
	  		while(i<j&&z[i]<=temp) i++;
	  		if(i<j){z[j]=z[i];j--;}
	   	  }
	   	  z[i]=temp;
	   	  moveCount++;
	   	  quickSort(z,low,i-1);
	   	  quickSort(z,i+1,height);
	   	 
	   long endTime = System.nanoTime(); 
	   long totalTime = endTime-StartTime;
   }
        
          public static void selectSort(int[] array) {
        	  long StartTime=System.nanoTime(); 
          	  int compareCount=0;
          	  int moveCount=0;
           	int i;
	        int j;
	        int temp;
	        int flag;
	for(i=0;i<array.length;i++) {
		temp=array[i];
		flag=i;
	for(j=i+1;j<array.length;j++) {
          if (array[j]<temp) {
         	temp=array[j];
	        flag=j;
}
				}
	    if(flag != i) {
	    array[flag]=array[i];
	    array[i]=temp;
	    compareCount+=2;
		moveCount++;
  }
		
	
	}  
	long endTime=System.nanoTime();
	long totalTime=endTime-StartTime;
	System.out.println("直接选择排序用时为："+totalTime+"纳秒");
	System.out.println("对比次数："+compareCount);
	System.out.println("移动次数："+moveCount);
	
          }*/
          public static void heapSort(int [] z){
		      int n=z.length;
		      for(int i=n/2-1;i>=0;i--){//这行代码是判断是不是堆
		    	  shif(z,i,n-1);//递归调用1
		      }
		      
		      
		      for(int i=n-1;i>=1;i--){
		    	  int temp=z[0];
		    	  z[0]=z[i];
		    	  z[i]=temp;
		    	  shif(z,0,i-1);//要是堆就和堆的无序区的第一个元素调换位置
		      }
		    
	}
	
	
	public static void shif(int [] z,int low,int height){
		   int compareCount=0;
			int moveCount=0;
		int i=low;
		int j=2*i+1;
		int temp=z[i];
		while(j<=height){
			if(j<height&&z[j]<z[j+1]){
				j++;
			}
			
			if(temp<z[j]){
				z[i]=z[j];
				i=j;
				j=2*i+1;
				 compareCount+=2;
					moveCount++;   
			}else{
					break ;
				}
			 z[i]=temp;
			  compareCount+=2;
				moveCount++; 
		}
		  /*z[i]=temp;
		  compareCount+=2;
			moveCount++; 
		*/
		long endTime=System.nanoTime();
		long totalTime=endTime-StartTime;
		System.out.println("堆排序用时为："+totalTime+"纳秒");
		System.out.println("对比次数："+compareCount);
		System.out.println("移动次数："+moveCount);
	}
	
static void orderAsc1(int[] ary) {
	int compareCount = 0;//比较次数
	int changeCount = 0;//交换次数
	int len = ary.length;
	int left = 0, right = len -1, tl, tr;
	while (left < right) {//外层固定循环次数
		tl = left + 1;
		tr = right - 1;
		for (int k = left; k < right; k++) {//内层从多到少递减比较次数, 从左向右
			if (ary[k] > ary[k + 1]) {//前大于后， 置换
				ary[k] = ary[k + 1] + (ary[k + 1] = ary[k]) * 0;//一步交换
				changeCount++;
				tr = k; //一轮中最后一比较的时候，将k所在索引赋给tr,  tr表示以后比较的结束索引值,  从左向右比后，k表示左边的索引
			} 
			compareCount++;
		}
		right = tr;
		for (int k = right; k > left; k--) {//内层从多到少递减比较次数, 从右向左
			if (ary[k] < ary[k - 1]) {//后小于前 置换
				ary[k] = ary[k - 1] + (ary[k - 1] = ary[k]) * 0;//一步交换
				changeCount++;
				tl = k; //一轮中最后一比较的时候，将k所在索引赋给tl,  tl表示以后比较的开始索引值, 从向右向左比后，k表示右边的索引
			} 
			compareCount++;
		}
		left = tl;
	}
	System.out.println("\n-----升序排序后------比较次数：" + compareCount + ", 交换次数：" + changeCount);
	for (int j = 0; j < len; j++) {
		System.out.print(ary[j] + " ");
	}
}

//跟orderAsc1的思路没有区别
static void orderAsc2(int[] ary) {
	int compareCount = 0;//比较次数
	int changeCount = 0;//交换次数
	int len = ary.length;
	int l = 0, r = len -1, tl, tr;
	for (; l < r; ) {//外层固定循环次数
		tl = l + 1;
		tr = r - 1;
		/*
		 * 从左向右比，将大的移到后面
		 */
		for (int k = l; k < r; k++) {
			if (ary[k] > ary[k + 1]) {
				int temp = ary[k] + ary[k + 1];
				ary[k + 1] = temp - ary[k + 1];
				ary[k] = temp - ary[k + 1];
				changeCount++;
				tr = k;
			}
			compareCount++;
		}
		r = tr;
		/*
		 * 从右向左比，将小的移到前面
		 */
		for (int k = r; k > l; k--) {
			if (ary[k] < ary[k - 1]) {
				int temp = ary[k] + ary[k - 1];
				ary[k - 1] = temp - ary[k - 1];
				ary[k] = temp - ary[k - 1];
				changeCount++;
				tl = k;
			}
			compareCount++;
		}
		l = tl;
	}
	System.out.println("\n-----orderAsc2升序排序后------比较次数：" + compareCount + ", 交换次数：" + changeCount);
	for (int j = 0; j < len; j++) {
		System.out.print(ary[j] + " ");
	}
}
}



