package org.zenframework.z8.server.engine;

import org.zenframework.z8.server.security.LoginParameters;
import org.zenframework.z8.server.types.guid;

import java.rmi.RemoteException;

public interface IAuthorityCenter extends IHubServer {
	int MaxLoginLength = 32;
	int MaxPasswordLength = 32;

	public ISession login(LoginParameters loginParameters, String password) throws RemoteException;
	public ISession trustedLogin(LoginParameters loginParameters, boolean createIfNotExist) throws RemoteException;
	public ISession server(String session, String server) throws RemoteException;

	public void userChanged(guid user, String schema) throws RemoteException;
	public void roleChanged(guid role, String schema) throws RemoteException;
}
