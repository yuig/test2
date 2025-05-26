package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/ExchangeFinder;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ExchangeFinder {

    /* renamed from: a, reason: collision with root package name */
    public final RealConnectionPool f95887a;

    /* renamed from: b, reason: collision with root package name */
    public final Address f95888b;

    /* renamed from: c, reason: collision with root package name */
    public final RealCall f95889c;

    /* renamed from: d, reason: collision with root package name */
    public final EventListener f95890d;

    /* renamed from: e, reason: collision with root package name */
    public RouteSelector.Selection f95891e;

    /* renamed from: f, reason: collision with root package name */
    public RouteSelector f95892f;

    /* renamed from: g, reason: collision with root package name */
    public int f95893g;

    /* renamed from: h, reason: collision with root package name */
    public int f95894h;

    /* renamed from: i, reason: collision with root package name */
    public int f95895i;

    /* renamed from: j, reason: collision with root package name */
    public Route f95896j;

    public ExchangeFinder(RealConnectionPool connectionPool, Address address, RealCall call, EventListener eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f95887a = connectionPool;
        this.f95888b = address;
        this.f95889c = call;
        this.f95890d = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.internal.connection.RealConnection a(int r16, int r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.a(int, int, int, int, boolean, boolean):okhttp3.internal.connection.RealConnection");
    }

    public final boolean b(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        HttpUrl httpUrl = this.f95888b.f95488i;
        return url.f95635e == httpUrl.f95635e && Intrinsics.d(url.f95634d, httpUrl.f95634d);
    }

    public final void c(IOException e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f95896j = null;
        if ((e13 instanceof StreamResetException) && ((StreamResetException) e13).f96181a == ErrorCode.REFUSED_STREAM) {
            this.f95893g++;
        } else if (e13 instanceof ConnectionShutdownException) {
            this.f95894h++;
        } else {
            this.f95895i++;
        }
    }
}
