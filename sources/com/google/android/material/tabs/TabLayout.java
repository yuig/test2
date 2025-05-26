package com.google.android.material.tabs;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.q1;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.y1;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.common.api.d;
import ek.b;
import ek.f;
import ek.h;
import ek.i;
import fj.c;
import fj.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import lb.l0;
import q5.v0;
import xa.a;
import xa.e;

@e
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {
    public static final int U = l.Widget_Design_TabLayout;
    public static final p5.e V = new p5.e(16);
    public final int A;
    public int B;
    public int C;
    public final boolean D;
    public boolean E;
    public final int F;
    public final boolean G;
    public final d H;
    public final TimeInterpolator I;

    /* renamed from: J */
    public final ArrayList f33124J;
    public i K;
    public ValueAnimator L;
    public ViewPager M;
    public a N;
    public q1 O;
    public f P;
    public b Q;
    public boolean R;
    public int S;
    public final s4.f T;

    /* renamed from: a */
    public int f33125a;

    /* renamed from: b */
    public final ArrayList f33126b;

    /* renamed from: c */
    public ek.e f33127c;

    /* renamed from: d */
    public final ek.d f33128d;

    /* renamed from: e */
    public final int f33129e;

    /* renamed from: f */
    public final int f33130f;

    /* renamed from: g */
    public final int f33131g;

    /* renamed from: h */
    public final int f33132h;

    /* renamed from: i */
    public final int f33133i;

    /* renamed from: j */
    public final int f33134j;

    /* renamed from: k */
    public final int f33135k;

    /* renamed from: l */
    public ColorStateList f33136l;

    /* renamed from: m */
    public final ColorStateList f33137m;

    /* renamed from: n */
    public ColorStateList f33138n;

    /* renamed from: o */
    public Drawable f33139o;

    /* renamed from: p */
    public int f33140p;

    /* renamed from: q */
    public final PorterDuff.Mode f33141q;

    /* renamed from: r */
    public final float f33142r;

    /* renamed from: s */
    public final float f33143s;

    /* renamed from: t */
    public final int f33144t;

    /* renamed from: u */
    public int f33145u;

    /* renamed from: v */
    public final int f33146v;

    /* renamed from: w */
    public final int f33147w;

    /* renamed from: x */
    public final int f33148x;

    /* renamed from: y */
    public final int f33149y;

    /* renamed from: z */
    public int f33150z;

    public TabLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.tabStyle);
    }

    public static ColorStateList j(int i13, int i14) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i14, i13});
    }

    public final void A(boolean z13) {
        int i13 = 0;
        while (true) {
            ek.d dVar = this.f33128d;
            if (i13 >= dVar.getChildCount()) {
                return;
            }
            View childAt = dVar.getChildAt(i13);
            int i14 = this.f33146v;
            if (i14 == -1) {
                int i15 = this.C;
                i14 = (i15 == 0 || i15 == 2) ? this.f33148x : 0;
            }
            childAt.setMinimumWidth(i14);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.C == 1 && this.f33150z == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z13) {
                childAt.requestLayout();
            }
            i13++;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        f(view);
    }

    public final void b(ek.c cVar) {
        ArrayList arrayList = this.f33124J;
        if (arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    public void c(ek.e eVar) {
        e(eVar, this.f33126b.isEmpty());
    }

    public void d(ek.e eVar, int i13, boolean z13) {
        if (eVar.f59130g != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        eVar.f59128e = i13;
        ArrayList arrayList = this.f33126b;
        arrayList.add(i13, eVar);
        int size = arrayList.size();
        int i14 = -1;
        for (int i15 = i13 + 1; i15 < size; i15++) {
            if (((ek.e) arrayList.get(i15)).f59128e == this.f33125a) {
                i14 = i15;
            }
            ((ek.e) arrayList.get(i15)).f59128e = i15;
        }
        this.f33125a = i14;
        h hVar = eVar.f59131h;
        hVar.setSelected(false);
        hVar.setActivated(false);
        int i16 = eVar.f59128e;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.C == 1 && this.f33150z == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f33128d.addView(hVar, i16, layoutParams);
        if (z13) {
            eVar.b();
        }
    }

    public void e(ek.e eVar, boolean z13) {
        d(eVar, this.f33126b.size(), z13);
    }

    public final void f(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        ek.e p13 = p();
        CharSequence charSequence = tabItem.f33121a;
        if (charSequence != null) {
            if (TextUtils.isEmpty(p13.f59127d) && !TextUtils.isEmpty(charSequence)) {
                p13.f59131h.setContentDescription(charSequence);
            }
            p13.f59126c = charSequence;
            p13.c();
        }
        Drawable drawable = tabItem.f33122b;
        if (drawable != null) {
            p13.f59125b = drawable;
            TabLayout tabLayout = p13.f59130g;
            if (tabLayout.f33150z == 1 || tabLayout.C == 2) {
                tabLayout.A(true);
            }
            p13.c();
        }
        int i13 = tabItem.f33123c;
        if (i13 != 0) {
            p13.f59129f = LayoutInflater.from(p13.f59131h.getContext()).inflate(i13, (ViewGroup) p13.f59131h, false);
            p13.c();
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            p13.f59127d = tabItem.getContentDescription();
            p13.c();
        }
        c(p13);
    }

    public final void g(int i13) {
        if (i13 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = v0.f102521a;
            if (isLaidOut()) {
                ek.d dVar = this.f33128d;
                int childCount = dVar.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    if (dVar.getChildAt(i14).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int i15 = i(i13, 0.0f);
                int i16 = this.A;
                if (scrollX != i15) {
                    if (this.L == null) {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        this.L = valueAnimator;
                        valueAnimator.setInterpolator(this.I);
                        this.L.setDuration(i16);
                        this.L.addUpdateListener(new e0(this, 5));
                    }
                    this.L.setIntValues(scrollX, i15);
                    this.L.start();
                }
                ValueAnimator valueAnimator2 = dVar.f59122a;
                if (valueAnimator2 != null && valueAnimator2.isRunning() && dVar.f59123b.f33125a != i13) {
                    dVar.f59122a.cancel();
                }
                dVar.c(i13, i16, true);
                return;
            }
        }
        w(i13, 0.0f, true, true, true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0 != 2) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r5 = this;
            int r0 = r5.C
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = r2
            goto L14
        Lb:
            int r0 = r5.f33149y
            int r3 = r5.f33129e
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            java.util.WeakHashMap r3 = q5.v0.f102521a
            ek.d r3 = r5.f33128d
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r5.C
            java.lang.String r2 = "TabLayout"
            r4 = 1
            if (r0 == 0) goto L34
            if (r0 == r4) goto L27
            if (r0 == r1) goto L27
            goto L4c
        L27:
            int r0 = r5.f33150z
            if (r0 != r1) goto L30
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L30:
            r3.setGravity(r4)
            goto L4c
        L34:
            int r0 = r5.f33150z
            if (r0 == 0) goto L41
            if (r0 == r4) goto L3d
            if (r0 == r1) goto L46
            goto L4c
        L3d:
            r3.setGravity(r4)
            goto L4c
        L41:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L46:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L4c:
            r5.A(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.h():void");
    }

    public final int i(int i13, float f13) {
        ek.d dVar;
        View childAt;
        int i14 = this.C;
        if ((i14 != 0 && i14 != 2) || (childAt = (dVar = this.f33128d).getChildAt(i13)) == null) {
            return 0;
        }
        int i15 = i13 + 1;
        View childAt2 = i15 < dVar.getChildCount() ? dVar.getChildAt(i15) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i16 = (int) ((width + width2) * 0.5f * f13);
        WeakHashMap weakHashMap = v0.f102521a;
        return getLayoutDirection() == 0 ? left + i16 : left - i16;
    }

    public final void k(ek.e eVar) {
        ArrayList arrayList = this.f33124J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((ek.c) arrayList.get(size)).b(eVar);
        }
    }

    public final void l(ek.e eVar) {
        ArrayList arrayList = this.f33124J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((ek.c) arrayList.get(size)).a(eVar);
        }
    }

    public final int m() {
        ek.e eVar = this.f33127c;
        if (eVar != null) {
            return eVar.f59128e;
        }
        return -1;
    }

    public final ek.e n(int i13) {
        if (i13 >= 0) {
            ArrayList arrayList = this.f33126b;
            if (i13 < arrayList.size()) {
                return (ek.e) arrayList.get(i13);
            }
        }
        return null;
    }

    public final Drawable o() {
        return this.f33139o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d7.b.x0(this);
        if (this.M == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                z((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.R) {
            z(null, false);
            this.R = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        h hVar;
        Drawable drawable;
        int i13 = 0;
        while (true) {
            ek.d dVar = this.f33128d;
            if (i13 >= dVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = dVar.getChildAt(i13);
            if ((childAt instanceof h) && (drawable = (hVar = (h) childAt).f59144g) != null) {
                drawable.setBounds(hVar.getLeft(), hVar.getTop(), hVar.getRight(), hVar.getBottom());
                hVar.f59144g.draw(canvas);
            }
            i13++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) y1.i(1, this.f33126b.size(), 1).f19715a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i13 = this.C;
        return (i13 == 0 || i13 == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        Context context = getContext();
        ArrayList arrayList = this.f33126b;
        int size = arrayList.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size) {
                break;
            }
            ek.e eVar = (ek.e) arrayList.get(i16);
            if (eVar == null || eVar.f59125b == null || TextUtils.isEmpty(eVar.f59126c)) {
                i16++;
            } else if (!this.D) {
                i15 = 72;
            }
        }
        i15 = 48;
        int round = Math.round(l0.X(context, i15));
        int mode = View.MeasureSpec.getMode(i14);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i14 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i14) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size2 = View.MeasureSpec.getSize(i13);
        if (View.MeasureSpec.getMode(i13) != 0) {
            int i17 = this.f33147w;
            if (i17 <= 0) {
                i17 = (int) (size2 - l0.X(getContext(), 56));
            }
            this.f33145u = i17;
        }
        super.onMeasure(i13, i14);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i18 = this.C;
            if (i18 != 0) {
                if (i18 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i14, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
                if (i18 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i14, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i13;
        if (motionEvent.getActionMasked() != 8 || (i13 = this.C) == 0 || i13 == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final ek.e p() {
        ek.e eVar = (ek.e) V.b();
        if (eVar == null) {
            eVar = new ek.e();
            eVar.f59128e = -1;
            eVar.f59132i = -1;
        }
        eVar.f59130g = this;
        s4.f fVar = this.T;
        h hVar = fVar != null ? (h) fVar.b() : null;
        if (hVar == null) {
            hVar = new h(getContext(), this);
        }
        if (eVar != hVar.f59138a) {
            hVar.f59138a = eVar;
            hVar.c();
        }
        hVar.setFocusable(true);
        int i13 = this.f33146v;
        if (i13 == -1) {
            int i14 = this.C;
            i13 = (i14 == 0 || i14 == 2) ? this.f33148x : 0;
        }
        hVar.setMinimumWidth(i13);
        if (TextUtils.isEmpty(eVar.f59127d)) {
            hVar.setContentDescription(eVar.f59126c);
        } else {
            hVar.setContentDescription(eVar.f59127d);
        }
        eVar.f59131h = hVar;
        int i15 = eVar.f59132i;
        if (i15 != -1) {
            hVar.setId(i15);
        }
        return eVar;
    }

    public final void q() {
        int i13;
        r();
        a aVar = this.N;
        if (aVar != null) {
            int b13 = aVar.b();
            for (int i14 = 0; i14 < b13; i14++) {
                ek.e p13 = p();
                CharSequence d2 = this.N.d(i14);
                if (TextUtils.isEmpty(p13.f59127d) && !TextUtils.isEmpty(d2)) {
                    p13.f59131h.setContentDescription(d2);
                }
                p13.f59126c = d2;
                p13.c();
                e(p13, false);
            }
            ViewPager viewPager = this.M;
            if (viewPager == null || b13 <= 0 || (i13 = viewPager.f19893f) == m() || i13 >= this.f33126b.size()) {
                return;
            }
            u(n(i13), true);
        }
    }

    public final void r() {
        for (int childCount = this.f33128d.getChildCount() - 1; childCount >= 0; childCount--) {
            t(childCount);
        }
        Iterator it = this.f33126b.iterator();
        while (it.hasNext()) {
            ek.e eVar = (ek.e) it.next();
            it.remove();
            eVar.a();
            V.a(eVar);
        }
        this.f33127c = null;
    }

    public final void s(int i13) {
        ek.e eVar = this.f33127c;
        int i14 = eVar != null ? eVar.f59128e : 0;
        t(i13);
        ArrayList arrayList = this.f33126b;
        ek.e eVar2 = (ek.e) arrayList.remove(i13);
        if (eVar2 != null) {
            eVar2.a();
            V.a(eVar2);
        }
        int size = arrayList.size();
        int i15 = -1;
        for (int i16 = i13; i16 < size; i16++) {
            if (((ek.e) arrayList.get(i16)).f59128e == this.f33125a) {
                i15 = i16;
            }
            ((ek.e) arrayList.get(i16)).f59128e = i16;
        }
        this.f33125a = i15;
        if (i14 == i13) {
            u(arrayList.isEmpty() ? null : (ek.e) arrayList.get(Math.max(0, i13 - 1)), true);
        }
    }

    @Override // android.view.View
    public final void setElevation(float f13) {
        super.setElevation(f13);
        d7.b.v0(this, f13);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.f33128d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    public final void t(int i13) {
        ek.d dVar = this.f33128d;
        h hVar = (h) dVar.getChildAt(i13);
        dVar.removeViewAt(i13);
        if (hVar != null) {
            if (hVar.f59138a != null) {
                hVar.f59138a = null;
                hVar.c();
            }
            hVar.setSelected(false);
            this.T.a(hVar);
        }
        requestLayout();
    }

    public final void u(ek.e eVar, boolean z13) {
        ek.e eVar2 = this.f33127c;
        if (eVar2 == eVar) {
            if (eVar2 != null) {
                k(eVar);
                g(eVar.f59128e);
                return;
            }
            return;
        }
        int i13 = eVar != null ? eVar.f59128e : -1;
        if (z13) {
            if ((eVar2 == null || eVar2.f59128e == -1) && i13 != -1) {
                w(i13, 0.0f, true, true, true);
            } else {
                g(i13);
            }
            if (i13 != -1) {
                y(i13);
            }
        }
        this.f33127c = eVar;
        if (eVar2 != null && eVar2.f59130g != null) {
            l(eVar2);
        }
        if (eVar != null) {
            ArrayList arrayList = this.f33124J;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ek.c) arrayList.get(size)).c(eVar);
            }
        }
    }

    public final void v(a aVar, boolean z13) {
        q1 q1Var;
        a aVar2 = this.N;
        if (aVar2 != null && (q1Var = this.O) != null) {
            aVar2.f134373a.unregisterObserver(q1Var);
        }
        this.N = aVar;
        if (z13 && aVar != null) {
            if (this.O == null) {
                this.O = new q1(this, 1);
            }
            aVar.f134373a.registerObserver(this.O);
        }
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        if (r10 == false) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(int r6, float r7, boolean r8, boolean r9, boolean r10) {
        /*
            r5 = this;
            float r0 = (float) r6
            float r0 = r0 + r7
            int r1 = java.lang.Math.round(r0)
            if (r1 < 0) goto L9c
            ek.d r2 = r5.f33128d
            int r3 = r2.getChildCount()
            if (r1 < r3) goto L12
            goto L9c
        L12:
            if (r9 == 0) goto L38
            int r9 = java.lang.Math.round(r0)
            com.google.android.material.tabs.TabLayout r0 = r2.f59123b
            r0.f33125a = r9
            android.animation.ValueAnimator r9 = r2.f59122a
            if (r9 == 0) goto L2b
            boolean r9 = r9.isRunning()
            if (r9 == 0) goto L2b
            android.animation.ValueAnimator r9 = r2.f59122a
            r9.cancel()
        L2b:
            android.view.View r9 = r2.getChildAt(r6)
            int r0 = r6 + 1
            android.view.View r0 = r2.getChildAt(r0)
            r2.b(r9, r0, r7)
        L38:
            android.animation.ValueAnimator r9 = r5.L
            if (r9 == 0) goto L47
            boolean r9 = r9.isRunning()
            if (r9 == 0) goto L47
            android.animation.ValueAnimator r9 = r5.L
            r9.cancel()
        L47:
            int r7 = r5.i(r6, r7)
            int r9 = r5.getScrollX()
            int r0 = r5.m()
            r2 = 1
            r3 = 0
            if (r6 >= r0) goto L59
            if (r7 >= r9) goto L67
        L59:
            int r0 = r5.m()
            if (r6 <= r0) goto L61
            if (r7 <= r9) goto L67
        L61:
            int r0 = r5.m()
            if (r6 != r0) goto L69
        L67:
            r0 = r2
            goto L6a
        L69:
            r0 = r3
        L6a:
            java.util.WeakHashMap r4 = q5.v0.f102521a
            int r4 = r5.getLayoutDirection()
            if (r4 != r2) goto L89
            int r0 = r5.m()
            if (r6 >= r0) goto L7a
            if (r7 <= r9) goto L91
        L7a:
            int r0 = r5.m()
            if (r6 <= r0) goto L82
            if (r7 >= r9) goto L91
        L82:
            int r9 = r5.m()
            if (r6 != r9) goto L8b
            goto L91
        L89:
            if (r0 != 0) goto L91
        L8b:
            int r9 = r5.S
            if (r9 == r2) goto L91
            if (r10 == 0) goto L97
        L91:
            if (r6 >= 0) goto L94
            r7 = r3
        L94:
            r5.scrollTo(r7, r3)
        L97:
            if (r8 == 0) goto L9c
            r5.y(r1)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.w(int, float, boolean, boolean, boolean):void");
    }

    public final void x(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.f33139o = mutate;
        int i13 = this.f33140p;
        if (i13 != 0) {
            mutate.setTint(i13);
        } else {
            mutate.setTintList(null);
        }
        int i14 = this.F;
        if (i14 == -1) {
            i14 = this.f33139o.getIntrinsicHeight();
        }
        ek.d dVar = this.f33128d;
        TabLayout tabLayout = dVar.f59123b;
        Rect bounds = tabLayout.f33139o.getBounds();
        tabLayout.f33139o.setBounds(bounds.left, 0, bounds.right, i14);
        dVar.requestLayout();
    }

    public final void y(int i13) {
        ek.d dVar = this.f33128d;
        int childCount = dVar.getChildCount();
        if (i13 < childCount) {
            int i14 = 0;
            while (i14 < childCount) {
                View childAt = dVar.getChildAt(i14);
                if ((i14 != i13 || childAt.isSelected()) && (i14 == i13 || !childAt.isSelected())) {
                    childAt.setSelected(i14 == i13);
                    childAt.setActivated(i14 == i13);
                } else {
                    childAt.setSelected(i14 == i13);
                    childAt.setActivated(i14 == i13);
                    if (childAt instanceof h) {
                        ((h) childAt).e();
                    }
                }
                i14++;
            }
        }
    }

    public final void z(ViewPager viewPager, boolean z13) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.M;
        if (viewPager2 != null) {
            f fVar = this.P;
            if (fVar != null && (arrayList2 = viewPager2.O) != null) {
                arrayList2.remove(fVar);
            }
            b bVar = this.Q;
            if (bVar != null && (arrayList = this.M.R) != null) {
                arrayList.remove(bVar);
            }
        }
        i iVar = this.K;
        if (iVar != null) {
            this.f33124J.remove(iVar);
            this.K = null;
        }
        int i13 = 0;
        if (viewPager != null) {
            this.M = viewPager;
            if (this.P == null) {
                this.P = new f(this);
            }
            this.P.a();
            viewPager.b(this.P);
            i iVar2 = new i(viewPager, i13);
            this.K = iVar2;
            b(iVar2);
            a aVar = viewPager.f19892e;
            if (aVar != null) {
                v(aVar, true);
            }
            if (this.Q == null) {
                this.Q = new b(this);
            }
            b bVar2 = this.Q;
            bVar2.f59119a = true;
            if (viewPager.R == null) {
                viewPager.R = new ArrayList();
            }
            viewPager.R.add(bVar2);
            w(viewPager.f19893f, 0.0f, true, true, true);
        } else {
            this.M = null;
            v(null, false);
        }
        this.R = z13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TabLayout(@androidx.annotation.NonNull android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i13) {
        f(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        f(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        f(view);
    }
}
