package androidx.slidingpanelayout.widget;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.view.View;
import android.view.ViewGroup;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class f extends bp1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SlidingPaneLayout f19795a;

    public f(SlidingPaneLayout slidingPaneLayout) {
        this.f19795a = slidingPaneLayout;
    }

    @Override // bp1.h
    public final void A(View view, int i13) {
        SlidingPaneLayout slidingPaneLayout = this.f19795a;
        int childCount = slidingPaneLayout.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = slidingPaneLayout.getChildAt(i14);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Override // bp1.h
    public final void B(int i13) {
        SlidingPaneLayout slidingPaneLayout = this.f19795a;
        if (slidingPaneLayout.f19769i.f137746a == 0) {
            float f13 = slidingPaneLayout.f19763c;
            CopyOnWriteArrayList copyOnWriteArrayList = slidingPaneLayout.f19768h;
            if (f13 != 1.0f) {
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                    throw null;
                }
                slidingPaneLayout.sendAccessibilityEvent(32);
                slidingPaneLayout.f19770j = true;
                return;
            }
            slidingPaneLayout.e(slidingPaneLayout.f19762b);
            Iterator it2 = copyOnWriteArrayList.iterator();
            if (it2.hasNext()) {
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it2.next());
                throw null;
            }
            slidingPaneLayout.sendAccessibilityEvent(32);
            slidingPaneLayout.f19770j = false;
        }
    }

    @Override // bp1.h
    public final void C(View view, int i13, int i14) {
        SlidingPaneLayout slidingPaneLayout = this.f19795a;
        if (slidingPaneLayout.f19762b == null) {
            slidingPaneLayout.f19763c = 0.0f;
        } else {
            boolean b13 = slidingPaneLayout.b();
            SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams) slidingPaneLayout.f19762b.getLayoutParams();
            int width = slidingPaneLayout.f19762b.getWidth();
            if (b13) {
                i13 = (slidingPaneLayout.getWidth() - i13) - width;
            }
            slidingPaneLayout.f19763c = (i13 - ((b13 ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (b13 ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / slidingPaneLayout.f19764d;
            Iterator it = slidingPaneLayout.f19768h.iterator();
            if (it.hasNext()) {
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
                throw null;
            }
        }
        slidingPaneLayout.invalidate();
    }

    @Override // bp1.h
    public final void D(View view, float f13, float f14) {
        int paddingLeft;
        SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams) view.getLayoutParams();
        SlidingPaneLayout slidingPaneLayout = this.f19795a;
        if (slidingPaneLayout.b()) {
            int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            if (f13 < 0.0f || (f13 == 0.0f && slidingPaneLayout.f19763c > 0.5f)) {
                paddingRight += slidingPaneLayout.f19764d;
            }
            paddingLeft = (slidingPaneLayout.getWidth() - paddingRight) - slidingPaneLayout.f19762b.getWidth();
        } else {
            paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + slidingPaneLayout.getPaddingLeft();
            if (f13 > 0.0f || (f13 == 0.0f && slidingPaneLayout.f19763c > 0.5f)) {
                paddingLeft += slidingPaneLayout.f19764d;
            }
        }
        slidingPaneLayout.f19769i.s(paddingLeft, view.getTop());
        slidingPaneLayout.invalidate();
    }

    @Override // bp1.h
    public final boolean I(View view, int i13) {
        if (N()) {
            return ((SlidingPaneLayout.LayoutParams) view.getLayoutParams()).f19780b;
        }
        return false;
    }

    public final boolean N() {
        SlidingPaneLayout slidingPaneLayout = this.f19795a;
        if (slidingPaneLayout.f19765e || slidingPaneLayout.f19774n == 3) {
            return false;
        }
        if (slidingPaneLayout.c() && slidingPaneLayout.f19774n == 1) {
            return false;
        }
        return slidingPaneLayout.c() || slidingPaneLayout.f19774n != 2;
    }

    @Override // bp1.h
    public final int f(View view, int i13) {
        SlidingPaneLayout slidingPaneLayout = this.f19795a;
        SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams) slidingPaneLayout.f19762b.getLayoutParams();
        if (!slidingPaneLayout.b()) {
            int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i13, paddingLeft), slidingPaneLayout.f19764d + paddingLeft);
        }
        int width = slidingPaneLayout.getWidth() - (slidingPaneLayout.f19762b.getWidth() + (slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        return Math.max(Math.min(i13, width), width - slidingPaneLayout.f19764d);
    }

    @Override // bp1.h
    public final int g(View view, int i13) {
        return view.getTop();
    }

    @Override // bp1.h
    public final int r(View view) {
        return this.f19795a.f19764d;
    }

    @Override // bp1.h
    public final void y(int i13, int i14) {
        if (N()) {
            SlidingPaneLayout slidingPaneLayout = this.f19795a;
            slidingPaneLayout.f19769i.c(slidingPaneLayout.f19762b, i14);
        }
    }

    @Override // bp1.h
    public final void z(int i13) {
        if (N()) {
            SlidingPaneLayout slidingPaneLayout = this.f19795a;
            slidingPaneLayout.f19769i.c(slidingPaneLayout.f19762b, i13);
        }
    }
}
