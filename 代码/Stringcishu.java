package quyuquan;
import java.io.*;
/*
 统计文本中有多少句话，并输出
 输入所要查到的词，输出含有目标词的句子
 统计目标词语出现多少次
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
		System.out.print("please input txt name:");//键入
		Scanner n1=new Scanner(System.in);
		String str1=n1.nextLine();//回车完成
		File file=new File(str1+".txt");
		FileInputStream fis=new FileInputStream(file);//读取输入进来的文本
		//words
		System.out.print("please input your wanted finding words:");
		Scanner n2=new Scanner(System.in);//输入所要查找的词
		String str2=n2.nextLine();
		
		long time1=System.currentTimeMillis();
		filelength=(int)fis.available();//获取文本长度
		strBuffer=new byte[filelength];
		fis.read(strBuffer,0,filelength);//读取fis中文本 并放入strBuffer中
		txtString=new String(strBuffer);//strBuffer转string，用于后面split
		//txtString1=txtString.split("”");
		//String[] sentences1=null;
		txtString1=txtString.replaceAll("(.*)”","。");
		String[] sentences=txtString1.split("。");//按照。分句
		/*for(int j=0;j<sentences.length;j++) {
			sentences1[j]=sentences[j].split("”");
			
		}*/
		System.out.println(str1+"有"+sentences.length+"句");//整个文本 有 多少句
		int add=0;
		int sum=0;
		//String[][] sentences2=null;
		for(int i=0;i<sentences.length;i++){//遍历
			/*boolean p=sentences[i].contains("”");
					if(p==true)
					{
						for(int j=0;j<sentences[i].length;j++)
						{
						sentences2[i][j] =sentences[i].split("”");
						}
					}*/
			boolean k=sentences[i].contains(str2);// 文本中是否含有 所要查找的关键词，返回布朗型
			if(k==true)
			{
				add++;//记录次数
				//System.out.println("第"+add+"句："+sentences[i]);//输出所包含的话
			}
			System.out.println(sentences[i]);//输出每一句话
			}	
		long time2=System.currentTimeMillis();
		
		System.out.println("出现"+str2+"的话有"+add+"次");
		System.out.println("花费:"+(time2-time1)+"秒");
	}
}