package ka0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import androidx.viewpager.widget.ViewPager;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import h32.d4;
import i2.f2;
import j1.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import mq.e0;
import mq.f0;
import mq.g0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lka0/j;", "Lnl1/d;", "<init>", "()V", "retrieval_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j extends x {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f78907h0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public wk2.a f78908c0;

    /* renamed from: d0, reason: collision with root package name */
    public final m1 f78909d0;

    /* renamed from: e0, reason: collision with root package name */
    public GestaltTabLayout f78910e0;

    /* renamed from: f0, reason: collision with root package name */
    public ViewPager f78911f0;

    /* renamed from: g0, reason: collision with root package name */
    public final d4 f78912g0;

    public j() {
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new ca0.b0(3, new q1(this, 26)));
        int i13 = 25;
        this.f78909d0 = a1.s(this, k0.f80436a.b(w.class), new e0(a13, i13), new f0(null, a13, i13), new g0(this, a13, i13));
        this.f78912g0 = d4.UNKNOWN_VIEW;
    }

    public static final void Y7(j jVar, i2.o oVar, int i13) {
        jVar.getClass();
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1526098940);
        fc0.n.a(false, null, false, false, q2.i.c(231836964, new e(jVar, 0), sVar), sVar, 24576, 15);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new t0(jVar, i13, 22);
        }
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getO1() {
        return this.f78912g0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = a0.fragment_collages_board;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(z.top_navigation_bar);
        e eVar = new e(this, 1);
        Object obj = q2.i.f102113a;
        ((ComposeView) findViewById).o(new q2.h(eVar, true, -221724918));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = onCreateView.findViewById(z.feeds_view_pager);
        ViewPager viewPager = (ViewPager) findViewById2;
        wk2.a aVar = this.f78908c0;
        if (aVar == null) {
            Intrinsics.r("adapterProvider");
            throw null;
        }
        viewPager.z((xa.a) aVar.get());
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f78911f0 = viewPager;
        View findViewById3 = onCreateView.findViewById(z.filter_tab_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f78910e0 = (GestaltTabLayout) findViewById3;
        ViewPager viewPager2 = this.f78911f0;
        if (viewPager2 == null) {
            Intrinsics.r("viewPager");
            throw null;
        }
        xa.a aVar2 = viewPager2.f19892e;
        Intrinsics.g(aVar2, "null cannot be cast to non-null type com.pinterest.collage.retrieval.CollageRetrievalPagerAdapter");
        ((p) aVar2).H(q.a());
        GestaltTabLayout gestaltTabLayout = this.f78910e0;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabBar");
            throw null;
        }
        List a13 = q.a();
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(a13, 10));
        Iterator it = a13.iterator();
        while (true) {
            int i13 = 0;
            if (!it.hasNext()) {
                int i14 = GestaltTabLayout.f49631b0;
                gestaltTabLayout.E(gestaltTabLayout.m(), arrayList);
                GestaltTabLayout gestaltTabLayout2 = this.f78910e0;
                if (gestaltTabLayout2 == null) {
                    Intrinsics.r("tabBar");
                    throw null;
                }
                ViewPager viewPager3 = this.f78911f0;
                if (viewPager3 == null) {
                    Intrinsics.r("viewPager");
                    throw null;
                }
                gestaltTabLayout2.b(new h(this, viewPager3, i13));
                ViewPager viewPager4 = this.f78911f0;
                if (viewPager4 == null) {
                    Intrinsics.r("viewPager");
                    throw null;
                }
                GestaltTabLayout gestaltTabLayout3 = this.f78910e0;
                if (gestaltTabLayout3 != null) {
                    viewPager4.b(new i(this, gestaltTabLayout3));
                    return onCreateView;
                }
                Intrinsics.r("tabBar");
                throw null;
            }
            u uVar = (u) it.next();
            GestaltTabLayout gestaltTabLayout4 = this.f78910e0;
            if (gestaltTabLayout4 == null) {
                Intrinsics.r("tabBar");
                throw null;
            }
            arrayList.add(kh2.b0.V(gestaltTabLayout4, bs1.c.j2(new String[0], uVar.getTitleResId()), 0, 12));
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        kh2.b0.D1(this, new g(this, null));
    }
}
