package qx1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import com.pinterest.base.LockableViewPager;
import com.pinterest.feature.core.view.MvpViewPagerFragment;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.partnerAnalytics.PartnerAnalyticsLocation;
import ek.e;
import kh2.b0;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import nc0.f;
import om1.l;
import so.f1;
import xk2.m;
import xk2.v;
import yk1.g;
import yv1.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqx1/c;", "Lcom/pinterest/feature/core/view/MvpViewPagerFragment;", "Lqx1/a;", "<init>", "()V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class c extends MvpViewPagerFragment<a> {

    /* renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f105334q0 = 0;

    /* renamed from: m0, reason: collision with root package name */
    public f1 f105335m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltIconButton f105336n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltTabLayout f105337o0;

    /* renamed from: p0, reason: collision with root package name */
    public final v f105338p0 = m.b(new i(this, 4));

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, xa.i
    public final void A5(int i13) {
        super.A5(i13);
        GestaltTabLayout gestaltTabLayout = this.f105337o0;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        e n13 = gestaltTabLayout.n(i13);
        if (n13 != null) {
            n13.b();
        }
    }

    @Override // yk1.k
    public yk1.m V7() {
        return new g();
    }

    @Override // nl1.d
    public final ViewStub e7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return null;
    }

    public abstract void g8();

    public abstract void h8();

    public abstract void i8(d dVar);

    @Override // nl1.d
    public final LockableViewPager m7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (LockableViewPager) mainView.findViewById(com.pinterest.partnerAnalytics.d.contentPage);
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = com.pinterest.partnerAnalytics.e.analytics_fragment;
        f1 f1Var = this.f105335m0;
        if (f1Var == null) {
            Intrinsics.r("pageAdapter");
            throw null;
        }
        f8(f1Var.a());
        ((a) a8()).H(f0.l(PartnerAnalyticsLocation.ANALYTICS_OVERVIEW, PartnerAnalyticsLocation.AUDIENCE_INSIGHTS));
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(com.pinterest.partnerAnalytics.d.btnFilter);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById;
        Intrinsics.checkNotNullParameter(gestaltIconButton, "<set-?>");
        this.f105336n0 = gestaltIconButton;
        if (gestaltIconButton == null) {
            Intrinsics.r("btnFilter");
            throw null;
        }
        final int i13 = 0;
        gestaltIconButton.u(new gm1.a(this) { // from class: qx1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f105333b;

            {
                this.f105333b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                c this$0 = this.f105333b;
                switch (i14) {
                    case 0:
                        int i15 = c.f105334q0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.h8();
                            break;
                        }
                        break;
                    default:
                        int i16 = c.f105334q0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.g8();
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById2 = view.findViewById(com.pinterest.partnerAnalytics.d.analyticsBackButton);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltIconButton gestaltIconButton2 = (GestaltIconButton) findViewById2;
        if (gestaltIconButton2 == null) {
            Intrinsics.r("analyticsBackButton");
            throw null;
        }
        final int i14 = 1;
        gestaltIconButton2.u(new gm1.a(this) { // from class: qx1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f105333b;

            {
                this.f105333b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                c this$0 = this.f105333b;
                switch (i142) {
                    case 0:
                        int i15 = c.f105334q0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.h8();
                            break;
                        }
                        break;
                    default:
                        int i16 = c.f105334q0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.g8();
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById3 = view.findViewById(com.pinterest.partnerAnalytics.d.tabLayout);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltTabLayout gestaltTabLayout = (GestaltTabLayout) findViewById3;
        this.f105337o0 = gestaltTabLayout;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        gestaltTabLayout.b(new ek.i(this, 3));
        GestaltTabLayout gestaltTabLayout2 = this.f105337o0;
        if (gestaltTabLayout2 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        String string = getString(com.pinterest.partnerAnalytics.g.analytics_overview_tab);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        gestaltTabLayout.d(b0.U(gestaltTabLayout2, string, 0, 12), d.HOME_ANALYTICS.ordinal(), true);
        GestaltTabLayout gestaltTabLayout3 = this.f105337o0;
        if (gestaltTabLayout3 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        String string2 = getString(com.pinterest.partnerAnalytics.g.analytics_audience_tab);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        gestaltTabLayout.d(b0.U(gestaltTabLayout3, string2, 0, 12), d.AUDIENCE.ordinal(), false);
        e n13 = gestaltTabLayout.n(((d) this.f105338p0.getValue()).ordinal());
        if (n13 != null) {
            n13.b();
        }
    }

    @Override // nl1.d
    public final f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (f) mainView.findViewById(t0.toolbar);
    }
}
