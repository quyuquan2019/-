package quyuquan;
import java.io.*;
/*
 ͳ���ı����ж��پ仰�������
 ������Ҫ�鵽�Ĵʣ��������Ŀ��ʵľ���
 ͳ��Ŀ�������ֶ��ٴ�
 */
import java.util.Scanner;
import java.util.regex.Pattern;
public class Stringcishu
{
	public static void main(String[] args)throws IOException
	{
		String txtString;
		String txtString1;
		byte[]strBuffer=null;
		int filelength=0;
		//text
		System.out.print("please input txt name:");//����
		Scanner n1=new Scanner(System.in);
		String str1=n1.nextLine();//�س����
		File file=new File(str1+".txt");
		FileInputStream fis=new FileInputStream(file);//��ȡ����������ı�
		//words
		System.out.print("please input your wanted finding words:");
		Scanner n2=new Scanner(System.in);//������Ҫ���ҵĴ�
		String str2=n2.nextLine();
		
		long time1=System.currentTimeMillis();
		filelength=(int)fis.available();//��ȡ�ı�����
		strBuffer=new byte[filelength];
		fis.read(strBuffer,0,filelength);//��ȡfis���ı� ������strBuffer��
		txtString=new String(strBuffer);//strBufferתstring�����ں���split
		//txtString1=txtString.split("��");
		//String[] sentences1=null;
		txtString1=txtString.replaceAll("(.*)��","��");
		String[] sentences=txtString1.split("��");//���ա��־�
		/*for(int j=0;j<sentences.length;j++) {
			sentences1[j]=sentences[j].split("��");
			
		}*/
		System.out.println(str1+"��"+sentences.length+"��");//�����ı� �� ���پ�
		int add=0;
		int sum=0;
		//String[][] sentences2=null;
		for(int i=0;i<sentences.length;i++){//����
			/*boolean p=sentences[i].contains("��");
					if(p==true)
					{
						for(int j=0;j<sentences[i].length;j++)
						{
						sentences2[i][j] =sentences[i].split("��");
						}
					}*/
			boolean k=sentences[i].contains(str2);// �ı����Ƿ��� ��Ҫ���ҵĹؼ��ʣ����ز�����
			if(k==true)
			{
				add++;//��¼����
				//System.out.println("��"+add+"�䣺"+sentences[i]);//����������Ļ�
			}
			System.out.println(sentences[i]);//���ÿһ�仰
			}	
		long time2=System.currentTimeMillis();
		
		System.out.println("����"+str2+"�Ļ���"+add+"��");
		System.out.println("����:"+(time2-time1)+"��");
	}
}