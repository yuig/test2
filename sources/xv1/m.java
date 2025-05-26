package xv1;

import com.pinterest.api.model.g00;
import com.pinterest.api.model.k00;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.t2;
import h32.f1;
import h32.g0;
import h32.v0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;

/* loaded from: classes4.dex */
public final class m extends l {

    /* renamed from: h, reason: collision with root package name */
    public final ov1.a f136086h;

    /* renamed from: i, reason: collision with root package name */
    public final uk1.d f136087i;

    /* renamed from: j, reason: collision with root package name */
    public final w f136088j;

    /* renamed from: k, reason: collision with root package name */
    public final ov1.e f136089k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ov1.a oneBarInternalListener, uk1.d presenterPinalytics, w eventManager, ov1.e oneBarContainerSelectionMode, boolean z13) {
        super(presenterPinalytics, z13);
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(oneBarInternalListener, "oneBarInternalListener");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(oneBarContainerSelectionMode, "oneBarContainerSelectionMode");
        this.f136086h = oneBarInternalListener;
        this.f136087i = presenterPinalytics;
        this.f136088j = eventManager;
        this.f136089k = oneBarContainerSelectionMode;
    }

    @Override // xv1.l
    public final void r3(boolean z13) {
        k00 q13;
        Object obj;
        Map u13;
        g00 g00Var = this.f136082d;
        if (g00Var == null || (q13 = g00Var.q()) == null) {
            return;
        }
        g00 g00Var2 = this.f136082d;
        Object obj2 = (g00Var2 == null || (u13 = g00Var2.u()) == null) ? null : u13.get("module_id");
        uk1.d dVar = this.f136087i;
        d0 d0Var = dVar.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        f1 f1Var = f1.TAP;
        g0 g0Var = g0.ONEBAR_DRAWER;
        HashMap hashMap = this.f136081c;
        HashMap n13 = bs1.c.n(hashMap);
        n13.put("is_onebar_module_auto_clicked", String.valueOf(z13));
        Unit unit = Unit.f80348a;
        d0.B(d0Var, f1Var, g0Var, null, n13, 20);
        if (obj2 != null) {
            d0 d0Var2 = dVar.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
            f1 f1Var2 = f1.ONE_BAR_MODULE_CLICK;
            HashMap n14 = bs1.c.n(hashMap);
            n14.put("is_onebar_module_auto_clicked", String.valueOf(z13));
            v0 v0Var = new v0();
            g00 g00Var3 = this.f136082d;
            v0Var.G = g00Var3 != null ? g00Var3.x() : null;
            d0Var2.h0((r18 & 1) != 0 ? f1.TAP : f1Var2, (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : n14, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
        List p13 = q13.p();
        if (p13 != null) {
            NavigationImpl L = Navigation.L((ScreenLocation) t2.f51394c.getValue(), g00Var.getUid(), ml1.b.NO_TRANSITION.getValue());
            String z14 = q13.z();
            if (z14 == null) {
                z14 = "";
            }
            String str = z14;
            Function0 function0 = this.f136084f;
            Iterator it = p13.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                g00 g00Var4 = (g00) obj;
                Intrinsics.f(g00Var4);
                if (pe.i.Q0(g00Var4)) {
                    break;
                }
            }
            g00 g00Var5 = (g00) obj;
            L.e(new vv1.m(str, g00Var, p13, this.f136086h, function0, this.f136089k, g00Var5 != null ? g00Var5.getUid() : null));
            this.f136088j.d(L);
        }
    }
}
