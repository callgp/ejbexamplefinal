import java.util.Properties;

import javax.naming.InitialContext;
import com.MsgServer.*;
public class ClientApp {

	public static void main(String[] args) {
	  try {
		// TODO Auto-generated method stub
       System.out.println("client app started");
       Properties props=new Properties();
       props.put("java.naming.factory.url.pkgs", "org.jboss.ejb.client.naming");
       InitialContext context=new InitialContext(props);
       String appName="";
       String moduleName= "MsgFromServerEJB";
       String distinctName= "";
       String beanName=ExampleServer.class.getSimpleName();
       System.out.println("beanName "+beanName);
       String interfaceName=ExampleServerRemote.class.getName();
       System.out.println("interfaceName "+interfaceName);
       String name="ejb:" + appName + "/" + moduleName + "/" + distinctName   + "/" + beanName + "!" +interfaceName;
       System.out.println("name  ---"+name);
       ExampleServerRemote bean=(ExampleServerRemote)context.lookup(name);
       String msg=bean.getMsg();
       System.out.println("msg  ---"+msg);
	} catch(Exception e) {
		e.printStackTrace();
       
	}  
    		   
	}

}
