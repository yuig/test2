package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.appcompat.app.z;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w0;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.l2;
import java.util.List;
import q5.v0;
import t3.s1;

/* loaded from: classes3.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f19921a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f19922b;

    /* renamed from: c, reason: collision with root package name */
    public final za.d f19923c;

    /* renamed from: d, reason: collision with root package name */
    public int f19924d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19925e;

    /* renamed from: f, reason: collision with root package name */
    public final f f19926f;

    /* renamed from: g, reason: collision with root package name */
    public j f19927g;

    /* renamed from: h, reason: collision with root package name */
    public int f19928h;

    /* renamed from: i, reason: collision with root package name */
    public Parcelable f19929i;

    /* renamed from: j, reason: collision with root package name */
    public p f19930j;

    /* renamed from: k, reason: collision with root package name */
    public o f19931k;

    /* renamed from: l, reason: collision with root package name */
    public e f19932l;

    /* renamed from: m, reason: collision with root package name */
    public za.d f19933m;

    /* renamed from: n, reason: collision with root package name */
    public b f19934n;

    /* renamed from: o, reason: collision with root package name */
    public d f19935o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19936p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f19937q;

    /* renamed from: r, reason: collision with root package name */
    public int f19938r;

    /* renamed from: s, reason: collision with root package name */
    public m f19939s;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new q();

        /* renamed from: a, reason: collision with root package name */
        public int f19940a;

        /* renamed from: b, reason: collision with root package name */
        public int f19941b;

        /* renamed from: c, reason: collision with root package name */
        public Parcelable f19942c;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f19940a);
            parcel.writeInt(this.f19941b);
            parcel.writeParcelable(this.f19942c, i13);
        }
    }

    public ViewPager2(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19921a = new Rect();
        this.f19922b = new Rect();
        this.f19923c = new za.d();
        this.f19925e = false;
        this.f19926f = new f(this, 0);
        this.f19928h = -1;
        this.f19936p = false;
        this.f19937q = true;
        this.f19938r = -1;
        e(context, attributeSet);
    }

    public final b2 a() {
        return this.f19930j.f19240m;
    }

    public final int b() {
        return this.f19924d;
    }

    public final int c() {
        return this.f19927g.f19157p == 1 ? 1 : 0;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i13) {
        return this.f19930j.canScrollHorizontally(i13);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i13) {
        return this.f19930j.canScrollVertically(i13);
    }

    public final int d() {
        int height;
        int paddingBottom;
        p pVar = this.f19930j;
        if (c() == 0) {
            height = pVar.getWidth() - pVar.getPaddingLeft();
            paddingBottom = pVar.getPaddingRight();
        } else {
            height = pVar.getHeight() - pVar.getPaddingTop();
            paddingBottom = pVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i13 = ((SavedState) parcelable).f19940a;
            sparseArray.put(this.f19930j.getId(), (Parcelable) sparseArray.get(i13));
            sparseArray.remove(i13);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        g();
    }

    public final void e(Context context, AttributeSet attributeSet) {
        this.f19939s = new m(this);
        p pVar = new p(this, context);
        this.f19930j = pVar;
        pVar.setId(View.generateViewId());
        this.f19930j.setDescendantFocusability(131072);
        j jVar = new j(this);
        this.f19927g = jVar;
        this.f19930j.R2(jVar);
        p pVar2 = this.f19930j;
        pVar2.U = ViewConfiguration.get(pVar2.getContext()).getScaledPagingTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ya.a.ViewPager2);
        v0.n(this, context, ya.a.ViewPager2, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            this.f19927g.C1(obtainStyledAttributes.getInt(ya.a.ViewPager2_android_orientation, 0));
            this.f19939s.x();
            obtainStyledAttributes.recycle();
            this.f19930j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f19930j.n(new h());
            e eVar = new e(this);
            this.f19932l = eVar;
            this.f19934n = new b(this, eVar, this.f19930j);
            o oVar = new o(this);
            this.f19931k = oVar;
            oVar.b(this.f19930j);
            this.f19930j.o(this.f19932l);
            za.d dVar = new za.d();
            this.f19933m = dVar;
            this.f19932l.f19956a = dVar;
            g gVar = new g(this, 0);
            g gVar2 = new g(this, 1);
            ((List) dVar.f141456b).add(gVar);
            ((List) this.f19933m.f141456b).add(gVar2);
            this.f19939s.s(this.f19930j);
            za.d dVar2 = this.f19933m;
            ((List) dVar2.f141456b).add(this.f19923c);
            d dVar3 = new d(this.f19927g);
            this.f19935o = dVar3;
            ((List) this.f19933m.f141456b).add(dVar3);
            p pVar3 = this.f19930j;
            attachViewToParent(pVar3, 0, pVar3.getLayoutParams());
        } catch (Throwable th3) {
            obtainStyledAttributes.recycle();
            throw th3;
        }
    }

    public final void f(k kVar) {
        ((List) this.f19923c.f141456b).add(kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        b2 b2Var;
        Fragment b13;
        if (this.f19928h == -1 || (b2Var = this.f19930j.f19240m) == 0) {
            return;
        }
        Parcelable parcelable = this.f19929i;
        if (parcelable != null) {
            if (b2Var instanceof za.l) {
                za.j jVar = (za.j) ((za.l) b2Var);
                g1.p pVar = jVar.f141469g;
                if (pVar.h()) {
                    g1.p pVar2 = jVar.f141468f;
                    if (pVar2.h()) {
                        Bundle bundle = (Bundle) parcelable;
                        if (bundle.getClassLoader() == null) {
                            bundle.setClassLoader(jVar.getClass().getClassLoader());
                        }
                        for (String str : bundle.keySet()) {
                            if (str.startsWith("f#") && str.length() > 2) {
                                long parseLong = Long.parseLong(str.substring(2));
                                w0 w0Var = jVar.f141467e;
                                w0Var.getClass();
                                String string = bundle.getString(str);
                                if (string == null) {
                                    b13 = null;
                                } else {
                                    b13 = w0Var.f18451c.b(string);
                                    if (b13 == null) {
                                        w0Var.k0(new IllegalStateException(s1.c("Fragment no longer exists for key ", str, ": unique id ", string)));
                                        throw null;
                                    }
                                }
                                pVar2.j(parseLong, b13);
                            } else {
                                if (!str.startsWith("s#") || str.length() <= 2) {
                                    throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                                }
                                long parseLong2 = Long.parseLong(str.substring(2));
                                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                                if (jVar.D(parseLong2)) {
                                    pVar.j(parseLong2, savedState);
                                }
                            }
                        }
                        if (!pVar2.h()) {
                            jVar.f141474l = true;
                            jVar.f141473k = true;
                            jVar.F();
                            Handler handler = new Handler(Looper.getMainLooper());
                            z zVar = new z(jVar, 17);
                            jVar.f141466d.a(new za.b(handler, zVar));
                            handler.postDelayed(zVar, 10000L);
                        }
                    }
                }
                throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
            }
            this.f19929i = null;
        }
        int max = Math.max(0, Math.min(this.f19928h, b2Var.e() - 1));
        this.f19924d = max;
        this.f19928h = -1;
        this.f19930j.G2(max);
        this.f19939s.x();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f19939s.getClass();
        this.f19939s.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public final void h(b2 b2Var) {
        b2 b2Var2 = this.f19930j.f19240m;
        this.f19939s.r(b2Var2);
        f fVar = this.f19926f;
        if (b2Var2 != null) {
            b2Var2.B(fVar);
        }
        this.f19930j.H2(b2Var);
        this.f19924d = 0;
        g();
        this.f19939s.q(b2Var);
        if (b2Var != null) {
            b2Var.z(fVar);
        }
    }

    public final void i(int i13, boolean z13) {
        if (this.f19934n.f19945b.f19968m) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        j(i13, z13);
    }

    public final void j(int i13, boolean z13) {
        b2 b2Var = this.f19930j.f19240m;
        if (b2Var == null) {
            if (this.f19928h != -1) {
                this.f19928h = Math.max(i13, 0);
                return;
            }
            return;
        }
        if (b2Var.e() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i13, 0), b2Var.e() - 1);
        int i14 = this.f19924d;
        if (min == i14 && this.f19932l.f19961f == 0) {
            return;
        }
        if (min == i14 && z13) {
            return;
        }
        double d2 = i14;
        this.f19924d = min;
        this.f19939s.x();
        e eVar = this.f19932l;
        if (eVar.f19961f != 0) {
            eVar.p();
            r9.d dVar = eVar.f19962g;
            d2 = dVar.f106812a + dVar.f106813b;
        }
        e eVar2 = this.f19932l;
        eVar2.getClass();
        eVar2.f19960e = z13 ? 2 : 3;
        eVar2.f19968m = false;
        boolean z14 = eVar2.f19964i != min;
        eVar2.f19964i = min;
        eVar2.m(2);
        if (z14) {
            eVar2.l(min);
        }
        if (!z13) {
            this.f19930j.G2(min);
            return;
        }
        double d13 = min;
        if (Math.abs(d13 - d2) <= 3.0d) {
            this.f19930j.d3(min);
            return;
        }
        this.f19930j.G2(d13 > d2 ? min - 3 : min + 3);
        p pVar = this.f19930j;
        pVar.post(new r(min, pVar));
    }

    public final void k(int i13) {
        if (i13 < 1 && i13 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f19938r = i13;
        this.f19930j.requestLayout();
    }

    public final void l(n nVar) {
        if (!this.f19936p) {
            g2 g2Var = this.f19930j.M;
            this.f19936p = true;
        }
        this.f19930j.O2(null);
        d dVar = this.f19935o;
        if (nVar == ((n) dVar.f19955c)) {
            return;
        }
        dVar.f19955c = nVar;
        e eVar = this.f19932l;
        eVar.p();
        r9.d dVar2 = eVar.f19962g;
        double d2 = dVar2.f106812a + dVar2.f106813b;
        int i13 = (int) d2;
        float f13 = (float) (d2 - i13);
        this.f19935o.b(i13, f13, Math.round(d() * f13));
    }

    public final void m(boolean z13) {
        this.f19937q = z13;
        this.f19939s.x();
    }

    public final void n() {
        o oVar = this.f19931k;
        if (oVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View h10 = oVar.h(this.f19927g);
        if (h10 == null) {
            return;
        }
        this.f19927g.getClass();
        int Z = l2.Z(h10);
        if (Z != this.f19924d && this.f19932l.f19961f == 0) {
            this.f19933m.c(Z);
        }
        this.f19925e = false;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f19939s.t(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int measuredWidth = this.f19930j.getMeasuredWidth();
        int measuredHeight = this.f19930j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f19921a;
        rect.left = paddingLeft;
        rect.right = (i15 - i13) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i16 - i14) - getPaddingBottom();
        Rect rect2 = this.f19922b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f19930j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f19925e) {
            n();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        measureChild(this.f19930j, i13, i14);
        int measuredWidth = this.f19930j.getMeasuredWidth();
        int measuredHeight = this.f19930j.getMeasuredHeight();
        int measuredState = this.f19930j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i13, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i14, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f19928h = savedState.f19941b;
        this.f19929i = savedState.f19942c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f19940a = this.f19930j.getId();
        int i13 = this.f19928h;
        if (i13 == -1) {
            i13 = this.f19924d;
        }
        savedState.f19941b = i13;
        Parcelable parcelable = this.f19929i;
        if (parcelable != null) {
            savedState.f19942c = parcelable;
        } else {
            Object obj = this.f19930j.f19240m;
            if (obj instanceof za.l) {
                za.j jVar = (za.j) ((za.l) obj);
                jVar.getClass();
                g1.p pVar = jVar.f141468f;
                int m13 = pVar.m();
                g1.p pVar2 = jVar.f141469g;
                Bundle bundle = new Bundle(pVar2.m() + m13);
                for (int i14 = 0; i14 < pVar.m(); i14++) {
                    long i15 = pVar.i(i14);
                    Fragment fragment = (Fragment) pVar.c(i15);
                    if (fragment != null && fragment.isAdded()) {
                        jVar.f141467e.X(bundle, a.a.g("f#", i15), fragment);
                    }
                }
                for (int i16 = 0; i16 < pVar2.m(); i16++) {
                    long i17 = pVar2.i(i16);
                    if (jVar.D(i17)) {
                        bundle.putParcelable(a.a.g("s#", i17), (Parcelable) pVar2.c(i17));
                    }
                }
                savedState.f19942c = bundle;
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i13, Bundle bundle) {
        this.f19939s.getClass();
        if (i13 != 8192 && i13 != 4096) {
            return super.performAccessibilityAction(i13, bundle);
        }
        this.f19939s.v(i13, bundle);
        return true;
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i13) {
        super.setLayoutDirection(i13);
        this.f19939s.x();
    }

    public ViewPager2(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f19921a = new Rect();
        this.f19922b = new Rect();
        this.f19923c = new za.d();
        this.f19925e = false;
        this.f19926f = new f(this, 0);
        this.f19928h = -1;
        this.f19936p = false;
        this.f19937q = true;
        this.f19938r = -1;
        e(context, attributeSet);
    }
}
