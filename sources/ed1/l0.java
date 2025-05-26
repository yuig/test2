package ed1;

import android.content.Context;
import androidx.recyclerview.widget.b2;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import so.f5;
import ua.t0;

/* loaded from: classes5.dex */
public final class l0 extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f58656a;

    /* renamed from: b, reason: collision with root package name */
    public final List f58657b;

    /* renamed from: c, reason: collision with root package name */
    public final yk1.j f58658c;

    /* renamed from: d, reason: collision with root package name */
    public final f5 f58659d;

    /* renamed from: e, reason: collision with root package name */
    public final lb0.q f58660e;

    /* renamed from: f, reason: collision with root package name */
    public final ha.a f58661f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, List shareConfigs, yk1.j mvpBinder, f5 shareBoardPreviewPresenterFactory, lb0.q prefsManagerPersisted) {
        super(0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(shareConfigs, "shareConfigs");
        Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
        Intrinsics.checkNotNullParameter(shareBoardPreviewPresenterFactory, "shareBoardPreviewPresenterFactory");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f58656a = context;
        this.f58657b = shareConfigs;
        this.f58658c = mvpBinder;
        this.f58659d = shareBoardPreviewPresenterFactory;
        this.f58660e = prefsManagerPersisted;
        this.f58661f = new ha.a();
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        com.pinterest.feature.sharesheet.view.previewcarousel.k view = (com.pinterest.feature.sharesheet.view.previewcarousel.k) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        j0 adapter = new j0(this.f58656a, this.f58657b, this.f58658c, this.f58659d, this);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        ViewPager2 viewPager2 = view.f48440a;
        if (viewPager2 == null) {
            Intrinsics.r("viewPager");
            throw null;
        }
        viewPager2.h(adapter);
        List list = adapter.f58649e;
        if (list.size() > 1) {
            TabLayout tabLayout = (TabLayout) view.findViewById(a62.c.carousel_tab_layout);
            ViewPager2 viewPager22 = view.f48440a;
            if (viewPager22 == null) {
                Intrinsics.r("viewPager");
                throw null;
            }
            ek.l lVar = new ek.l(tabLayout, viewPager22, new mj.m(27));
            if (lVar.f59158e) {
                throw new IllegalStateException("TabLayoutMediator is already attached");
            }
            b2 b2Var = viewPager22.f19930j.f19240m;
            lVar.f59157d = b2Var;
            if (b2Var == null) {
                throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
            }
            lVar.f59158e = true;
            viewPager22.f(new ek.j(tabLayout));
            tabLayout.b(new ek.k(viewPager22, true));
            lVar.f59157d.z(new za.e(lVar, 1));
            lVar.a();
            tabLayout.w(viewPager22.f19924d, 0.0f, true, true, true);
            ViewPager2 viewPager23 = view.f48440a;
            if (viewPager23 == null) {
                Intrinsics.r("viewPager");
                throw null;
            }
            viewPager23.k(list.size());
        }
        view.f48441b = this;
        t0.a(view, null);
    }
}
