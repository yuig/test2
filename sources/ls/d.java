package ls;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.t60;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.s;
import i92.k;
import kk2.m;
import kotlin.jvm.internal.Intrinsics;
import lh0.e;
import rr.n0;
import rr0.g;
import rr0.h;
import sq0.e0;
import x02.i2;
import yk1.i;
import yq0.t;

/* loaded from: classes3.dex */
public final class d extends g {
    public final z02.a A;
    public final e B;
    public final k C;
    public final js.a D;
    public final float E;
    public final float F;
    public final float G;
    public final float H;
    public f30 I;

    /* renamed from: x, reason: collision with root package name */
    public final i2 f84613x;

    /* renamed from: y, reason: collision with root package name */
    public final String f84614y;

    /* renamed from: z, reason: collision with root package name */
    public final String f84615z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h parameters, i2 pinRepository, String str, String overrideParams, z02.a adPreviewService, e experiments, k toastUtils, js.a adPreviewUtils) {
        super(parameters);
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(overrideParams, "overrideParams");
        Intrinsics.checkNotNullParameter(adPreviewService, "adPreviewService");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(adPreviewUtils, "adPreviewUtils");
        this.f84613x = pinRepository;
        this.f84614y = str;
        this.f84615z = overrideParams;
        this.A = adPreviewService;
        this.B = experiments;
        this.C = toastUtils;
        this.D = adPreviewUtils;
        this.E = 2.0f;
        this.F = 1.5f;
        this.G = 1.0f;
        this.H = 0.001f;
        this.f109902n = new np0.e(c0.d.O(pinRepository));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER, new ep.c(16));
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER, new ep.c(17));
    }

    @Override // rr0.g
    public final boolean T3(qr0.d dVar) {
        qr0.e feed = (qr0.e) dVar;
        Intrinsics.checkNotNullParameter(feed, "feed");
        return false;
    }

    @Override // rr0.g, sq0.e0
    public final int getItemViewType(int i13) {
        if (!(getItem(i13) instanceof t60)) {
            return D3().getItemViewType(i13);
        }
        s item = getItem(i13);
        Intrinsics.g(item, "null cannot be cast to non-null type com.pinterest.api.model.PlaceholderGridItem");
        return ((t60) item).f42109b ? RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER : RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER;
    }

    @Override // rr0.g, vq0.g
    public final void loadData() {
        super.loadData();
        ((t) ((ks.a) getView())).setLoadState(i.LOADING);
        String str = this.f84614y;
        if (str != null) {
            xj2.c o13 = new m(this.f84613x.Q(str).s(), new ep.a(10, new c(this, 0)), 0).l(wj2.c.a()).o(new n0(12, new c(this, 1)), new n0(13, new c(this, 2)));
            Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
            addDisposable(o13);
        }
    }

    @Override // rr0.g, vq0.g, sq0.w
    public final void loadMoreData() {
    }

    @Override // vq0.g
    public final e0 p3() {
        return this;
    }
}
