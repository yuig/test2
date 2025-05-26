package xa;

import android.database.DataSetObserver;
import androidx.viewpager.widget.PagerTitleStrip;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes3.dex */
public final class c extends DataSetObserver implements i, h {

    /* renamed from: a, reason: collision with root package name */
    public int f134377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PagerTitleStrip f134378b;

    public c(PagerTitleStrip pagerTitleStrip) {
        this.f134378b = pagerTitleStrip;
    }

    @Override // xa.i
    public final void A5(int i13) {
        if (this.f134377a == 0) {
            PagerTitleStrip pagerTitleStrip = this.f134378b;
            ViewPager viewPager = pagerTitleStrip.f19874a;
            pagerTitleStrip.d(viewPager.f19893f, viewPager.f19892e);
            float f13 = pagerTitleStrip.f19879f;
            if (f13 < 0.0f) {
                f13 = 0.0f;
            }
            pagerTitleStrip.e(f13, pagerTitleStrip.f19874a.f19893f, true);
        }
    }

    @Override // xa.h
    public final void a(ViewPager viewPager, a aVar, a aVar2) {
        this.f134378b.c(aVar, aVar2);
    }

    @Override // xa.i
    public final void i(int i13, float f13, int i14) {
        if (f13 > 0.5f) {
            i13++;
        }
        this.f134378b.e(f13, i13, false);
    }

    @Override // xa.i
    public final void i5(int i13) {
        this.f134377a = i13;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        PagerTitleStrip pagerTitleStrip = this.f134378b;
        ViewPager viewPager = pagerTitleStrip.f19874a;
        pagerTitleStrip.d(viewPager.f19893f, viewPager.f19892e);
        float f13 = pagerTitleStrip.f19879f;
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        pagerTitleStrip.e(f13, pagerTitleStrip.f19874a.f19893f, true);
    }
}
