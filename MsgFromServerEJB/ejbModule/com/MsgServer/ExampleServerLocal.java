package com.MsgServer;

import jakarta.ejb.Local;

@Local
public interface ExampleServerLocal {

	String getMsg();

}
