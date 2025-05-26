package ek;

import androidx.recyclerview.widget.b2;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.Intrinsics;
import mj.m;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final TabLayout f59154a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewPager2 f59155b;

    /* renamed from: c, reason: collision with root package name */
    public final m f59156c;

    /* renamed from: d, reason: collision with root package name */
    public b2 f59157d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f59158e;

    public l(TabLayout tabLayout, ViewPager2 viewPager2, m mVar) {
        this.f59154a = tabLayout;
        this.f59155b = viewPager2;
        this.f59156c = mVar;
    }

    public final void a() {
        TabLayout tabLayout = this.f59154a;
        tabLayout.r();
        b2 b2Var = this.f59157d;
        if (b2Var != null) {
            int e13 = b2Var.e();
            for (int i13 = 0; i13 < e13; i13++) {
                e tab = tabLayout.p();
                this.f59156c.getClass();
                int i14 = com.pinterest.feature.sharesheet.view.previewcarousel.k.f48439c;
                Intrinsics.checkNotNullParameter(tab, "tab");
                tabLayout.e(tab, false);
            }
            if (e13 > 0) {
                int min = Math.min(this.f59155b.f19924d, tabLayout.f33126b.size() - 1);
                if (min != tabLayout.m()) {
                    tabLayout.u(tabLayout.n(min), true);
                }
            }
        }
    }
}
