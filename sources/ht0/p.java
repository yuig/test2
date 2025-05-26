package ht0;

import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.j0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.grid.PinterestRecyclerView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import yq0.b0;
import yq0.z;

/* loaded from: classes5.dex */
public final class p extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f70132c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PinterestGridLayoutManager f70133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f70134e;

    public /* synthetic */ p(b0 b0Var, PinterestGridLayoutManager pinterestGridLayoutManager, int i13) {
        this.f70132c = i13;
        this.f70134e = b0Var;
        this.f70133d = pinterestGridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.j0
    public final int c(int i13) {
        PinterestRecyclerView pinterestRecyclerView;
        os.f fVar;
        PinterestRecyclerView pinterestRecyclerView2;
        os.f fVar2;
        os.f fVar3;
        int i14 = this.f70132c;
        PinterestGridLayoutManager pinterestGridLayoutManager = this.f70133d;
        b0 b0Var = this.f70134e;
        switch (i14) {
            case 0:
                r rVar = (r) b0Var;
                int i15 = r.G0;
                z zVar = (z) rVar.f139732f0;
                if ((zVar != null && zVar.f139759e.getItemViewType(i13) == 2) || ((pinterestRecyclerView = rVar.f139736j0) != null && (fVar = pinterestRecyclerView.f52533c) != null && i13 != -1 && fVar.f97479e && i13 == fVar.e() - 1)) {
                    break;
                }
                break;
            case 1:
                nv0.o.f92363a.getClass();
                List list = nv0.c.f92353c;
                int i16 = qv0.g.N0;
                z zVar2 = (z) ((qv0.g) b0Var).f139732f0;
                if (CollectionsKt.L(list, zVar2 != null ? Integer.valueOf(zVar2.f139759e.getItemViewType(i13)) : null)) {
                    break;
                }
                break;
            case 2:
                g41.c cVar = (g41.c) b0Var;
                int i17 = g41.c.J0;
                PinterestRecyclerView pinterestRecyclerView3 = cVar.f139736j0;
                if ((pinterestRecyclerView3 != null && (fVar3 = pinterestRecyclerView3.f52533c) != null && i13 != -1 && fVar3.L(i13)) || ((pinterestRecyclerView2 = cVar.f139736j0) != null && (fVar2 = pinterestRecyclerView2.f52533c) != null && i13 != -1 && fVar2.f97479e && i13 == fVar2.e() - 1)) {
                    break;
                }
                break;
            case 3:
                List<Integer> list2 = RecyclerViewTypes.FULL_SPAN_ITEM_TYPES;
                int i18 = d91.j.f54083v1;
                z zVar3 = (z) ((d91.j) b0Var).f139732f0;
                if (CollectionsKt.L(list2, zVar3 != null ? Integer.valueOf(zVar3.f139759e.getItemViewType(i13)) : null)) {
                    break;
                }
                break;
            default:
                List<Integer> list3 = RecyclerViewTypes.FULL_SPAN_ITEM_TYPES;
                int i19 = jd1.d.f75508b1;
                z zVar4 = (z) ((jd1.d) b0Var).f139732f0;
                if (CollectionsKt.L(list3, zVar4 != null ? Integer.valueOf(zVar4.f139759e.getItemViewType(i13)) : null)) {
                    break;
                }
                break;
        }
        return pinterestGridLayoutManager.F;
    }
}
