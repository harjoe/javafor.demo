package single;

public class Harjoe {
	
	private static Harjoe INSTANCE = null;
	
	/**
	 * 构造私有, 阻止由外部创建 
	 */
	private Harjoe(){
		//private
	}
	
	/**
	 * 获取实例
	 * @return
	 */
	public static synchronized Harjoe getInstance(){
		if (INSTANCE == null)
			INSTANCE = new Harjoe();
		return INSTANCE;
	}

}
