package tw.qq;

import org.json.JSONArray;
import org.json.JSONString;
import org.json.JSONStringer;
import org.json.JSONWriter;

import com.mysql.fabric.xmlrpc.base.Value;

//全部的都是寫入
public class matt02 {

	public static void main(String[] args) {
	    String json=new JSONStringer().object()
	          .key("key1")
	          .value("value1")
	          .endObject()
	          .toString();
	    System.out.println(json);
	    
	    String json2=new JSONStringer().array()
	    		  .object()
		          .key("key1")
		          .value("value1")
		          .endObject()
		          .object()
		          .key("key2")
		          .value("value2")
		          .endObject()
		          .endArray()
		          .toString();
		    System.out.println(json2);
	  
	    
	    JSONWriter jw =new JSONStringer().array();
	    
	   
	    jw.object().key("key1").value("value1").endObject();
	  //jobj.endObject();
	    jw.endArray();   
	    System.out.println(jw.toString());

	}

}
