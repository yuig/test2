package mu;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f88177a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f88178b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f88179c;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f88180d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f88181e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f88182f;

    /* renamed from: g, reason: collision with root package name */
    public final z f88183g;

    /* renamed from: h, reason: collision with root package name */
    public final zy.a0 f88184h;

    public a(int i13, s0 scrollingModuleAction, u0 toolbarDisplayState, t0 scrollingModuleDisplayState, a0 bottomSheetDisplayState, e0 modalAction, z backPressAction, zy.a0 pinalyticsDisplayState) {
        Intrinsics.checkNotNullParameter(scrollingModuleAction, "scrollingModuleAction");
        Intrinsics.checkNotNullParameter(toolbarDisplayState, "toolbarDisplayState");
        Intrinsics.checkNotNullParameter(scrollingModuleDisplayState, "scrollingModuleDisplayState");
        Intrinsics.checkNotNullParameter(bottomSheetDisplayState, "bottomSheetDisplayState");
        Intrinsics.checkNotNullParameter(modalAction, "modalAction");
        Intrinsics.checkNotNullParameter(backPressAction, "backPressAction");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        this.f88177a = i13;
        this.f88178b = scrollingModuleAction;
        this.f88179c = toolbarDisplayState;
        this.f88180d = scrollingModuleDisplayState;
        this.f88181e = bottomSheetDisplayState;
        this.f88182f = modalAction;
        this.f88183g = backPressAction;
        this.f88184h = pinalyticsDisplayState;
    }

    public static a e(a aVar, int i13, s0 s0Var, u0 u0Var, t0 t0Var, a0 a0Var, e0 e0Var, z zVar, zy.a0 a0Var2, int i14) {
        int i15 = (i14 & 1) != 0 ? aVar.f88177a : i13;
        s0 scrollingModuleAction = (i14 & 2) != 0 ? aVar.f88178b : s0Var;
        u0 toolbarDisplayState = (i14 & 4) != 0 ? aVar.f88179c : u0Var;
        t0 scrollingModuleDisplayState = (i14 & 8) != 0 ? aVar.f88180d : t0Var;
        a0 bottomSheetDisplayState = (i14 & 16) != 0 ? aVar.f88181e : a0Var;
        e0 modalAction = (i14 & 32) != 0 ? aVar.f88182f : e0Var;
        z backPressAction = (i14 & 64) != 0 ? aVar.f88183g : zVar;
        zy.a0 pinalyticsDisplayState = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? aVar.f88184h : a0Var2;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(scrollingModuleAction, "scrollingModuleAction");
        Intrinsics.checkNotNullParameter(toolbarDisplayState, "toolbarDisplayState");
        Intrinsics.checkNotNullParameter(scrollingModuleDisplayState, "scrollingModuleDisplayState");
        Intrinsics.checkNotNullParameter(bottomSheetDisplayState, "bottomSheetDisplayState");
        Intrinsics.checkNotNullParameter(modalAction, "modalAction");
        Intrinsics.checkNotNullParameter(backPressAction, "backPressAction");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        return new a(i15, scrollingModuleAction, toolbarDisplayState, scrollingModuleDisplayState, bottomSheetDisplayState, modalAction, backPressAction, pinalyticsDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f88177a == aVar.f88177a && Intrinsics.d(this.f88178b, aVar.f88178b) && Intrinsics.d(this.f88179c, aVar.f88179c) && Intrinsics.d(this.f88180d, aVar.f88180d) && Intrinsics.d(this.f88181e, aVar.f88181e) && Intrinsics.d(this.f88182f, aVar.f88182f) && this.f88183g == aVar.f88183g && Intrinsics.d(this.f88184h, aVar.f88184h);
    }

    public final int hashCode() {
        return this.f88184h.hashCode() + ((this.f88183g.hashCode() + ((this.f88182f.hashCode() + ((this.f88181e.hashCode() + ep.b.b(this.f88180d.f88243a, ep.b.e(this.f88179c.f88245a, (this.f88178b.hashCode() + (Integer.hashCode(this.f88177a) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AdsBaseDisplayState(carouselIndex=" + this.f88177a + ", scrollingModuleAction=" + this.f88178b + ", toolbarDisplayState=" + this.f88179c + ", scrollingModuleDisplayState=" + this.f88180d + ", bottomSheetDisplayState=" + this.f88181e + ", modalAction=" + this.f88182f + ", backPressAction=" + this.f88183g + ", pinalyticsDisplayState=" + this.f88184h + ")";
    }

    public /* synthetic */ a(zy.a0 a0Var, int i13) {
        this(0, c0.f88194b, new u0(false), new t0(0), new a0(null, null, false, true), c0.f88193a, z.None, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? new zy.a0() : a0Var);
    }
}
