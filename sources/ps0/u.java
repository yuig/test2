package ps0;

import android.view.View;
import androidx.recyclerview.widget.m2;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import com.pinterest.ui.grid.GridPlaceholderLoadingLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeFeedFragment f101318a;

    public u(HomeFeedFragment homeFeedFragment) {
        this.f101318a = homeFeedFragment;
    }

    @Override // androidx.recyclerview.widget.m2
    public final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // androidx.recyclerview.widget.m2
    public final void d(View view) {
        GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        HomeFeedFragment homeFeedFragment = this.f101318a;
        if (!homeFeedFragment.I1 || homeFeedFragment.J1 || (gridPlaceholderLoadingLayout = homeFeedFragment.F1) == null || !bs1.c.o1(gridPlaceholderLoadingLayout)) {
            return;
        }
        homeFeedFragment.J1 = true;
        ir.c h93 = homeFeedFragment.h9();
        if (h93 != null) {
            h93.d();
        }
    }
}
