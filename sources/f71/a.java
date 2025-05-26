package f71;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import d71.e;
import d71.f;
import d71.g;
import d82.c;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lh0.c4;
import lh0.g1;
import lh0.z3;
import nx.d0;
import yk1.b;
import yk1.n;
import yk1.v;

/* loaded from: classes5.dex */
public final class a extends b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final e71.b f61211a;

    /* renamed from: b, reason: collision with root package name */
    public final f f61212b;

    /* renamed from: c, reason: collision with root package name */
    public final v f61213c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f61214d;

    /* renamed from: e, reason: collision with root package name */
    public final List f61215e;

    /* renamed from: f, reason: collision with root package name */
    public final a4 f61216f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f61217g;

    /* renamed from: h, reason: collision with root package name */
    public final d4 f61218h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f61219i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e71.b swatchType, f parentListener, v resources, Integer num, List skinToneFilterList, a4 a4Var, Integer num2, d4 viewType, c4 c4Var, int i13) {
        super(0);
        skinToneFilterList = (i13 & 16) != 0 ? e71.a.f57616f : skinToneFilterList;
        num2 = (i13 & 64) != 0 ? null : num2;
        viewType = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? d4.SEARCH : viewType;
        c4Var = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : c4Var;
        Intrinsics.checkNotNullParameter(swatchType, "swatchType");
        Intrinsics.checkNotNullParameter(parentListener, "parentListener");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(skinToneFilterList, "skinToneFilterList");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        boolean z13 = false;
        this.f61211a = swatchType;
        this.f61212b = parentListener;
        this.f61213c = resources;
        this.f61214d = num;
        this.f61215e = skinToneFilterList;
        this.f61216f = a4Var;
        this.f61217g = num2;
        this.f61218h = viewType;
        if (c4Var != null) {
            z3 z3Var = lh0.a4.f83297a;
            g1 g1Var = (g1) c4Var.f83319a;
            if (g1Var.o("android_search_unify_tap_back_behavior", "enabled", z3Var) || g1Var.l("android_search_unify_tap_back_behavior")) {
                z13 = true;
            }
        }
        this.f61219i = z13;
    }

    @Override // d71.e
    public final void o1(int i13, Integer num, boolean z13) {
        Integer valueOf;
        e71.a aVar = (e71.a) this.f61215e.get(i13);
        g gVar = (g) getView();
        if (!this.f61219i) {
            ((g71.f) gVar).j();
        }
        g71.f fVar = (g71.f) gVar;
        fVar.l(((yk1.a) this.f61213c).f139224a.getString(c.content_description_search_skin_tone_unselected, aVar.getDisplay()));
        f fVar2 = this.f61212b;
        if (num != null && i13 == num.intValue()) {
            fVar2.n();
            valueOf = null;
        } else {
            if (z13) {
                fVar2.o(aVar, i13);
            }
            String apiTerm = aVar.getTerm();
            if (apiTerm != null) {
                Intrinsics.checkNotNullParameter(apiTerm, "apiTerm");
                d0 a13 = sh.f.a();
                HashMap x13 = a.a.x("story_type", "skin_tone_filters", "filter_value", apiTerm);
                i0 i0Var = new i0(this.f61218h, this.f61216f, null, g0.SKIN_TONE_FILTERS, null, null);
                f1 f1Var = f1.TAP;
                Intrinsics.f(a13);
                a13.U(i0Var, f1Var, null, null, x13, false);
            }
            valueOf = Integer.valueOf(i13);
        }
        this.f61214d = valueOf;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        g view = (g) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        List list = this.f61215e;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            e71.a aVar = (e71.a) obj;
            String display = aVar.getDisplay();
            Integer num = this.f61214d;
            arrayList.add(new d71.a(display, i13, num != null && num.intValue() == i13, this.f61217g, aVar.f57621e, aVar.getTerm()));
            i13 = i14;
        }
        g71.f fVar = (g71.f) view;
        fVar.b(this.f61211a, arrayList);
        fVar.f63904i = arrayList;
    }

    @Override // d71.e
    public final void v0() {
        this.f61212b.n();
    }
}
