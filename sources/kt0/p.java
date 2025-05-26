package kt0;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import com.pinterest.feature.home.viewpager.tabs.HomeFeedTabView;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p implements ek.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f80846a;

    public p(q qVar) {
        this.f80846a = qVar;
    }

    @Override // ek.c
    public final void a(ek.e tab) {
        e s33;
        ComponentCallbacks u13;
        Intrinsics.checkNotNullParameter(tab, "tab");
        e0 e0Var = this.f80846a.H0;
        if (e0Var == null || tab.f59128e != 0) {
            return;
        }
        Integer num = null;
        if (e0Var.isBound() && (s33 = e0Var.s3()) != null) {
            q qVar = (q) s33;
            int i13 = -1;
            if (qVar.c8() && (u13 = ((com.pinterest.feature.home.viewpager.a) qVar.a8()).u(0)) != null && (u13 instanceof d)) {
                i13 = ((HomeFeedFragment) ((d) u13)).l9();
            }
            num = Integer.valueOf(i13);
        }
        t t33 = e0Var.t3();
        int i14 = e0Var.f80819m;
        HashMap hashMap = new HashMap();
        hashMap.put("reason", i14 == 0 ? "tap_tab_view" : "tab_swipe");
        hashMap.put("index", String.valueOf(i14));
        if (num != null) {
            hashMap.put("first_visible_grid_item_index", String.valueOf(num.intValue()));
        }
        t.d(t33, f1.UNSELECT, u0.MULTI_TAB_HOME_TAB, g0.TAB_CAROUSEL, hashMap, 8);
    }

    @Override // ek.c
    public final void b(ek.e tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
    }

    @Override // ek.c
    public final void c(ek.e tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        q qVar = this.f80846a;
        if (qVar.Q0 == f.RESET && !qVar.B0) {
            qVar.y8(f.TAP);
        }
        qVar.B0 = false;
        e0 e0Var = qVar.H0;
        if (e0Var != null) {
            int i13 = tab.f59128e;
            if (((lt0.e) CollectionsKt.U(i13, e0Var.f80816j)) != null) {
                e0Var.f80819m = i13;
                e s33 = e0Var.s3();
                if (s33 != null) {
                    ((q) s33).s8(Integer.valueOf(e0Var.f80819m));
                }
            }
        }
        Context context = qVar.getContext();
        if (context == null) {
            return;
        }
        View view = tab.f59129f;
        HomeFeedTabView homeFeedTabView = view instanceof HomeFeedTabView ? (HomeFeedTabView) view : null;
        if (homeFeedTabView == null) {
            return;
        }
        int i14 = wp1.c.home_feed_tab_indicator;
        Object obj = d5.a.f53679a;
        Drawable drawable = context.getDrawable(i14);
        Intrinsics.g(drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int width = homeFeedTabView.findViewById(wp1.d.tab_text).getWidth();
        if (width > 0) {
            layerDrawable.setLayerWidth(0, width);
        }
        TabLayout tabLayout = qVar.f80855z0;
        if (tabLayout != null) {
            tabLayout.x(layerDrawable);
        } else {
            Intrinsics.r("tabLayout");
            throw null;
        }
    }
}
