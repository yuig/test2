package l71;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.w;
import uj2.b0;
import x02.i2;

/* loaded from: classes5.dex */
public final class o extends f {

    /* renamed from: s, reason: collision with root package name */
    public final boolean f81954s;

    /* renamed from: t, reason: collision with root package name */
    public final js0.c f81955t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z13, i2 pinRepository, w eventManager, uk1.d presenterPinalytics, uj2.q networkStateStream, yk1.v viewResources, k22.m userService) {
        super(null, null);
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(userService, "userService");
        this.f81954s = z13;
        this.f81955t = new js0.c(userService);
        o(16, new bu0.a(eventManager, presenterPinalytics, viewResources, pinRepository, networkStateStream));
    }

    @Override // l71.f
    public final boolean B() {
        return z.j(this.f81938m);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        Object item = getItem(i13);
        vh vhVar = item instanceof vh ? (vh) item : null;
        if (vhVar == null) {
            return -2;
        }
        String q13 = vhVar.q();
        return (Intrinsics.d(q13, "user_recently_saved_pins") || Intrinsics.d(q13, "user_recently_viewed_pins")) ? 16 : -2;
    }

    @Override // l71.f
    public final b0 w(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        kk2.m k13 = ((b0) this.f81955t.b(new p71.g(this.f81954s ? 7 : 4)).buildRequest()).k(new d51.a(11, a.f81926k));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        return k13;
    }
}
