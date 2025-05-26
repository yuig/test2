package f90;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.pi0;
import com.pinterest.collage.cutoutcloseup.view.CutoutCarouselView;
import i1.f1;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import m60.s0;
import nr0.e;
import nr0.l;
import nr0.m;
import qz.f0;
import so.n6;
import sv.y;
import t80.r;
import u60.g;
import uk1.d;
import wk1.c;
import wk1.i;
import wk1.n;
import x02.i2;

/* loaded from: classes5.dex */
public final class b extends n implements ca2.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f61439a;

    /* renamed from: b, reason: collision with root package name */
    public final String f61440b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f61441c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f61442d;

    /* renamed from: e, reason: collision with root package name */
    public final String f61443e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f61444f;

    /* renamed from: g, reason: collision with root package name */
    public int f61445g;

    /* renamed from: h, reason: collision with root package name */
    public String f61446h;

    /* renamed from: i, reason: collision with root package name */
    public final e90.a f61447i;

    /* renamed from: j, reason: collision with root package name */
    public final e90.b f61448j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String shufflePinId, String shuffleItemId, String assetId, c params, i2 pinRepository, m dynamicGridViewBinderDelegateFactory, g0 pageSizeProvider, boolean z13, String rootPinId) {
        super(params);
        e90.b bVar;
        Intrinsics.checkNotNullParameter(shufflePinId, "pinId");
        Intrinsics.checkNotNullParameter(shuffleItemId, "shuffleItemId");
        Intrinsics.checkNotNullParameter(assetId, "shuffleItemAssetId");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(rootPinId, "rootPinId");
        this.f61439a = shufflePinId;
        this.f61440b = shuffleItemId;
        this.f61441c = pinRepository;
        this.f61442d = z13;
        this.f61443e = rootPinId;
        this.f61444f = new ArrayList();
        e90.a aVar = new e90.a();
        aVar.o(845239, new ep.c(19));
        this.f61447i = aVar;
        if (z13) {
            bVar = null;
        } else {
            d presenterPinalytics = getPresenterPinalytics();
            qa2.n nVar = params.f130131b;
            l viewBinderDelegate = ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics, nVar.f103320a, nVar, params.f130137h);
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(shufflePinId, "shufflePinId");
            Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
            Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
            bVar = new e90.b("/v3/shuffles/assets/ASSET_ID_PLACEHOLDER/related/modules/", viewBinderDelegate, null, null, null, null, null, null, null, 0L, null, 8188);
            bVar.L = assetId;
            f0 f0Var = new f0();
            f0Var.e("fields", n00.b.a(n00.c.COLLAGE_CUTOUT_CLOSEUP_FEED));
            f0Var.e("page_size", pageSizeProvider.d());
            f0Var.e("exclude_pins", shufflePinId);
            bVar.f49121k = f0Var;
        }
        this.f61448j = bVar;
    }

    @Override // ca2.b
    public final void M0(String str) {
        if (isBound()) {
            ((k90.c) ((c90.a) getView())).D5();
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        i iVar = (i) dataSources;
        iVar.b(this.f61447i);
        e90.b bVar = this.f61448j;
        if (bVar != null) {
            iVar.b(bVar);
        }
    }

    @Override // ca2.b
    public final void s1(float f13, boolean z13) {
        if (isBound()) {
            k90.c cVar = (k90.c) ((c90.a) getView());
            cVar.getClass();
            float f14 = (1 - f13) * (-bs1.c.X(cVar, a90.a.collages_bottom_sheet_top_margin_collapsed_mode));
            float f15 = -bs1.c.X(cVar, a90.a.collages_bottom_sheet_top_margin_expanded_mode);
            if (f14 >= f15) {
                f14 = f15;
            }
            CutoutCarouselView cutoutCarouselView = cVar.f78736t1;
            if (cutoutCarouselView == null) {
                Intrinsics.r("collagesCarouselView");
                throw null;
            }
            cutoutCarouselView.setTranslationY(f14);
            RecyclerView g83 = cVar.g8();
            if (g83 != null) {
                g83.setTranslationY(f14);
            }
            if (f13 == 1.0f) {
                View view = cVar.f78735s1;
                if (view == null) {
                    Intrinsics.r("header");
                    throw null;
                }
                view.setBackground(bs1.c.g0(cVar, a90.b.rounded_top, null, 6));
                CutoutCarouselView cutoutCarouselView2 = cVar.f78736t1;
                if (cutoutCarouselView2 != null) {
                    cutoutCarouselView2.setBackground(bs1.c.g0(cVar, a90.b.rounded_top_gradient_body, null, 6));
                    return;
                } else {
                    Intrinsics.r("collagesCarouselView");
                    throw null;
                }
            }
            RecyclerView g84 = cVar.g8();
            if (g84 != null) {
                g84.G2(0);
            }
            View view2 = cVar.f78735s1;
            if (view2 == null) {
                Intrinsics.r("header");
                throw null;
            }
            view2.setBackground(bs1.c.g0(cVar, s0.rounded_top_rect_radius_40, null, 6));
            CutoutCarouselView cutoutCarouselView3 = cVar.f78736t1;
            if (cutoutCarouselView3 != null) {
                cutoutCarouselView3.setBackground(null);
            } else {
                Intrinsics.r("collagesCarouselView");
                throw null;
            }
        }
    }

    public final void u3(String str, Function1 function1, Function1 function12) {
        addDisposable(this.f61441c.P(str).F(new g(27, new f1(28, function1)), new g(28, new f1(29, function12)), ck2.i.f27923c, ck2.i.f27924d));
    }

    public final void v3(int i13) {
        Unit unit;
        String uid;
        Object obj = this.f61444f.get(i13);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        pi0 pi0Var = (pi0) obj;
        f30 C = pi0Var.C();
        if (C == null || (uid = C.getUid()) == null) {
            unit = null;
        } else {
            u3(uid, new y(this, pi0Var, uid, 8), new r(7, this, uid));
            unit = Unit.f80348a;
        }
        if (unit == null && isBound()) {
            this.f61447i.u(this.f61439a, null, null);
        }
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: w3, reason: merged with bridge method [inline-methods] */
    public final void r3(c90.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((e) view);
        ca2.e eVar = ((k90.c) view).f78734r1;
        if (eVar == null) {
            Intrinsics.r("bottomSheetController");
            throw null;
        }
        eVar.q(this);
        u3(this.f61439a, new a(this, view, 0), new a(this, view, 1));
    }
}
