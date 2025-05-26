package gg0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.pinterest.education.view.EducationNewContainerView;
import com.pinterest.education.view.EducationPromptView;
import com.pinterest.education.view.EducationPulsarView;
import com.pinterest.education.view.EducationToolTipView;
import com.pinterest.gestalt.bannerOverlay.GestaltBannerOverlay;
import com.pinterest.navigation.Navigation;
import df.j1;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import qa2.u1;

/* loaded from: classes5.dex */
public final class u implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EducationNewContainerView f64961a;

    public u(EducationNewContainerView educationNewContainerView) {
        this.f64961a = educationNewContainerView;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull i event) {
        eg0.c cVar;
        i32.c findByValue;
        EducationPulsarView educationPulsarView;
        EducationToolTipView educationToolTipView;
        Intrinsics.checkNotNullParameter(event, "event");
        EducationNewContainerView educationNewContainerView = this.f64961a;
        eg0.c cVar2 = educationNewContainerView.f44995k;
        if (cVar2 != null) {
            boolean z13 = educationNewContainerView.f45008x;
            int i13 = cVar2.f58891j;
            if (z13 && !EducationNewContainerView.B.contains(Integer.valueOf(i13))) {
                educationNewContainerView.f45008x = false;
                EducationToolTipView educationToolTipView2 = educationNewContainerView.f44999o;
                if (educationToolTipView2 != null) {
                    educationToolTipView2.c();
                }
            }
            if (!EducationNewContainerView.C.contains(Integer.valueOf(i13)) || (cVar = educationNewContainerView.f44995k) == null || (findByValue = i32.c.findByValue(cVar.f58891j)) == null) {
                return;
            }
            Context context = educationNewContainerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            zf0.f fVar = educationNewContainerView.f44988d;
            View d2 = fVar.d(context, findByValue);
            if (d2 == null) {
                return;
            }
            fVar.getClass();
            View n13 = !zf0.f.k(educationNewContainerView, d2, findByValue) ? educationNewContainerView.n(findByValue) : null;
            if (educationNewContainerView.f45008x && (educationToolTipView = educationNewContainerView.f44999o) != null) {
                int i14 = EducationToolTipView.f45022m;
                educationToolTipView.a(findByValue, false, n13, false);
            }
            if (!educationNewContainerView.f45009y || (educationPulsarView = educationNewContainerView.f44998n) == null) {
                return;
            }
            educationPulsarView.b(findByValue, n13);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        GestaltBannerOverlay gestaltBannerOverlay = this.f64961a.f45003s;
        if (gestaltBannerOverlay == null || bs1.c.j1(gestaltBannerOverlay)) {
            return;
        }
        ViewPropertyAnimator animate = gestaltBannerOverlay.animate();
        event.getClass();
        animate.setDuration(300L).translationY(0.0f).start();
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        GestaltBannerOverlay gestaltBannerOverlay = this.f64961a.f45003s;
        if (gestaltBannerOverlay == null || bs1.c.j1(gestaltBannerOverlay)) {
            return;
        }
        ViewPropertyAnimator animate = gestaltBannerOverlay.animate();
        event.getClass();
        ViewPropertyAnimator duration = animate.setDuration(300L);
        ViewGroup.LayoutParams layoutParams = gestaltBannerOverlay.getLayoutParams();
        duration.translationY(((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r1.bottomMargin : 0) - r0.f45007w).start();
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        EducationNewContainerView educationNewContainerView = this.f64961a;
        eg0.c cVar = educationNewContainerView.f44995k;
        if (cVar != null) {
            HashSet hashSet = EducationNewContainerView.A;
            int i13 = cVar.f58891j;
            if (hashSet.contains(Integer.valueOf(i13))) {
                i32.c.Companion.getClass();
                i32.c a13 = i32.a.a(i13);
                View view = educationNewContainerView.f45002r;
                if (view == null) {
                    view = a13 != null ? educationNewContainerView.n(a13) : null;
                }
                EducationPulsarView educationPulsarView = educationNewContainerView.f44998n;
                if (educationPulsarView != null) {
                    educationPulsarView.b(a13, view);
                }
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull o event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f64961a.f44998n != null) {
            throw null;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull p event) {
        Intrinsics.checkNotNullParameter(event, "event");
        EducationNewContainerView educationNewContainerView = this.f64961a;
        m.h hVar = educationNewContainerView.f44992h;
        if (j1.N0(hVar != null ? (String) hVar.f85199d : null, i32.l.ANDROID_NEWS_HUB_SCROLL_PROMPT)) {
            List<u1> list = event.f64957a;
            educationNewContainerView.l();
            if (educationNewContainerView.f44992h != null) {
                for (u1 u1Var : list) {
                    EducationPulsarView educationPulsarView = new EducationPulsarView(educationNewContainerView.getContext(), null);
                    u1Var.onPulsarShow();
                    educationNewContainerView.addView(educationPulsarView, 0);
                    View anchorView = u1Var.getAnchorView();
                    educationNewContainerView.f44988d.getClass();
                    educationPulsarView.d(u1Var.getAnchorWidth(), u1Var.getAnchorHeight(), zf0.f.c(anchorView));
                    educationNewContainerView.f44996l.add(educationPulsarView);
                    educationNewContainerView.f44997m.add(u1Var);
                }
            }
            EducationPromptView educationPromptView = educationNewContainerView.f45000p;
            if (educationPromptView != null) {
                educationPromptView.a(0L, educationNewContainerView.getResources().getString(jg0.e.news_hub_tap_story), null, 0);
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(l lVar) {
        EducationNewContainerView educationNewContainerView = this.f64961a;
        m.h hVar = educationNewContainerView.f44992h;
        if (j1.N0(hVar != null ? (String) hVar.f85199d : null, i32.l.ANDROID_NEWS_HUB_SCROLL_PROMPT)) {
            EducationPromptView educationPromptView = educationNewContainerView.f45000p;
            if (educationPromptView != null) {
                educationPromptView.setVisibility(8);
                educationPromptView.f45015d.removeCallbacksAndMessages(null);
            }
            educationNewContainerView.l();
            return;
        }
        educationNewContainerView.l();
        EducationPulsarView educationPulsarView = educationNewContainerView.f44998n;
        if (educationPulsarView != null) {
            educationPulsarView.c();
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(q qVar) {
        EducationNewContainerView educationNewContainerView = this.f64961a;
        eg0.c cVar = educationNewContainerView.f44995k;
        if (cVar != null) {
            HashSet hashSet = EducationNewContainerView.B;
            int i13 = cVar.f58891j;
            if (hashSet.contains(Integer.valueOf(i13))) {
                i32.c.Companion.getClass();
                i32.c a13 = i32.a.a(i13);
                Context context = educationNewContainerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                zf0.f fVar = educationNewContainerView.f44988d;
                View d2 = fVar.d(context, a13);
                if (d2 == null) {
                    return;
                }
                fVar.getClass();
                boolean k13 = zf0.f.k(educationNewContainerView, d2, a13);
                View n13 = (k13 || a13 == null) ? null : educationNewContainerView.n(a13);
                if (!k13 && n13 == null) {
                    EducationToolTipView educationToolTipView = educationNewContainerView.f44999o;
                    if (educationToolTipView != null) {
                        educationToolTipView.c();
                        return;
                    }
                    return;
                }
                EducationToolTipView educationToolTipView2 = educationNewContainerView.f44999o;
                if (educationToolTipView2 != null) {
                    eg0.c cVar2 = educationNewContainerView.f44995k;
                    i32.c findByValue = cVar2 != null ? i32.c.findByValue(cVar2.f58891j) : null;
                    int i14 = EducationToolTipView.f45022m;
                    educationToolTipView2.a(findByValue, false, n13, false);
                }
            }
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(Navigation navigation) {
        HashSet hashSet = EducationNewContainerView.A;
        this.f64961a.m();
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(m mVar) {
        EducationPulsarView educationPulsarView = this.f64961a.f44998n;
        if (educationPulsarView != null) {
            educationPulsarView.c();
        }
    }
}
