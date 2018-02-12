package load;

public class Load {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		//静态加载
		Apple apple = new Apple();
		
		//动态加载
		Class<?> clz =  Class.forName("load.Apple");
		clz.newInstance();
	}
}
