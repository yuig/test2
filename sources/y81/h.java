package y81;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.snappablecarousel.SnappableCarouselLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yq0.z;

/* loaded from: classes5.dex */
public final class h extends fb2.b implements e {

    /* renamed from: g, reason: collision with root package name */
    public final int f138043g;

    /* renamed from: h, reason: collision with root package name */
    public d f138044h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, int i13, int i14, int i15) {
        super(context, i13, i15);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f138043g = i15;
        getPinterestRecyclerView().f52531a.setOverScrollMode(2);
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager();
        Intrinsics.g(linearLayoutManager, "null cannot be cast to non-null type com.pinterest.ui.snappablecarousel.SnappableCarouselLayoutManager");
        SnappableCarouselLayoutManager snappableCarouselLayoutManager = (SnappableCarouselLayoutManager) linearLayoutManager;
        snappableCarouselLayoutManager.f52642J = false;
        snappableCarouselLayoutManager.L = i14 / i13;
        snappableCarouselLayoutManager.K = 0.9f;
    }

    public final void b(List products, Integer num, List list) {
        Intrinsics.checkNotNullParameter(products, "items");
        d dVar = this.f138044h;
        if (dVar != null) {
            i iVar = (i) dVar;
            Intrinsics.checkNotNullParameter(products, "products");
            if (iVar.isBound()) {
                int i13 = 0;
                ((fb2.b) ((e) iVar.getView())).getPinterestRecyclerView().f52531a.suppressLayout(false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(0, new a());
                List list2 = products;
                if (!list2.isEmpty()) {
                    arrayList.addAll(1, list2);
                }
                iVar.f138052j = list;
                int size = arrayList.size();
                if (num != null && num.intValue() < size && num.intValue() != 0) {
                    i13 = num.intValue();
                } else if (size > 1) {
                    i13 = 1;
                }
                iVar.G3(i13, arrayList);
            }
        }
    }

    public final void e() {
        d dVar = this.f138044h;
        if (dVar != null) {
            i iVar = (i) dVar;
            if (iVar.isBound()) {
                ArrayList arrayList = new ArrayList();
                float f13 = iVar.f138046d;
                int c13 = ml2.c.c(((f13 / 2.0f) + (hf0.b.f69002b / 2.0f)) / f13);
                arrayList.add(0, new a());
                for (int i13 = 0; i13 < c13; i13++) {
                    arrayList.add(new f());
                }
                iVar.G3(1, arrayList);
                ((fb2.b) ((e) iVar.getView())).getPinterestRecyclerView().f52531a.suppressLayout(true);
            }
        }
    }

    public final void g(f42.c makeupCategory) {
        Intrinsics.checkNotNullParameter(makeupCategory, "makeupCategory");
        d dVar = this.f138044h;
        if (dVar != null) {
            Intrinsics.checkNotNullParameter(makeupCategory, "makeupCategory");
            ((i) dVar).f138050h = makeupCategory;
        }
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM, new g(this, 0));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_CLEAR, new g(this, 1));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING, new g(this, 2));
    }
}
