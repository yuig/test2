package xa;

import android.view.View;
import androidx.viewpager.widget.PagerTabStrip;
import androidx.viewpager.widget.ViewPager;
import kg.n;

/* loaded from: classes3.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PagerTabStrip f134376b;

    public /* synthetic */ b(PagerTabStrip pagerTabStrip, int i13) {
        this.f134375a = i13;
        this.f134376b = pagerTabStrip;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f134375a;
        PagerTabStrip pagerTabStrip = this.f134376b;
        switch (i13) {
            case 0:
                n.a(view);
                pagerTabStrip.f19874a.A(r3.f19893f - 1);
                break;
            default:
                n.a(view);
                ViewPager viewPager = pagerTabStrip.f19874a;
                viewPager.A(viewPager.f19893f + 1);
                break;
        }
    }
}
