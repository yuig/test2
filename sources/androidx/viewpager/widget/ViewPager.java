package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.appcompat.app.v;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.x1;
import com.google.android.gms.ads.AdSize;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ep.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import q5.m0;
import q5.v0;
import qq2.c;
import s3.o;
import xa.e;
import xa.f;
import xa.g;
import xa.h;
import xa.i;
import xa.j;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] U = {R.attr.layout_gravity};
    public static final o V = new o(3);
    public static final x1 W = new x1(1);
    public float A;
    public float B;
    public float C;
    public int D;
    public VelocityTracker E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public EdgeEffect f19887J;
    public EdgeEffect K;
    public boolean L;
    public boolean M;
    public int N;
    public ArrayList O;
    public i P;
    public i Q;
    public ArrayList R;
    public final v S;
    public int T;

    /* renamed from: a, reason: collision with root package name */
    public int f19888a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19889b;

    /* renamed from: c, reason: collision with root package name */
    public final f f19890c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f19891d;

    /* renamed from: e, reason: collision with root package name */
    public xa.a f19892e;

    /* renamed from: f, reason: collision with root package name */
    public int f19893f;

    /* renamed from: g, reason: collision with root package name */
    public int f19894g;

    /* renamed from: h, reason: collision with root package name */
    public Parcelable f19895h;

    /* renamed from: i, reason: collision with root package name */
    public ClassLoader f19896i;

    /* renamed from: j, reason: collision with root package name */
    public Scroller f19897j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19898k;

    /* renamed from: l, reason: collision with root package name */
    public j f19899l;

    /* renamed from: m, reason: collision with root package name */
    public int f19900m;

    /* renamed from: n, reason: collision with root package name */
    public float f19901n;

    /* renamed from: o, reason: collision with root package name */
    public float f19902o;

    /* renamed from: p, reason: collision with root package name */
    public int f19903p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f19904q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f19905r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f19906s;

    /* renamed from: t, reason: collision with root package name */
    public int f19907t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f19908u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f19909v;

    /* renamed from: w, reason: collision with root package name */
    public int f19910w;

    /* renamed from: x, reason: collision with root package name */
    public int f19911x;

    /* renamed from: y, reason: collision with root package name */
    public int f19912y;

    /* renamed from: z, reason: collision with root package name */
    public float f19913z;

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f19914a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19915b;

        /* renamed from: c, reason: collision with root package name */
        public float f19916c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f19917d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f19916c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.U);
            this.f19915b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public int f19918c;

        /* renamed from: d, reason: collision with root package name */
        public Parcelable f19919d;

        /* renamed from: e, reason: collision with root package name */
        public final ClassLoader f19920e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f19918c = parcel.readInt();
            this.f19919d = parcel.readParcelable(classLoader);
            this.f19920e = classLoader;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("FragmentPager.SavedState{");
            sb3.append(Integer.toHexString(System.identityHashCode(this)));
            sb3.append(" position=");
            return a.a.n(sb3, this.f19918c, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f19918c);
            parcel.writeParcelable(this.f19919d, i13);
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.f19889b = new ArrayList();
        this.f19890c = new f();
        this.f19891d = new Rect();
        this.f19894g = -1;
        this.f19895h = null;
        this.f19896i = null;
        this.f19901n = -3.4028235E38f;
        this.f19902o = Float.MAX_VALUE;
        this.f19907t = 1;
        this.D = -1;
        this.L = true;
        this.S = new v(this, 5);
        this.T = 0;
        n();
    }

    public final void A(int i13) {
        this.f19906s = false;
        C(i13, 0, !this.L, false);
    }

    public final void B(int i13, boolean z13) {
        this.f19906s = false;
        C(i13, 0, z13, false);
    }

    public final void C(int i13, int i14, boolean z13, boolean z14) {
        xa.a aVar = this.f19892e;
        if (aVar == null || aVar.b() <= 0) {
            F(false);
            return;
        }
        ArrayList arrayList = this.f19889b;
        if (!z14 && this.f19893f == i13 && arrayList.size() != 0) {
            F(false);
            return;
        }
        if (i13 < 0) {
            i13 = 0;
        } else if (i13 >= this.f19892e.b()) {
            i13 = this.f19892e.b() - 1;
        }
        int i15 = this.f19907t;
        int i16 = this.f19893f;
        if (i13 > i16 + i15 || i13 < i16 - i15) {
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                ((f) arrayList.get(i17)).f134382c = true;
            }
        }
        boolean z15 = this.f19893f != i13;
        if (!this.L) {
            u(i13);
            y(i13, i14, z13, z15);
        } else {
            this.f19893f = i13;
            if (z15) {
                g(i13);
            }
            requestLayout();
        }
    }

    public final void D(int i13) {
        if (i13 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i13 + " too small; defaulting to 1");
            i13 = 1;
        }
        if (i13 != this.f19907t) {
            this.f19907t = i13;
            t();
        }
    }

    public final void E(int i13) {
        if (this.T == i13) {
            return;
        }
        this.T = i13;
        i iVar = this.P;
        if (iVar != null) {
            iVar.i5(i13);
        }
        ArrayList arrayList = this.O;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                i iVar2 = (i) this.O.get(i14);
                if (iVar2 != null) {
                    iVar2.i5(i13);
                }
            }
        }
        i iVar3 = this.Q;
        if (iVar3 != null) {
            iVar3.i5(i13);
        }
    }

    public final void F(boolean z13) {
        if (this.f19905r != z13) {
            this.f19905r = z13;
        }
    }

    public final f a(int i13, int i14) {
        f fVar = new f();
        fVar.f134381b = i13;
        fVar.f134380a = this.f19892e.e(this, i13);
        this.f19892e.getClass();
        fVar.f134383d = 1.0f;
        ArrayList arrayList = this.f19889b;
        if (i14 < 0 || i14 >= arrayList.size()) {
            arrayList.add(fVar);
        } else {
            arrayList.add(i14, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i13, int i14) {
        f k13;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                View childAt = getChildAt(i15);
                if (childAt.getVisibility() == 0 && (k13 = k(childAt)) != null && k13.f134381b == this.f19893f) {
                    childAt.addFocusables(arrayList, i13, i14);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i14 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        f k13;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 0 && (k13 = k(childAt)) != null && k13.f134381b == this.f19893f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z13 = layoutParams2.f19914a | (view.getClass().getAnnotation(e.class) != null);
        layoutParams2.f19914a = z13;
        if (!this.f19904q) {
            super.addView(view, i13, layoutParams);
        } else {
            if (z13) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f19917d = true;
            addViewInLayout(view, i13, layoutParams);
        }
    }

    public final void b(i iVar) {
        if (this.O == null) {
            this.O = new ArrayList();
        }
        this.O.add(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 0
            if (r0 != r7) goto L9
        L7:
            r0 = r1
            goto L60
        L9:
            if (r0 == 0) goto L60
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r7) goto L16
            goto L60
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L60:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r7, r0, r8)
            r2 = 0
            r3 = 1
            r4 = 66
            r5 = 17
            if (r1 == 0) goto Lb2
            if (r1 == r0) goto Lb2
            android.graphics.Rect r6 = r7.f19891d
            if (r8 != r5) goto L96
            android.graphics.Rect r4 = r7.h(r6, r1)
            int r4 = r4.left
            android.graphics.Rect r5 = r7.h(r6, r0)
            int r5 = r5.left
            if (r0 == 0) goto L90
            if (r4 < r5) goto L90
            int r0 = r7.f19893f
            if (r0 <= 0) goto Lca
            int r0 = r0 - r3
            r7.B(r0, r3)
        L8e:
            r2 = r3
            goto Lca
        L90:
            boolean r0 = r1.requestFocus()
        L94:
            r2 = r0
            goto Lca
        L96:
            if (r8 != r4) goto Lca
            android.graphics.Rect r2 = r7.h(r6, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r7.h(r6, r0)
            int r3 = r3.left
            if (r0 == 0) goto Lad
            if (r2 > r3) goto Lad
            boolean r0 = r7.q()
            goto L94
        Lad:
            boolean r0 = r1.requestFocus()
            goto L94
        Lb2:
            if (r8 == r5) goto Lc1
            if (r8 != r3) goto Lb7
            goto Lc1
        Lb7:
            if (r8 == r4) goto Lbc
            r0 = 2
            if (r8 != r0) goto Lca
        Lbc:
            boolean r2 = r7.q()
            goto Lca
        Lc1:
            int r0 = r7.f19893f
            if (r0 <= 0) goto Lca
            int r0 = r0 - r3
            r7.B(r0, r3)
            goto L8e
        Lca:
            if (r2 == 0) goto Ld3
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        Ld3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i13) {
        if (this.f19892e == null) {
            return false;
        }
        int i14 = i();
        int scrollX = getScrollX();
        return i13 < 0 ? scrollX > ((int) (((float) i14) * this.f19901n)) : i13 > 0 && scrollX < ((int) (((float) i14) * this.f19902o));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f19898k = true;
        if (this.f19897j.isFinished() || !this.f19897j.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f19897j.getCurrX();
        int currY = this.f19897j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!r(currX)) {
                this.f19897j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = v0.f102521a;
        postInvalidateOnAnimation();
    }

    public boolean d(int i13, int i14, int i15, View view, boolean z13) {
        int i16;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i17 = i14 + scrollX;
                if (i17 >= childAt.getLeft() && i17 < childAt.getRight() && (i16 = i15 + scrollY) >= childAt.getTop() && i16 < childAt.getBottom() && d(i13, i17 - childAt.getLeft(), i16 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z13 && view.canScrollHorizontally(-i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
            r4 = this;
            boolean r0 = super.dispatchKeyEvent(r5)
            r1 = 1
            if (r0 != 0) goto L60
            int r0 = r5.getAction()
            if (r0 != 0) goto L5f
            int r0 = r5.getKeyCode()
            r2 = 21
            r3 = 2
            if (r0 == r2) goto L47
            r2 = 22
            if (r0 == r2) goto L35
            r2 = 61
            if (r0 == r2) goto L1f
            goto L5f
        L1f:
            boolean r0 = r5.hasNoModifiers()
            if (r0 == 0) goto L2a
            boolean r5 = r4.c(r3)
            goto L5c
        L2a:
            boolean r5 = r5.hasModifiers(r1)
            if (r5 == 0) goto L5f
            boolean r5 = r4.c(r1)
            goto L5c
        L35:
            boolean r5 = r5.hasModifiers(r3)
            if (r5 == 0) goto L40
            boolean r5 = r4.q()
            goto L5c
        L40:
            r5 = 66
            boolean r5 = r4.c(r5)
            goto L5c
        L47:
            boolean r5 = r5.hasModifiers(r3)
            if (r5 == 0) goto L56
            int r5 = r4.f19893f
            if (r5 <= 0) goto L5f
            int r5 = r5 - r1
            r4.B(r5, r1)
            goto L60
        L56:
            r5 = 17
            boolean r5 = r4.c(r5)
        L5c:
            if (r5 == 0) goto L5f
            goto L60
        L5f:
            r1 = 0
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f k13;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 0 && (k13 = k(childAt)) != null && k13.f134381b == this.f19893f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z13;
        xa.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.f19892e) == null || aVar.b() <= 1)) {
            this.f19887J.finish();
            this.K.finish();
            return;
        }
        if (this.f19887J.isFinished()) {
            z13 = false;
        } else {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate(getPaddingTop() + (-height), this.f19901n * width);
            this.f19887J.setSize(height, width);
            z13 = this.f19887J.draw(canvas);
            canvas.restoreToCount(save);
        }
        if (!this.K.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.f19902o + 1.0f)) * width2);
            this.K.setSize(height2, width2);
            z13 |= this.K.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (z13) {
            WeakHashMap weakHashMap = v0.f102521a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final void e(boolean z13) {
        boolean z14 = this.T == 2;
        if (z14) {
            F(false);
            if (!this.f19897j.isFinished()) {
                this.f19897j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f19897j.getCurrX();
                int currY = this.f19897j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        r(currX);
                    }
                }
            }
        }
        this.f19906s = false;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f19889b;
            if (i13 >= arrayList.size()) {
                break;
            }
            f fVar = (f) arrayList.get(i13);
            if (fVar.f134382c) {
                fVar.f134382c = false;
                z14 = true;
            }
            i13++;
        }
        if (z14) {
            v vVar = this.S;
            if (!z13) {
                vVar.run();
            } else {
                WeakHashMap weakHashMap = v0.f102521a;
                postOnAnimation(vVar);
            }
        }
    }

    public final void f() {
        int b13 = this.f19892e.b();
        this.f19888a = b13;
        ArrayList arrayList = this.f19889b;
        boolean z13 = arrayList.size() < (this.f19907t * 2) + 1 && arrayList.size() < b13;
        int i13 = this.f19893f;
        int i14 = 0;
        boolean z14 = false;
        while (i14 < arrayList.size()) {
            f fVar = (f) arrayList.get(i14);
            int c13 = this.f19892e.c(fVar.f134380a);
            if (c13 != -1) {
                if (c13 == -2) {
                    arrayList.remove(i14);
                    i14--;
                    if (!z14) {
                        this.f19892e.getClass();
                        z14 = true;
                    }
                    this.f19892e.a(this, fVar.f134381b, fVar.f134380a);
                    int i15 = this.f19893f;
                    if (i15 == fVar.f134381b) {
                        i13 = Math.max(0, Math.min(i15, b13 - 1));
                    }
                } else {
                    int i16 = fVar.f134381b;
                    if (i16 != c13) {
                        if (i16 == this.f19893f) {
                            i13 = c13;
                        }
                        fVar.f134381b = c13;
                    }
                }
                z13 = true;
            }
            i14++;
        }
        if (z14) {
            this.f19892e.getClass();
        }
        Collections.sort(arrayList, V);
        if (z13) {
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i17).getLayoutParams();
                if (!layoutParams.f19914a) {
                    layoutParams.f19916c = 0.0f;
                }
            }
            C(i13, 0, false, true);
            requestLayout();
        }
    }

    public final void g(int i13) {
        i iVar = this.P;
        if (iVar != null) {
            iVar.A5(i13);
        }
        ArrayList arrayList = this.O;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                i iVar2 = (i) this.O.get(i14);
                if (iVar2 != null) {
                    iVar2.A5(i13);
                }
            }
        }
        i iVar3 = this.Q;
        if (iVar3 != null) {
            iVar3.A5(i13);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f19916c = 0.0f;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i13, int i14) {
        throw null;
    }

    public final Rect h(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final int i() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public final f j(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return k(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public final f k(View view) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f19889b;
            if (i13 >= arrayList.size()) {
                return null;
            }
            f fVar = (f) arrayList.get(i13);
            if (this.f19892e.f(view, fVar.f134380a)) {
                return fVar;
            }
            i13++;
        }
    }

    public final f l() {
        f fVar;
        int i13;
        int i14 = i();
        float f13 = 0.0f;
        float scrollX = i14 > 0 ? getScrollX() / i14 : 0.0f;
        float f14 = i14 > 0 ? this.f19900m / i14 : 0.0f;
        int i15 = 0;
        boolean z13 = true;
        f fVar2 = null;
        int i16 = -1;
        float f15 = 0.0f;
        while (true) {
            ArrayList arrayList = this.f19889b;
            if (i15 >= arrayList.size()) {
                return fVar2;
            }
            f fVar3 = (f) arrayList.get(i15);
            if (z13 || fVar3.f134381b == (i13 = i16 + 1)) {
                fVar = fVar3;
            } else {
                float f16 = f13 + f15 + f14;
                f fVar4 = this.f19890c;
                fVar4.f134384e = f16;
                fVar4.f134381b = i13;
                this.f19892e.getClass();
                fVar4.f134383d = 1.0f;
                i15--;
                fVar = fVar4;
            }
            f13 = fVar.f134384e;
            float f17 = fVar.f134383d + f13 + f14;
            if (!z13 && scrollX < f13) {
                return fVar2;
            }
            if (scrollX < f17 || i15 == arrayList.size() - 1) {
                break;
            }
            int i17 = fVar.f134381b;
            float f18 = fVar.f134383d;
            i15++;
            z13 = false;
            f fVar5 = fVar;
            i16 = i17;
            f15 = f18;
            fVar2 = fVar5;
        }
        return fVar;
    }

    public final f m(int i13) {
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.f19889b;
            if (i14 >= arrayList.size()) {
                return null;
            }
            f fVar = (f) arrayList.get(i14);
            if (fVar.f134381b == i13) {
                return fVar;
            }
            i14++;
        }
    }

    public final void n() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f19897j = new Scroller(context, W);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f13 = context.getResources().getDisplayMetrics().density;
        this.f19912y = viewConfiguration.getScaledPagingTouchSlop();
        this.F = (int) (400.0f * f13);
        this.G = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f19887J = new EdgeEffect(context);
        this.K = new EdgeEffect(context);
        this.H = (int) (25.0f * f13);
        this.I = (int) (2.0f * f13);
        this.f19910w = (int) (f13 * 16.0f);
        v0.o(this, new g(this, 0));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        m0.n(this, new c(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.N
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6c
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6c
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f19914a
            if (r10 != 0) goto L2c
            goto L69
        L2c:
            int r9 = r9.f19915b
            r9 = r9 & 7
            if (r9 == r2) goto L50
            r10 = 3
            if (r9 == r10) goto L4a
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5d
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
        L46:
            r11 = r9
            r9 = r3
            r3 = r11
            goto L5d
        L4a:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5d
        L50:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
            goto L46
        L5d:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L68
            r8.offsetLeftAndRight(r3)
        L68:
            r3 = r9
        L69:
            int r7 = r7 + 1
            goto L1b
        L6c:
            xa.i r0 = r12.P
            if (r0 == 0) goto L73
            r0.i(r13, r14, r15)
        L73:
            java.util.ArrayList r0 = r12.O
            if (r0 == 0) goto L8d
            int r0 = r0.size()
        L7b:
            if (r1 >= r0) goto L8d
            java.util.ArrayList r3 = r12.O
            java.lang.Object r3 = r3.get(r1)
            xa.i r3 = (xa.i) r3
            if (r3 == 0) goto L8a
            r3.i(r13, r14, r15)
        L8a:
            int r1 = r1 + 1
            goto L7b
        L8d:
            xa.i r0 = r12.Q
            if (r0 == 0) goto L94
            r0.i(r13, r14, r15)
        L94:
            r12.M = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.o(int, float, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.S);
        Scroller scroller = this.f19897j;
        if (scroller != null && !scroller.isFinished()) {
            this.f19897j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            x();
            return false;
        }
        if (action != 0) {
            if (this.f19908u) {
                return true;
            }
            if (this.f19909v) {
                return false;
            }
        }
        if (action == 0) {
            float x13 = motionEvent.getX();
            this.B = x13;
            this.f19913z = x13;
            float y13 = motionEvent.getY();
            this.C = y13;
            this.A = y13;
            this.D = motionEvent.getPointerId(0);
            this.f19909v = false;
            this.f19898k = true;
            this.f19897j.computeScrollOffset();
            if (this.T != 2 || Math.abs(this.f19897j.getFinalX() - this.f19897j.getCurrX()) <= this.I) {
                e(false);
                this.f19908u = false;
            } else {
                this.f19897j.abortAnimation();
                this.f19906s = false;
                t();
                this.f19908u = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                E(1);
            }
        } else if (action == 2) {
            int i13 = this.D;
            if (i13 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i13);
                float x14 = motionEvent.getX(findPointerIndex);
                float f13 = x14 - this.f19913z;
                float abs = Math.abs(f13);
                float y14 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y14 - this.C);
                if (f13 != 0.0f) {
                    float f14 = this.f19913z;
                    if ((f14 >= this.f19911x || f13 <= 0.0f) && ((f14 <= getWidth() - this.f19911x || f13 >= 0.0f) && d((int) f13, (int) x14, (int) y14, this, false))) {
                        this.f19913z = x14;
                        this.A = y14;
                        this.f19909v = true;
                        return false;
                    }
                }
                float f15 = this.f19912y;
                if (abs > f15 && abs * 0.5f > abs2) {
                    this.f19908u = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    E(1);
                    float f16 = this.B;
                    float f17 = this.f19912y;
                    this.f19913z = f13 > 0.0f ? f16 + f17 : f16 - f17;
                    this.A = y14;
                    F(true);
                } else if (abs2 > f15) {
                    this.f19909v = true;
                }
                if (this.f19908u && s(x14)) {
                    WeakHashMap weakHashMap = v0.f102521a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            p(motionEvent);
        }
        if (this.E == null) {
            this.E = VelocityTracker.obtain();
        }
        this.E.addMovement(motionEvent);
        return this.f19908u;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i13, int i14) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i15;
        setMeasuredDimension(View.getDefaultSize(0, i13), View.getDefaultSize(0, i14));
        int measuredWidth = getMeasuredWidth();
        this.f19911x = Math.min(measuredWidth / 10, this.f19910w);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i16 = 0;
        while (true) {
            boolean z13 = true;
            int i17 = 1073741824;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f19914a) {
                int i18 = layoutParams2.f19915b;
                int i19 = i18 & 7;
                int i23 = i18 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
                boolean z14 = i23 == 48 || i23 == 80;
                if (i19 != 3 && i19 != 5) {
                    z13 = false;
                }
                int i24 = Integer.MIN_VALUE;
                if (z14) {
                    i15 = Integer.MIN_VALUE;
                    i24 = 1073741824;
                } else {
                    i15 = z13 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i25 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i25 != -2) {
                    if (i25 == -1) {
                        i25 = paddingLeft;
                    }
                    i24 = 1073741824;
                } else {
                    i25 = paddingLeft;
                }
                int i26 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i26 == -2) {
                    i26 = measuredHeight;
                    i17 = i15;
                } else if (i26 == -1) {
                    i26 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i25, i24), View.MeasureSpec.makeMeasureSpec(i26, i17));
                if (z14) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z13) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i16++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f19903p = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f19904q = true;
        t();
        this.f19904q = false;
        int childCount2 = getChildCount();
        for (int i27 = 0; i27 < childCount2; i27++) {
            View childAt2 = getChildAt(i27);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f19914a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f19916c), 1073741824), this.f19903p);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i13, Rect rect) {
        int i14;
        int i15;
        int i16;
        f k13;
        int childCount = getChildCount();
        if ((i13 & 2) != 0) {
            i15 = childCount;
            i14 = 0;
            i16 = 1;
        } else {
            i14 = childCount - 1;
            i15 = -1;
            i16 = -1;
        }
        while (i14 != i15) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 0 && (k13 = k(childAt)) != null && k13.f134381b == this.f19893f && childAt.requestFocus(i13, rect)) {
                return true;
            }
            i14 += i16;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        xa.a aVar = this.f19892e;
        ClassLoader classLoader = savedState.f19920e;
        if (aVar != null) {
            aVar.h(savedState.f19919d, classLoader);
            C(savedState.f19918c, 0, false, true);
        } else {
            this.f19894g = savedState.f19918c;
            this.f19895h = savedState.f19919d;
            this.f19896i = classLoader;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f19918c = this.f19893f;
        xa.a aVar = this.f19892e;
        if (aVar != null) {
            savedState.f19919d = aVar.i();
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        if (i13 != i15) {
            int i17 = this.f19900m;
            v(i13, i15, i17, i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x017b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.D) {
            int i13 = actionIndex == 0 ? 1 : 0;
            this.f19913z = motionEvent.getX(i13);
            this.D = motionEvent.getPointerId(i13);
            VelocityTracker velocityTracker = this.E;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q() {
        xa.a aVar = this.f19892e;
        if (aVar == null || this.f19893f >= aVar.b() - 1) {
            return false;
        }
        B(this.f19893f + 1, true);
        return true;
    }

    public final boolean r(int i13) {
        if (this.f19889b.size() == 0) {
            if (this.L) {
                return false;
            }
            this.M = false;
            o(0, 0.0f, 0);
            if (this.M) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f l13 = l();
        int i14 = i();
        int i15 = this.f19900m;
        int i16 = i14 + i15;
        float f13 = i14;
        int i17 = l13.f134381b;
        float f14 = ((i13 / f13) - l13.f134384e) / (l13.f134383d + (i15 / f13));
        this.M = false;
        o(i17, f14, (int) (i16 * f14));
        if (this.M) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f19904q) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final boolean s(float f13) {
        boolean z13;
        boolean z14;
        float f14 = this.f19913z - f13;
        this.f19913z = f13;
        float scrollX = getScrollX() + f14;
        float i13 = i();
        float f15 = this.f19901n * i13;
        float f16 = this.f19902o * i13;
        ArrayList arrayList = this.f19889b;
        boolean z15 = false;
        f fVar = (f) arrayList.get(0);
        f fVar2 = (f) b.h(arrayList, 1);
        if (fVar.f134381b != 0) {
            f15 = fVar.f134384e * i13;
            z13 = false;
        } else {
            z13 = true;
        }
        if (fVar2.f134381b != this.f19892e.b() - 1) {
            f16 = fVar2.f134384e * i13;
            z14 = false;
        } else {
            z14 = true;
        }
        if (scrollX < f15) {
            if (z13) {
                this.f19887J.onPull(Math.abs(f15 - scrollX) / i13);
                z15 = true;
            }
            scrollX = f15;
        } else if (scrollX > f16) {
            if (z14) {
                this.K.onPull(Math.abs(scrollX - f16) / i13);
                z15 = true;
            }
            scrollX = f16;
        }
        int i14 = (int) scrollX;
        this.f19913z = (scrollX - i14) + this.f19913z;
        scrollTo(i14, getScrollY());
        r(i14);
        return z15;
    }

    public final void t() {
        u(this.f19893f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r10 == r11) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(int r18) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.u(int):void");
    }

    public final void v(int i13, int i14, int i15, int i16) {
        if (i14 > 0 && !this.f19889b.isEmpty()) {
            if (!this.f19897j.isFinished()) {
                this.f19897j.setFinalX(i() * this.f19893f);
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i14 - getPaddingLeft()) - getPaddingRight()) + i16)) * (((i13 - getPaddingLeft()) - getPaddingRight()) + i15)), getScrollY());
                return;
            }
        }
        f m13 = m(this.f19893f);
        int min = (int) ((m13 != null ? Math.min(m13.f134384e, this.f19902o) : 0.0f) * ((i13 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            e(false);
            scrollTo(min, getScrollY());
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    public final void w() {
        int i13 = 0;
        while (i13 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i13).getLayoutParams()).f19914a) {
                removeViewAt(i13);
                i13--;
            }
            i13++;
        }
    }

    public final boolean x() {
        this.D = -1;
        this.f19908u = false;
        this.f19909v = false;
        VelocityTracker velocityTracker = this.E;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.E = null;
        }
        this.f19887J.onRelease();
        this.K.onRelease();
        return this.f19887J.isFinished() || this.K.isFinished();
    }

    public final void y(int i13, int i14, boolean z13, boolean z14) {
        int scrollX;
        int abs;
        f m13 = m(i13);
        int max = m13 != null ? (int) (Math.max(this.f19901n, Math.min(m13.f134384e, this.f19902o)) * i()) : 0;
        if (!z13) {
            if (z14) {
                g(i13);
            }
            e(false);
            scrollTo(max, 0);
            r(max);
            return;
        }
        if (getChildCount() == 0) {
            F(false);
        } else {
            Scroller scroller = this.f19897j;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.f19898k ? this.f19897j.getCurrX() : this.f19897j.getStartX();
                this.f19897j.abortAnimation();
                F(false);
            }
            int i15 = scrollX;
            int scrollY = getScrollY();
            int i16 = max - i15;
            int i17 = 0 - scrollY;
            if (i16 == 0 && i17 == 0) {
                e(false);
                t();
                E(0);
            } else {
                F(true);
                E(2);
                int i18 = i();
                int i19 = i18 / 2;
                float f13 = i18;
                float f14 = i19;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i16) * 1.0f) / f13) - 0.5f) * 0.47123894f)) * f14) + f14;
                int abs2 = Math.abs(i14);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    this.f19892e.getClass();
                    abs = (int) (((Math.abs(i16) / ((f13 * 1.0f) + this.f19900m)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, AdSize.WIDE_SKYSCRAPER_HEIGHT);
                this.f19898k = false;
                this.f19897j.startScroll(i15, scrollY, i16, i17, min);
                WeakHashMap weakHashMap = v0.f102521a;
                postInvalidateOnAnimation();
            }
        }
        if (z14) {
            g(i13);
        }
    }

    public final void z(xa.a aVar) {
        ArrayList arrayList;
        xa.a aVar2 = this.f19892e;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f134374b = null;
            }
            this.f19892e.getClass();
            int i13 = 0;
            while (true) {
                arrayList = this.f19889b;
                if (i13 >= arrayList.size()) {
                    break;
                }
                f fVar = (f) arrayList.get(i13);
                this.f19892e.a(this, fVar.f134381b, fVar.f134380a);
                i13++;
            }
            this.f19892e.getClass();
            arrayList.clear();
            w();
            this.f19893f = 0;
            scrollTo(0, 0);
        }
        xa.a aVar3 = this.f19892e;
        this.f19892e = aVar;
        this.f19888a = 0;
        if (aVar != null) {
            if (this.f19899l == null) {
                this.f19899l = new j(this);
            }
            xa.a aVar4 = this.f19892e;
            j jVar = this.f19899l;
            synchronized (aVar4) {
                aVar4.f134374b = jVar;
            }
            this.f19906s = false;
            boolean z13 = this.L;
            this.L = true;
            this.f19888a = this.f19892e.b();
            if (this.f19894g >= 0) {
                this.f19892e.h(this.f19895h, this.f19896i);
                C(this.f19894g, 0, false, true);
                this.f19894g = -1;
                this.f19895h = null;
                this.f19896i = null;
            } else if (z13) {
                requestLayout();
            } else {
                t();
            }
        }
        ArrayList arrayList2 = this.R;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.R.size();
        for (int i14 = 0; i14 < size; i14++) {
            ((h) this.R.get(i14)).a(this, aVar3, aVar);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public ViewPager(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19889b = new ArrayList();
        this.f19890c = new f();
        this.f19891d = new Rect();
        this.f19894g = -1;
        this.f19895h = null;
        this.f19896i = null;
        this.f19901n = -3.4028235E38f;
        this.f19902o = Float.MAX_VALUE;
        this.f19907t = 1;
        this.D = -1;
        this.L = true;
        this.S = new v(this, 5);
        this.T = 0;
        n();
    }
}
