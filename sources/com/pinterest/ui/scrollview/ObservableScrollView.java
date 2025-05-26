package com.pinterest.ui.scrollview;

import aa2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import ne0.b;

/* loaded from: classes4.dex */
public class ObservableScrollView extends NestedScrollView {
    public final ArrayList F;
    public int G;
    public final boolean H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public volatile boolean f52641J;
    public volatile boolean K;
    public long L;
    public int M;
    public final b N;

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.F.clear();
        this.L = -1L;
        this.M = -1;
        this.f52641J = false;
        this.K = false;
        removeCallbacks(this.N);
        super.onDetachedFromWindow();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.H && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((c) arrayList.get(i17)).getClass();
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            ((c) it.next()).getClass();
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i13, int i14, int i15, int i16) {
        int i17 = this.I;
        if (i17 <= 0 || i14 <= i17 || i14 <= i16) {
            this.G = i14;
            int size = this.F.size();
            for (int i18 = 0; i18 < size; i18++) {
                ((c) this.F.get(i18)).a(i14, i16);
            }
            if (this.L == -1) {
                this.f52641J = true;
                ArrayList arrayList = this.F;
                int size2 = arrayList.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    ((c) arrayList.get(i19)).c();
                }
            }
            this.L = System.currentTimeMillis();
        } else {
            scrollTo(i13, i16);
        }
        if (this.f52641J && i16 > 0 && ((i14 == 0 || i14 == this.M) && !this.K && this.f52641J)) {
            this.K = true;
            postDelayed(this.N, 100L);
        }
        super.onScrollChanged(i13, i14, i15, i16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if (r0 != 3) goto L15;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == r1) goto L11
            r2 = 2
            if (r0 == r2) goto Le
            r2 = 3
            if (r0 == r2) goto L11
            goto L22
        Le:
            r3.f52641J = r1
            goto L22
        L11:
            boolean r0 = r3.K
            if (r0 != 0) goto L22
            boolean r0 = r3.f52641J
            if (r0 == 0) goto L22
            r3.K = r1
            ne0.b r0 = r3.N
            r1 = 100
            r3.postDelayed(r0, r1)
        L22:
            boolean r4 = super.onTouchEvent(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.scrollview.ObservableScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void scrollTo(int i13, int i14) {
        this.M = i14;
        super.scrollTo(i13, i14);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.F = new ArrayList();
        this.G = 0;
        this.H = true;
        this.I = -1;
        this.L = -1L;
        this.M = -1;
        this.N = new b(this, 10);
        setOverScrollMode(2);
    }
}
