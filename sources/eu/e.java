package eu;

import com.pinterest.ads.feature.owc.view.collection.AdsCollectionScrollingModule;
import com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet;
import com.pinterest.api.model.f30;
import is1.k0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.b0;
import so.f8;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Leu/e;", "Lfu/h;", "Lct/b;", "<init>", "()V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends s implements ct.b {

    /* renamed from: f1, reason: collision with root package name */
    public static final /* synthetic */ int f60127f1 = 0;
    public f8 R0;
    public c82.d S0;
    public k0 T0;
    public lh0.g U0;
    public lh0.d V0;
    public jv.a W0;
    public b0 X0;
    public es.h Y0;
    public es.a Z0;

    /* renamed from: a1, reason: collision with root package name */
    public ct.a f60128a1;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f60129b1;

    /* renamed from: c1, reason: collision with root package name */
    public final xk2.v f60130c1 = xk2.m.b(new b(this, 1));

    /* renamed from: d1, reason: collision with root package name */
    public final xk2.v f60131d1 = xk2.m.b(new b(this, 0));

    /* renamed from: e1, reason: collision with root package name */
    public final d f60132e1 = new d(this);

    @Override // fu.h, cu.m, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        f7().h(this.f60132e1);
        if (u8().b()) {
            d8().t2();
        }
        if (this.f60129b1) {
            d8().l2();
            this.f60129b1 = false;
        }
    }

    @Override // fu.h, cu.m, yk1.k, nl1.d
    public final void L7() {
        super.L7();
        f7().j(this.f60132e1);
    }

    @Override // fu.h, yk1.k
    public final yk1.m V7() {
        f8 f8Var = this.R0;
        if (f8Var == null) {
            Intrinsics.r("adsCollectionPresenterFactory");
            throw null;
        }
        qt.g g83 = g8(new c(f8Var));
        Intrinsics.g(g83, "null cannot be cast to non-null type com.pinterest.ads.feature.owc.presenter.collection.AdsCollectionPresenter");
        return (st.b) g83;
    }

    @Override // fu.h, cu.m
    public final cu.i a8() {
        return (a) this.f60131d1.getValue();
    }

    @Override // fu.h, fu.c
    public final void d5() {
        if (!u8().f() && !u8().e()) {
            super.d5();
            return;
        }
        ct.a aVar = this.f60128a1;
        if (aVar != null) {
            ((st.b) aVar).R3();
        }
    }

    @Override // fu.h
    /* renamed from: j8 */
    public final tt.b V7() {
        f8 f8Var = this.R0;
        if (f8Var == null) {
            Intrinsics.r("adsCollectionPresenterFactory");
            throw null;
        }
        qt.g g83 = g8(new c(f8Var));
        Intrinsics.g(g83, "null cannot be cast to non-null type com.pinterest.ads.feature.owc.presenter.collection.AdsCollectionPresenter");
        return (st.b) g83;
    }

    @Override // fu.h
    /* renamed from: k8 */
    public final AdsBrowserBottomSheet a8() {
        return (a) this.f60131d1.getValue();
    }

    @Override // fu.h
    public final void p8(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        super.p8(url, str);
        ct.a aVar = this.f60128a1;
        if (aVar != null) {
            ((st.b) aVar).S3(str);
        }
    }

    public final lh0.g u8() {
        lh0.g gVar = this.U0;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.r("adsExperiments");
        throw null;
    }

    @Override // cu.m, at.b
    public final void updatePin(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        super.updatePin(pin);
        es.h hVar = this.Y0;
        if (hVar == null) {
            Intrinsics.r("adsCommonDisplay");
            throw null;
        }
        lh0.d dVar = this.V0;
        if (dVar == null) {
            Intrinsics.r("adFormatsLibraryExperiments");
            throw null;
        }
        ArrayList t13 = ((es.v) hVar).t(pin, dVar);
        if (t13 != null) {
            d8().s2(t13);
        }
    }

    @Override // fu.h
    /* renamed from: v8, reason: merged with bridge method [inline-methods] */
    public final AdsCollectionScrollingModule d8() {
        return (AdsCollectionScrollingModule) this.f60130c1.getValue();
    }
}
