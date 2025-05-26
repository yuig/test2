package lu;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llu/k;", "Lfu/h;", "Lft/c;", "<init>", "()V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class k extends z implements ft.c {
    public static final /* synthetic */ int Y0 = 0;
    public so.l R0;
    public es.a S0;
    public ft.b T0;
    public boolean V0;
    public final xk2.v U0 = xk2.m.b(new i(this, 0));
    public final xk2.v W0 = xk2.m.b(new i(this, 1));
    public final xk2.v X0 = xk2.m.b(new i(this, 2));

    @Override // nl1.d
    public final void Q7(boolean z13) {
        ft.b bVar;
        boolean z14 = this.f91282J != z13;
        super.Q7(z13);
        if (z14 && this.f91282J && (bVar = this.T0) != null) {
            ((vt.g) bVar).R3();
        }
    }

    @Override // cu.m, cu.d
    public final void T4() {
        if (this.V0) {
            v8().d();
        } else {
            super.T4();
        }
    }

    @Override // yk1.k, nl1.d, cu.d
    public final void Y0() {
        if (this.V0) {
            v8().d();
        } else {
            P7();
        }
    }

    @Override // fu.h, cu.m
    public final cu.i a8() {
        return (f) this.W0.getValue();
    }

    @Override // fu.h, fu.c
    public final void d5() {
        if (this.V0) {
            v8().d();
        } else {
            if (v8().g()) {
                return;
            }
            v8().i(v8().e());
        }
    }

    @Override // fu.h
    /* renamed from: k8 */
    public final AdsBrowserBottomSheet a8() {
        return (f) this.W0.getValue();
    }

    @Override // cu.m, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v8().c().F(new zt.b(12, new wt.c(this, 5)), new zt.b(13, a.f84849p), ck2.i.f27923c, ck2.i.f27924d);
    }

    @Override // fu.h
    public final void p8(String url, String str) {
        ft.b bVar;
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.V0) {
            v8().d();
            return;
        }
        if (str != null && (bVar = this.T0) != null) {
            ((vt.g) bVar).T3(str);
        }
        super.p8(url, str);
    }

    @Override // fu.h
    /* renamed from: u8, reason: merged with bridge method [inline-methods] */
    public final vt.g V7() {
        so.l lVar = this.R0;
        if (lVar == null) {
            Intrinsics.r("adsQuizPresenterFactory");
            throw null;
        }
        qt.g g83 = g8(new j(lVar));
        Intrinsics.g(g83, "null cannot be cast to non-null type com.pinterest.ads.feature.owc.presenter.quiz.AdsQuizPresenter");
        vt.g gVar = (vt.g) g83;
        gVar.S3(v8());
        return gVar;
    }

    public final vt.e v8() {
        return (vt.e) this.U0.getValue();
    }

    @Override // fu.h
    /* renamed from: w8, reason: merged with bridge method [inline-methods] */
    public final y d8() {
        return (y) this.X0.getValue();
    }

    public final void x8(boolean z13) {
        if (!z13) {
            FrameLayout f35324k0 = d8().getF35324k0();
            if (f35324k0 != null) {
                f35324k0.setClickable(false);
            }
            y d83 = d8();
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            d83.setForeground(new ColorDrawable(dl2.b.x0(requireContext, eo1.a.sema_color_background_transparent)));
            return;
        }
        FrameLayout f35324k02 = d8().getF35324k0();
        if (f35324k02 != null) {
            f35324k02.setClickable(true);
        }
        y d84 = d8();
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        d84.setForeground(new ColorDrawable(dl2.b.x0(requireContext2, eo1.a.color_background_dark_opacity_300)));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 80.0f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new h(this, 1));
        ofFloat.start();
    }
}
