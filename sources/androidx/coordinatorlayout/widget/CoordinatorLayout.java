package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.customview.view.AbsSavedState;
import com.google.firebase.messaging.q;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import g1.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p5.e;
import q5.a2;
import q5.k0;
import q5.m0;
import q5.s;
import q5.t;
import q5.u;
import q5.v0;
import s3.o;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements s, t {

    /* renamed from: s, reason: collision with root package name */
    public static final String f17876s;

    /* renamed from: t, reason: collision with root package name */
    public static final Class[] f17877t;

    /* renamed from: u, reason: collision with root package name */
    public static final ThreadLocal f17878u;

    /* renamed from: v, reason: collision with root package name */
    public static final o f17879v;

    /* renamed from: w, reason: collision with root package name */
    public static final e f17880w;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f17881a;

    /* renamed from: b, reason: collision with root package name */
    public final q f17882b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f17883c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f17884d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f17885e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17886f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17887g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f17888h;

    /* renamed from: i, reason: collision with root package name */
    public View f17889i;

    /* renamed from: j, reason: collision with root package name */
    public View f17890j;

    /* renamed from: k, reason: collision with root package name */
    public a5.b f17891k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17892l;

    /* renamed from: m, reason: collision with root package name */
    public a2 f17893m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17894n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f17895o;

    /* renamed from: p, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f17896p;

    /* renamed from: q, reason: collision with root package name */
    public gc.c f17897q;

    /* renamed from: r, reason: collision with root package name */
    public final u f17898r;

    public static abstract class Behavior<V extends View> {
        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public void A(CoordinatorLayout coordinatorLayout, View view, View view2, int i13) {
            if (i13 == 0) {
                z(coordinatorLayout, view, view2);
            }
        }

        public boolean B(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(View view, Rect rect) {
            return false;
        }

        public boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void g(c cVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i13) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f13, float f14) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f13, float f14) {
            return false;
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int[] iArr, int i15) {
            if (i15 == 0) {
                p(coordinatorLayout, view, view2, i13, i14, iArr);
            }
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14) {
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int i15, int i16, int i17) {
            if (i17 == 0) {
                r(coordinatorLayout, view, view2, i14, i16);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
            iArr[0] = iArr[0] + i15;
            iArr[1] = iArr[1] + i16;
            s(coordinatorLayout, view, view2, i13, i14, i15, i16, i17);
        }

        public boolean u(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z13) {
            return false;
        }

        public void v(View view, Parcelable parcelable) {
        }

        public Parcelable w(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13) {
            return false;
        }

        public boolean y(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13, int i14) {
            if (i14 == 0) {
                return x(coordinatorLayout, view, view2, view3, i13);
            }
            return false;
        }

        public void z(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }
    }

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new d();

        /* renamed from: c, reason: collision with root package name */
        public SparseArray f17899c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f17899c = new SparseArray(readInt);
            for (int i13 = 0; i13 < readInt; i13++) {
                this.f17899c.append(iArr[i13], readParcelableArray[i13]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            SparseArray sparseArray = this.f17899c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i14 = 0; i14 < size; i14++) {
                iArr[i14] = this.f17899c.keyAt(i14);
                parcelableArr[i14] = (Parcelable) this.f17899c.valueAt(i14);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i13);
        }
    }

    static {
        Package r03 = CoordinatorLayout.class.getPackage();
        f17876s = r03 != null ? r03.getName() : null;
        f17879v = new o(1);
        f17877t = new Class[]{Context.class, AttributeSet.class};
        f17878u = new ThreadLocal();
        f17880w = new e(12);
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z4.a.coordinatorLayoutStyle);
    }

    public static int L(int i13) {
        if (i13 == 0) {
            return 8388661;
        }
        return i13;
    }

    public static void M(View view, int i13) {
        c cVar = (c) view.getLayoutParams();
        int i14 = cVar.f17908i;
        if (i14 != i13) {
            WeakHashMap weakHashMap = v0.f102521a;
            view.offsetLeftAndRight(i13 - i14);
            cVar.f17908i = i13;
        }
    }

    public static void N(View view, int i13) {
        c cVar = (c) view.getLayoutParams();
        int i14 = cVar.f17909j;
        if (i14 != i13) {
            WeakHashMap weakHashMap = v0.f102521a;
            view.offsetTopAndBottom(i13 - i14);
            cVar.f17909j = i13;
        }
    }

    public static Rect c() {
        Rect rect = (Rect) f17880w.b();
        return rect == null ? new Rect() : rect;
    }

    public static void u(int i13, Rect rect, Rect rect2, c cVar, int i14, int i15) {
        int i16 = cVar.f17902c;
        if (i16 == 0) {
            i16 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i16, i13);
        int i17 = cVar.f17903d;
        if ((i17 & 7) == 0) {
            i17 |= 8388611;
        }
        if ((i17 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 0) {
            i17 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i17, i13);
        int i18 = absoluteGravity & 7;
        int i19 = absoluteGravity & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
        int i23 = absoluteGravity2 & 7;
        int i24 = absoluteGravity2 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
        int width = i23 != 1 ? i23 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i24 != 16 ? i24 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i18 == 1) {
            width -= i14 / 2;
        } else if (i18 != 5) {
            width -= i14;
        }
        if (i19 == 16) {
            height -= i15 / 2;
        } else if (i19 != 80) {
            height -= i15;
        }
        rect2.set(width, height, i14 + width, i15 + height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c y(View view) {
        c cVar = (c) view.getLayoutParams();
        if (!cVar.f17901b) {
            if (view instanceof a) {
                Behavior a13 = ((a) view).a();
                if (a13 == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                cVar.d(a13);
                cVar.f17901b = true;
            } else {
                b bVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    bVar = (b) cls.getAnnotation(b.class);
                    if (bVar != null) {
                        break;
                    }
                }
                if (bVar != null) {
                    try {
                        cVar.d((Behavior) bVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e13) {
                        Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e13);
                    }
                }
                cVar.f17901b = true;
            }
        }
        return cVar;
    }

    public final void A(View view, View view2, int i13) {
        e eVar = f17880w;
        Rect c13 = c();
        Rect c14 = c();
        try {
            r(c13, view2);
            c cVar = (c) view.getLayoutParams();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            u(i13, c13, c14, cVar, measuredWidth, measuredHeight);
            f(cVar, c14, measuredWidth, measuredHeight);
            view.layout(c14.left, c14.top, c14.right, c14.bottom);
        } finally {
            c13.setEmpty();
            eVar.a(c13);
            c14.setEmpty();
            eVar.a(c14);
        }
    }

    public final void B(View view, int i13, int i14) {
        c cVar = (c) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(L(cVar.f17902c), i14);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i14 == 1) {
            i13 = width - i13;
        }
        int v13 = v(i13) - measuredWidth;
        if (i15 == 1) {
            v13 += measuredWidth / 2;
        } else if (i15 == 5) {
            v13 += measuredWidth;
        }
        int i17 = i16 != 16 ? i16 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin, Math.min(v13, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar).topMargin, Math.min(i17, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    public final void D(View view, int i13) {
        Behavior behavior;
        c cVar = (c) view.getLayoutParams();
        if (cVar.f17910k != null) {
            Rect c13 = c();
            Rect c14 = c();
            Rect c15 = c();
            r(c13, cVar.f17910k);
            o(view, c14, false);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            u(i13, c13, c15, cVar, measuredWidth, measuredHeight);
            boolean z13 = (c15.left == c14.left && c15.top == c14.top) ? false : true;
            f(cVar, c15, measuredWidth, measuredHeight);
            int i14 = c15.left - c14.left;
            int i15 = c15.top - c14.top;
            if (i14 != 0) {
                WeakHashMap weakHashMap = v0.f102521a;
                view.offsetLeftAndRight(i14);
            }
            if (i15 != 0) {
                WeakHashMap weakHashMap2 = v0.f102521a;
                view.offsetTopAndBottom(i15);
            }
            if (z13 && (behavior = cVar.f17900a) != null) {
                behavior.h(this, view, cVar.f17910k);
            }
            c13.setEmpty();
            e eVar = f17880w;
            eVar.a(c13);
            c14.setEmpty();
            eVar.a(c14);
            c15.setEmpty();
            eVar.a(c15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(int r21) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.E(int):void");
    }

    public final void F(View view, int i13) {
        c cVar = (c) view.getLayoutParams();
        View view2 = cVar.f17910k;
        if (view2 == null && cVar.f17905f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            A(view, view2, i13);
            return;
        }
        int i14 = cVar.f17904e;
        if (i14 >= 0) {
            B(view, i14, i13);
            return;
        }
        c cVar2 = (c) view.getLayoutParams();
        Rect c13 = c();
        c13.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar2).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin);
        if (this.f17893m != null) {
            WeakHashMap weakHashMap = v0.f102521a;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                c13.left = this.f17893m.c() + c13.left;
                c13.top = this.f17893m.e() + c13.top;
                c13.right -= this.f17893m.d();
                c13.bottom -= this.f17893m.b();
            }
        }
        Rect c14 = c();
        int i15 = cVar2.f17902c;
        if ((i15 & 7) == 0) {
            i15 |= 8388611;
        }
        if ((i15 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 0) {
            i15 |= 48;
        }
        Gravity.apply(i15, view.getMeasuredWidth(), view.getMeasuredHeight(), c13, c14, i13);
        view.layout(c14.left, c14.top, c14.right, c14.bottom);
        c13.setEmpty();
        e eVar = f17880w;
        eVar.a(c13);
        c14.setEmpty();
        eVar.a(c14);
    }

    public final void G(View view, int i13, int i14, int i15) {
        measureChildWithMargins(view, i13, i14, i15, 0);
    }

    public final boolean H(Behavior behavior, View view, MotionEvent motionEvent, int i13) {
        if (i13 == 0) {
            return behavior.k(this, view, motionEvent);
        }
        if (i13 == 1) {
            return behavior.B(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    public final boolean I(MotionEvent motionEvent, int i13) {
        boolean z13;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f17883c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i14 = childCount - 1; i14 >= 0; i14--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i14) : i14));
        }
        o oVar = f17879v;
        if (oVar != null) {
            Collections.sort(arrayList, oVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z14 = false;
        boolean z15 = false;
        for (int i15 = 0; i15 < size; i15++) {
            View view = (View) arrayList.get(i15);
            c cVar = (c) view.getLayoutParams();
            Behavior behavior = cVar.f17900a;
            if (!(z14 || z15) || actionMasked == 0) {
                if (!z15 && !z14 && behavior != null && (z14 = H(behavior, view, motionEvent, i13))) {
                    this.f17889i = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i16 = 0; i16 < i15; i16++) {
                            View view2 = (View) arrayList.get(i16);
                            Behavior behavior2 = ((c) view2.getLayoutParams()).f17900a;
                            if (behavior2 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = MotionEvent.obtain(motionEvent);
                                    motionEvent2.setAction(3);
                                }
                                H(behavior2, view2, motionEvent2, i13);
                            }
                        }
                    }
                }
                if (cVar.f17900a == null) {
                    cVar.f17912m = false;
                }
                boolean z16 = cVar.f17912m;
                if (z16) {
                    z13 = true;
                } else {
                    cVar.f17912m = z16;
                    z13 = z16;
                }
                z15 = z13 && !z16;
                if (z13 && !z15) {
                    break;
                }
            } else if (behavior != null) {
                if (motionEvent2 == null) {
                    motionEvent2 = MotionEvent.obtain(motionEvent);
                    motionEvent2.setAction(3);
                }
                H(behavior, view, motionEvent2, i13);
            }
        }
        arrayList.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z14;
    }

    public final void J() {
        if (this.f17887g && this.f17891k != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f17891k);
        }
        this.f17892l = false;
    }

    public final void K() {
        View view = this.f17889i;
        if (view != null) {
            Behavior behavior = ((c) view.getLayoutParams()).f17900a;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                behavior.B(this, this.f17889i, obtain);
                obtain.recycle();
            }
            this.f17889i = null;
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            ((c) getChildAt(i13).getLayoutParams()).f17912m = false;
        }
        this.f17886f = false;
    }

    public final void O() {
        WeakHashMap weakHashMap = v0.f102521a;
        if (!getFitsSystemWindows()) {
            m0.n(this, null);
            return;
        }
        if (this.f17897q == null) {
            this.f17897q = new gc.c(this, 25);
        }
        m0.n(this, this.f17897q);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof c) && super.checkLayoutParams(layoutParams);
    }

    public final void d() {
        if (this.f17887g) {
            if (this.f17891k == null) {
                this.f17891k = new a5.b(this, 0);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f17891k);
        }
        this.f17892l = true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j13) {
        Behavior behavior = ((c) view.getLayoutParams()).f17900a;
        if (behavior != null) {
            behavior.getClass();
        }
        return super.drawChild(canvas, view, j13);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f17895o;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void f(c cVar, Rect rect, int i13, int i14) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i13) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i14) - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin));
        rect.set(max, max2, i13 + max, i14 + max2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f17898r.b();
    }

    @Override // android.view.View
    public final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(View view) {
        ArrayList arrayList = (ArrayList) ((o0) this.f17882b.f33804b).get(view);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            View view2 = (View) arrayList.get(i13);
            Behavior behavior = ((c) view2.getLayoutParams()).f17900a;
            if (behavior != null) {
                behavior.h(this, view2, view);
            }
        }
    }

    @Override // q5.s
    public final void i(View view, View view2, int i13, int i14) {
        this.f17898r.c(i13, i14);
        this.f17890j = view2;
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            ((c) getChildAt(i15).getLayoutParams()).getClass();
        }
    }

    @Override // q5.s
    public void k(View view, int i13) {
        this.f17898r.d(i13);
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.b(i13)) {
                Behavior behavior = cVar.f17900a;
                if (behavior != null) {
                    behavior.A(this, childAt, view, i13);
                }
                if (i13 == 0) {
                    cVar.f17913n = false;
                } else if (i13 == 1) {
                    cVar.f17914o = false;
                }
                cVar.f17915p = false;
            }
        }
        this.f17890j = null;
    }

    @Override // q5.s
    public void l(View view, int i13, int i14, int[] iArr, int i15) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z13 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.b(i15) && (behavior = cVar.f17900a) != null) {
                    int[] iArr2 = this.f17884d;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.q(this, childAt, view, i13, i14, iArr2, i15);
                    i16 = i13 > 0 ? Math.max(i16, iArr2[0]) : Math.min(i16, iArr2[0]);
                    i17 = i14 > 0 ? Math.max(i17, iArr2[1]) : Math.min(i17, iArr2[1]);
                    z13 = true;
                }
            }
        }
        iArr[0] = i16;
        iArr[1] = i17;
        if (z13) {
            E(1);
        }
    }

    public final void o(View view, Rect rect, boolean z13) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z13) {
            r(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        K();
        if (this.f17892l) {
            if (this.f17891k == null) {
                this.f17891k = new a5.b(this, 0);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f17891k);
        }
        if (this.f17893m == null) {
            WeakHashMap weakHashMap = v0.f102521a;
            if (getFitsSystemWindows()) {
                k0.c(this);
            }
        }
        this.f17887g = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        K();
        if (this.f17892l && this.f17891k != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f17891k);
        }
        View view = this.f17890j;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f17887g = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        if (!this.f17894n || (drawable = this.f17895o) == null) {
            return;
        }
        a2 a2Var = this.f17893m;
        int e13 = a2Var != null ? a2Var.e() : 0;
        if (e13 > 0) {
            drawable.setBounds(0, 0, getWidth(), e13);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            K();
        }
        boolean I = I(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f17889i = null;
            K();
        }
        return I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        Behavior behavior;
        WeakHashMap weakHashMap = v0.f102521a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f17881a;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            View view = (View) arrayList.get(i17);
            if (view.getVisibility() != 8 && ((behavior = ((c) view.getLayoutParams()).f17900a) == null || !behavior.l(this, view, layoutDirection))) {
                F(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x032a, code lost:
    
        if (r0.m(r30, r20, r25, r21, r26) == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0107, code lost:
    
        if ((android.view.Gravity.getAbsoluteGravity(r4.f17907h, r11) & r12) == r12) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x032d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f13, float f14, boolean z13) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z14 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.b(0) && (behavior = cVar.f17900a) != null) {
                    z14 |= behavior.n(this, childAt, view, f13, f14);
                }
            }
        }
        if (z14) {
            E(1);
        }
        return z14;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f13, float f14) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z13 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.b(0) && (behavior = cVar.f17900a) != null) {
                    z13 |= behavior.o(this, childAt, view, f13, f14);
                }
            }
        }
        return z13;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i13, int i14, int[] iArr) {
        l(view, i13, i14, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i13, int i14, int i15, int i16) {
        t(view, i13, i14, i15, i16, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i13) {
        i(view, view2, i13, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        SparseArray sparseArray = savedState.f17899c;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            int id3 = childAt.getId();
            Behavior behavior = y(childAt).f17900a;
            if (id3 != -1 && behavior != null && (parcelable2 = (Parcelable) sparseArray.get(id3)) != null) {
                behavior.v(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable w13;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            int id3 = childAt.getId();
            Behavior behavior = ((c) childAt.getLayoutParams()).f17900a;
            if (id3 != -1 && behavior != null && (w13 = behavior.w(childAt)) != null) {
                sparseArray.append(id3, w13);
            }
        }
        savedState.f17899c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i13) {
        return x(view, view2, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        k(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean I;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f17889i;
        boolean z13 = false;
        if (view != null) {
            Behavior behavior = ((c) view.getLayoutParams()).f17900a;
            I = behavior != null ? behavior.B(this, this.f17889i, motionEvent) : false;
        } else {
            I = I(motionEvent, 1);
            if (actionMasked != 0 && I) {
                z13 = true;
            }
        }
        if (this.f17889i == null || actionMasked == 3) {
            I |= super.onTouchEvent(motionEvent);
        } else if (z13) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            super.onTouchEvent(obtain);
            obtain.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f17889i = null;
            K();
        }
        return I;
    }

    public final List p(View view) {
        q qVar = this.f17882b;
        int i13 = ((o0) qVar.f33804b).f63294c;
        ArrayList arrayList = null;
        for (int i14 = 0; i14 < i13; i14++) {
            ArrayList arrayList2 = (ArrayList) ((o0) qVar.f33804b).j(i14);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((o0) qVar.f33804b).f(i14));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public final void r(Rect rect, View view) {
        ThreadLocal threadLocal = a5.c.f711a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = a5.c.f711a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        a5.c.a(this, view, matrix);
        ThreadLocal threadLocal3 = a5.c.f712b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z13) {
        Behavior behavior = ((c) view.getLayoutParams()).f17900a;
        if (behavior == null || !behavior.u(this, view, rect, z13)) {
            return super.requestChildRectangleOnScreen(view, rect, z13);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z13) {
        super.requestDisallowInterceptTouchEvent(z13);
        if (!z13 || this.f17886f) {
            return;
        }
        if (this.f17889i == null) {
            int childCount = getChildCount();
            MotionEvent motionEvent = null;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                Behavior behavior = ((c) childAt.getLayoutParams()).f17900a;
                if (behavior != null) {
                    if (motionEvent == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    behavior.k(this, childAt, motionEvent);
                }
            }
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        K();
        this.f17886f = true;
    }

    @Override // q5.t
    public final void s(View view, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        Behavior behavior;
        boolean z13;
        int min;
        int childCount = getChildCount();
        boolean z14 = false;
        int i18 = 0;
        int i19 = 0;
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt = getChildAt(i23);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.b(i17) && (behavior = cVar.f17900a) != null) {
                    int[] iArr2 = this.f17884d;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.t(this, childAt, view, i13, i14, i15, i16, i17, iArr2);
                    i18 = i15 > 0 ? Math.max(i18, iArr2[0]) : Math.min(i18, iArr2[0]);
                    if (i16 > 0) {
                        z13 = true;
                        min = Math.max(i19, iArr2[1]);
                    } else {
                        z13 = true;
                        min = Math.min(i19, iArr2[1]);
                    }
                    i19 = min;
                    z14 = z13;
                }
            }
        }
        iArr[0] = iArr[0] + i18;
        iArr[1] = iArr[1] + i19;
        if (z14) {
            E(1);
        }
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z13) {
        super.setFitsSystemWindows(z13);
        O();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f17896p = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i13) {
        super.setVisibility(i13);
        boolean z13 = i13 == 0;
        Drawable drawable = this.f17895o;
        if (drawable == null || drawable.isVisible() == z13) {
            return;
        }
        drawable.setVisible(z13, false);
    }

    @Override // q5.s
    public void t(View view, int i13, int i14, int i15, int i16, int i17) {
        s(view, i13, i14, i15, i16, 0, this.f17885e);
    }

    public final int v(int i13) {
        int[] iArr = this.f17888h;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i13);
            return 0;
        }
        if (i13 >= 0 && i13 < iArr.length) {
            return iArr[i13];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i13 + " out of range for " + this);
        return 0;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f17895o;
    }

    public final a2 w() {
        return this.f17893m;
    }

    @Override // q5.s
    public boolean x(View view, View view2, int i13, int i14) {
        int childCount = getChildCount();
        boolean z13 = false;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                Behavior behavior = cVar.f17900a;
                if (behavior != null) {
                    boolean y13 = behavior.y(this, childAt, view, view2, i13, i14);
                    z13 |= y13;
                    if (i14 == 0) {
                        cVar.f17913n = y13;
                    } else if (i14 == 1) {
                        cVar.f17914o = y13;
                    }
                } else if (i14 == 0) {
                    cVar.f17913n = false;
                } else if (i14 == 1) {
                    cVar.f17914o = false;
                }
            }
        }
        return z13;
    }

    public final boolean z(View view, int i13, int i14) {
        e eVar = f17880w;
        Rect c13 = c();
        r(c13, view);
        try {
            return c13.contains(i13, i14);
        } finally {
            c13.setEmpty();
            eVar.a(c13);
        }
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f17881a = new ArrayList();
        this.f17882b = new q(2);
        this.f17883c = new ArrayList();
        this.f17884d = new int[2];
        this.f17885e = new int[2];
        this.f17898r = new u();
        TypedArray obtainStyledAttributes = i13 == 0 ? context.obtainStyledAttributes(attributeSet, z4.c.CoordinatorLayout, 0, z4.b.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, z4.c.CoordinatorLayout, i13, 0);
        if (i13 == 0) {
            v0.n(this, context, z4.c.CoordinatorLayout, attributeSet, obtainStyledAttributes, 0, z4.b.Widget_Support_CoordinatorLayout);
        } else {
            v0.n(this, context, z4.c.CoordinatorLayout, attributeSet, obtainStyledAttributes, i13, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(z4.c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f17888h = intArray;
            float f13 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i14 = 0; i14 < length; i14++) {
                this.f17888h[i14] = (int) (r12[i14] * f13);
            }
        }
        this.f17895o = obtainStyledAttributes.getDrawable(z4.c.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        O();
        super.setOnHierarchyChangeListener(new a5.a(this));
        WeakHashMap weakHashMap = v0.f102521a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c ? new c((c) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }
}
