package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class c implements n {

    /* renamed from: a, reason: collision with root package name */
    public final int f19952a;

    public c(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("Margin must be non-negative");
        }
        this.f19952a = i13;
    }

    @Override // androidx.viewpager2.widget.n
    public final void x(View view, float f13) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if (!(parent instanceof RecyclerView) || !(parent2 instanceof ViewPager2)) {
            throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
        }
        ViewPager2 viewPager2 = (ViewPager2) parent2;
        float f14 = this.f19952a * f13;
        if (viewPager2.c() != 0) {
            view.setTranslationY(f14);
            return;
        }
        if (viewPager2.f19927g.Q() == 1) {
            f14 = -f14;
        }
        view.setTranslationX(f14);
    }
}
