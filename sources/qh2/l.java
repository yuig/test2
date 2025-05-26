package qh2;

import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import javax.net.ssl.HttpsURLConnection;
import kh2.m2;

/* loaded from: classes4.dex */
public final class l extends URLStreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ URLStreamHandler f103961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f103962b;

    public l(m mVar, URLStreamHandler uRLStreamHandler) {
        this.f103962b = mVar;
        this.f103961a = uRLStreamHandler;
    }

    public final URLConnection a(URLConnection uRLConnection) {
        boolean z13;
        if (!(uRLConnection instanceof HttpURLConnection)) {
            return uRLConnection;
        }
        if (!this.f103962b.f103964b.booleanValue() || uRLConnection.getRequestProperties().containsKey("Accept-Encoding")) {
            z13 = false;
        } else {
            uRLConnection.setRequestProperty("Accept-Encoding", "gzip");
            z13 = true;
        }
        return uRLConnection instanceof HttpsURLConnection ? new f((HttpsURLConnection) uRLConnection, z13) : new d((HttpURLConnection) uRLConnection, z13);
    }

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url, Proxy proxy) {
        URLStreamHandler uRLStreamHandler = this.f103961a;
        try {
            Method declaredMethod = uRLStreamHandler.getClass().getDeclaredMethod("openConnection", URL.class, Proxy.class);
            declaredMethod.setAccessible(true);
            return a((URLConnection) declaredMethod.invoke(uRLStreamHandler, url, proxy));
        } catch (Exception e13) {
            j.b(e13);
            m2.F1(e13);
            throw null;
        }
    }

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url) {
        URLStreamHandler uRLStreamHandler = this.f103961a;
        try {
            Method declaredMethod = uRLStreamHandler.getClass().getDeclaredMethod("openConnection", URL.class);
            declaredMethod.setAccessible(true);
            return a((URLConnection) declaredMethod.invoke(uRLStreamHandler, url));
        } catch (Exception e13) {
            j.b(e13);
            m2.F1(e13);
            throw null;
        }
    }
}
