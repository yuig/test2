package okhttp3.internal.platform;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.Android10SocketAdapter;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;

@SuppressSignatureCheck
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/Android10Platform;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Android10Platform extends Platform {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f96184e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f96185f;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f96186d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/Android10Platform$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    static {
        boolean z13 = false;
        z13 = false;
        f96184e = new Companion(z13 ? 1 : 0);
        Platform.f96214a.getClass();
        if (Intrinsics.d("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29) {
            z13 = true;
        }
        f96185f = z13;
    }

    public Android10Platform() {
        SocketAdapter[] elements = new SocketAdapter[4];
        Android10SocketAdapter.f96217a.getClass();
        Platform.f96214a.getClass();
        elements[0] = (!Intrinsics.d("Dalvik", System.getProperty("java.vm.name")) || Build.VERSION.SDK_INT < 29) ? null : new Android10SocketAdapter();
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
        this.f96186d = arrayList;
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
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f96186d.iterator();
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
    public final String f(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f96186d.iterator();
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
    public final boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
