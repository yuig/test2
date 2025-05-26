package kx0;

import android.util.Pair;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.i1;
import androidx.recyclerview.widget.j0;
import com.pinterest.feature.search.results.view.SearchGridMultiSectionFragment;
import j51.d0;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;
import o82.q2;

/* loaded from: classes5.dex */
public final class c extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f81059c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f81060d;

    public c(b3 adapter) {
        this.f81059c = 3;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f81060d = adapter;
    }

    @Override // androidx.recyclerview.widget.j0
    public final int c(int i13) {
        boolean z13 = false;
        int i14 = this.f81059c;
        Object obj = this.f81060d;
        switch (i14) {
            case 0:
                hx0.e eVar = ((o) obj).f81077b1;
                if (eVar == null) {
                    return 1;
                }
                sq0.o r13 = eVar.getDataSourceRegistry().r(i13);
                if (r13 != null) {
                    wk1.e eVar2 = (wk1.e) r13.f115027a;
                    nr0.j jVar = eVar2 instanceof nr0.j ? (nr0.j) eVar2 : null;
                    r3 = jVar != null ? Boolean.valueOf(jVar.n0(r13.f115028b)) : null;
                    if (r3 != null && !r3.booleanValue()) {
                        return 1;
                    }
                }
                return hf0.b.f69004d;
            case 1:
                try {
                    int i15 = ny0.v.T0;
                    q2 q2Var = (q2) ((ny0.v) obj).f139732f0;
                    if (q2Var == null) {
                        return 2;
                    }
                    android.support.v4.media.a aVar = (android.support.v4.media.a) q2Var.f93701i.f19473e;
                    androidx.appcompat.widget.a g13 = aVar.g(i13);
                    Pair pair = new Pair(((i1) g13.f16504c).f19449c, Integer.valueOf(g13.f16502a));
                    g13.f16503b = false;
                    g13.f16504c = null;
                    g13.f16502a = -1;
                    aVar.f15842f = g13;
                    b2 b2Var = (b2) pair.first;
                    Integer num = (Integer) pair.second;
                    Intrinsics.f(num);
                    return b2Var.g(num.intValue()) == 539205 ? 1 : 2;
                } catch (IllegalArgumentException unused) {
                    return 2;
                }
            case 2:
                c51.e eVar3 = ((d0) obj).f74721a1;
                if (eVar3 != null) {
                    sq0.o r14 = ((g51.n) eVar3).getDataSourceRegistry().r(i13);
                    if (r14 != null) {
                        wk1.e eVar4 = (wk1.e) r14.f115027a;
                        nr0.j jVar2 = eVar4 instanceof nr0.j ? (nr0.j) eVar4 : null;
                        r3 = jVar2 != null ? Boolean.valueOf(jVar2.n0(r14.f115028b)) : null;
                        if (r3 != null) {
                            z13 = r3.booleanValue();
                        }
                    }
                    r3 = Boolean.valueOf(z13);
                }
                if (Intrinsics.d(r3, Boolean.TRUE)) {
                    return hf0.b.f69004d;
                }
                return 1;
            case 3:
                int itemViewType = ((b3) obj).f93541f.getItemViewType(i13);
                return (itemViewType == a61.c.VIEW_TYPE_UNIFIED_COMPONENT_BUNDLED.getType() || itemViewType == a61.c.VIEW_TYPE_STRUCTURED_FEED_GRID_SECTION_VIEW.getType()) ? 1 : 2;
            default:
                h61.j jVar3 = ((SearchGridMultiSectionFragment) obj).U1;
                if (Intrinsics.d(jVar3 != null ? Boolean.valueOf(jVar3.Y1(i13)) : null, Boolean.TRUE)) {
                    return hf0.b.f69004d;
                }
                return 1;
        }
    }

    public /* synthetic */ c(yq0.t tVar, int i13) {
        this.f81059c = i13;
        this.f81060d = tVar;
    }
}
