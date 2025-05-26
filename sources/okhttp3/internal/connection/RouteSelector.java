package okhttp3.internal.connection;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RouteSelector;", "", "Companion", "Selection", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RouteSelector {

    /* renamed from: i, reason: collision with root package name */
    public static final Companion f95951i = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final Address f95952a;

    /* renamed from: b, reason: collision with root package name */
    public final RouteDatabase f95953b;

    /* renamed from: c, reason: collision with root package name */
    public final Call f95954c;

    /* renamed from: d, reason: collision with root package name */
    public final EventListener f95955d;

    /* renamed from: e, reason: collision with root package name */
    public final List f95956e;

    /* renamed from: f, reason: collision with root package name */
    public int f95957f;

    /* renamed from: g, reason: collision with root package name */
    public List f95958g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f95959h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static String a(InetSocketAddress inetSocketAddress) {
            Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                Intrinsics.checkNotNullExpressionValue(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            Intrinsics.checkNotNullExpressionValue(hostAddress, "address.hostAddress");
            return hostAddress;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Selection;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Selection {

        /* renamed from: a, reason: collision with root package name */
        public final List f95960a;

        /* renamed from: b, reason: collision with root package name */
        public int f95961b;

        public Selection(ArrayList routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.f95960a = routes;
        }

        public final boolean a() {
            return this.f95961b < this.f95960a.size();
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, RealCall call, EventListener eventListener) {
        List l13;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f95952a = address;
        this.f95953b = routeDatabase;
        this.f95954c = call;
        this.f95955d = eventListener;
        q0 q0Var = q0.f80391a;
        this.f95956e = q0Var;
        this.f95958g = q0Var;
        this.f95959h = new ArrayList();
        HttpUrl httpUrl = address.f95488i;
        eventListener.p(call, httpUrl);
        Proxy proxy = address.f95486g;
        if (proxy != null) {
            l13 = e0.b(proxy);
        } else {
            URI j13 = httpUrl.j();
            if (j13.getHost() == null) {
                l13 = Util.l(Proxy.NO_PROXY);
            } else {
                List<Proxy> proxiesOrNull = address.f95487h.select(j13);
                List<Proxy> list = proxiesOrNull;
                if (list == null || list.isEmpty()) {
                    l13 = Util.l(Proxy.NO_PROXY);
                } else {
                    Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
                    l13 = Util.A(proxiesOrNull);
                }
            }
        }
        this.f95956e = l13;
        this.f95957f = 0;
        eventListener.o(call, httpUrl, l13);
    }

    public final boolean a() {
        return (this.f95957f < this.f95956e.size()) || (this.f95959h.isEmpty() ^ true);
    }
}
