package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import bk.b0;
import bk.o;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.t;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q5.a2;
import q5.v0;
import ua.m0;

/* loaded from: classes3.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements vj.b {

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f32827w = {R.attr.state_checked};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f32828x = {-16842910};

    /* renamed from: y, reason: collision with root package name */
    public static final int f32829y = fj.l.Widget_Design_NavigationView;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.android.material.internal.i f32830h;

    /* renamed from: i, reason: collision with root package name */
    public final t f32831i;

    /* renamed from: j, reason: collision with root package name */
    public final int f32832j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f32833k;

    /* renamed from: l, reason: collision with root package name */
    public final m.l f32834l;

    /* renamed from: m, reason: collision with root package name */
    public final n.e f32835m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f32836n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f32837o;

    /* renamed from: p, reason: collision with root package name */
    public int f32838p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f32839q;

    /* renamed from: r, reason: collision with root package name */
    public final int f32840r;

    /* renamed from: s, reason: collision with root package name */
    public final b0 f32841s;

    /* renamed from: t, reason: collision with root package name */
    public final vj.j f32842t;

    /* renamed from: u, reason: collision with root package name */
    public final vj.f f32843u;

    /* renamed from: v, reason: collision with root package name */
    public final m f32844v;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new n();

        /* renamed from: c, reason: collision with root package name */
        public Bundle f32845c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f32845c = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeBundle(this.f32845c);
        }
    }

    public NavigationView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fj.c.navigationViewStyle);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public final void a(a2 a2Var) {
        t tVar = this.f32831i;
        tVar.getClass();
        int e13 = a2Var.e();
        if (tVar.f32802z != e13) {
            tVar.f32802z = e13;
            int i13 = (tVar.f32778b.getChildCount() <= 0 && tVar.f32800x) ? tVar.f32802z : 0;
            NavigationMenuView navigationMenuView = tVar.f32777a;
            navigationMenuView.setPadding(0, i13, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = tVar.f32777a;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, a2Var.b());
        v0.c(tVar.f32778b, a2Var);
    }

    @Override // vj.b
    public final void b() {
        j();
        this.f32842t.b();
        if (!this.f32839q || this.f32838p == 0) {
            return;
        }
        this.f32838p = 0;
        i(getWidth(), getHeight());
    }

    @Override // vj.b
    public final void c(androidx.activity.b bVar) {
        j();
        this.f32842t.f125894f = bVar;
    }

    @Override // vj.b
    public final void d(androidx.activity.b bVar) {
        int i13 = ((DrawerLayout.LayoutParams) j().second).f18203a;
        vj.j jVar = this.f32842t;
        if (jVar.f125894f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        androidx.activity.b bVar2 = jVar.f125894f;
        jVar.f125894f = bVar;
        float f13 = bVar.f15875c;
        if (bVar2 != null) {
            jVar.d(f13, i13, bVar.f15876d == 0);
        }
        if (this.f32839q) {
            this.f32838p = gj.a.c(0, jVar.f125889a.getInterpolation(f13), this.f32840r);
            i(getWidth(), getHeight());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b0 b0Var = this.f32841s;
        if (b0Var.b()) {
            Path path = (Path) b0Var.f23025e;
            if (!path.isEmpty()) {
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // vj.b
    public final void e() {
        Pair j13 = j();
        DrawerLayout drawerLayout = (DrawerLayout) j13.first;
        vj.j jVar = this.f32842t;
        androidx.activity.b bVar = jVar.f125894f;
        jVar.f125894f = null;
        if (bVar == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.b(this, true);
            return;
        }
        int i13 = ((DrawerLayout.LayoutParams) j13.second).f18203a;
        int i14 = a.f32846a;
        jVar.c(bVar, i13, new m0(drawerLayout, this, 2), new androidx.media3.ui.c(drawerLayout, 3));
    }

    public final ColorStateList g(int i13) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i13, typedValue, true)) {
            return null;
        }
        ColorStateList b13 = d5.a.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(i.a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i14 = typedValue.data;
        int defaultColor = b13.getDefaultColor();
        int[] iArr = f32828x;
        return new ColorStateList(new int[][]{iArr, f32827w, FrameLayout.EMPTY_STATE_SET}, new int[]{b13.getColorForState(iArr, defaultColor), i14, defaultColor});
    }

    public final InsetDrawable h(x92.b bVar, ColorStateList colorStateList) {
        bk.i iVar = new bk.i(o.c(getContext(), bVar.C(fj.m.NavigationView_itemShapeAppearance, 0), bVar.C(fj.m.NavigationView_itemShapeAppearanceOverlay, 0)).a());
        iVar.t(colorStateList);
        return new InsetDrawable((Drawable) iVar, bVar.w(fj.m.NavigationView_itemShapeInsetStart, 0), bVar.w(fj.m.NavigationView_itemShapeInsetTop, 0), bVar.w(fj.m.NavigationView_itemShapeInsetEnd, 0), bVar.w(fj.m.NavigationView_itemShapeInsetBottom, 0));
    }

    public final void i(int i13, int i14) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.LayoutParams)) {
            if ((this.f32838p > 0 || this.f32839q) && (getBackground() instanceof bk.i)) {
                int i15 = ((DrawerLayout.LayoutParams) getLayoutParams()).f18203a;
                WeakHashMap weakHashMap = v0.f102521a;
                boolean z13 = Gravity.getAbsoluteGravity(i15, getLayoutDirection()) == 3;
                bk.i iVar = (bk.i) getBackground();
                bk.m h10 = iVar.f23052a.f23030a.h();
                h10.c(this.f32838p);
                if (z13) {
                    h10.g(0.0f);
                    h10.e(0.0f);
                } else {
                    h10.h(0.0f);
                    h10.f(0.0f);
                }
                o a13 = h10.a();
                iVar.Y0(a13);
                b0 b0Var = this.f32841s;
                b0Var.f23023c = a13;
                b0Var.c();
                b0Var.a(this);
                b0Var.f23024d = new RectF(0.0f, 0.0f, i13, i14);
                b0Var.c();
                b0Var.a(this);
                b0Var.f23022b = true;
                b0Var.a(this);
            }
        }
    }

    public final Pair j() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.LayoutParams)) {
            return new Pair((DrawerLayout) parent, (DrawerLayout.LayoutParams) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d7.b.x0(this);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            vj.f fVar = this.f32843u;
            if (fVar.f125898a != null) {
                DrawerLayout drawerLayout = (DrawerLayout) parent;
                m mVar = this.f32844v;
                if (mVar == null) {
                    drawerLayout.getClass();
                } else {
                    ArrayList arrayList = drawerLayout.f18195s;
                    if (arrayList != null) {
                        arrayList.remove(mVar);
                    }
                }
                if (mVar != null) {
                    if (drawerLayout.f18195s == null) {
                        drawerLayout.f18195s = new ArrayList();
                    }
                    drawerLayout.f18195s.add(mVar);
                }
                if (DrawerLayout.k(this)) {
                    fVar.a(true);
                }
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f32835m);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            m mVar = this.f32844v;
            if (mVar == null) {
                drawerLayout.getClass();
                return;
            }
            ArrayList arrayList = drawerLayout.f18195s;
            if (arrayList == null) {
                return;
            }
            arrayList.remove(mVar);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int mode = View.MeasureSpec.getMode(i13);
        int i15 = this.f32832j;
        if (mode == Integer.MIN_VALUE) {
            i13 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i13), i15), 1073741824);
        } else if (mode == 0) {
            i13 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        }
        super.onMeasure(i13, i14);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f18020a);
        this.f32830h.u(savedState.f32845c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f32845c = bundle;
        this.f32830h.w(bundle);
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        i(i13, i14);
    }

    @Override // android.view.View
    public final void setElevation(float f13) {
        super.setElevation(f13);
        d7.b.v0(this, f13);
    }

    @Override // android.view.View
    public final void setOverScrollMode(int i13) {
        super.setOverScrollMode(i13);
        t tVar = this.f32831i;
        if (tVar != null) {
            tVar.B = i13;
            NavigationMenuView navigationMenuView = tVar.f32777a;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i13);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0239  */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NavigationView(@androidx.annotation.NonNull android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
