package com.amazonaws.http;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes3.dex */
public class UrlHttpClient implements HttpClient {

    /* renamed from: a, reason: collision with root package name */
    public final ClientConfiguration f28613a;

    static {
        LogFactory.a(UrlHttpClient.class);
    }

    public UrlHttpClient(ClientConfiguration clientConfiguration) {
        this.f28613a = clientConfiguration;
        Object obj = TLS12SocketFactory.f28612a;
    }

    @Override // com.amazonaws.http.HttpClient
    public final HttpResponse a(HttpRequest httpRequest) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) httpRequest.f28599b.toURL().openConnection();
        ClientConfiguration clientConfiguration = this.f28613a;
        clientConfiguration.getClass();
        httpURLConnection.setConnectTimeout(clientConfiguration.f28530f);
        httpURLConnection.setReadTimeout(clientConfiguration.f28529e);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        if (httpRequest.f28602e) {
            httpURLConnection.setChunkedStreamingMode(0);
        }
        if (httpURLConnection instanceof HttpsURLConnection) {
        }
        Map map = httpRequest.f28600c;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (!str.equals("Content-Length") && !str.equals("Host")) {
                    str.equals("Expect");
                    httpURLConnection.setRequestProperty(str, (String) entry.getValue());
                }
            }
        }
        String str2 = httpRequest.f28598a;
        httpURLConnection.setRequestMethod(str2);
        InputStream inputStream = httpRequest.f28601d;
        if (inputStream != null && httpRequest.a() >= 0) {
            httpURLConnection.setDoOutput(true);
            if (!httpRequest.f28602e) {
                httpURLConnection.setFixedLengthStreamingMode((int) httpRequest.a());
            }
            OutputStream outputStream = httpURLConnection.getOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            }
            outputStream.flush();
            outputStream.close();
        }
        String responseMessage = httpURLConnection.getResponseMessage();
        int responseCode = httpURLConnection.getResponseCode();
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null && !"HEAD".equals(str2)) {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (IOException unused) {
            }
        }
        HttpResponse.Builder builder = new HttpResponse.Builder();
        builder.f28609b = responseCode;
        builder.f28608a = responseMessage;
        builder.f28610c = errorStream;
        Iterator<Map.Entry<String, List<String>>> it = httpURLConnection.getHeaderFields().entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            HashMap hashMap = builder.f28611d;
            if (!hasNext) {
                return new HttpResponse(builder.f28608a, builder.f28609b, Collections.unmodifiableMap(hashMap), builder.f28610c);
            }
            Map.Entry<String, List<String>> next = it.next();
            if (next.getKey() != null) {
                hashMap.put(next.getKey(), next.getValue().get(0));
            }
        }
    }

    @Override // com.amazonaws.http.HttpClient
    public final void shutdown() {
    }
}
