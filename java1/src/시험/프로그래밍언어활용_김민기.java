package ����;

import java.util.Scanner;

public class ���α׷��־��Ȱ��_��α� { // c s

	public static void main(String[] args) { // m s
			
		// �迭 
		Student[] �л��迭 = new Student[100];
		Scanner scanner = new Scanner(System.in);
		int[] Rank = new int[100]; 
		
		while( true ) {
			try {
				System.out.println(" **** �л� ��� ****");
				// �л��� ���� ��� [ ��� �迭 ���  ]
				System.out.println(" 1. �л���� 2.�л����� : ");
				System.out.println("---------------------------------------------------------------");
				System.out.println("                           �� �� ǥ                              ");
				System.out.println("---------------------------------------------------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");			
				for( int j = 0 ; j<�л��迭.length; j++ ) {
				
					if( �л��迭[j] != null) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n" , (j+1),�л��迭[j].get�̸�(),�л��迭[j].get����(),
								�л��迭[j].get����(),�л��迭[j].get����(),�л��迭[j].get����(),�л��迭[j].get���(),Rank[j]);				
					}
					
				}
				
				System.out.println("---------------------------------------------------------------");
				
				int ch = scanner.nextInt();
				if( ch==1 ) {   // �л� ��� 
					System.out.println(" �̸� : "); String �̸� = scanner.next();
					System.out.println(" �������� : "); int ���� = scanner.nextInt();
					System.out.println(" �������� : "); int ���� = scanner.nextInt();
					System.out.println(" �������� : "); int ���� = scanner.nextInt();
					int ���� = ���� + ���� + ����;
					double ��� = (double)����/3;
					Student member = new Student( �̸� , ���� , ���� , ���� ,���� , ���);
					int i = 0;
					
					for( Student temp : �л��迭 ) {
						if( temp == null) {
							�л��迭[i] = member; break;
						} i++;
					}
					Rank[i] = 1;
					for(int r = 0; r<Rank.length; r++  ) {
						for(int t = 0; r<Rank.length; t++) {
							if(�л��迭[r].get����() < �л��迭[t].get����()) {
								  Rank[r]++;
							}
							else if(�л��迭[r].get����() > �л��迭[t].get����()) {
								Rank[t]++;
							}
						}
					}
					
				
					
				} 
					
				else if( ch== 2 ) {  // �л� ����
					System.out.println(" ������ ��ȣ �Է� :");  int ��ȣ = scanner.nextInt();
					
					�л��迭[��ȣ-1] = null;
					
					for( int i = ��ȣ-1; i<�л��迭.length-1; i++) {
						if( i == �л��迭.length-1 ) {
							�л��迭[i] = null;
						}else {
							�л��迭[i]=�л��迭[i+1];
						}
					}
				}
				
				else { 
					System.out.println(" �˼����� ����Դϴ�. ");  
					}
			}
			catch( Exception e ) {   
				System.out.println(" �˸�]] �˼����� ����Դϴ�.");
				scanner = new Scanner(System.in);
			}
		}
	}
}
