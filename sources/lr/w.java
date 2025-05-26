package lr;

import android.content.Context;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import df.j1;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import rg0.i0;

/* loaded from: classes3.dex */
public final class w extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final String f84557d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84558e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f84559f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f84560g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84561h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84562i;

    /* renamed from: j, reason: collision with root package name */
    public final String f84563j;

    /* renamed from: k, reason: collision with root package name */
    public final m60.w f84564k;

    /* renamed from: l, reason: collision with root package name */
    public final nx.d0 f84565l;

    /* renamed from: m, reason: collision with root package name */
    public final g70.h f84566m;

    public w(nx.d0 pinalytics, m60.w eventManager, g70.h boardNavigator, String sourcePinId, String str, String str2, String str3, String str4, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(sourcePinId, "sourcePinId");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f84557d = sourcePinId;
        this.f84558e = str;
        this.f84559f = z13;
        this.f84560g = z14;
        this.f84561h = str2;
        this.f84562i = str3;
        this.f84563j = str4;
        this.f84564k = eventManager;
        this.f84565l = pinalytics;
        this.f84566m = boardNavigator;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        String string = container.getResources().getString(x0.profile);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CharSequence a03 = j1.a0(container.getResources().getString(x0.saved_onto_board_bold, string));
        Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
        u50.f0 p23 = bs1.c.p2(a03);
        String str = this.f84563j;
        do1.j jVar = str != null ? new do1.j(str) : null;
        String string2 = container.getResources().getString(x0.organize_board_button);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        GestaltToast gestaltToast = new GestaltToast(context, new do1.d(p23, jVar, new do1.b(bs1.c.p2(string2), new v(this, 0)), null, 0, 0, 0, null, false, 504));
        f1 f1Var = f1.VIEW;
        d(f1Var, u0.BOARD_ORGANIZE_BUTTON);
        d(f1Var, u0.QUICK_SAVE_TOAST_VIEW);
        return gestaltToast;
    }

    @Override // we0.a
    public final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.f84561h;
        if (str != null) {
            this.f84564k.d(r41.k.c(r41.k.f106176a, str, r41.b.QuicksaveToast, r41.g.Pin, u32.i.PINS, 8));
        } else {
            String str2 = this.f84562i;
            if (str2 != null) {
                g70.h.g(this.f84566m, str2, null, e.f84495m, 2);
            }
        }
        d(f1.VIEW, u0.QUICK_SAVE_TOAST_VIEW);
    }

    @Override // we0.a
    public final void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        g4.u.v0(i0.f108029b, this.f84557d, null, 6);
    }

    public final void d(f1 f1Var, u0 u0Var) {
        this.f84565l.N(f1Var, u0Var, g0.QUICK_SAVE_TOAST, this.f84558e, false);
    }
}
