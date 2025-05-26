package ir;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.pinterest.ui.components.placeholder.BasePlaceholderLoadingLayout;
import com.pinterest.ui.grid.GridPlaceholderLoadingLayout;
import com.pinterest.ui.tabs.TabBarPlaceholderLoadingLayout;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final cp1.p f73450a;

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f73451b;

    /* renamed from: c, reason: collision with root package name */
    public AnimatorSet f73452c;

    /* renamed from: d, reason: collision with root package name */
    public GridPlaceholderLoadingLayout f73453d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f73454e;

    public c(cp1.p activity, lh0.b experiments) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f73450a = activity;
        this.f73454e = xk2.m.b(new androidx.activity.a0(this, 29));
    }

    public final AnimatorSet a(View view, BasePlaceholderLoadingLayout basePlaceholderLoadingLayout) {
        view.setAlpha(0.0f);
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(basePlaceholderLoadingLayout, (Property<BasePlaceholderLoadingLayout, Float>) property, 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new PathInterpolator(0.25f, 0.1f, 0.25f, 0.1f));
        animatorSet.setDuration(300L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new a(this, view, basePlaceholderLoadingLayout, 1));
        animatorSet.addListener(new a(this, view, basePlaceholderLoadingLayout, 0));
        return animatorSet;
    }

    public final GridPlaceholderLoadingLayout b() {
        GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout = this.f73453d;
        if (gridPlaceholderLoadingLayout != null) {
            return gridPlaceholderLoadingLayout;
        }
        GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout2 = (GridPlaceholderLoadingLayout) this.f73450a.findViewById(t0.grid_placeholder_loading_layout);
        this.f73453d = gridPlaceholderLoadingLayout2;
        return gridPlaceholderLoadingLayout2;
    }

    public final TabBarPlaceholderLoadingLayout c() {
        return (TabBarPlaceholderLoadingLayout) this.f73454e.getValue();
    }

    public final void d() {
        AnimatorSet animatorSet;
        int i13 = t0.p_recycler_view_home;
        cp1.p pVar = this.f73450a;
        View findViewById = pVar.findViewById(i13);
        GridPlaceholderLoadingLayout b13 = b();
        AnimatorSet animatorSet2 = (findViewById == null || b13 == null) ? new AnimatorSet() : a(findViewById, b13);
        View findViewById2 = pVar.findViewById(t0.home_feed_view_pager_tab_layout_container);
        if (findViewById2 == null || c() == null) {
            animatorSet = new AnimatorSet();
        } else {
            TabBarPlaceholderLoadingLayout c13 = c();
            Intrinsics.f(c13);
            animatorSet = a(findViewById2, c13);
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(animatorSet2, animatorSet);
        animatorSet3.start();
    }

    public final void e() {
        d();
    }
}
