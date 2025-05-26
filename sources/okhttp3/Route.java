package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Route;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Route {

    /* renamed from: a, reason: collision with root package name */
    public final Address f95754a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f95755b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f95756c;

    public Route(Address address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f95754a = address;
        this.f95755b = proxy;
        this.f95756c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (Intrinsics.d(route.f95754a, this.f95754a) && Intrinsics.d(route.f95755b, this.f95755b) && Intrinsics.d(route.f95756c, this.f95756c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f95756c.hashCode() + ((this.f95755b.hashCode() + ((this.f95754a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f95756c + '}';
    }
}
