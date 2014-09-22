package BubbleSort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		//ソート前のサンプルデータ定義
		int[] values = {10,0,9,1,8,3,7,4,6,5};
		
		//ソート前のデータ配列を表示
		System.out.print("ソート前のデータ配列 ： ");
		for (int v: values){
			System.out.printf("%d,", v);					//配列の中身を１個ずつ取り出して出力
		}
		System.out.println();								//見やすく改行
		
		//バブルソートの関数呼び出し
		BubbleSortEngin (values);
		
		//ソート後のデータ配列を表示
		System.out.print("ソート後のデータ配列 ： ");
		for (int v: values){
			System.out.printf("%d,", v);					//配列の中身を１個ずつ取り出して出力
		}
	}
	
	
	//////////////////////////////////////////////////
	//	バブルソート関数
	//	概要：前の要素と比較し、前のほうが大きければ互いに交換する
	//////////////////////////////////////////////////
	public static void BubbleSortEngin(int[] a) {
	    // 最後の要素を除いて、すべての要素を並べ替えます
	    for(int i=0;i<a.length-1;i++){
	        // お尻から順番に比較します
	        for(int j=a.length-1;j>i;j--){

	        	// 後数の方が大きいときは互いに入れ替えます
	        	if(a[j]<a[j-1]){
		    		//デバッグ用表示
		    		System.out.print("デバッグ用表示(入れ替え前) ： ");
	    			System.out.println(Arrays.toString(a));				//メイン関数ではforで回したけどこっちのほうが楽だったりする
	        		
	        		int t=a[j];
	        		a[j]=a[j-1];
	        		a[j-1]=t;
	        		
		    		//デバッグ用表示
		    		System.out.print("デバッグ用表示(入れ替え後) ： ");
	    			System.out.println(Arrays.toString(a));
	        	}	        
	        }
	    }
	}
}
