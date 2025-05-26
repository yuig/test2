package y81;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.s;
import h90.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import sq0.e0;
import uj2.q;
import x81.n;
import x81.u;

/* loaded from: classes5.dex */
public final class i extends vq0.b implements d, fb2.d, b {

    /* renamed from: c, reason: collision with root package name */
    public final List f138045c;

    /* renamed from: d, reason: collision with root package name */
    public final int f138046d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f138047e;

    /* renamed from: f, reason: collision with root package name */
    public final u f138048f;

    /* renamed from: g, reason: collision with root package name */
    public final x81.l f138049g;

    /* renamed from: h, reason: collision with root package name */
    public f42.c f138050h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f138051i;

    /* renamed from: j, reason: collision with root package name */
    public List f138052j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List list, int i13, Integer num, u uVar, x81.l lVar, f42.c makeupCategory, n presenterPinalytics, q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(makeupCategory, "makeupCategory");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f138045c = list;
        this.f138046d = i13;
        this.f138047e = num;
        this.f138048f = uVar;
        this.f138049g = lVar;
        this.f138050h = makeupCategory;
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM, new k(this));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_CLEAR, new m(this, 19));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING, new sz0.a(22));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vq0.g
    /* renamed from: D3, reason: merged with bridge method [inline-methods] */
    public final void r3(e view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((h) view).f138044h = this;
        fb2.b bVar = (fb2.b) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        bVar.f61617e = this;
        List list = this.f138045c;
        if (list != null) {
            int i13 = 0;
            bVar.getPinterestRecyclerView().f52531a.suppressLayout(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(0, new a());
            arrayList.addAll(1, list);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                Integer num = this.f138047e;
                if (num != null && num.intValue() < size && num.intValue() != 0) {
                    i13 = num.intValue();
                } else if (size > 1) {
                    i13 = 1;
                }
                G3(i13, arrayList);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F3(int r13) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y81.i.F3(int):void");
    }

    public final void G3(int i13, ArrayList arrayList) {
        x3(arrayList);
        ((fb2.b) ((e) getView())).getPinterestRecyclerView().f52531a.G2(i13);
        F3(i13);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        s sVar = (s) d().get(i13);
        return sVar instanceof f30 ? RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM : sVar instanceof a ? RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_CLEAR : RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING;
    }

    @Override // vq0.g
    public final e0 p3() {
        return this;
    }
}
