
public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Exception e = new Exception("���Ƿ� �߻���Ŵ.");	//���� ��ü ����.
			throw e ;		//���ܸ� �߻�.
		//	throw new Exception("���Ƿ� �߻�������."); ���� ������ ���ٷ� ����� �� �ִ�.
		}catch (Exception e) {
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ����ϴ�.");
	}

}
