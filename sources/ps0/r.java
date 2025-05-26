package ps0;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeFeedFragment f101294a;

    public r(HomeFeedFragment homeFeedFragment) {
        this.f101294a = homeFeedFragment;
    }

    public final void a(boolean z13) {
        View findViewById;
        kt0.c cVar = this.f101294a.f45767w1;
        if (cVar != null) {
            kt0.q qVar = (kt0.q) cVar;
            if (z13) {
                TabLayout tabLayout = qVar.f80855z0;
                if (tabLayout == null) {
                    Intrinsics.r("tabLayout");
                    throw null;
                }
                tabLayout.setVisibility(8);
                View view = qVar.A0;
                findViewById = view != null ? view.findViewById(wp1.d.hf_tuner_icon) : null;
                if (findViewById == null) {
                    return;
                }
                findViewById.setVisibility(8);
                return;
            }
            TabLayout tabLayout2 = qVar.f80855z0;
            if (tabLayout2 == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            tabLayout2.setVisibility(0);
            View view2 = qVar.A0;
            findViewById = view2 != null ? view2.findViewById(wp1.d.hf_tuner_icon) : null;
            if (findViewById == null) {
                return;
            }
            findViewById.setVisibility(0);
        }
    }
}
