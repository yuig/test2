package okhttp3.internal.authenticator;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Authenticator;
import okhttp3.Dns;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/authenticator/JavaNetAuthenticator;", "Lokhttp3/Authenticator;", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class JavaNetAuthenticator implements Authenticator {

    /* renamed from: c, reason: collision with root package name */
    public final Dns f95764c;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95765a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f95765a = iArr;
        }
    }

    public JavaNetAuthenticator() {
        this(0);
    }

    public static InetAddress b(Proxy proxy, HttpUrl httpUrl, Dns dns) {
        Proxy.Type type = proxy.type();
        if (type != null && WhenMappings.f95765a[type.ordinal()] == 1) {
            return (InetAddress) CollectionsKt.S(dns.a(httpUrl.f95634d));
        }
        SocketAddress address = proxy.address();
        Intrinsics.g(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        Intrinsics.checkNotNullExpressionValue(address2, "address() as InetSocketAddress).address");
        return address2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0071  */
    @Override // okhttp3.Authenticator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Request a(okhttp3.Route r21, okhttp3.Response r22) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.authenticator.JavaNetAuthenticator.a(okhttp3.Route, okhttp3.Response):okhttp3.Request");
    }

    public JavaNetAuthenticator(int i13) {
        Dns defaultDns = Dns.f95609a;
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.f95764c = defaultDns;
    }
}
