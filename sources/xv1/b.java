package xv1;

import com.pinterest.api.model.g00;
import com.pinterest.api.model.k00;
import com.pinterest.api.model.o00;
import com.pinterest.api.model.px0;
import com.pinterest.api.model.tx0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import de1.h0;
import de1.q0;
import de1.r0;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;

/* loaded from: classes4.dex */
public final class b extends l {

    /* renamed from: h, reason: collision with root package name */
    public final uk1.d f136024h;

    /* renamed from: i, reason: collision with root package name */
    public final w f136025i;

    /* renamed from: j, reason: collision with root package name */
    public final r0 f136026j;

    /* renamed from: k, reason: collision with root package name */
    public de1.d f136027k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(uk1.d presenterPinalytics, w eventManager, boolean z13, r0 unifiedProductFilterHostScreenType) {
        super(presenterPinalytics, z13);
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(unifiedProductFilterHostScreenType, "unifiedProductFilterHostScreenType");
        this.f136024h = presenterPinalytics;
        this.f136025i = eventManager;
        this.f136026j = unifiedProductFilterHostScreenType;
    }

    public static HashMap w3(g00 g00Var, ge1.d dVar) {
        Boolean v13;
        List m13;
        k00 q13 = g00Var.q();
        Boolean bool = null;
        px0 r13 = q13 != null ? q13.r() : null;
        HashMap hashMap = new HashMap();
        tx0 tx0Var = (r13 == null || (m13 = r13.m()) == null) ? null : (tx0) CollectionsKt.firstOrNull(m13);
        if (tx0Var != null) {
            hashMap.put("price_drop_sale", String.valueOf(tx0Var.q().doubleValue()));
            Map u13 = g00Var.u();
            hashMap.put("module_id", String.valueOf(u13 != null ? u13.get("module_id") : null));
            if (dVar == ge1.d.ON_SALE_FILTER_TAPPED) {
                o00 v14 = g00Var.v();
                if (v14 != null && (v13 = v14.v()) != null) {
                    bool = Boolean.valueOf(!v13.booleanValue());
                }
                hashMap.put("is_selecting", String.valueOf(bool));
            }
        }
        return hashMap;
    }

    @Override // xv1.l
    public final void p3(g00 module) {
        k00 q13;
        px0 r13;
        HashMap<String, String> auxData;
        Intrinsics.checkNotNullParameter(module, "model");
        Integer w13 = module.w();
        q42.f fVar = q42.f.SHOP_FILTER;
        int value = fVar.getValue();
        int intValue = w13.intValue();
        uk1.d dVar = this.f136024h;
        if (intValue != value) {
            d0 d0Var = dVar.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.RENDER, (r18 & 2) != 0 ? null : u0.FILTER_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            return;
        }
        k00 q14 = module.q();
        u0 u0Var = null;
        px0 r14 = q14 != null ? q14.r() : null;
        Integer o13 = r14 != null ? r14.o() : null;
        int value2 = t32.f.PRODUCT_ON_SALE.getValue();
        if (o13 != null && o13.intValue() == value2) {
            d0 pinalytics = dVar.f122379a;
            Intrinsics.checkNotNullExpressionValue(pinalytics, "getPinalytics(...)");
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            ge1.d event = ge1.d.ON_SALE_FILTER_VIEWED;
            if (event != null && dVar.f122379a != null && (auxData = event.getAuxData()) != null) {
                auxData.putAll(w3(module, event));
            }
            Intrinsics.checkNotNullParameter(event, "event");
            pinalytics.h0((r18 & 1) != 0 ? f1.TAP : event.getEventType(), (r18 & 2) != 0 ? null : event.getElementType(), (r18 & 4) != 0 ? null : event.getComponentType(), (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : event.getAuxData(), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            return;
        }
        d0 d0Var2 = dVar.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
        f1 f1Var = f1.VIEW;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (ph.a.y0(fVar) && (q13 = module.q()) != null && (r13 = q13.r()) != null) {
            Integer o14 = r13.o();
            t32.d dVar2 = t32.f.Companion;
            int intValue2 = o14.intValue();
            dVar2.getClass();
            t32.f a13 = t32.d.a(intValue2);
            int i13 = a13 == null ? -1 : q0.f54637c[a13.ordinal()];
            if (i13 == 2) {
                u0Var = u0.SHOPPING_PRICE_FILTER;
            } else if (i13 == 3) {
                u0Var = u0.SHOPPING_MERCHANT_FILTER;
            } else if (i13 == 4) {
                u0Var = u0.SHOPPING_BRAND_FILTER;
            }
        }
        d0Var2.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0.ONEBAR_MODULE, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    @Override // xv1.l, yk1.b
    /* renamed from: q3 */
    public final void r3(vv1.i view) {
        g00 g00Var;
        Boolean bool;
        px0 r13;
        px0 r14;
        List m13;
        tx0 tx0Var;
        px0 r15;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        if (a.f136022a[this.f136026j.ordinal()] != 1 || (g00Var = this.f136082d) == null) {
            return;
        }
        q42.d dVar = q42.f.Companion;
        Integer w13 = g00Var.w();
        Intrinsics.checkNotNullExpressionValue(w13, "getModuleType(...)");
        int intValue = w13.intValue();
        dVar.getClass();
        q42.f a13 = q42.d.a(intValue);
        if (a13 == null || !ph.a.y0(a13)) {
            return;
        }
        o00 v13 = g00Var.v();
        if (v13 == null || (bool = v13.v()) == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        Map u13 = g00Var.u();
        Object obj = u13 != null ? u13.get("module_id") : null;
        String str = obj instanceof String ? (String) obj : null;
        k00 q13 = g00Var.q();
        if (q13 == null || (r13 = q13.r()) == null) {
            return;
        }
        k00 q14 = g00Var.q();
        String p13 = (q14 == null || (r15 = q14.r()) == null) ? null : r15.p();
        k00 q15 = g00Var.q();
        String v14 = (q15 == null || (r14 = q15.r()) == null || (m13 = r14.m()) == null || (tx0Var = (tx0) CollectionsKt.firstOrNull(m13)) == null) ? null : tx0Var.v();
        if (p13 == null) {
            p13 = "";
        }
        h0 h0Var = new h0(r13, p13, v14, booleanValue, str, 92);
        de1.d dVar2 = this.f136027k;
        if (dVar2 != null) {
            dVar2.w0(a13, h0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // xv1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r3(boolean r47) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xv1.b.r3(boolean):void");
    }
}
