package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.core.widget.g;
import androidx.customview.view.AbsSavedState;
import com.airbnb.lottie.k;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.navigation.m;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import f6.c;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import q5.a2;
import q5.v0;
import t5.e;
import vj.f;
import y5.d;

/* loaded from: classes3.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] C = {R.attr.colorPrimaryDark};
    public static final int[] D = {R.attr.layout_gravity};
    public static final boolean E;
    public static final boolean F;
    public static final boolean G;
    public Matrix A;
    public final e B;

    /* renamed from: a, reason: collision with root package name */
    public final g f18177a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18178b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18179c;

    /* renamed from: d, reason: collision with root package name */
    public int f18180d;

    /* renamed from: e, reason: collision with root package name */
    public float f18181e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f18182f;

    /* renamed from: g, reason: collision with root package name */
    public final d f18183g;

    /* renamed from: h, reason: collision with root package name */
    public final d f18184h;

    /* renamed from: i, reason: collision with root package name */
    public final b f18185i;

    /* renamed from: j, reason: collision with root package name */
    public final b f18186j;

    /* renamed from: k, reason: collision with root package name */
    public int f18187k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18188l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18189m;

    /* renamed from: n, reason: collision with root package name */
    public int f18190n;

    /* renamed from: o, reason: collision with root package name */
    public int f18191o;

    /* renamed from: p, reason: collision with root package name */
    public int f18192p;

    /* renamed from: q, reason: collision with root package name */
    public int f18193q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18194r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f18195s;

    /* renamed from: t, reason: collision with root package name */
    public float f18196t;

    /* renamed from: u, reason: collision with root package name */
    public float f18197u;

    /* renamed from: v, reason: collision with root package name */
    public final Drawable f18198v;

    /* renamed from: w, reason: collision with root package name */
    public Object f18199w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f18200x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f18201y;

    /* renamed from: z, reason: collision with root package name */
    public Rect f18202z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f18203a;

        /* renamed from: b, reason: collision with root package name */
        public float f18204b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f18205c;

        /* renamed from: d, reason: collision with root package name */
        public int f18206d;

        public LayoutParams(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f18203a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.D);
            this.f18203a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public int f18207c;

        /* renamed from: d, reason: collision with root package name */
        public int f18208d;

        /* renamed from: e, reason: collision with root package name */
        public int f18209e;

        /* renamed from: f, reason: collision with root package name */
        public int f18210f;

        /* renamed from: g, reason: collision with root package name */
        public int f18211g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f18207c = 0;
            this.f18207c = parcel.readInt();
            this.f18208d = parcel.readInt();
            this.f18209e = parcel.readInt();
            this.f18210f = parcel.readInt();
            this.f18211g = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f18207c);
            parcel.writeInt(this.f18208d);
            parcel.writeInt(this.f18209e);
            parcel.writeInt(this.f18210f);
            parcel.writeInt(this.f18211g);
        }
    }

    static {
        int i13 = Build.VERSION.SDK_INT;
        E = true;
        F = true;
        G = i13 >= 29;
    }

    public DrawerLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e6.a.drawerLayoutStyle);
    }

    public static boolean i(View view) {
        WeakHashMap weakHashMap = v0.f102521a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    public static boolean j(View view) {
        return ((LayoutParams) view.getLayoutParams()).f18203a == 0;
    }

    public static boolean k(View view) {
        if (l(view)) {
            return (((LayoutParams) view.getLayoutParams()).f18206d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean l(View view) {
        int i13 = ((LayoutParams) view.getLayoutParams()).f18203a;
        WeakHashMap weakHashMap = v0.f102521a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final boolean a(View view, int i13) {
        return (h(view) & i13) == i13;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i13, int i14) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i15 = 0;
        boolean z13 = false;
        while (true) {
            arrayList2 = this.f18201y;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            if (!l(childAt)) {
                arrayList2.add(childAt);
            } else if (k(childAt)) {
                childAt.addFocusables(arrayList, i13, i14);
                z13 = true;
            }
            i15++;
        }
        if (!z13) {
            int size = arrayList2.size();
            for (int i16 = 0; i16 < size; i16++) {
                View view = (View) arrayList2.get(i16);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i13, i14);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i13, layoutParams);
        if (e() != null || l(view)) {
            WeakHashMap weakHashMap = v0.f102521a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = v0.f102521a;
            view.setImportantForAccessibility(1);
        }
        if (E) {
            return;
        }
        v0.o(view, this.f18177a);
    }

    public final void b(View view, boolean z13) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f18189m) {
            layoutParams.f18204b = 0.0f;
            layoutParams.f18206d = 0;
        } else if (z13) {
            layoutParams.f18206d |= 4;
            if (a(view, 3)) {
                this.f18183g.u(view, -view.getWidth(), view.getTop());
            } else {
                this.f18184h.u(view, getWidth(), view.getTop());
            }
        } else {
            float f13 = ((LayoutParams) view.getLayoutParams()).f18204b;
            float width = view.getWidth();
            int i13 = ((int) (width * 0.0f)) - ((int) (f13 * width));
            if (!a(view, 3)) {
                i13 = -i13;
            }
            view.offsetLeftAndRight(i13);
            o(view, 0.0f);
            r(view, 0);
            view.setVisibility(4);
        }
        invalidate();
    }

    public final void c(boolean z13) {
        int childCount = getChildCount();
        boolean z14 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (l(childAt) && (!z13 || layoutParams.f18205c)) {
                z14 |= a(childAt, 3) ? this.f18183g.u(childAt, -childAt.getWidth(), childAt.getTop()) : this.f18184h.u(childAt, getWidth(), childAt.getTop());
                layoutParams.f18205c = false;
            }
        }
        b bVar = this.f18185i;
        bVar.f18215d.removeCallbacks(bVar.f18214c);
        b bVar2 = this.f18186j;
        bVar2.f18215d.removeCallbacks(bVar2.f18214c);
        if (z14) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float f13 = 0.0f;
        for (int i13 = 0; i13 < childCount; i13++) {
            f13 = Math.max(f13, ((LayoutParams) getChildAt(i13).getLayoutParams()).f18204b);
        }
        this.f18181e = f13;
        boolean h10 = this.f18183g.h();
        boolean h13 = this.f18184h.h();
        if (h10 || h13) {
            WeakHashMap weakHashMap = v0.f102521a;
            postInvalidateOnAnimation();
        }
    }

    public final View d(int i13) {
        WeakHashMap weakHashMap = v0.f102521a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if ((h(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f18181e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x13 = motionEvent.getX();
        float y13 = motionEvent.getY();
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            View childAt = getChildAt(i13);
            if (this.f18202z == null) {
                this.f18202z = new Rect();
            }
            childAt.getHitRect(this.f18202z);
            if (this.f18202z.contains((int) x13, (int) y13) && !j(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.A == null) {
                            this.A = new Matrix();
                        }
                        matrix.invert(this.A);
                        obtain.transform(this.A);
                    }
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                }
                if (dispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j13) {
        Drawable background;
        int height = getHeight();
        boolean j14 = j(view);
        int width = getWidth();
        int save = canvas.save();
        int i13 = 0;
        if (j14) {
            int childCount = getChildCount();
            int i14 = 0;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && l(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i14) {
                            i14 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i14, 0, width, getHeight());
            i13 = i14;
        }
        boolean drawChild = super.drawChild(canvas, view, j13);
        canvas.restoreToCount(save);
        float f13 = this.f18181e;
        if (f13 > 0.0f && j14) {
            int i16 = this.f18180d;
            Paint paint = this.f18182f;
            paint.setColor((((int) ((((-16777216) & i16) >>> 24) * f13)) << 24) | (i16 & 16777215));
            canvas.drawRect(i13, 0.0f, width, getHeight(), paint);
        }
        return drawChild;
    }

    public final View e() {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if ((((LayoutParams) childAt.getLayoutParams()).f18206d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (l(childAt)) {
                if (!l(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((LayoutParams) childAt.getLayoutParams()).f18204b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public final int g(View view) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i13 = ((LayoutParams) view.getLayoutParams()).f18203a;
        WeakHashMap weakHashMap = v0.f102521a;
        int layoutDirection = getLayoutDirection();
        if (i13 == 3) {
            int i14 = this.f18190n;
            if (i14 != 3) {
                return i14;
            }
            int i15 = layoutDirection == 0 ? this.f18192p : this.f18193q;
            if (i15 != 3) {
                return i15;
            }
        } else if (i13 == 5) {
            int i16 = this.f18191o;
            if (i16 != 3) {
                return i16;
            }
            int i17 = layoutDirection == 0 ? this.f18193q : this.f18192p;
            if (i17 != 3) {
                return i17;
            }
        } else if (i13 == 8388611) {
            int i18 = this.f18192p;
            if (i18 != 3) {
                return i18;
            }
            int i19 = layoutDirection == 0 ? this.f18190n : this.f18191o;
            if (i19 != 3) {
                return i19;
            }
        } else if (i13 == 8388613) {
            int i23 = this.f18193q;
            if (i23 != 3) {
                return i23;
            }
            int i24 = layoutDirection == 0 ? this.f18191o : this.f18190n;
            if (i24 != 3) {
                return i24;
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f18203a = 0;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.f18203a = 0;
            layoutParams3.f18203a = layoutParams2.f18203a;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.f18203a = 0;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.f18203a = 0;
        return layoutParams5;
    }

    public final int h(View view) {
        int i13 = ((LayoutParams) view.getLayoutParams()).f18203a;
        WeakHashMap weakHashMap = v0.f102521a;
        return Gravity.getAbsoluteGravity(i13, getLayoutDirection());
    }

    public final void m(View view) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f18189m) {
            layoutParams.f18204b = 1.0f;
            layoutParams.f18206d = 1;
            q(view, true);
            p(view);
        } else {
            layoutParams.f18206d |= 2;
            if (a(view, 3)) {
                this.f18183g.u(view, 0, view.getTop());
            } else {
                this.f18184h.u(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void n(int i13, int i14) {
        View d2;
        WeakHashMap weakHashMap = v0.f102521a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i14, getLayoutDirection());
        if (i14 == 3) {
            this.f18190n = i13;
        } else if (i14 == 5) {
            this.f18191o = i13;
        } else if (i14 == 8388611) {
            this.f18192p = i13;
        } else if (i14 == 8388613) {
            this.f18193q = i13;
        }
        if (i13 != 0) {
            (absoluteGravity == 3 ? this.f18183g : this.f18184h).b();
        }
        if (i13 != 1) {
            if (i13 == 2 && (d2 = d(absoluteGravity)) != null) {
                m(d2);
                return;
            }
            return;
        }
        View d13 = d(absoluteGravity);
        if (d13 != null) {
            b(d13, true);
        }
    }

    public final void o(View view, float f13) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f13 == layoutParams.f18204b) {
            return;
        }
        layoutParams.f18204b = f13;
        ArrayList arrayList = this.f18195s;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c) this.f18195s.get(size)).getClass();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18189m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18189m = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        if (!this.f18200x || (drawable = this.f18198v) == null) {
            return;
        }
        Object obj = this.f18199w;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            drawable.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            drawable.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0 != 3) goto L19;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            y5.d r1 = r8.f18183g
            boolean r2 = r1.t(r9)
            y5.d r3 = r8.f18184h
            boolean r3 = r3.t(r9)
            r2 = r2 | r3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L65
            if (r0 == r3) goto L5e
            r9 = 2
            if (r0 == r9) goto L1e
            r9 = 3
            if (r0 == r9) goto L5e
            goto L63
        L1e:
            float[] r9 = r1.f137749d
            int r9 = r9.length
            r0 = r4
        L22:
            if (r0 >= r9) goto L63
            int r5 = r1.f137756k
            int r6 = r3 << r0
            r5 = r5 & r6
            if (r5 == 0) goto L5b
            float[] r5 = r1.f137751f
            r5 = r5[r0]
            float[] r6 = r1.f137749d
            r6 = r6[r0]
            float r5 = r5 - r6
            float[] r6 = r1.f137752g
            r6 = r6[r0]
            float[] r7 = r1.f137750e
            r7 = r7[r0]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r1.f137747b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L5b
            androidx.drawerlayout.widget.b r9 = r8.f18185i
            androidx.appcompat.app.z r0 = r9.f18214c
            androidx.drawerlayout.widget.DrawerLayout r9 = r9.f18215d
            r9.removeCallbacks(r0)
            androidx.drawerlayout.widget.b r9 = r8.f18186j
            androidx.appcompat.app.z r0 = r9.f18214c
            androidx.drawerlayout.widget.DrawerLayout r9 = r9.f18215d
            r9.removeCallbacks(r0)
            goto L63
        L5b:
            int r0 = r0 + 1
            goto L22
        L5e:
            r8.c(r3)
            r8.f18194r = r4
        L63:
            r9 = r4
            goto L8b
        L65:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.f18196t = r0
            r8.f18197u = r9
            float r5 = r8.f18181e
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L88
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r1.i(r0, r9)
            if (r9 == 0) goto L88
            boolean r9 = j(r9)
            if (r9 == 0) goto L88
            r9 = r3
            goto L89
        L88:
            r9 = r4
        L89:
            r8.f18194r = r4
        L8b:
            if (r2 != 0) goto Lae
            if (r9 != 0) goto Lae
            int r9 = r8.getChildCount()
            r0 = r4
        L94:
            if (r0 >= r9) goto La8
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r1 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r1
            boolean r1 = r1.f18205c
            if (r1 == 0) goto La5
            goto Lae
        La5:
            int r0 = r0 + 1
            goto L94
        La8:
            boolean r9 = r8.f18194r
            if (r9 == 0) goto Lad
            goto Lae
        Lad:
            r3 = r4
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i13, KeyEvent keyEvent) {
        if (i13 != 4 || f() == null) {
            return super.onKeyDown(i13, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i13, KeyEvent keyEvent) {
        if (i13 != 4) {
            return super.onKeyUp(i13, keyEvent);
        }
        View f13 = f();
        if (f13 != null && g(f13) == 0) {
            c(false);
        }
        return f13 != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        WindowInsets rootWindowInsets;
        float f13;
        int i17;
        boolean z14 = true;
        this.f18188l = true;
        int i18 = i15 - i13;
        int childCount = getChildCount();
        int i19 = 0;
        while (i19 < childCount) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (j(childAt)) {
                    int i23 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i23, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i23, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f14 = measuredWidth;
                        i17 = (-measuredWidth) + ((int) (layoutParams.f18204b * f14));
                        f13 = (measuredWidth + i17) / f14;
                    } else {
                        float f15 = measuredWidth;
                        f13 = (i18 - r11) / f15;
                        i17 = i18 - ((int) (layoutParams.f18204b * f15));
                    }
                    boolean z15 = f13 != layoutParams.f18204b ? z14 : false;
                    int i24 = layoutParams.f18203a & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
                    if (i24 == 16) {
                        int i25 = i16 - i14;
                        int i26 = (i25 - measuredHeight) / 2;
                        int i27 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i26 < i27) {
                            i26 = i27;
                        } else {
                            int i28 = i26 + measuredHeight;
                            int i29 = i25 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i28 > i29) {
                                i26 = i29 - measuredHeight;
                            }
                        }
                        childAt.layout(i17, i26, measuredWidth + i17, measuredHeight + i26);
                    } else if (i24 != 80) {
                        int i33 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i17, i33, measuredWidth + i17, measuredHeight + i33);
                    } else {
                        int i34 = i16 - i14;
                        childAt.layout(i17, (i34 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i17, i34 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z15) {
                        o(childAt, f13);
                    }
                    int i35 = layoutParams.f18204b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i35) {
                        childAt.setVisibility(i35);
                    }
                }
            }
            i19++;
            z14 = true;
        }
        if (G && (rootWindowInsets = getRootWindowInsets()) != null) {
            f5.e i36 = a2.i(null, rootWindowInsets).f102400a.i();
            d dVar = this.f18183g;
            dVar.f137760o = Math.max(dVar.f137761p, i36.f61081a);
            d dVar2 = this.f18184h;
            dVar2.f137760o = Math.max(dVar2.f137761p, i36.f61083c);
        }
        this.f18188l = false;
        this.f18189m = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View d2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f18020a);
        int i13 = savedState.f18207c;
        if (i13 != 0 && (d2 = d(i13)) != null) {
            m(d2);
        }
        int i14 = savedState.f18208d;
        if (i14 != 3) {
            n(i14, 3);
        }
        int i15 = savedState.f18209e;
        if (i15 != 3) {
            n(i15, 5);
        }
        int i16 = savedState.f18210f;
        if (i16 != 3) {
            n(i16, 8388611);
        }
        int i17 = savedState.f18211g;
        if (i17 != 3) {
            n(i17, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i13) {
        if (F) {
            return;
        }
        WeakHashMap weakHashMap = v0.f102521a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f18207c = 0;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i13).getLayoutParams();
            int i14 = layoutParams.f18206d;
            boolean z13 = i14 == 1;
            boolean z14 = i14 == 2;
            if (z13 || z14) {
                savedState.f18207c = layoutParams.f18203a;
                break;
            }
        }
        savedState.f18208d = this.f18190n;
        savedState.f18209e = this.f18191o;
        savedState.f18210f = this.f18192p;
        savedState.f18211g = this.f18193q;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (g(r7) != 2) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            y5.d r0 = r6.f18183g
            r0.m(r7)
            y5.d r1 = r6.f18184h
            r1.m(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L59
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            goto L67
        L1a:
            r6.c(r3)
            r6.f18194r = r2
            goto L67
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.i(r4, r5)
            if (r4 == 0) goto L54
            boolean r4 = j(r4)
            if (r4 == 0) goto L54
            float r4 = r6.f18196t
            float r1 = r1 - r4
            float r4 = r6.f18197u
            float r7 = r7 - r4
            int r0 = r0.f137747b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L54
            android.view.View r7 = r6.e()
            if (r7 == 0) goto L54
            int r7 = r6.g(r7)
            r0 = 2
            if (r7 != r0) goto L55
        L54:
            r2 = r3
        L55:
            r6.c(r2)
            goto L67
        L59:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f18196t = r0
            r6.f18197u = r7
            r6.f18194r = r2
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(View view) {
        r5.d dVar = r5.d.f106221o;
        v0.l(view, dVar.a());
        v0.i(view, 0);
        if (!k(view) || g(view) == 2) {
            return;
        }
        v0.m(view, dVar, null, this.B);
    }

    public final void q(View view, boolean z13) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if ((z13 || l(childAt)) && !(z13 && childAt == view)) {
                WeakHashMap weakHashMap = v0.f102521a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = v0.f102521a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public final void r(View view, int i13) {
        int i14;
        View rootView;
        int i15 = this.f18183g.f137746a;
        int i16 = this.f18184h.f137746a;
        if (i15 == 1 || i16 == 1) {
            i14 = 1;
        } else {
            i14 = 2;
            if (i15 != 2 && i16 != 2) {
                i14 = 0;
            }
        }
        if (view != null && i13 == 0) {
            float f13 = ((LayoutParams) view.getLayoutParams()).f18204b;
            if (f13 == 0.0f) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if ((layoutParams.f18206d & 1) == 1) {
                    layoutParams.f18206d = 0;
                    ArrayList arrayList = this.f18195s;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            NavigationView navigationView = ((m) ((c) this.f18195s.get(size))).f32912a;
                            if (view == navigationView) {
                                f fVar = navigationView.f32843u;
                                vj.c cVar = fVar.f125898a;
                                if (cVar != null) {
                                    cVar.c(fVar.f125900c);
                                }
                                if (navigationView.f32839q && navigationView.f32838p != 0) {
                                    navigationView.f32838p = 0;
                                    navigationView.i(navigationView.getWidth(), navigationView.getHeight());
                                }
                            }
                        }
                    }
                    q(view, false);
                    p(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f13 == 1.0f) {
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                if ((layoutParams2.f18206d & 1) == 0) {
                    layoutParams2.f18206d = 1;
                    ArrayList arrayList2 = this.f18195s;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            NavigationView navigationView2 = ((m) ((c) this.f18195s.get(size2))).f32912a;
                            if (view == navigationView2) {
                                f fVar2 = navigationView2.f32843u;
                                Objects.requireNonNull(fVar2);
                                view.post(new k(fVar2, 16));
                            }
                        }
                    }
                    q(view, true);
                    p(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i14 != this.f18187k) {
            this.f18187k = i14;
            ArrayList arrayList3 = this.f18195s;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((c) this.f18195s.get(size3)).getClass();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z13) {
        super.requestDisallowInterceptTouchEvent(z13);
        if (z13) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f18188l) {
            return;
        }
        super.requestLayout();
    }

    public DrawerLayout(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f18177a = new g(1);
        this.f18180d = -1728053248;
        this.f18182f = new Paint();
        this.f18189m = true;
        this.f18190n = 3;
        this.f18191o = 3;
        this.f18192p = 3;
        this.f18193q = 3;
        this.B = new e(this, 3);
        setDescendantFocusability(262144);
        float f13 = getResources().getDisplayMetrics().density;
        this.f18179c = (int) ((64.0f * f13) + 0.5f);
        float f14 = f13 * 400.0f;
        b bVar = new b(this, 3);
        this.f18185i = bVar;
        b bVar2 = new b(this, 5);
        this.f18186j = bVar2;
        d dVar = new d(getContext(), this, bVar);
        dVar.f137747b = (int) (dVar.f137747b * 1.0f);
        this.f18183g = dVar;
        dVar.f137762q = 1;
        dVar.f137759n = f14;
        bVar.f18213b = dVar;
        d dVar2 = new d(getContext(), this, bVar2);
        dVar2.f137747b = (int) (1.0f * dVar2.f137747b);
        this.f18184h = dVar2;
        dVar2.f137762q = 2;
        dVar2.f137759n = f14;
        bVar2.f18213b = dVar2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = v0.f102521a;
        setImportantForAccessibility(1);
        v0.o(this, new f6.b(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new f6.a());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C);
            try {
                this.f18198v = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, e6.c.DrawerLayout, i13, 0);
        try {
            if (obtainStyledAttributes2.hasValue(e6.c.DrawerLayout_elevation)) {
                this.f18178b = obtainStyledAttributes2.getDimension(e6.c.DrawerLayout_elevation, 0.0f);
            } else {
                this.f18178b = getResources().getDimension(e6.b.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.f18201y = new ArrayList();
        } catch (Throwable th3) {
            obtainStyledAttributes2.recycle();
            throw th3;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
