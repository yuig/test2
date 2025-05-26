package fu;

import android.content.Intent;
import android.view.KeyEvent;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet;
import com.pinterest.ads.feature.owc.view.core.AdsCoreScrollingModule;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.u0;
import i32.y0;
import java.util.HashMap;
import kh2.m2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import ps.p;
import ps0.y;
import so.u7;
import xk2.v;
import zp.j0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfu/h;", "Lcu/m;", "Ltt/b;", "Lcom/pinterest/ads/feature/owc/view/core/AdsBrowserBottomSheet;", "Ldt/b;", "Lfu/c;", "Lli0/a;", "<init>", "()V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class h extends cu.m<tt.b, AdsBrowserBottomSheet> implements dt.b, c, li0.a {
    public static final /* synthetic */ int L0 = 0;
    public d0 A0;
    public long B0;
    public dt.a C0;
    public String D0;
    public boolean E0;
    public d0 H0;

    /* renamed from: v0, reason: collision with root package name */
    public u7 f62948v0;

    /* renamed from: w0, reason: collision with root package name */
    public z70.m f62949w0;

    /* renamed from: x0, reason: collision with root package name */
    public a11.d f62950x0;

    /* renamed from: y0, reason: collision with root package name */
    public ni1.d f62951y0;

    /* renamed from: z0, reason: collision with root package name */
    public lh0.g f62952z0;
    public final v F0 = xk2.m.b(new d(this, 1));
    public final v G0 = xk2.m.b(new d(this, 3));
    public final v I0 = xk2.m.b(new d(this, 0));
    public final v J0 = xk2.m.b(new d(this, 2));
    public final g K0 = new g(this);

    public static final void i8(h hVar, boolean z13) {
        d0 d0Var = hVar.H0;
        if (d0Var != null) {
            d0Var.h0((r18 & 1) != 0 ? f1.TAP : null, (r18 & 2) != 0 ? null : z13 ? u0.VIDEO_MUTE_BUTTON : u0.VIDEO_UNMUTE_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : hVar.getPin().getId(), (r18 & 32) != 0 ? null : m2.L0(hVar.getPin()), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }

    @Override // fu.c
    public final void F5(int i13) {
        if (i13 == p.pharma_disclosure) {
            this.E0 = true;
            dt.a aVar = this.C0;
            if (aVar != null) {
                ((tt.b) aVar).K3();
            }
            dt.a aVar2 = this.C0;
            if (aVar2 != null) {
                com.pinterest.api.model.g t33 = getPin().t3();
                ((tt.b) aVar2).M3(t33 != null ? t33.Z() : null);
            }
        }
    }

    @Override // li0.a
    public final boolean G5(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return lf.a.b(E4(), valueCallback, fileChooserParams);
    }

    @Override // cu.m, yk1.k, nl1.d
    public void K7() {
        xj2.c l13;
        super.K7();
        Navigation navigation = this.I;
        if (Intrinsics.d(navigation != null ? Boolean.valueOf(navigation.S("com.pinterest.EXTRA_IS_REQUIRED_SPAM_CHECK", false)) : null, Boolean.TRUE)) {
            String D = com.bumptech.glide.c.D(getPin());
            if (D == null) {
                D = "";
            }
            a11.d dVar = this.f62950x0;
            if (dVar == null) {
                Intrinsics.r("clickthroughHelperFactory");
                throw null;
            }
            l13 = dVar.a(n8()).l(D, getPin(), false, null, null, null, null, true, false, null, null, true, false, null, false, false, false);
            R6(l13);
        }
        f7().h(this.K0);
    }

    @Override // cu.m, yk1.k, nl1.d
    public void L7() {
        super.L7();
        if (this.f53233m0 != null && !getPin().b5().booleanValue()) {
            f7().d(new a11.c());
        }
        f7().j(this.K0);
    }

    @Override // nl1.d
    public final boolean N7(int i13, KeyEvent keyEvent) {
        d8().n1().onKeyDown(i13, keyEvent);
        return false;
    }

    @Override // fu.c
    public void a() {
        dt.a aVar;
        if (m8() && (aVar = this.C0) != null) {
            ((tt.b) aVar).Q3(d4.ONE_TAP_V3_BROWSER, this.f53239s0, g0.BROWSER, w7());
        }
        long j13 = this.B0;
        if (j13 != 0) {
            dt.a aVar2 = this.C0;
            if (aVar2 != null) {
                ((tt.b) aVar2).J3(j13);
            }
            this.B0 = 0L;
        }
    }

    public void d5() {
        dt.a aVar = this.C0;
        if (aVar != null) {
            ((tt.b) aVar).M3(this.D0);
        }
    }

    @Override // cu.m, nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        AdsBrowserBottomSheet a83 = a8();
        if (a83.l() != 3) {
            return super.getF103154e0();
        }
        if (!a83.k0()) {
            return true;
        }
        a83.b();
        return true;
    }

    @Override // cu.m
    public final void h8() {
        super.h8();
        d8().f35327n0 = this;
        d8().n1().f35425l = (e) this.F0.getValue();
    }

    @Override // fu.c
    public final void j() {
        dt.a aVar;
        if (m8() && (aVar = this.C0) != null) {
            ((tt.b) aVar).Q3(d4.BROWSER, this.f53239s0, null, w7());
        }
        dt.a aVar2 = this.C0;
        if (aVar2 != null) {
            ((tt.b) aVar2).M3(this.D0);
        }
        if (this.B0 == 0) {
            this.B0 = System.currentTimeMillis() * 1000000;
        }
    }

    @Override // yk1.k
    /* renamed from: j8, reason: merged with bridge method [inline-methods] */
    public tt.b V7() {
        u7 u7Var = this.f62948v0;
        if (u7Var != null) {
            return (tt.b) g8(new f(u7Var));
        }
        Intrinsics.r("adsCorePresenterFactory");
        throw null;
    }

    @Override // cu.m
    /* renamed from: k8, reason: merged with bridge method [inline-methods] */
    public AdsBrowserBottomSheet a8() {
        return (AdsBrowserBottomSheet) this.I0.getValue();
    }

    @Override // cu.m
    /* renamed from: l8, reason: merged with bridge method [inline-methods] */
    public AdsCoreScrollingModule d8() {
        return (AdsCoreScrollingModule) this.J0.getValue();
    }

    @Override // dt.b
    public void loadUrl(String url) {
        boolean z13;
        Intrinsics.checkNotNullParameter(url, "url");
        y yVar = ro1.c.f108967f;
        if (y.e(url) != ro1.b.WEB) {
            lh0.g gVar = this.f62952z0;
            if (gVar == null) {
                Intrinsics.r("experiments");
                throw null;
            }
            if (gVar.a()) {
                z13 = true;
                if (!this.f53234n0 || this.E0 || z13) {
                    o8(url, true);
                    this.E0 = false;
                } else if (m2.u1(f8())) {
                    p8(url, getPin().getId());
                    return;
                } else {
                    q8(url);
                    return;
                }
            }
        }
        z13 = false;
        if (this.f53234n0) {
        }
        o8(url, true);
        this.E0 = false;
    }

    public boolean m8() {
        return ((Boolean) this.G0.getValue()).booleanValue();
    }

    public final d0 n8() {
        d0 d0Var = this.A0;
        if (d0Var != null) {
            return d0Var;
        }
        Intrinsics.r("topLevelPinalytics");
        throw null;
    }

    public final void o8(String url, boolean z13) {
        Intrinsics.checkNotNullParameter(url, "url");
        a11.d dVar = this.f62950x0;
        if (dVar == null) {
            Intrinsics.r("clickthroughHelperFactory");
            throw null;
        }
        R6(a11.e.c(dVar.a(n8()), url, getPin(), false, 0, 0, null, false, !this.E0, null, null, null, false, false, null, false, false, true, 65400));
        if (z13) {
            Intrinsics.checkNotNullParameter(url, "url");
            boolean z14 = dl2.b.z1(getContext(), "com.android.chrome");
            dt.a aVar = this.C0;
            if (aVar != null) {
                aVar.e0(url, z14);
            }
        }
    }

    @Override // yk1.k, androidx.fragment.app.Fragment
    public final void onActivityResult(int i13, int i14, Intent intent) {
        lf.a.n(i13, i14, intent);
    }

    public void p8(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        Navigation navigation = this.I;
        if (navigation != null) {
            String v03 = navigation.v0("com.pinterest.EXTRA_REFERRER");
            Object i03 = navigation.i0("com.pinterest.PIN_LOGGING_AUX_DATA");
            to0.y yVar = i03 instanceof to0.y ? (to0.y) i03 : null;
            HashMap a13 = yVar != null ? yVar.a() : null;
            String v04 = navigation.v0("com.pinterest.CLIENT_TRACKING_PARAMETER");
            z70.m mVar = this.f62949w0;
            if (mVar == null) {
                Intrinsics.r("chromeTabHelper");
                throw null;
            }
            z70.m.f(mVar, url, v03, str, null, true, a13, v04, true, null, false, false, null, false, null, new j0(14, this, url), 16128);
        }
        boolean z13 = dl2.b.z1(getContext(), "com.android.chrome");
        dt.a aVar = this.C0;
        if (aVar != null) {
            aVar.e0(url, z13);
        }
    }

    @Override // nl1.d
    public final String q7() {
        return this.f53234n0 ? getPin().getId() : super.q7();
    }

    public final void q8(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!Intrinsics.d(url, a8().getF35367s())) {
            a8().r0(url);
        }
        a8().e();
    }

    @Override // at.b
    public final void z6(y0 placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        ur0.g.d(placement, this, null);
    }
}
