package tv1;

import android.content.Context;
import bm1.m;
import c71.b0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import df.j1;
import h32.f1;
import h32.g0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import u50.f0;
import yk1.n;
import yq1.u1;

/* loaded from: classes4.dex */
public final class c extends yk1.b implements vv1.h {

    /* renamed from: a, reason: collision with root package name */
    public final rv1.a f119550a;

    /* renamed from: b, reason: collision with root package name */
    public final uk1.d f119551b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f119552c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f119553d;

    /* renamed from: e, reason: collision with root package name */
    public j61.a f119554e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rv1.a listener, uk1.d presenterPinalytics, b0 b0Var) {
        super(0);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f119550a = listener;
        this.f119551b = presenterPinalytics;
        this.f119552c = b0Var;
        this.f119553d = new HashMap();
    }

    @Override // vv1.h
    public final void R1(boolean z13) {
        String str;
        String str2;
        b0 b0Var = this.f119552c;
        if (b0Var != null) {
            str = b0Var.f26731c;
            if (!j1.U0(str)) {
                str = b0Var.S;
            }
        } else {
            str = null;
        }
        j61.a aVar = this.f119554e;
        if (aVar != null) {
            HashMap hashMap = this.f119553d;
            if (b0Var != null && (str2 = b0Var.f26730b) != null) {
                if (str == null) {
                    str = str2;
                }
                hashMap.put("entered_query", str);
                String str3 = b0Var.S;
                if (str3 != null) {
                    str2 = str3;
                }
                hashMap.put("pinner_displayed_query", str2);
            }
            d0 d0Var = this.f119551b.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            d0.B(d0Var, z13 ? f1.SELECT : f1.UNSELECT, g0.ONEBAR_DRAWER, null, hashMap, 20);
            rv1.a aVar2 = this.f119550a;
            String filterApiTerm = aVar.f74826c;
            if (!z13) {
                aVar2.v(filterApiTerm);
                return;
            }
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(filterApiTerm, "filterApiTerm");
            b0 u13 = aVar2.u(filterApiTerm);
            aVar2.f110103j.e(300L, u13 != null ? b0.c(u13, false, 3) : null);
            aVar2.f110104k.t3();
        }
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        vv1.d view = (vv1.d) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        uv1.e eVar = (uv1.e) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        eVar.f123193a = this;
        j61.a colorPaletteFilter = this.f119554e;
        if (colorPaletteFilter != null) {
            Intrinsics.checkNotNullParameter(colorPaletteFilter, "colorPaletteFilter");
            bm1.n nVar2 = colorPaletteFilter.f74828e ? bm1.n.SELECTED : bm1.n.UNSELECTED;
            String str = colorPaletteFilter.f74824a;
            Context context = eVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            GestaltButtonToggle gestaltButtonToggle = new GestaltButtonToggle(context, new m(null, nVar2, new bm1.b(new f0(str)), false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL));
            kh2.j.r(gestaltButtonToggle, new u1(eVar, 17));
            gestaltButtonToggle.s(uv1.d.f123192i);
            eVar.addView(gestaltButtonToggle);
        }
    }
}
