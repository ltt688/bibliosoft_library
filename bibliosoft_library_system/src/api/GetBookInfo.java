package api;
 
import java.util.Vector;
 
import javax.swing.JOptionPane;
 
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
 
/**
 * @TODO 得到书籍信息
 * @author 爱敲代码的大海
 * @return 书籍基本信息集合
 */
public class GetBookInfo {
//	public static void main(String[] args) {
//		String isbnnumber="9787501253753";
//		Vector<String> str=GetBookInfo.GetByISBN(isbnnumber);
//		System.out.println(str.toString());
//	}

	public static Vector<String> GetByISBN(String isbn) {
		Vector<String> Book=null;
		String Publish,Name,Author,Price;
		try {
			Book=new Vector<String>();
			String result=HttpUtil.sendGet("https://api.douban.com/v2/book/isbn/:"+isbn,"UTF-8");
			//将返回字符串转换为JSON对象
			JSONObject json=JSONObject.fromObject(result);
			//得到出版社
			Publish=json.get("publisher").toString();
			System.out.println(Publish);
			//得到书名
			Name=json.get("title").toString();
			//得到作者，因为得到的是数组，所以要转化
			JSONArray arrAuthor=JSONArray.fromObject(json.get("author"));
			Author=arrAuthor.getString(0).toString();
			//得到价格
			Price=json.get("price").toString();
			//将得到的信息存储在集合中
			Book.add(Name);
			Book.add(Author);
			Book.add(Price);
			Book.add(Publish);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "网络连接失败···");
		}
		return Book;
	}
}
