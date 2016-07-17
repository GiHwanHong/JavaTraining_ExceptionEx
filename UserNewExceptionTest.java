public class UserNewExceptionTest {
	public static void main(String[] args) {
		try{
			startInstall();		// ���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyFiles();		// ���ϵ��� �����Ѵ�.
		}catch (SpaceException e) {
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
			System.out.println("������ Ȯ���� �Ŀ� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�.");
		}catch (Exception msg) {
			System.out.println("���� �޽��� : " + msg.getMessage());
			msg.printStackTrace();
			System.gc();		//������ �÷����� �����Ͽ� �޸𸮸� �÷��ش�.
			System.out.println("�޸� ������ Ȯ���� �Ŀ� �ٽ� ��ġ���ֽñ�ٶ��ϴ�.");
		}finally {
			deleteTempFiles();	//���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
		}	//try���� ��.
	}  //main�� ��.
	static void startInstall() throws SpaceException , MemoryException{
		if(!enoughSpace())		//����� ��ġ ������ ������..?
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		if(!enoughMemory())		//����� �޸𸮰� ������...?
			throw new MemoryException("�޸𸮰� �����մϴ�.");
	} 	//staticInstall�޼����� ��.
	static void copyFiles(){ /* ���ϵ��� �����ϴ� �ڵ� */}
	static void deleteTempFiles(){/* �ӽ����ϵ��� �����ϴ� �ڵ带 ����.*/}
	
	static boolean enoughSpace(){
		//��ġ�� �ʿ��� ������ �ִ��� Ȯ���ϴ� �ڵ�.
		return false;
	}
	static boolean enoughMemory(){
		//��ġ�� �ʿ��� �޸� ������ �ִ��� Ȯ���ϴ� �ڵ带 ���´�.
		return false;
	}
}	//UserNewExceptionTestŬ������ ��

class SpaceException extends Exception{
	public SpaceException(String msg) {
		super(msg);
	}
}
class MemoryException extends Exception{
	MemoryException(String msg){
		super(msg);
	}
}
