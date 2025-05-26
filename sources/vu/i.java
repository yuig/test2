package vu;

import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet;
import com.pinterest.ads.feature.owc.view.core.AdsCoreScrollingModule;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.w;
import xk2.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvu/i;", "Lfu/h;", "Lgt/a;", "<init>", "()V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i extends m implements gt.a {
    public w R0;
    public c91.e S0;
    public es.h T0;
    public es.a U0;
    public final v V0;
    public final v W0;

    public i() {
        this.S = false;
        this.V0 = xk2.m.b(new f(this, 1));
        this.W0 = xk2.m.b(new f(this, 0));
    }

    @Override // fu.h, yk1.k
    public final yk1.m V7() {
        w wVar = this.R0;
        if (wVar == null) {
            Intrinsics.r("adsShoppingPresenterFactory");
            throw null;
        }
        qt.g g83 = g8(new g(wVar));
        Intrinsics.g(g83, "null cannot be cast to non-null type com.pinterest.ads.feature.owc.presenter.shopping.AdsShoppingPresenter");
        return (wt.f) g83;
    }

    @Override // cu.m, at.b
    public final void a4(String str, String str2, String str3, boolean z13, boolean z14) {
        if (((k) this.V0.getValue()).O0) {
            super.a4(str, str2, str3, z13, z14);
        }
    }

    @Override // fu.h, cu.m
    public final cu.i a8() {
        return (e) this.W0.getValue();
    }

    @Override // fu.h, cu.m
    public final BaseAdsScrollingModule d8() {
        return (k) this.V0.getValue();
    }

    @Override // fu.h
    /* renamed from: j8 */
    public final tt.b V7() {
        w wVar = this.R0;
        if (wVar == null) {
            Intrinsics.r("adsShoppingPresenterFactory");
            throw null;
        }
        qt.g g83 = g8(new g(wVar));
        Intrinsics.g(g83, "null cannot be cast to non-null type com.pinterest.ads.feature.owc.presenter.shopping.AdsShoppingPresenter");
        return (wt.f) g83;
    }

    @Override // fu.h
    /* renamed from: k8 */
    public final AdsBrowserBottomSheet a8() {
        return (e) this.W0.getValue();
    }

    @Override // fu.h
    /* renamed from: l8 */
    public final AdsCoreScrollingModule d8() {
        return (k) this.V0.getValue();
    }

    @Override // fu.h, dt.b
    public final void loadUrl(String url) {
        boolean a13;
        Intrinsics.checkNotNullParameter(url, "url");
        if (!b40.U0(getPin())) {
            super.loadUrl(url);
            return;
        }
        ni1.d dVar = this.f62951y0;
        if (dVar == null) {
            Intrinsics.r("deeplinkHelper");
            throw null;
        }
        f30 pin = getPin();
        String id3 = getPin().getId();
        es.a aVar = this.U0;
        if (aVar == null) {
            Intrinsics.r("adFormats");
            throw null;
        }
        a13 = dVar.a(pin, id3, null, null, null, (r19 & 32) != 0 ? false : false, (r19 & 64) != 0 ? false : false, aVar);
        if (!a13) {
            o8(url, false);
        }
        Intrinsics.checkNotNullParameter(url, "url");
        boolean z13 = dl2.b.z1(getContext(), "com.android.chrome");
        dt.a aVar2 = this.C0;
        if (aVar2 != null) {
            aVar2.e0(url, z13);
        }
    }

    @Override // cu.m, at.b
    public final void updatePin(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        ((k) this.V0.getValue()).i2(pin.f6() != null);
        super.updatePin(pin);
    }
}
