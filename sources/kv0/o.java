package kv0;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import jk2.j1;
import kotlin.jvm.internal.Intrinsics;
import nx.b0;
import nx.d0;
import x02.i2;

/* loaded from: classes5.dex */
public final class o extends xk1.c implements nr0.j {

    /* renamed from: k, reason: collision with root package name */
    public final String f80991k;

    /* renamed from: l, reason: collision with root package name */
    public final i2 f80992l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f80993m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(d0 pinalytics, String pinId, i2 pinRepository, yk1.v viewResources, ku1.k screenNavigator, cg1.a productTaggingListener, b60.b activeUserManager, b0 pinAuxHelper) {
        super(null);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        Intrinsics.checkNotNullParameter(productTaggingListener, "productTaggingListener");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f80991k = pinId;
        this.f80992l = pinRepository;
        this.f80993m = true;
        o(RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL, new dg1.c(pinalytics, viewResources, screenNavigator, activeUserManager, null, null, productTaggingListener, pinAuxHelper, 1008));
        o(RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER, new pk0.b(19));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return getItem(i13) instanceof f30 ? RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL : RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER;
    }

    @Override // wt1.b
    public final boolean i() {
        return this.f80993m;
    }

    @Override // xk1.c
    public final uj2.q k() {
        j1 j1Var = new j1(this.f80992l.P(this.f80991k), new bv0.k(25, a.f80936w), 0);
        Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
        return j1Var;
    }
}
