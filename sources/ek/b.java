package ek;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public final class b implements xa.h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f59119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabLayout f59120b;

    public b(TabLayout tabLayout) {
        this.f59120b = tabLayout;
    }

    @Override // xa.h
    public final void a(ViewPager viewPager, xa.a aVar, xa.a aVar2) {
        TabLayout tabLayout = this.f59120b;
        if (tabLayout.M == viewPager) {
            tabLayout.v(aVar2, this.f59119a);
        }
    }
}
