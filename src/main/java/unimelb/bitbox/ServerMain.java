package unimelb.bitbox;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.ClientInfoStatus;
import java.util.logging.Logger;

import javax.sound.sampled.Port;

import unimelb.bitbox.util.Configuration;
import unimelb.bitbox.util.FileSystemManager;
import unimelb.bitbox.util.FileSystemObserver;
import unimelb.bitbox.util.FileSystemManager.FileSystemEvent;

public class ServerMain implements FileSystemObserver {

	private Client client;
	private Server server;
	private static int port;
	private static String[] peers;

	private static Logger log = Logger.getLogger(ServerMain.class.getName());
	protected FileSystemManager fileSystemManager;

	public ServerMain() throws NumberFormatException, IOException, NoSuchAlgorithmException {
		fileSystemManager = new FileSystemManager(Configuration.getConfigurationValue("path"), this);
		port = Integer.parseInt(Configuration.getConfigurationValue("port"));
		peers = Configuration.getConfigurationValue("peers").split(",");

		client = new Client();
		client.connectToPeerServer(peers[0]);
		server = new Server(port);

//		if (client != null) {
//
//			client.sendToServer("hi");
//		}
		server.sendToClients("hello");

	}

	@Override
	public void processFileSystemEvent(FileSystemEvent fileSystemEvent) {

	}

}
