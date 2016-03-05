package ar.com.fernandospr.wns.client;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

import org.glassfish.jersey.client.HttpUrlConnectorProvider.ConnectionFactory;

public class ProxyEnabledConnectionFactory implements ConnectionFactory {

	private String proxy;
	private int port;

	public ProxyEnabledConnectionFactory(String proxy, int port) {
		this.proxy = proxy;
		this.port = port;
	}

	public HttpURLConnection getConnection(final URL url) throws IOException {
		if (proxy != null && port != 0) {
			Proxy theProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxy, port));
			return (HttpURLConnection) url.openConnection(theProxy);
		} else {
			return (HttpURLConnection) url.openConnection();
		}
	}
}
