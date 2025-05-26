package ek;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class j extends androidx.viewpager2.widget.k {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f59149a;

    /* renamed from: c, reason: collision with root package name */
    public int f59151c = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f59150b = 0;

    public j(TabLayout tabLayout) {
        this.f59149a = new WeakReference(tabLayout);
    }

    @Override // androidx.viewpager2.widget.k
    public final void a(int i13) {
        this.f59150b = this.f59151c;
        this.f59151c = i13;
        TabLayout tabLayout = (TabLayout) this.f59149a.get();
        if (tabLayout != null) {
            tabLayout.S = this.f59151c;
        }
    }

    @Override // androidx.viewpager2.widget.k
    public final void b(int i13, float f13, int i14) {
        TabLayout tabLayout = (TabLayout) this.f59149a.get();
        if (tabLayout != null) {
            int i15 = this.f59151c;
            tabLayout.w(i13, f13, i15 != 2 || this.f59150b == 1, (i15 == 2 && this.f59150b == 0) ? false : true, false);
        }
    }

    @Override // androidx.viewpager2.widget.k
    public final void c(int i13) {
        TabLayout tabLayout = (TabLayout) this.f59149a.get();
        if (tabLayout == null || tabLayout.m() == i13 || i13 >= tabLayout.f33126b.size()) {
            return;
        }
        int i14 = this.f59151c;
        tabLayout.u(tabLayout.n(i13), i14 == 0 || (i14 == 2 && this.f59150b == 0));
    }
}
