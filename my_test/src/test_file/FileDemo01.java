//1-14

package test_file;

import java.io.File;

public class FileDemo01 {
	public static void main(String[] args) {
		File file = new File("/path/to/file.txt");
		//1getName()方法
		String fileName = file.getName();
		System.out.println("文件名为： "+ fileName);
		
		//2getParent()方法
		String parent = file.getParent();
		System.out.println("父路径名为 ："+ parent);
		
		//getParentFile()方法
		File parentFile = file.getParentFile();
		System.out.println("父路径为： " + parentFile);
		
		//3getPath()方法！！！
		String path = file.getPath();
		System.out.println("路径名为： " + path);
		
		//isAbsolute()方法
		boolean isAbsolute = file.isAbsolute();
		System.out.println("是否为绝对路径：" + isAbsolute);
		
		//getAbsolutePath()方法
		String absolutePath = file.getAbsolutePath();
		System.out.println("绝对路径：" +absolutePath);
		
		//canRead()方法！！！
		boolean canRead = file.canRead();
		System.out.println("可读性： " + canRead);
		
		//canWrite()方法！！！
		boolean canWrite = file.canWrite();
		System.out.println("可写性： " +canWrite);
		
		//exist()方法
		boolean exists = file.exists();
		System.out.println("存在性： " +exists);
		
		//isDirectory()方法！！！
		File directory = new File("/path/to/directory");
		boolean isDirectory = directory.isDirectory();
		System.out.println("是否为目录： " + isDirectory);
		
		//isFile()方法
		boolean isFile = file.isFile();
		System.out.println("是否为文件： " + isFile);
		
		//lastModified()方法
		long lastModifiedTime = file.lastModified();
		System.out.println("最后修改的时间为： " + lastModifiedTime);
		
		//length()方法!!!
		long fileLength = file.length();
		System.out.println("文件长度： "+ fileLength);
		
		//createNewFile()方法
		File nFile = new File("/path/to/newfile.txt");
		try {
			boolean created = nFile.createNewFile();
			System.out.println("文件创建结果： " + created);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
