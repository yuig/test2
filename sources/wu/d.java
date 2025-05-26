package wu;

import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet;
import com.pinterest.ads.feature.owc.view.core.AdsCoreScrollingModule;
import com.pinterest.api.model.f30;
import gs0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.h0;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lwu/d;", "Lfu/h;", "Lht/a;", "<init>", "()V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends j implements ht.a {
    public static final /* synthetic */ int Y0 = 0;
    public h0 R0;
    public es.h S0;
    public es.a T0;
    public final v U0 = m.b(new a(this, 2));
    public final v V0 = m.b(new a(this, 1));
    public final v W0 = m.b(new a(this, 0));
    public final c X0 = new c(this);

    @Override // fu.h, cu.m, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        f7().h(this.X0);
    }

    @Override // fu.h, cu.m, yk1.k, nl1.d
    public final void L7() {
        f7().j(this.X0);
        super.L7();
    }

    @Override // cu.m, cu.d
    public final void T4() {
        f30 c13 = v8().c();
        if (c13 != null) {
            k kVar = this.f53226f0;
            if (kVar == null) {
                Intrinsics.r("pinOverflowMenuModalProvider");
                throw null;
            }
            if (this.f53225e0 != null) {
                k.a(kVar, c13, jo1.c.a(this), true, false, null, null, false, null, null, false, null, null, false, null, null, null, false, false, false, false, null, null, false, 8388600).showFeedBack();
            } else {
                Intrinsics.r("baseGridActionUtils");
                throw null;
            }
        }
    }

    @Override // fu.h, fu.c
    public final void a() {
        super.a();
        ((xu.a) this.W0.getValue()).forceLayout();
    }

    @Override // fu.h, cu.m
    public final cu.i a8() {
        return (xu.a) this.W0.getValue();
    }

    @Override // fu.h, cu.m
    public final BaseAdsScrollingModule d8() {
        return (i) this.V0.getValue();
    }

    @Override // fu.h
    /* renamed from: k8 */
    public final AdsBrowserBottomSheet a8() {
        return (xu.a) this.W0.getValue();
    }

    @Override // fu.h
    /* renamed from: l8 */
    public final AdsCoreScrollingModule d8() {
        return (i) this.V0.getValue();
    }

    @Override // fu.h
    /* renamed from: u8, reason: merged with bridge method [inline-methods] */
    public final xt.c V7() {
        h0 h0Var = this.R0;
        if (h0Var == null) {
            Intrinsics.r("adsShowcasePresenterFactory");
            throw null;
        }
        qt.g g83 = g8(new b(h0Var));
        Intrinsics.g(g83, "null cannot be cast to non-null type com.pinterest.ads.feature.owc.presenter.showcase.AdsShowcasePresenter");
        xt.c cVar = (xt.c) g83;
        cVar.R3(v8());
        return cVar;
    }

    public final xt.f v8() {
        return (xt.f) this.U0.getValue();
    }
}
