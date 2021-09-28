package org.zenframework.z8.server.engine;

import org.zenframework.z8.server.types.guid;

import java.rmi.RemoteException;

public interface IAuthorityCenter extends IHubServer {
	int MaxLoginLength = 32;
	int MaxPasswordLength = 32;

	public Session login(String login, String password, String schema) throws RemoteException;
	public Session trustedLogin(String login, String scheme, boolean createIfNotExist) throws RemoteException;
	public Session server(String session, String server) throws RemoteException;

	public void userChanged(guid user, String schema) throws RemoteException;
	public void roleChanged(guid role, String schema) throws RemoteException;
}
