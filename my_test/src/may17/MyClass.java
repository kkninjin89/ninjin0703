package may17;

public class MyClass {
	// 静态变量
    private static int staticCount = 0;
    
    // 实例变量
    private int instanceCount = 0;

    // 静态方法
    public static void incrementStaticCount() {
        staticCount++;
        System.out.println("Static count: " + staticCount);
    }

    // 实例方法
    public void incrementInstanceCount() {
        instanceCount++;
        System.out.println("Instance count: " + instanceCount);
    }

    public static void main(String[] args) {
        // 调用静态方法
        MyClass.incrementStaticCount();

        // 创建类的实例
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        // 通过实例调用实例方法
        obj1.incrementInstanceCount();  // 输出: Instance count: 1
        obj2.incrementInstanceCount();  // 输出: Instance count: 1

        // 静态方法可以通过类名或实例调用，但推荐通过类名调用
        obj1.incrementStaticCount();    // 输出: Static count: 2 (不推荐)
        MyClass.incrementStaticCount(); // 输出: Static count: 3 (推荐)
    }
}
