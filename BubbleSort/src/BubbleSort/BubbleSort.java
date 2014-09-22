package BubbleSort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		//�\�[�g�O�̃T���v���f�[�^��`
		int[] values = {10,0,9,1,8,3,7,4,6,5};
		
		//�\�[�g�O�̃f�[�^�z���\��
		System.out.print("�\�[�g�O�̃f�[�^�z�� �F ");
		for (int v: values){
			System.out.printf("%d,", v);					//�z��̒��g���P�����o���ďo��
		}
		System.out.println();								//���₷�����s
		
		//�o�u���\�[�g�̊֐��Ăяo��
		BubbleSortEngin (values);
		
		//�\�[�g��̃f�[�^�z���\��
		System.out.print("�\�[�g��̃f�[�^�z�� �F ");
		for (int v: values){
			System.out.printf("%d,", v);					//�z��̒��g���P�����o���ďo��
		}
	}
	
	
	//////////////////////////////////////////////////
	//	�o�u���\�[�g�֐�
	//	�T�v�F�O�̗v�f�Ɣ�r���A�O�̂ق����傫����Ό݂��Ɍ�������
	//////////////////////////////////////////////////
	public static void BubbleSortEngin(int[] a) {
	    // �Ō�̗v�f�������āA���ׂĂ̗v�f����בւ��܂�
	    for(int i=0;i<a.length-1;i++){
	        // ���K���珇�Ԃɔ�r���܂�
	        for(int j=a.length-1;j>i;j--){

	        	// �㐔�̕����傫���Ƃ��݂͌��ɓ���ւ��܂�
	        	if(a[j]<a[j-1]){
		    		//�f�o�b�O�p�\��
		    		System.out.print("�f�o�b�O�p�\��(����ւ��O) �F ");
	    			System.out.println(Arrays.toString(a));				//���C���֐��ł�for�ŉ񂵂����ǂ������̂ق����y�������肷��
	        		
	        		int t=a[j];
	        		a[j]=a[j-1];
	        		a[j-1]=t;
	        		
		    		//�f�o�b�O�p�\��
		    		System.out.print("�f�o�b�O�p�\��(����ւ���) �F ");
	    			System.out.println(Arrays.toString(a));
	        	}	        
	        }
	    }
	}
}
