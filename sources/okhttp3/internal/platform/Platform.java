package okhttp3.internal.platform;

import a.a;
import android.util.Log;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.BouncyCastlePlatform;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.Jdk8WithJettyBootPlatform;
import okhttp3.internal.platform.Jdk9Platform;
import okhttp3.internal.platform.OpenJSSEPlatform;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.platform.android.AndroidLogHandler;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import wo2.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/Platform;", "", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class Platform {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f96214a = new Companion(0);

    /* renamed from: b, reason: collision with root package name */
    public static volatile Platform f96215b;

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f96216c;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001c\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/platform/Platform$Companion;", "", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Lokhttp3/internal/platform/Platform;", "platform", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static ArrayList a(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).getProtocol());
            }
            return arrayList2;
        }

        public static byte[] b(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            j jVar = new j();
            Iterator it = a(protocols).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                jVar.a0(str.length());
                jVar.r0(str);
            }
            return jVar.A(jVar.f130711b);
        }

        public static Platform c() {
            if (Intrinsics.d("Conscrypt", Security.getProviders()[0].getName())) {
                ConscryptPlatform.f96196e.getClass();
                ConscryptPlatform b13 = ConscryptPlatform.Companion.b();
                if (b13 != null) {
                    return b13;
                }
            }
            if (Intrinsics.d("BC", Security.getProviders()[0].getName())) {
                BouncyCastlePlatform.f96193e.getClass();
                BouncyCastlePlatform a13 = BouncyCastlePlatform.Companion.a();
                if (a13 != null) {
                    return a13;
                }
            }
            if (Intrinsics.d("OpenJSSE", Security.getProviders()[0].getName())) {
                OpenJSSEPlatform.f96211e.getClass();
                OpenJSSEPlatform a14 = OpenJSSEPlatform.Companion.a();
                if (a14 != null) {
                    return a14;
                }
            }
            Jdk9Platform.f96209d.getClass();
            Jdk9Platform a15 = Jdk9Platform.Companion.a();
            if (a15 != null) {
                return a15;
            }
            Jdk8WithJettyBootPlatform.f96200i.getClass();
            Jdk8WithJettyBootPlatform a16 = Jdk8WithJettyBootPlatform.Companion.a();
            return a16 != null ? a16 : new Platform();
        }
    }

    static {
        Platform c13;
        if (Intrinsics.d("Dalvik", System.getProperty("java.vm.name"))) {
            AndroidLog.f96221a.getClass();
            for (Map.Entry entry : AndroidLog.f96223c.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (AndroidLog.f96222b.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(AndroidLogHandler.f96224a);
                }
            }
            Android10Platform.f96184e.getClass();
            c13 = Android10Platform.f96185f ? new Android10Platform() : null;
            if (c13 == null) {
                AndroidPlatform.f96187f.getClass();
                c13 = AndroidPlatform.Companion.a();
                Intrinsics.f(c13);
            }
        } else {
            c13 = Companion.c();
        }
        f96215b = c13;
        f96216c = Logger.getLogger(OkHttpClient.class.getName());
    }

    public static void i(int i13, String message, Throwable th3) {
        Intrinsics.checkNotNullParameter(message, "message");
        f96216c.log(i13 == 5 ? Level.WARNING : Level.INFO, message, th3);
    }

    public static /* synthetic */ void j(Platform platform, String str, int i13, int i14) {
        if ((i14 & 2) != 0) {
            i13 = 4;
        }
        platform.getClass();
        i(i13, str, null);
    }

    public void a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    public CertificateChainCleaner b(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new BasicCertificateChainCleaner(c(trustManager));
    }

    public TrustRootIndex c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    public void e(Socket socket, InetSocketAddress address, int i13) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i13);
    }

    public String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    public Object g() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        if (f96216c.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public void k(Object obj, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = a.C(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, message, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory m(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext l13 = l();
            l13.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = l13.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e13) {
            throw new AssertionError("No System TLS: " + e13, e13);
        }
    }

    public X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.f(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.g(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb3 = new StringBuilder("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
        sb3.append(arrays);
        throw new IllegalStateException(sb3.toString().toString());
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
