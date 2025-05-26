package okhttp3.internal.platform.android;

import a.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.z;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class AndroidSocketAdapter implements SocketAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final Companion f96225f = new Companion(0);

    /* renamed from: g, reason: collision with root package name */
    public static final AndroidSocketAdapter$Companion$factory$1 f96226g;

    /* renamed from: a, reason: collision with root package name */
    public final Class f96227a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f96228b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f96229c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f96230d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f96231e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1] */
    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", "packageName");
        f96226g = new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f96232a = "com.google.android.gms.org.conscrypt";

            @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
            public final boolean a(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
                return z.p(name, this.f96232a + '.', false);
            }

            @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
            public final SocketAdapter b(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                AndroidSocketAdapter.Companion companion = AndroidSocketAdapter.f96225f;
                Class<?> cls = sslSocket.getClass();
                companion.getClass();
                Class<?> cls2 = cls;
                while (!Intrinsics.d(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                    cls2 = cls2.getSuperclass();
                    if (cls2 == null) {
                        throw new AssertionError(a.h("No OpenSSLSocketImpl superclass of socket of type ", cls));
                    }
                }
                return new AndroidSocketAdapter(cls2);
            }
        };
    }

    public AndroidSocketAdapter(Class sslSocketClass) {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f96227a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f96228b = declaredMethod;
        this.f96229c = sslSocketClass.getMethod("setHostname", String.class);
        this.f96230d = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f96231e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f96227a.isInstance(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b() {
        AndroidPlatform.f96187f.getClass();
        return AndroidPlatform.Companion.b();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f96230d.invoke(sslSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, Charsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e13) {
            throw new AssertionError(e13);
        } catch (InvocationTargetException e14) {
            Throwable cause = e14.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.d(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e14);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f96228b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f96229c.invoke(sslSocket, str);
                }
                Method method = this.f96231e;
                Platform.f96214a.getClass();
                method.invoke(sslSocket, Platform.Companion.b(protocols));
            } catch (IllegalAccessException e13) {
                throw new AssertionError(e13);
            } catch (InvocationTargetException e14) {
                throw new AssertionError(e14);
            }
        }
    }
}
