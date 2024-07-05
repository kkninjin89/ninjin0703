//15

package test_file;

import java.io.File;

public class FileDemo02 {
	public static void main(String[] args) {
		
		File file1 = new File("/path/to/newdirectory/file.txt");
		try {
			//如果 /path/to/newdirectory/ 目录不存在,
			//file.getParentFile().mkdirs() 将创建必要的目录结构。
			file1.getParentFile().mkdirs();
			
			boolean created = file1.createNewFile();
			
			if (created) {
				System.out.println("文件创建成功: " + file1.getAbsolutePath());
			} else {
				System.out.println("文件已存在或创建失败：" + file1.getAbsolutePath());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//delete()方法
			boolean deleted = file1.delete();
			System.out.println("删除结果：" + deleted);

	}
}
