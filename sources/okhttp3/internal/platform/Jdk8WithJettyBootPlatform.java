package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.Platform;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform;", "Lokhttp3/internal/platform/Platform;", "AlpnProvider", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Jdk8WithJettyBootPlatform extends Platform {

    /* renamed from: i, reason: collision with root package name */
    public static final Companion f96200i = new Companion(0);

    /* renamed from: d, reason: collision with root package name */
    public final Method f96201d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f96202e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f96203f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f96204g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f96205h;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$AlpnProvider;", "Ljava/lang/reflect/InvocationHandler;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class AlpnProvider implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final List f96206a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f96207b;

        /* renamed from: c, reason: collision with root package name */
        public String f96208c;

        public AlpnProvider(ArrayList protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            this.f96206a = protocols;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method method, Object[] objArr) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (Intrinsics.d(name, "supports") && Intrinsics.d(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (Intrinsics.d(name, "unsupported") && Intrinsics.d(Void.TYPE, returnType)) {
                this.f96207b = true;
                return null;
            }
            boolean d2 = Intrinsics.d(name, "protocols");
            List list = this.f96206a;
            if (d2 && objArr.length == 0) {
                return list;
            }
            if ((Intrinsics.d(name, "selectProtocol") || Intrinsics.d(name, "select")) && Intrinsics.d(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list2 = (List) obj;
                    int size = list2.size();
                    if (size >= 0) {
                        int i13 = 0;
                        while (true) {
                            Object obj2 = list2.get(i13);
                            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (!list.contains(str)) {
                                if (i13 == size) {
                                    break;
                                }
                                i13++;
                            } else {
                                this.f96208c = str;
                                return str;
                            }
                        }
                    }
                    String str2 = (String) list.get(0);
                    this.f96208c = str2;
                    return str2;
                }
            }
            if ((!Intrinsics.d(name, "protocolSelected") && !Intrinsics.d(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f96208c = (String) obj3;
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static Jdk8WithJettyBootPlatform a() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod("get", SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                Intrinsics.checkNotNullExpressionValue(putMethod, "putMethod");
                Intrinsics.checkNotNullExpressionValue(getMethod, "getMethod");
                Intrinsics.checkNotNullExpressionValue(removeMethod, "removeMethod");
                Intrinsics.checkNotNullExpressionValue(clientProviderClass, "clientProviderClass");
                Intrinsics.checkNotNullExpressionValue(serverProviderClass, "serverProviderClass");
                return new Jdk8WithJettyBootPlatform(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public Jdk8WithJettyBootPlatform(Method putMethod, Method getMethod, Method removeMethod, Class clientProviderClass, Class serverProviderClass) {
        Intrinsics.checkNotNullParameter(putMethod, "putMethod");
        Intrinsics.checkNotNullParameter(getMethod, "getMethod");
        Intrinsics.checkNotNullParameter(removeMethod, "removeMethod");
        Intrinsics.checkNotNullParameter(clientProviderClass, "clientProviderClass");
        Intrinsics.checkNotNullParameter(serverProviderClass, "serverProviderClass");
        this.f96201d = putMethod;
        this.f96202e = getMethod;
        this.f96203f = removeMethod;
        this.f96204g = clientProviderClass;
        this.f96205h = serverProviderClass;
    }

    @Override // okhttp3.internal.platform.Platform
    public final void a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            this.f96203f.invoke(null, sslSocket);
        } catch (IllegalAccessException e13) {
            throw new AssertionError("failed to remove ALPN", e13);
        } catch (InvocationTargetException e14) {
            throw new AssertionError("failed to remove ALPN", e14);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Platform.f96214a.getClass();
        try {
            this.f96201d.invoke(null, sslSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f96204g, this.f96205h}, new AlpnProvider(Platform.Companion.a(protocols))));
        } catch (IllegalAccessException e13) {
            throw new AssertionError("failed to set ALPN", e13);
        } catch (InvocationTargetException e14) {
            throw new AssertionError("failed to set ALPN", e14);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f96202e.invoke(null, sslSocket));
            Intrinsics.g(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            boolean z13 = alpnProvider.f96207b;
            if (!z13 && alpnProvider.f96208c == null) {
                Platform.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                return null;
            }
            if (z13) {
                return null;
            }
            return alpnProvider.f96208c;
        } catch (IllegalAccessException e13) {
            throw new AssertionError("failed to get ALPN selected protocol", e13);
        } catch (InvocationTargetException e14) {
            throw new AssertionError("failed to get ALPN selected protocol", e14);
        }
    }
}
