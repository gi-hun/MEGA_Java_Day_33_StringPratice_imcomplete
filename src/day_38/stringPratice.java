package day_38;

public class stringPratice {
	public static void main(String[] args) {
		String nameData = "";
		nameData+=	"100001/�̸���";nameData += "\n";		
		nameData += "100002/�̿���";nameData += "\n";
		nameData += "100003/���缮";nameData += "\n";
		nameData += "100004/�ڸ��";nameData += "\n";
		nameData += "100005/�ֿ���";nameData += "\n";
		nameData += "100006/�ں���";
		
		String[] temp_name = nameData.split("\n");

		
		for(int i=0;i<temp_name.length;i++)
		{
			System.out.println("["+i+"]"+temp_name[i]);
		}
		System.out.println();
	
		String[] id_name = new String[12];
		String[] nd_id = new String[6];
		String[] nd_name = new String[6];
		/*for(int i=0;i<temp_name.length;i++)
		{
			id_name[i*2] = temp_name[i].split("/");			//id
			nd_id[i] = id_name[i*2];
			id_name[i*2+1] = temp_name[i].split("/");		//name
			nd_name[i] = id_name[i*2+1];
		}
		System.out.println();*/
		
		String  moneyData = "";
		moneyData += "100001/600";moneyData += "\n";	
		moneyData += "100003/7000";moneyData += "\n";		
		moneyData += "100001/100";moneyData += "\n";		
		moneyData += "100002/400";moneyData += "\n";		
		moneyData += "100001/600";moneyData += "\n";		
		moneyData += "100004/900";moneyData += "\n";		
		moneyData += "100001/130";moneyData += "\n";		
		moneyData += "100003/200";moneyData += "\n";		
		moneyData += "100002/700";moneyData += "\n";	
		moneyData += "100002/900";moneyData += "\n";
		moneyData += "100004/800";
		
		System.out.println();
		String[] temp_money = moneyData.split("\n");
		
		for(int i=0;i<temp_money.length;i++)
		{
			System.out.println("["+i+"]"+temp_money[i]);
		}
		
		String[] id_money = new String[22];
		String[] md_id = new String[11];
		String[] md_money = new String[11];
		/*for(int i=0;i<temp_money.length;i++)
		{
			id_money[i*2] = temp_money[i].split("/");		//id
			md_id[i] = id_money[i*2];
			id_money[i*2+1] = temp_money[i].split("/");		//money
			md_money[i] = id_money[i*2+1];
		}*/
		System.out.println();
		// ����) moneyData �� nameData �� �����ؼ� �Ʒ��Ͱ��� ��������
		
		/* * 100001/�̸���/600
		 * 100003/���缮/7000
		 * 100001/�̸���/100
		 * 100002/�̿���/400
		 * 100001/�̸���/600
		 * 100004/�ڸ��/900
		 * 100001/�̸���/130
		 * 100003/���缮/200
		 * 100002/�̿���/700
		 * 100002/�̿���/900
		 * 100004/�ڸ��/800
		 * nd_id /nd_name/md_money*/
		 
		//nd_id�� md_id�� ������ <nd_id + nd_name + md_money> ������� ���
		
		for(int i=0;i<nd_id.length;i++)
		{
			for(int j=0;j<md_id.length;j++)
			{
				if(nd_id[i] == md_id[j])
				{
					System.out.print(nd_id+"/"+nd_name+"/"+md_money);
				}
			}
			System.out.println();
		}
		

	}
}