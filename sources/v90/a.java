package v90;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final s90.r0 f124853a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f124854b;

    /* renamed from: c, reason: collision with root package name */
    public final s90.t0 f124855c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.a0 f124856d;

    /* renamed from: e, reason: collision with root package name */
    public final y62.g f124857e;

    /* renamed from: f, reason: collision with root package name */
    public final x62.p f124858f;

    /* renamed from: g, reason: collision with root package name */
    public final n1 f124859g;

    /* renamed from: h, reason: collision with root package name */
    public final t90.o f124860h;

    /* renamed from: i, reason: collision with root package name */
    public final x62.n f124861i;

    /* renamed from: j, reason: collision with root package name */
    public final t90.q f124862j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f124863k;

    public a(s90.r0 cutoutSearchStatusBarState, boolean z13, s90.t0 cutoutToolbarState, zy.a0 pinalyticsState, y62.g selectMaskModel, x62.p refineMaskModel, n1 currentEditorMode, t90.o bottomActionBarState, x62.n currentRefineMode, t90.q refineActionPanelState, boolean z14) {
        Intrinsics.checkNotNullParameter(cutoutSearchStatusBarState, "cutoutSearchStatusBarState");
        Intrinsics.checkNotNullParameter(cutoutToolbarState, "cutoutToolbarState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(selectMaskModel, "selectMaskModel");
        Intrinsics.checkNotNullParameter(refineMaskModel, "refineMaskModel");
        Intrinsics.checkNotNullParameter(currentEditorMode, "currentEditorMode");
        Intrinsics.checkNotNullParameter(bottomActionBarState, "bottomActionBarState");
        Intrinsics.checkNotNullParameter(currentRefineMode, "currentRefineMode");
        Intrinsics.checkNotNullParameter(refineActionPanelState, "refineActionPanelState");
        this.f124853a = cutoutSearchStatusBarState;
        this.f124854b = z13;
        this.f124855c = cutoutToolbarState;
        this.f124856d = pinalyticsState;
        this.f124857e = selectMaskModel;
        this.f124858f = refineMaskModel;
        this.f124859g = currentEditorMode;
        this.f124860h = bottomActionBarState;
        this.f124861i = currentRefineMode;
        this.f124862j = refineActionPanelState;
        this.f124863k = z14;
    }

    public static a e(a aVar, s90.r0 r0Var, boolean z13, s90.t0 t0Var, zy.a0 a0Var, y62.g gVar, x62.p pVar, n1 n1Var, t90.o oVar, x62.n nVar, boolean z14, int i13) {
        s90.r0 cutoutSearchStatusBarState = (i13 & 1) != 0 ? aVar.f124853a : r0Var;
        boolean z15 = (i13 & 2) != 0 ? aVar.f124854b : z13;
        s90.t0 cutoutToolbarState = (i13 & 4) != 0 ? aVar.f124855c : t0Var;
        zy.a0 pinalyticsState = (i13 & 8) != 0 ? aVar.f124856d : a0Var;
        y62.g selectMaskModel = (i13 & 16) != 0 ? aVar.f124857e : gVar;
        x62.p refineMaskModel = (i13 & 32) != 0 ? aVar.f124858f : pVar;
        n1 currentEditorMode = (i13 & 64) != 0 ? aVar.f124859g : n1Var;
        t90.o bottomActionBarState = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? aVar.f124860h : oVar;
        x62.n currentRefineMode = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? aVar.f124861i : nVar;
        t90.q refineActionPanelState = aVar.f124862j;
        boolean z16 = (i13 & 1024) != 0 ? aVar.f124863k : z14;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(cutoutSearchStatusBarState, "cutoutSearchStatusBarState");
        Intrinsics.checkNotNullParameter(cutoutToolbarState, "cutoutToolbarState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(selectMaskModel, "selectMaskModel");
        Intrinsics.checkNotNullParameter(refineMaskModel, "refineMaskModel");
        Intrinsics.checkNotNullParameter(currentEditorMode, "currentEditorMode");
        Intrinsics.checkNotNullParameter(bottomActionBarState, "bottomActionBarState");
        Intrinsics.checkNotNullParameter(currentRefineMode, "currentRefineMode");
        Intrinsics.checkNotNullParameter(refineActionPanelState, "refineActionPanelState");
        return new a(cutoutSearchStatusBarState, z15, cutoutToolbarState, pinalyticsState, selectMaskModel, refineMaskModel, currentEditorMode, bottomActionBarState, currentRefineMode, refineActionPanelState, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f124853a, aVar.f124853a) && this.f124854b == aVar.f124854b && Intrinsics.d(this.f124855c, aVar.f124855c) && Intrinsics.d(this.f124856d, aVar.f124856d) && Intrinsics.d(this.f124857e, aVar.f124857e) && Intrinsics.d(this.f124858f, aVar.f124858f) && this.f124859g == aVar.f124859g && Intrinsics.d(this.f124860h, aVar.f124860h) && this.f124861i == aVar.f124861i && Intrinsics.d(this.f124862j, aVar.f124862j) && this.f124863k == aVar.f124863k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124863k) + ((this.f124862j.hashCode() + ((this.f124861i.hashCode() + ep.b.c(this.f124860h.f116816a, (this.f124859g.hashCode() + ((this.f124858f.hashCode() + ((this.f124857e.hashCode() + ((this.f124856d.hashCode() + ((this.f124855c.hashCode() + ep.b.e(this.f124854b, this.f124853a.hashCode() * 31, 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CollageCutoutDisplayStateV2(cutoutSearchStatusBarState=");
        sb3.append(this.f124853a);
        sb3.append(", isSavingCutout=");
        sb3.append(this.f124854b);
        sb3.append(", cutoutToolbarState=");
        sb3.append(this.f124855c);
        sb3.append(", pinalyticsState=");
        sb3.append(this.f124856d);
        sb3.append(", selectMaskModel=");
        sb3.append(this.f124857e);
        sb3.append(", refineMaskModel=");
        sb3.append(this.f124858f);
        sb3.append(", currentEditorMode=");
        sb3.append(this.f124859g);
        sb3.append(", bottomActionBarState=");
        sb3.append(this.f124860h);
        sb3.append(", currentRefineMode=");
        sb3.append(this.f124861i);
        sb3.append(", refineActionPanelState=");
        sb3.append(this.f124862j);
        sb3.append(", selectMaskShimmerVisible=");
        return a.a.r(sb3, this.f124863k, ")");
    }
}
