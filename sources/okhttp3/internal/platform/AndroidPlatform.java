package okhttp3.internal.platform;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.CloseGuard;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

@SuppressSignatureCheck
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Companion", "CustomTrustRootIndex", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AndroidPlatform extends Platform {

    /* renamed from: f, reason: collision with root package name */
    public static final Companion f96187f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f96188g;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f96189d;

    /* renamed from: e, reason: collision with root package name */
    public final CloseGuard f96190e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static AndroidPlatform a() {
            if (AndroidPlatform.f96188g) {
                return new AndroidPlatform();
            }
            return null;
        }

        public static boolean b() {
            return AndroidPlatform.f96188g;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$CustomTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class CustomTrustRootIndex implements TrustRootIndex {

        /* renamed from: a, reason: collision with root package name */
        public final X509TrustManager f96191a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f96192b;

        public CustomTrustRootIndex(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f96191a = trustManager;
            this.f96192b = findByIssuerAndSignatureMethod;
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public final X509Certificate a(X509Certificate cert) {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object invoke = this.f96192b.invoke(this.f96191a, cert);
                Intrinsics.g(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) invoke).getTrustedCert();
            } catch (IllegalAccessException e13) {
                throw new AssertionError("unable to get issues and signature", e13);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) obj;
            return Intrinsics.d(this.f96191a, customTrustRootIndex.f96191a) && Intrinsics.d(this.f96192b, customTrustRootIndex.f96192b);
        }

        public final int hashCode() {
            return this.f96192b.hashCode() + (this.f96191a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f96191a + ", findByIssuerAndSignatureMethod=" + this.f96192b + ')';
        }
    }

    static {
        boolean z13 = false;
        z13 = false;
        f96187f = new Companion(z13 ? 1 : 0);
        Platform.f96214a.getClass();
        if (Intrinsics.d("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT < 30) {
            z13 = true;
        }
        f96188g = z13;
    }

    public AndroidPlatform() {
        StandardAndroidSocketAdapter standardAndroidSocketAdapter;
        Method method;
        Method method2;
        SocketAdapter[] elements = new SocketAdapter[4];
        StandardAndroidSocketAdapter.f96243h.getClass();
        Intrinsics.checkNotNullParameter("com.android.org.conscrypt", "packageName");
        Method method3 = null;
        try {
            Class<?> sslSocketClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class<?> sslSocketFactoryClass = Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class<?> paramClass = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Intrinsics.checkNotNullExpressionValue(paramClass, "paramsClass");
            Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
            Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
            Intrinsics.checkNotNullParameter(paramClass, "paramClass");
            standardAndroidSocketAdapter = new StandardAndroidSocketAdapter(sslSocketClass);
        } catch (Exception e13) {
            Platform.f96214a.getClass();
            Platform.f96215b.getClass();
            Platform.i(5, "unable to load android socket classes", e13);
            standardAndroidSocketAdapter = null;
        }
        elements[0] = standardAndroidSocketAdapter;
        AndroidSocketAdapter.f96225f.getClass();
        elements[1] = new DeferredSocketAdapter(AndroidSocketAdapter.f96226g);
        ConscryptSocketAdapter.f96239a.getClass();
        elements[2] = new DeferredSocketAdapter(ConscryptSocketAdapter.f96240b);
        BouncyCastleSocketAdapter.f96233a.getClass();
        elements[3] = new DeferredSocketAdapter(BouncyCastleSocketAdapter.f96234b);
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList A = c0.A(elements);
        ArrayList arrayList = new ArrayList();
        Iterator it = A.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((SocketAdapter) next).b()) {
                arrayList.add(next);
            }
        }
        this.f96189d = arrayList;
        CloseGuard.f96235d.getClass();
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f96190e = new CloseGuard(method3, method2, method);
    }

    @Override // okhttp3.internal.platform.Platform
    public final CertificateChainCleaner b(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        AndroidCertificateChainCleaner.f96218d.getClass();
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        AndroidCertificateChainCleaner androidCertificateChainCleaner = x509TrustManagerExtensions != null ? new AndroidCertificateChainCleaner(trustManager, x509TrustManagerExtensions) : null;
        return androidCertificateChainCleaner != null ? androidCertificateChainCleaner : super.b(trustManager);
    }

    @Override // okhttp3.internal.platform.Platform
    public final TrustRootIndex c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            return new CustomTrustRootIndex(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.c(trustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f96189d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((SocketAdapter) obj).a(sslSocket)) {
                    break;
                }
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            socketAdapter.d(sslSocket, str, protocols);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void e(Socket socket, InetSocketAddress address, int i13) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i13);
        } catch (ClassCastException e13) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e13;
            }
            throw new IOException("Exception in connect", e13);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final String f(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f96189d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SocketAdapter) obj).a(sslSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            return socketAdapter.c(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    public final Object g() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        CloseGuard closeGuard = this.f96190e;
        closeGuard.getClass();
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        Method method = closeGuard.f96236a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, new Object[0]);
            Method method2 = closeGuard.f96237b;
            Intrinsics.f(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.Platform
    public final void k(Object obj, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        CloseGuard closeGuard = this.f96190e;
        closeGuard.getClass();
        if (obj != null) {
            try {
                Method method = closeGuard.f96238c;
                Intrinsics.f(method);
                method.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        Platform.j(this, message, 5, 4);
    }
}
