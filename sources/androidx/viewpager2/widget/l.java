package androidx.viewpager2.widget;

import android.view.View;

/* loaded from: classes3.dex */
public final class l implements r5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f19974b;

    public /* synthetic */ l(m mVar, int i13) {
        this.f19973a = i13;
        this.f19974b = mVar;
    }

    @Override // r5.p
    public final boolean l(View view) {
        int i13 = this.f19973a;
        m mVar = this.f19974b;
        switch (i13) {
            case 0:
                int i14 = ((ViewPager2) view).f19924d + 1;
                ViewPager2 viewPager2 = mVar.f19978e;
                if (viewPager2.f19937q) {
                    viewPager2.j(i14, true);
                    break;
                }
                break;
            default:
                int i15 = ((ViewPager2) view).f19924d - 1;
                ViewPager2 viewPager22 = mVar.f19978e;
                if (viewPager22.f19937q) {
                    viewPager22.j(i15, true);
                    break;
                }
                break;
        }
        return true;
    }
}
