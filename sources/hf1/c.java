package hf1;

import com.pinterest.gestalt.tabs.GestaltTabLayout;
import k22.m;
import kotlin.jvm.internal.Intrinsics;
import tk2.e;
import uj2.q;
import uk1.d;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class c extends t {

    /* renamed from: a, reason: collision with root package name */
    public final m f69011a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69012b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d presenterPinalytics, q networkStateStream, m userService, String str) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userService, "userService");
        this.f69011a = userService;
        this.f69012b = str;
    }

    @Override // yk1.p
    /* renamed from: p3, reason: merged with bridge method [inline-methods] */
    public final void r3(ff1.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((if1.d) view).f72236q0 = this;
        String str = this.f69012b;
        if (str != null) {
            xj2.c o13 = this.f69011a.t(str, n00.b.a(n00.c.BOARD_WISHLIST_FILTER)).r(e.f118017c).l(wj2.c.a()).o(new vd1.a(10, new a(this, 0)), new vd1.a(11, b.f69010i));
            Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
            addDisposable(o13);
        }
    }

    public final void q3(int i13) {
        if1.d dVar = (if1.d) ((ff1.b) getView());
        dVar.b8().w(i13, true);
        GestaltTabLayout gestaltTabLayout = dVar.f72235p0;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        ek.e n13 = gestaltTabLayout.n(i13);
        if (n13 != null) {
            n13.b();
        }
    }
}
