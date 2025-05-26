package ek;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class f implements xa.i {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f59133a;

    /* renamed from: b, reason: collision with root package name */
    public int f59134b;

    /* renamed from: c, reason: collision with root package name */
    public int f59135c;

    public f(TabLayout tabLayout) {
        this.f59133a = new WeakReference(tabLayout);
    }

    @Override // xa.i
    public void A5(int i13) {
        TabLayout tabLayout = (TabLayout) this.f59133a.get();
        if (tabLayout == null || tabLayout.m() == i13 || i13 >= tabLayout.f33126b.size()) {
            return;
        }
        int i14 = this.f59135c;
        tabLayout.u(tabLayout.n(i13), i14 == 0 || (i14 == 2 && this.f59134b == 0));
    }

    public final void a() {
        this.f59135c = 0;
        this.f59134b = 0;
    }

    @Override // xa.i
    public final void i(int i13, float f13, int i14) {
        TabLayout tabLayout = (TabLayout) this.f59133a.get();
        if (tabLayout != null) {
            int i15 = this.f59135c;
            tabLayout.w(i13, f13, i15 != 2 || this.f59134b == 1, (i15 == 2 && this.f59134b == 0) ? false : true, false);
        }
    }

    @Override // xa.i
    public void i5(int i13) {
        this.f59134b = this.f59135c;
        this.f59135c = i13;
        TabLayout tabLayout = (TabLayout) this.f59133a.get();
        if (tabLayout != null) {
            tabLayout.S = this.f59135c;
        }
    }
}
