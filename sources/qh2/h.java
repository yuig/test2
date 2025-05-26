package qh2;

import io.embrace.android.embracesdk.Embrace;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import javax.net.ssl.HttpsURLConnection;
import org.chromium.net.y;

/* loaded from: classes4.dex */
public abstract class h extends URLStreamHandler {

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f103947e = Boolean.FALSE;

    /* renamed from: a, reason: collision with root package name */
    public final y f103948a;

    /* renamed from: b, reason: collision with root package name */
    public final URLStreamHandler f103949b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f103950c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f103951d;

    public h(URLStreamHandler uRLStreamHandler) {
        Method declaredMethod;
        Method declaredMethod2;
        y yVar = j.f103954a;
        this.f103949b = uRLStreamHandler;
        this.f103948a = yVar;
        try {
            e eVar = (e) this;
            int i13 = eVar.f103928f;
            URLStreamHandler uRLStreamHandler2 = eVar.f103949b;
            switch (i13) {
                case 0:
                    declaredMethod = uRLStreamHandler2.getClass().getDeclaredMethod("openConnection", URL.class);
                    declaredMethod.setAccessible(true);
                    break;
                default:
                    declaredMethod = uRLStreamHandler2.getClass().getSuperclass().getDeclaredMethod("openConnection", URL.class);
                    declaredMethod.setAccessible(true);
                    break;
            }
            this.f103950c = declaredMethod;
            e eVar2 = (e) this;
            int i14 = eVar2.f103928f;
            URLStreamHandler uRLStreamHandler3 = eVar2.f103949b;
            switch (i14) {
                case 0:
                    declaredMethod2 = uRLStreamHandler3.getClass().getDeclaredMethod("openConnection", URL.class, Proxy.class);
                    declaredMethod2.setAccessible(true);
                    break;
                default:
                    declaredMethod2 = uRLStreamHandler3.getClass().getSuperclass().getDeclaredMethod("openConnection", URL.class, Proxy.class);
                    declaredMethod2.setAccessible(true);
                    break;
            }
            this.f103951d = declaredMethod2;
        } catch (NoSuchMethodException e13) {
            throw new IllegalStateException("Failed to initialize EmbraceUrlStreamHandler instance.", e13);
        }
    }

    public final void a(URLConnection uRLConnection) {
        this.f103948a.getClass();
        if (!y.R().isNetworkSpanForwardingEnabled() || uRLConnection.getRequestProperties().containsKey("traceparent")) {
            return;
        }
        Embrace.Companion.getClass();
        uRLConnection.addRequestProperty("traceparent", Embrace.instance.generateW3cTraceparent());
    }

    public final URLConnection b(URLConnection uRLConnection) {
        URLConnection dVar;
        this.f103948a.getClass();
        Embrace.Companion.getClass();
        if (!Embrace.instance.isStarted()) {
            return uRLConnection;
        }
        e eVar = (e) this;
        switch (eVar.f103928f) {
            case 0:
                if (!(uRLConnection instanceof HttpURLConnection)) {
                    return uRLConnection;
                }
                eVar.a(uRLConnection);
                if (f103947e.booleanValue() && !uRLConnection.getRequestProperties().containsKey("Accept-Encoding")) {
                    uRLConnection.setRequestProperty("Accept-Encoding", "gzip");
                    dVar = new d((HttpURLConnection) uRLConnection, true);
                    break;
                } else {
                    dVar = new d((HttpURLConnection) uRLConnection, false);
                    break;
                }
            default:
                if (!(uRLConnection instanceof HttpsURLConnection)) {
                    return uRLConnection;
                }
                eVar.a(uRLConnection);
                if (f103947e.booleanValue() && !uRLConnection.getRequestProperties().containsKey("Accept-Encoding")) {
                    uRLConnection.setRequestProperty("Accept-Encoding", "gzip");
                    dVar = new f((HttpsURLConnection) uRLConnection, true);
                    break;
                } else {
                    dVar = new f((HttpsURLConnection) uRLConnection, false);
                    break;
                }
                break;
        }
        return dVar;
    }

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url) {
        try {
            return b((URLConnection) this.f103950c.invoke(this.f103949b, url));
        } catch (Exception e13) {
            throw new IOException("An exception was thrown while attempting to open a connection", e13);
        }
    }

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url, Proxy proxy) {
        try {
            return b((URLConnection) this.f103951d.invoke(this.f103949b, url, proxy));
        } catch (Exception e13) {
            throw new IOException("An exception was thrown while attempting to open a connection", e13);
        }
    }
}
