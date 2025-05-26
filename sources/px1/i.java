package px1;

import android.content.Context;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import x02.x2;

/* loaded from: classes4.dex */
public final class i extends yk1.t implements j {

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f101666d = g0.ANALYTICS_FILTER_MENU;

    /* renamed from: e, reason: collision with root package name */
    public static final String f101667e = "ETSY";

    /* renamed from: f, reason: collision with root package name */
    public static final String f101668f = "INSTAGRAM";

    /* renamed from: g, reason: collision with root package name */
    public static final String f101669g = "YOUTUBE";

    /* renamed from: a, reason: collision with root package name */
    public final Context f101670a;

    /* renamed from: b, reason: collision with root package name */
    public final yx.a f101671b;

    /* renamed from: c, reason: collision with root package name */
    public final x2 f101672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, yx.a filterRepository, uk1.d presenterPinalytics, uj2.q networkStateStream, x2 userRepository) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filterRepository, "filterRepository");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f101670a = context;
        this.f101671b = filterRepository;
        this.f101672c = userRepository;
    }

    public static /* synthetic */ void w3(i iVar, u0 u0Var, String str, String str2, g0 g0Var, int i13) {
        f1 f1Var = f1.TAP;
        if ((i13 & 16) != 0) {
            g0Var = f101666d;
        }
        iVar.v3(u0Var, str, str2, f1Var, g0Var);
    }

    @Override // yk1.p
    /* renamed from: p3, reason: merged with bridge method [inline-methods] */
    public final void r3(k view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        k kVar = (k) getViewIfBound();
        if (kVar != null) {
            Intrinsics.checkNotNullParameter(this, "listener");
            ((f) kVar).C0 = this;
        }
        ex1.n nVar = new ex1.n(this, 6);
        x2 x2Var = this.f101672c;
        xj2.c F = x2.b0(x2Var, x2Var.B.a(k22.j.ANALYTICS_GRAPH), null, null, 65533).Q("me").F(new ru1.d(18, new al1.j(12, nVar)), new ru1.d(19, e.f101632k), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
        k kVar2 = (k) getViewIfBound();
        if (kVar2 != null) {
            ((f) kVar2).b8(((yx.c) this.f101671b).c());
        }
    }

    public final void q3(q filterParam) {
        Intrinsics.checkNotNullParameter(filterParam, "filterParam");
        yx.c cVar = (yx.c) this.f101671b;
        zx.l lVar = cVar.f140326c;
        zx.l c13 = cVar.c();
        int i13 = h.f101665a[lVar.f142974b.ordinal()];
        if (i13 == 1) {
            k kVar = (k) getViewIfBound();
            if (kVar != null) {
                f fVar = (f) kVar;
                fVar.b8(yx.a.a(this.f101671b, null, null, zx.e.ALL, zx.c.ALL, null, null, null, null, null, false, 1011));
                return;
            }
            return;
        }
        if (i13 == 2) {
            zx.e eVar = zx.e.values()[filterParam.f101681a];
            k kVar2 = (k) getViewIfBound();
            if (kVar2 != null) {
                ((f) kVar2).b8(yx.a.a(this.f101671b, null, null, eVar, null, null, null, null, null, null, false, 1019));
            }
            u0 u0Var = u0.ANALYTICS_ORGANIC_PIN_FORMAT_FILTER;
            String name = c13.f142975c.name();
            Locale locale = Locale.ROOT;
            String lowerCase = name.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = eVar.name().toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            w3(this, u0Var, lowerCase, lowerCase2, null, 24);
            return;
        }
        if (i13 != 3) {
            return;
        }
        zx.c cVar2 = zx.c.values()[filterParam.f101681a];
        k kVar3 = (k) getViewIfBound();
        if (kVar3 != null) {
            ((f) kVar3).b8(yx.a.a(this.f101671b, null, null, null, cVar2, null, null, null, null, null, false, 1015));
        }
        u0 u0Var2 = u0.ANALYTICS_ADS_PIN_FORMAT_FILTER;
        String name2 = c13.f142976d.name();
        Locale locale2 = Locale.ROOT;
        String lowerCase3 = name2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        String lowerCase4 = cVar2.name().toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
        w3(this, u0Var2, lowerCase3, lowerCase4, null, 24);
    }

    public final void r3() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.ANALYTICS_DATE_MENU_BUTTON, (r18 & 4) != 0 ? null : g0.ANALYTICS_MOBILE_HEADER, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    public final void s3() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CANCEL_BUTTON, (r18 & 4) != 0 ? null : f101666d, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        yx.c cVar = (yx.c) this.f101671b;
        zx.l c13 = cVar.c();
        Intrinsics.checkNotNullParameter(c13, "<set-?>");
        cVar.f140326c = c13;
    }

    public final void t3() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.DONE_BUTTON, (r18 & 4) != 0 ? null : f101666d, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        yx.c cVar = (yx.c) this.f101671b;
        cVar.getClass();
        ((lb0.b) lb0.n.b()).n(cVar.f140324a.getKeyName(), new nm.p().a().k(cVar.f140326c));
    }

    public final void u3() {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.ANALYTICS_RESET_BUTTON, (r18 & 4) != 0 ? null : f101666d, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        ((yx.c) this.f101671b).d();
    }

    public final void v3(u0 u0Var, String str, String str2, f1 f1Var, g0 g0Var) {
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : a.a.x("analytics_previous_value", str, "analytics_next_value", str2), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }
}
