package androidx.slidingpanelayout.widget;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.customview.view.AbsSavedState;
import ao2.o1;
import eb.l;
import eb.m;
import eb.o;
import eb.s;
import hb.i;
import hb.k;
import hb.n;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import q5.a2;
import q5.n0;
import q5.v0;

/* loaded from: classes3.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f19760r;

    /* renamed from: a, reason: collision with root package name */
    public boolean f19761a;

    /* renamed from: b, reason: collision with root package name */
    public View f19762b;

    /* renamed from: c, reason: collision with root package name */
    public float f19763c;

    /* renamed from: d, reason: collision with root package name */
    public int f19764d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19765e;

    /* renamed from: f, reason: collision with root package name */
    public float f19766f;

    /* renamed from: g, reason: collision with root package name */
    public float f19767g;

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f19768h;

    /* renamed from: i, reason: collision with root package name */
    public final y5.d f19769i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19770j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19771k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f19772l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f19773m;

    /* renamed from: n, reason: collision with root package name */
    public int f19774n;

    /* renamed from: o, reason: collision with root package name */
    public eb.f f19775o;

    /* renamed from: p, reason: collision with root package name */
    public final e f19776p;

    /* renamed from: q, reason: collision with root package name */
    public final m.h f19777q;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: d, reason: collision with root package name */
        public static final int[] f19778d = {R.attr.layout_weight};

        /* renamed from: a, reason: collision with root package name */
        public float f19779a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f19780b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f19781c;

        public LayoutParams(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f19779a = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f19778d);
            this.f19779a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new g();

        /* renamed from: c, reason: collision with root package name */
        public boolean f19782c;

        /* renamed from: d, reason: collision with root package name */
        public int f19783d;

        public SavedState(Parcel parcel) {
            super(parcel, null);
            this.f19782c = parcel.readInt() != 0;
            this.f19783d = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f19782c ? 1 : 0);
            parcel.writeInt(this.f19783d);
        }
    }

    static {
        f19760r = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final boolean a(View view) {
        if (view == null) {
            return false;
        }
        return this.f19761a && ((LayoutParams) view.getLayoutParams()).f19781c && this.f19763c > 0.0f;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() != 1) {
            super.addView(view, i13, layoutParams);
            return;
        }
        h hVar = new h(view.getContext());
        hVar.addView(view);
        super.addView(hVar, i13, layoutParams);
    }

    public final boolean b() {
        WeakHashMap weakHashMap = v0.f102521a;
        return getLayoutDirection() == 1;
    }

    public final boolean c() {
        return !this.f19761a || this.f19763c == 0.0f;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        y5.d dVar = this.f19769i;
        if (dVar.h()) {
            if (!this.f19761a) {
                dVar.a();
            } else {
                WeakHashMap weakHashMap = v0.f102521a;
                postInvalidateOnAnimation();
            }
        }
    }

    public final boolean d(float f13) {
        int paddingLeft;
        if (!this.f19761a) {
            return false;
        }
        boolean b13 = b();
        LayoutParams layoutParams = (LayoutParams) this.f19762b.getLayoutParams();
        if (b13) {
            int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            paddingLeft = (int) (getWidth() - (((f13 * this.f19764d) + paddingRight) + this.f19762b.getWidth()));
        } else {
            paddingLeft = (int) ((f13 * this.f19764d) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
        }
        View view = this.f19762b;
        if (!this.f19769i.u(view, paddingLeft, view.getTop())) {
            return false;
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
        WeakHashMap weakHashMap = v0.f102521a;
        postInvalidateOnAnimation();
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        b();
        if (getChildCount() > 1) {
            getChildAt(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j13) {
        boolean b13 = b() ^ c();
        f5.e eVar = null;
        y5.d dVar = this.f19769i;
        if (b13) {
            dVar.f137762q = 1;
            if (f19760r) {
                WeakHashMap weakHashMap = v0.f102521a;
                a2 a13 = n0.a(this);
                if (a13 != null) {
                    eVar = a13.f102400a.i();
                }
            }
            if (eVar != null) {
                dVar.f137760o = Math.max(dVar.f137761p, eVar.f61081a);
            }
        } else {
            dVar.f137762q = 2;
            if (f19760r) {
                WeakHashMap weakHashMap2 = v0.f102521a;
                a2 a14 = n0.a(this);
                if (a14 != null) {
                    eVar = a14.f102400a.i();
                }
            }
            if (eVar != null) {
                dVar.f137760o = Math.max(dVar.f137761p, eVar.f61083c);
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f19761a && !layoutParams.f19780b && this.f19762b != null) {
            Rect rect = this.f19772l;
            canvas.getClipBounds(rect);
            if (b()) {
                rect.left = Math.max(rect.left, this.f19762b.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f19762b.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean drawChild = super.drawChild(canvas, view, j13);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final void e(View view) {
        int i13;
        int i14;
        int i15;
        int i16;
        View childAt;
        boolean z13;
        View view2 = view;
        boolean b13 = b();
        int width = b13 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = b13 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view.isOpaque()) {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        } else {
            i13 = view.getLeft();
            i14 = view.getRight();
            i15 = view.getTop();
            i16 = view.getBottom();
        }
        int childCount = getChildCount();
        int i17 = 0;
        while (i17 < childCount && (childAt = getChildAt(i17)) != view2) {
            if (childAt.getVisibility() == 8) {
                z13 = b13;
            } else {
                z13 = b13;
                childAt.setVisibility((Math.max(b13 ? paddingLeft : width, childAt.getLeft()) < i13 || Math.max(paddingTop, childAt.getTop()) < i15 || Math.min(b13 ? width : paddingLeft, childAt.getRight()) > i14 || Math.min(height, childAt.getBottom()) > i16) ? 0 : 4);
            }
            i17++;
            view2 = view;
            b13 = z13;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f19779a = 0.0f;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams2.f19779a = 0.0f;
            return layoutParams2;
        }
        LayoutParams layoutParams3 = new LayoutParams(layoutParams);
        layoutParams3.f19779a = 0.0f;
        return layoutParams3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Activity activity;
        super.onAttachedToWindow();
        this.f19771k = true;
        if (this.f19777q != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                m.h hVar = this.f19777q;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                o1 o1Var = (o1) hVar.f85199d;
                if (o1Var != null) {
                    o1Var.cancel((CancellationException) null);
                }
                hVar.f85199d = j.z(dl2.b.b(dl2.b.o0((Executor) hVar.f85198c)), null, null, new d(hVar, activity, null), 3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        o1 o1Var;
        super.onDetachedFromWindow();
        this.f19771k = true;
        m.h hVar = this.f19777q;
        if (hVar != null && (o1Var = (o1) hVar.f85199d) != null) {
            o1Var.cancel((CancellationException) null);
        }
        ArrayList arrayList = this.f19773m;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(arrayList.get(0));
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z13;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z14 = this.f19761a;
        y5.d dVar = this.f19769i;
        if (!z14 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            int x13 = (int) motionEvent.getX();
            int y13 = (int) motionEvent.getY();
            dVar.getClass();
            this.f19770j = y5.d.l(childAt, x13, y13);
        }
        if (!this.f19761a || (this.f19765e && actionMasked != 0)) {
            dVar.b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            dVar.b();
            return false;
        }
        if (actionMasked == 0) {
            this.f19765e = false;
            float x14 = motionEvent.getX();
            float y14 = motionEvent.getY();
            this.f19766f = x14;
            this.f19767g = y14;
            dVar.getClass();
            if (y5.d.l(this.f19762b, (int) x14, (int) y14) && a(this.f19762b)) {
                z13 = true;
                return dVar.t(motionEvent) || z13;
            }
        } else if (actionMasked == 2) {
            float x15 = motionEvent.getX();
            float y15 = motionEvent.getY();
            float abs = Math.abs(x15 - this.f19766f);
            float abs2 = Math.abs(y15 - this.f19767g);
            if (abs > dVar.f137747b && abs2 > abs) {
                dVar.b();
                this.f19765e = true;
                return false;
            }
        }
        z13 = false;
        if (dVar.t(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        int i23;
        boolean b13 = b();
        int i24 = i15 - i13;
        int paddingRight = b13 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = b13 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f19771k) {
            this.f19763c = (this.f19761a && this.f19770j) ? 0.0f : 1.0f;
        }
        int i25 = paddingRight;
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt = getChildAt(i26);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f19780b) {
                    int i27 = i24 - paddingLeft;
                    int min = (Math.min(paddingRight, i27) - i25) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.f19764d = min;
                    int i28 = b13 ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.f19781c = (measuredWidth / 2) + ((i25 + i28) + min) > i27;
                    int i29 = (int) (min * this.f19763c);
                    i17 = i28 + i29 + i25;
                    this.f19763c = i29 / min;
                } else {
                    i17 = paddingRight;
                }
                if (b13) {
                    i18 = i24 - i17;
                    i19 = i18 - measuredWidth;
                } else {
                    i18 = i17 + measuredWidth;
                    i19 = i17;
                }
                childAt.layout(i19, paddingTop, i18, childAt.getMeasuredHeight() + paddingTop);
                eb.f fVar = this.f19775o;
                if (fVar != null) {
                    db.b bVar = ((eb.h) fVar).f58192a;
                    int b14 = bVar.b();
                    int a13 = bVar.a();
                    eb.c cVar = eb.c.f58182b;
                    if ((b14 > a13 ? eb.c.f58183c : cVar) == cVar && ((eb.h) this.f19775o).a()) {
                        i23 = ((eb.h) this.f19775o).f58192a.c().width();
                        paddingRight = Math.abs(i23) + childAt.getWidth() + paddingRight;
                        i25 = i17;
                    }
                }
                i23 = 0;
                paddingRight = Math.abs(i23) + childAt.getWidth() + paddingRight;
                i25 = i17;
            }
        }
        if (this.f19771k) {
            e(this.f19762b);
        }
        this.f19771k = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026b  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v27 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r23, int r24) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f18020a);
        if (savedState.f19782c) {
            if (!this.f19761a) {
                this.f19770j = true;
            }
            if (this.f19771k || d(0.0f)) {
                this.f19770j = true;
            }
        } else {
            if (!this.f19761a) {
                this.f19770j = false;
            }
            if (this.f19771k || d(1.0f)) {
                this.f19770j = false;
            }
        }
        this.f19770j = savedState.f19782c;
        this.f19774n = savedState.f19783d;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f19782c = this.f19761a ? c() : this.f19770j;
        savedState.f19783d = this.f19774n;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        if (i13 != i15) {
            this.f19771k = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f19761a) {
            return super.onTouchEvent(motionEvent);
        }
        y5.d dVar = this.f19769i;
        dVar.m(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x13 = motionEvent.getX();
            float y13 = motionEvent.getY();
            this.f19766f = x13;
            this.f19767g = y13;
        } else if (actionMasked == 1 && a(this.f19762b)) {
            float x14 = motionEvent.getX();
            float y14 = motionEvent.getY();
            float f13 = x14 - this.f19766f;
            float f14 = y14 - this.f19767g;
            int i13 = dVar.f137747b;
            if ((f14 * f14) + (f13 * f13) < i13 * i13 && y5.d.l(this.f19762b, (int) x14, (int) y14)) {
                if (!this.f19761a) {
                    this.f19770j = false;
                }
                if (this.f19771k || d(1.0f)) {
                    this.f19770j = false;
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view.getParent() instanceof h) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f19761a) {
            return;
        }
        this.f19770j = view == this.f19762b;
    }

    public SlidingPaneLayout(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f19763c = 1.0f;
        this.f19768h = new CopyOnWriteArrayList();
        this.f19771k = true;
        this.f19772l = new Rect();
        this.f19773m = new ArrayList();
        this.f19776p = new e(this);
        float f13 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        v0.o(this, new f6.b(this));
        setImportantForAccessibility(1);
        y5.d dVar = new y5.d(getContext(), this, new f(this));
        dVar.f137747b = (int) (2.0f * dVar.f137747b);
        this.f19769i = dVar;
        dVar.f137759n = f13 * 400.0f;
        m.f58204a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        fb.a aVar = (fb.a) l.f58202b.getValue();
        if (aVar == null) {
            n nVar = n.f68507c;
            Intrinsics.checkNotNullParameter(context, "context");
            if (n.f68507c == null) {
                ReentrantLock reentrantLock = n.f68508d;
                reentrantLock.lock();
                try {
                    if (n.f68507c == null) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        k kVar = null;
                        try {
                            db.n c13 = i.c();
                            if (c13 != null) {
                                db.n other = db.n.f54285f;
                                Intrinsics.checkNotNullParameter(other, "other");
                                Object value = c13.f54290e.getValue();
                                Intrinsics.checkNotNullExpressionValue(value, "<get-bigInteger>(...)");
                                Object value2 = other.f54290e.getValue();
                                Intrinsics.checkNotNullExpressionValue(value2, "<get-bigInteger>(...)");
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    k kVar2 = new k(context);
                                    if (kVar2.i()) {
                                        kVar = kVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        n.f68507c = new n(kVar);
                    }
                    Unit unit = Unit.f80348a;
                    reentrantLock.unlock();
                } catch (Throwable th3) {
                    reentrantLock.unlock();
                    throw th3;
                }
            }
            aVar = n.f68507c;
            Intrinsics.f(aVar);
        }
        s sVar = s.f58214b;
        o tracker = new o(aVar);
        l.f58203c.getClass();
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        m.h hVar = new m.h(tracker, d5.a.c(context));
        this.f19777q = hVar;
        e onFoldingFeatureChangeListener = this.f19776p;
        Intrinsics.checkNotNullParameter(onFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
        hVar.f85200e = onFoldingFeatureChangeListener;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
