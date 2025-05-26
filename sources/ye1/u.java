package ye1;

import android.net.Uri;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.vh;
import h32.v2;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.y0;
import z32.c2;

/* loaded from: classes5.dex */
public final class u extends yk1.c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final ll.j f138892a;

    /* renamed from: b, reason: collision with root package name */
    public vh f138893b;

    /* renamed from: c, reason: collision with root package name */
    public ud1.a f138894c;

    /* renamed from: d, reason: collision with root package name */
    public final a71.c f138895d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f138896e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(uk1.d presenterPinalytics, uj2.q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f138892a = new ll.j(16, 0);
        d0 d0Var = presenterPinalytics.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        this.f138895d = new a71.c(d0Var, 2);
    }

    public final y0 E1() {
        v2 y13 = this.f138892a.y(null);
        ud1.a aVar = this.f138894c;
        this.f138895d.getClass();
        return new y0(y13, null, a71.c.a(aVar), null, 10);
    }

    public final y0 I() {
        vh vhVar = this.f138893b;
        String uid = vhVar != null ? vhVar.getUid() : null;
        vh vhVar2 = this.f138893b;
        v2 x13 = ll.j.x(this.f138892a, uid, 0, 0, vhVar2 != null ? vhVar2.u() : null, null, null, 52);
        if (x13 == null) {
            return null;
        }
        ud1.a aVar = this.f138894c;
        this.f138895d.getClass();
        return new y0(x13, null, a71.c.a(aVar), null, 10);
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(q view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        q qVar = (q) getViewIfBound();
        if (qVar != null) {
            qVar.I6(this);
        }
        if (this.f138896e) {
            return;
        }
        vh vhVar = this.f138893b;
        String q13 = vhVar != null ? vhVar.q() : null;
        boolean d2 = Intrinsics.d(q13, "related_query_shop_upsell_closeup");
        a71.c cVar = this.f138895d;
        if (d2) {
            ud1.b event = ud1.b.SHOPPING_UNIT_VIEW;
            ud1.a aVar = this.f138894c;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            d0.B(cVar.f1259a, event.getEventType(), event.getComponentType(), null, a71.c.a(aVar), 20);
        } else if (Intrinsics.d(q13, "related_query_shop_upsell_search")) {
            ud1.c event2 = ud1.c.SHOPPING_UNIT_VIEW;
            ud1.a aVar2 = this.f138894c;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(event2, "event");
            d0.B(cVar.f1259a, event2.getEventType(), event2.getComponentType(), null, a71.c.a(aVar2), 20);
        }
        this.f138896e = true;
    }

    public final void r3() {
        ih ihVar;
        String e13;
        vh vhVar = this.f138893b;
        if (vhVar == null || (ihVar = vhVar.f42857o) == null || (e13 = ihVar.e()) == null) {
            return;
        }
        vh vhVar2 = this.f138893b;
        String q13 = vhVar2 != null ? vhVar2.q() : null;
        boolean d2 = Intrinsics.d(q13, "related_query_shop_upsell_closeup");
        a71.c cVar = this.f138895d;
        if (d2) {
            ud1.b event = ud1.b.SHOPPING_UNIT_TAP;
            ud1.a aVar = this.f138894c;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            d0.B(cVar.f1259a, event.getEventType(), event.getComponentType(), null, a71.c.a(aVar), 20);
        } else if (Intrinsics.d(q13, "related_query_shop_upsell_search")) {
            ud1.c event2 = ud1.c.SHOPPING_UNIT_TAP;
            ud1.a aVar2 = this.f138894c;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(event2, "event");
            d0.B(cVar.f1259a, event2.getEventType(), event2.getComponentType(), null, a71.c.a(aVar2), 20);
        }
        Uri parse = Uri.parse(e13);
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Intrinsics.f(queryParameterNames);
        for (String str : queryParameterNames) {
            clearQuery.appendQueryParameter(str, Intrinsics.d(str, "pins_display") ? String.valueOf(c2.SHOPPING_GRID.value()) : parse.getQueryParameter(str));
        }
        q qVar = (q) getViewIfBound();
        if (qVar != null) {
            String builder = clearQuery.toString();
            Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
            qVar.E1(builder);
        }
    }
}
