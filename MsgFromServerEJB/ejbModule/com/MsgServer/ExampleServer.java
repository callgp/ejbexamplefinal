package com.MsgServer;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;

/**
 * Session Bean implementation class ExampleServer
 */
@Stateless
@LocalBean
public class ExampleServer implements ExampleServerRemote, ExampleServerLocal {

    /**
     * Default constructor. 
     */
    public ExampleServer() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public String getMsg() {
    	return " this is msg from server";
    }

}
