package dh1;

import com.pinterest.feature.todaytab.tab.view.h;
import kg.t;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.w;
import m60.x0;
import pk.a0;
import qf1.z;
import uj2.q;
import yk1.r;
import yk1.v;

/* loaded from: classes5.dex */
public final class a extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f54989a;

    /* renamed from: b, reason: collision with root package name */
    public final v f54990b;

    /* renamed from: c, reason: collision with root package name */
    public final w f54991c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f54992d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f54993e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(uk1.d presenterPinalytics, q networkStateStream, boolean z13, v viewResources, w eventManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f54989a = z13;
        this.f54990b = viewResources;
        this.f54991c = eventManager;
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        h hVar = (h) ((ch1.a) getView());
        hVar.f48713d.d(com.pinterest.feature.todaytab.tab.view.b.f48696m);
        t.O(hVar.f48710a);
        a0.k0(hVar.f48712c);
        a0.k0(hVar.f48711b);
        hVar.setPaddingRelative(hVar.getPaddingStart(), hVar.getPaddingTop(), hVar.getPaddingEnd(), bs1.c.Z(hVar, eo1.c.space_1600) + bs1.c.Z(hVar, r0.lego_floating_nav_bottom_bar_height));
        this.f54992d = null;
        this.f54993e = null;
        super.onUnbind();
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(ch1.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        if (this.f54989a) {
            String text = ((yk1.a) this.f54990b).f139224a.getString(x0.today_tab_go_back);
            Intrinsics.checkNotNullParameter(text, "text");
            ((h) view).f48713d.d(new z(text, 16));
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        ((h) view).f48729g = this;
        r3();
    }

    public final void r3() {
        Integer num = this.f54992d;
        if (num != null) {
            int intValue = num.intValue();
            Integer num2 = this.f54993e;
            if (intValue >= (num2 != null ? num2.intValue() : -1) || !isBound()) {
                return;
            }
            h hVar = (h) ((ch1.a) getView());
            hVar.f48713d.d(com.pinterest.feature.todaytab.tab.view.b.f48695l);
            hVar.setPaddingRelative(hVar.getPaddingStart(), hVar.getPaddingTop(), hVar.getPaddingEnd(), bs1.c.Z(hVar, eo1.c.space_1600));
        }
    }
}
