package e61;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.s;
import h90.m;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import nr0.j;
import nx.d0;
import wt1.e0;
import x81.n0;

/* loaded from: classes5.dex */
public final class a extends e0 implements j {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f57518h = 1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f57519i;

    public a(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f57519i = true;
        o(59, new c11.a(pinalytics, 10, 0));
        o(60, new c11.a(pinalytics, 11, 0));
    }

    @Override // wt1.e0, vq0.f
    public final void J1() {
        switch (this.f57518h) {
            case 1:
                break;
            default:
                super.J1();
                break;
        }
    }

    @Override // nr0.g
    public final boolean c3(int i13) {
        return true;
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        return true;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        switch (this.f57518h) {
            case 0:
                return RecyclerViewTypes.VIEW_TRY_ON_FEED_PRODUCT_CARD;
            default:
                s sVar = (s) getItem(i13);
                if (sVar instanceof k61.a) {
                    return 59;
                }
                return sVar instanceof k61.j ? 60 : -2;
        }
    }

    @Override // wt1.b
    public final boolean i() {
        switch (this.f57518h) {
        }
        return this.f57519i;
    }

    @Override // wt1.e0, wt1.b
    public final void n() {
        switch (this.f57518h) {
            case 1:
                super.n();
                this.f57519i = false;
                break;
            default:
                super.n();
                break;
        }
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return true;
    }

    @Override // wt1.e0, vq0.f
    public final boolean t0() {
        switch (this.f57518h) {
            case 1:
                return false;
            default:
                return super.t0();
        }
    }

    public final boolean u() {
        Iterator it = d().iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (((s) it.next()) instanceof k61.j) {
                return i13 > -1;
            }
            i13++;
        }
        return false;
    }

    public a(n0 productCardRequestListener) {
        Intrinsics.checkNotNullParameter(productCardRequestListener, "productCardRequestListener");
        o(RecyclerViewTypes.VIEW_TRY_ON_FEED_PRODUCT_CARD, new m(productCardRequestListener, 17));
    }
}
