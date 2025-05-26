package w61;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.a4;
import h32.d4;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import lh0.g1;
import lh0.i3;
import lh0.z3;
import m60.w;
import nx.d0;
import u61.c;
import x61.j;
import yk1.b;
import yk1.n;
import yk1.v;

/* loaded from: classes5.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final u61.b f128120a;

    /* renamed from: b, reason: collision with root package name */
    public final List f128121b;

    /* renamed from: c, reason: collision with root package name */
    public final v f128122c;

    /* renamed from: d, reason: collision with root package name */
    public final w f128123d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f128124e;

    /* renamed from: f, reason: collision with root package name */
    public final a4 f128125f;

    /* renamed from: g, reason: collision with root package name */
    public final d0 f128126g;

    /* renamed from: h, reason: collision with root package name */
    public final d4 f128127h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f128128i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(u61.b parentListener, List hairPatternFilterList, v resources, w wVar, Integer num, a4 a4Var, d0 pinalytics, d4 viewType, i3 i3Var, int i13) {
        super(0);
        wVar = (i13 & 8) != 0 ? null : wVar;
        viewType = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? d4.SEARCH : viewType;
        i3Var = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : i3Var;
        Intrinsics.checkNotNullParameter(parentListener, "parentListener");
        Intrinsics.checkNotNullParameter(hairPatternFilterList, "hairPatternFilterList");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        boolean z13 = false;
        this.f128120a = parentListener;
        this.f128121b = hairPatternFilterList;
        this.f128122c = resources;
        this.f128123d = wVar;
        this.f128124e = num;
        this.f128125f = a4Var;
        this.f128126g = pinalytics;
        this.f128127h = viewType;
        if (i3Var != null) {
            z3 z3Var = lh0.a4.f83297a;
            g1 g1Var = (g1) i3Var.f83389a;
            if (g1Var.o("android_search_unify_tap_back_behavior", "enabled", z3Var) || g1Var.l("android_search_unify_tap_back_behavior")) {
                z13 = true;
            }
        }
        this.f128128i = z13;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        c view = (c) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        List list = this.f128121b;
        List list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        int i13 = 0;
        for (Object obj : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            v61.a aVar = (v61.a) obj;
            Integer num = this.f128124e;
            u61.a aVar2 = new u61.a(aVar, i13, num != null && num.intValue() == i13, list.size());
            ((j) view).a(aVar2);
            arrayList.add(aVar2);
            i13 = i14;
        }
        ((j) view).f133954i = arrayList;
    }
}
