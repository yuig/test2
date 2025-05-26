package g90;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.collage.cutoutcloseup.view.CutoutCarouselView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements xa.i {

    /* renamed from: a, reason: collision with root package name */
    public final CutoutCarouselView f64556a;

    /* renamed from: b, reason: collision with root package name */
    public final r f64557b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f64558c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f64559d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f64560e;

    /* renamed from: f, reason: collision with root package name */
    public float f64561f;

    /* renamed from: g, reason: collision with root package name */
    public int f64562g;

    public q(CutoutCarouselView cutoutCarousel, r viewPagerAdapter, int i13, Resources resources, i1.j jVar, j jVar2) {
        Intrinsics.checkNotNullParameter(cutoutCarousel, "cutoutCarousel");
        Intrinsics.checkNotNullParameter(viewPagerAdapter, "viewPagerAdapter");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f64556a = cutoutCarousel;
        this.f64557b = viewPagerAdapter;
        this.f64558c = jVar;
        this.f64559d = jVar2;
        this.f64560e = xk2.m.b(new p(0, resources));
        this.f64561f = i13;
        this.f64562g = i13;
    }

    @Override // xa.i
    public final void A5(int i13) {
        Function1 function1 = this.f64559d;
        if (function1 != null) {
            function1.invoke(this.f64556a.j3(i13));
        }
        r rVar = this.f64557b;
        int size = rVar.f77529f.size();
        int i14 = 0;
        while (i14 < size) {
            Fragment v13 = rVar.v(i14);
            h90.r rVar2 = v13 instanceof h90.r ? (h90.r) v13 : null;
            if (rVar2 != null) {
                boolean z13 = i14 == i13;
                RecyclerView g83 = rVar2.g8();
                if (g83 != null) {
                    g83.setNestedScrollingEnabled(z13);
                    g83.setOverScrollMode(2);
                }
            }
            i14++;
        }
    }

    @Override // xa.i
    public final void i(int i13, float f13, int i14) {
        Function2 function2;
        float f14 = i13 + f13;
        CutoutCarouselView cutoutCarouselView = this.f64556a;
        if (f13 <= 0.001f || f13 >= 0.999f) {
            int rint = (int) Math.rint(f14);
            int i15 = this.f64562g;
            if (rint != i15 && (function2 = this.f64558c) != null) {
                function2.invoke(rint > i15 ? e0.LEFT : e0.RIGHT, cutoutCarouselView.j3(i15));
            }
            cutoutCarouselView.G2(rint);
            this.f64562g = rint;
            f14 = rint;
        } else {
            cutoutCarouselView.scrollBy(ml2.c.c(((Number) this.f64560e.getValue()).intValue() * (f14 - this.f64561f)), 0);
        }
        this.f64561f = f14;
    }

    @Override // xa.i
    public final void i5(int i13) {
    }
}
