package ps0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import com.pinterest.feature.home.view.InitialLoadSwipeRefreshLayout;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.p1;
import lh0.z3;
import m60.t0;
import m60.u0;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class p implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeFeedFragment f101290a;

    public p(HomeFeedFragment homeFeedFragment) {
        this.f101290a = homeFeedFragment;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.q event) {
        Intrinsics.checkNotNullParameter(event, "event");
        HomeFeedFragment homeFeedFragment = this.f101290a;
        View view = homeFeedFragment.C1;
        if (view == null || !bs1.c.o1(view)) {
            return;
        }
        p1 j93 = homeFeedFragment.j9();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) j93.f83456a;
        if (g1Var.o("visual_search_in_long_press_android", "enabled", z3Var) || g1Var.l("visual_search_in_long_press_android")) {
            homeFeedFragment.o9(u0.anim_speed_superfast);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.c0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.f100055b) {
            HomeFeedFragment homeFeedFragment = this.f101290a;
            if (homeFeedFragment.f45753i1 != null) {
                RelativeLayout relativeLayout = homeFeedFragment.H1;
                if (relativeLayout != null) {
                    Context requireContext = homeFeedFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    d21.a.a(event.f100054a, relativeLayout, requireContext);
                    return;
                }
                Intrinsics.r("reactionAnimationOverlay");
                throw null;
            }
            Intrinsics.r("pinReactionUtils");
            throw null;
        }
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull te1.a event) {
        View view;
        InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout;
        View view2;
        InitialLoadSwipeRefreshLayout initialLoadSwipeRefreshLayout2;
        Intrinsics.checkNotNullParameter(event, "event");
        HomeFeedFragment homeFeedFragment = this.f101290a;
        homeFeedFragment.f7().i(event);
        if (!event.f117498a) {
            FragmentActivity E4 = homeFeedFragment.E4();
            if ((E4 != null ? E4.findViewById(t0.home_feed_view_pager_tab_layout) : null) == null || (view2 = homeFeedFragment.getView()) == null || (initialLoadSwipeRefreshLayout2 = (InitialLoadSwipeRefreshLayout) view2.findViewById(wp1.d.homefeed_swipe_container)) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = initialLoadSwipeRefreshLayout2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = k3.k0(homeFeedFragment.requireContext()) + dl2.b.G0(initialLoadSwipeRefreshLayout2, eo1.a.hf_tabbar_bottom_padding) + bs1.c.W(initialLoadSwipeRefreshLayout2, u82.a.lego_tab_indicator_height);
                initialLoadSwipeRefreshLayout2.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        FragmentActivity E42 = homeFeedFragment.E4();
        if ((E42 != null ? E42.findViewById(t0.home_feed_view_pager_tab_layout) : null) == null || (view = homeFeedFragment.getView()) == null || (initialLoadSwipeRefreshLayout = (InitialLoadSwipeRefreshLayout) view.findViewById(wp1.d.homefeed_swipe_container)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = initialLoadSwipeRefreshLayout.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = dl2.b.G0(initialLoadSwipeRefreshLayout, eo1.a.hf_tabbar_bottom_padding) + bs1.c.W(initialLoadSwipeRefreshLayout, u82.a.lego_tab_indicator_height);
            initialLoadSwipeRefreshLayout.setLayoutParams(marginLayoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
