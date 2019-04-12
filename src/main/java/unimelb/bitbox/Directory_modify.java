package unimelb.bitbox;

import unimelb.bitbox.util.Document;


public class Directory_modify {
	
	public Document DIRECTORY_CREATE_REQUEST(String pathName) {
		Document doc=new Document();
		doc.append("commond", "DIRECTORY_CREATE_REQUEST");
		doc.append("pathName", pathName);
		return doc;
	}
	
	public Document DIRECTORY_CREATE_RESPONSE(String pathName,String message, boolean status) {
		
		Document Dir_resp= new Document();
		Dir_resp.append("command", "DIRECTORY_CREATE_RESPONSE");
		Dir_resp.append("pathName", pathName);
		Dir_resp.append("message", message);
		Dir_resp.append("status", status);
		return Dir_resp;
	}
	
	public Document DIRECTORY_DELETE_REQUEST(String pathName) {
		Document doc=new Document();
		doc.append("commond", "DIRECTORY_DELETE_REQUEST");
		doc.append("pathName", pathName);
		return doc;
	}
	
	public Document DIRECTORY_DELETE_RESPONSE(String pathName,String message, boolean status) {
		
		Document Dir_resp= new Document();
		Dir_resp.append("command", "DIRECTORY_DELETE_RESPONSE");
		Dir_resp.append("pathName", pathName);
		Dir_resp.append("message", message);
		Dir_resp.append("status", status);
		return Dir_resp;
	}
	
}
