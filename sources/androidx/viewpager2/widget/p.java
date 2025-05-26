package androidx.viewpager2.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class p extends RecyclerView {
    public final /* synthetic */ ViewPager2 I0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ViewPager2 viewPager2, Context context) {
        super(context, null);
        this.I0 = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.I0.f19939s.getClass();
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.I0;
        accessibilityEvent.setFromIndex(viewPager2.f19924d);
        accessibilityEvent.setToIndex(viewPager2.f19924d);
        viewPager2.f19939s.w(accessibilityEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.I0.f19937q && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.I0.f19937q && super.onTouchEvent(motionEvent);
    }
}
