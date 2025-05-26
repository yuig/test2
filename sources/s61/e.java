package s61;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.sf0;
import com.pinterest.base.LockableViewPager;
import com.pinterest.feature.pincarouselads.view.CarouselIndexView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.imageview.WebImageView;
import hz.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.a0;
import so.f3;
import so.i3;
import yk1.m;
import yk1.u;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls61/e;", "Lcom/pinterest/feature/core/view/MvpViewPagerFragment;", "Ls61/b;", "", "<init>", "()V", "results_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e extends g<b> implements u {
    public static final /* synthetic */ int C0 = 0;
    public long A0;

    /* renamed from: r0, reason: collision with root package name */
    public f3 f111233r0;

    /* renamed from: s0, reason: collision with root package name */
    public i3 f111234s0;

    /* renamed from: t0, reason: collision with root package name */
    public r61.b f111235t0;

    /* renamed from: v0, reason: collision with root package name */
    public CarouselIndexView f111237v0;

    /* renamed from: w0, reason: collision with root package name */
    public HorizontalScrollView f111238w0;

    /* renamed from: x0, reason: collision with root package name */
    public WebImageView f111239x0;

    /* renamed from: y0, reason: collision with root package name */
    public GestaltIconButton f111240y0;

    /* renamed from: z0, reason: collision with root package name */
    public long f111241z0;

    /* renamed from: u0, reason: collision with root package name */
    public final a0 f111236u0 = new a0();
    public final l B0 = new l(this, 4);

    @Override // yk1.k
    public final m V7() {
        f3 f3Var = this.f111233r0;
        if (f3Var != null) {
            return f3Var.a(this.f111236u0);
        }
        Intrinsics.r("goldStandardViewPagerPresenterFactory");
        throw null;
    }

    public final r61.b j8() {
        r61.b bVar = this.f111235t0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("mixpanelManager");
        throw null;
    }

    @Override // nl1.d
    public final LockableViewPager m7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (LockableViewPager) mainView.findViewById(l42.b.gold_standard_steps_view_pager);
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = l42.d.fragment_gold_standard_view_pager;
        i3 i3Var = this.f111234s0;
        if (i3Var != null) {
            f8(i3Var.a());
        } else {
            Intrinsics.r("goldStandardViewPagerAdapter");
            throw null;
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f111241z0 = System.currentTimeMillis();
        j8().a(0L, "VIEW_START_MICROTREATMENT");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.A0 = System.currentTimeMillis();
        j8().a(this.A0 - this.f111241z0, "VIEW_END_MICROTREATMENT");
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Navigation navigation = this.I;
        sf0 sf0Var = (sf0) (navigation != null ? navigation.i0("extra_safety_text_treatment") : null);
        if (sf0Var == null) {
            D5();
            return;
        }
        ((b) a8()).H(sf0Var);
        View findViewById = view.findViewById(l42.b.gold_standard_steps_scroll_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f111238w0 = (HorizontalScrollView) findViewById;
        View findViewById2 = view.findViewById(l42.b.gold_standard_steps_carousel);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f111237v0 = (CarouselIndexView) findViewById2;
        View findViewById3 = view.findViewById(l42.b.gold_standard_steps_background);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f111239x0 = (WebImageView) findViewById3;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        String z13 = pk.a0.q0(requireContext) ? sf0Var.z() : sf0Var.A();
        WebImageView webImageView = this.f111239x0;
        if (webImageView == null) {
            Intrinsics.r("background");
            throw null;
        }
        webImageView.loadUrl(z13);
        CarouselIndexView carouselIndexView = this.f111237v0;
        if (carouselIndexView == null) {
            Intrinsics.r("carouselIndexView");
            throw null;
        }
        carouselIndexView.d(((b) a8()).f77529f.size());
        final int i13 = 0;
        carouselIndexView.e(0);
        carouselIndexView.c(eo1.b.color_themed_text_default, eo1.b.color_gray_500);
        bs1.c.U1(carouselIndexView);
        ((GestaltIconButton) view.findViewById(l42.b.gold_standard_steps_back_button)).u(new gm1.a(this) { // from class: s61.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f111228b;

            {
                this.f111228b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                FragmentActivity E4;
                int i14 = i13;
                e this$0 = this.f111228b;
                switch (i14) {
                    case 0:
                        int i15 = e.C0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (E4 = this$0.E4()) != null) {
                            E4.onBackPressed();
                            break;
                        }
                        break;
                    default:
                        int i16 = e.C0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof om1.l) {
                            if (this$0.b8().j() != ((b) this$0.a8()).f77529f.size() - 1) {
                                if (this$0.b8().j() == 0) {
                                    this$0.j8().a(0L, "TAP_MICROTREATMENT_START_BUTTON");
                                } else {
                                    this$0.j8().a(0L, "TAP_MICROTREATMENT_NEXT_BUTTON");
                                }
                                this$0.b8().w(this$0.b8().j() + 1, true);
                                break;
                            } else {
                                this$0.j8().a(0L, "TAP_MICROTREATMENT_DONE_BUTTON");
                                FragmentActivity E42 = this$0.E4();
                                if (E42 != null) {
                                    E42.onBackPressed();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        View findViewById4 = view.findViewById(l42.b.gold_standard_steps_fab);
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById4;
        gestaltIconButton.t(d.f111229j);
        final int i14 = 1;
        gestaltIconButton.u(new gm1.a(this) { // from class: s61.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f111228b;

            {
                this.f111228b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                FragmentActivity E4;
                int i142 = i14;
                e this$0 = this.f111228b;
                switch (i142) {
                    case 0:
                        int i15 = e.C0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (E4 = this$0.E4()) != null) {
                            E4.onBackPressed();
                            break;
                        }
                        break;
                    default:
                        int i16 = e.C0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof om1.l) {
                            if (this$0.b8().j() != ((b) this$0.a8()).f77529f.size() - 1) {
                                if (this$0.b8().j() == 0) {
                                    this$0.j8().a(0L, "TAP_MICROTREATMENT_START_BUTTON");
                                } else {
                                    this$0.j8().a(0L, "TAP_MICROTREATMENT_NEXT_BUTTON");
                                }
                                this$0.b8().w(this$0.b8().j() + 1, true);
                                break;
                            } else {
                                this$0.j8().a(0L, "TAP_MICROTREATMENT_DONE_BUTTON");
                                FragmentActivity E42 = this$0.E4();
                                if (E42 != null) {
                                    E42.onBackPressed();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f111240y0 = gestaltIconButton;
        Y7(this.B0);
    }
}
