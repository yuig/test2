package e2;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import j1.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v extends View {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f56908f = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f56909g = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public i0 f56910a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f56911b;

    /* renamed from: c, reason: collision with root package name */
    public Long f56912c;

    /* renamed from: d, reason: collision with root package name */
    public u0.n f56913d;

    /* renamed from: e, reason: collision with root package name */
    public Function0 f56914e;

    public final void a(o1.n nVar, boolean z13, long j13, int i13, long j14, float f13, q0 q0Var) {
        if (this.f56910a == null || !Intrinsics.d(Boolean.valueOf(z13), this.f56911b)) {
            i0 i0Var = new i0(z13);
            setBackground(i0Var);
            this.f56910a = i0Var;
            this.f56911b = Boolean.valueOf(z13);
        }
        i0 i0Var2 = this.f56910a;
        Intrinsics.f(i0Var2);
        this.f56914e = q0Var;
        Integer num = i0Var2.f56871c;
        if (num == null || num.intValue() != i13) {
            i0Var2.f56871c = Integer.valueOf(i13);
            h0.f56864a.a(i0Var2, i13);
        }
        c(j13, j14, f13);
        if (z13) {
            i0Var2.setHotspot(a3.c.d(nVar.f92766a), a3.c.e(nVar.f92766a));
        } else {
            i0Var2.setHotspot(i0Var2.getBounds().centerX(), i0Var2.getBounds().centerY());
        }
        d(true);
    }

    public final void b() {
        this.f56914e = null;
        u0.n nVar = this.f56913d;
        if (nVar != null) {
            removeCallbacks(nVar);
            u0.n nVar2 = this.f56913d;
            Intrinsics.f(nVar2);
            nVar2.run();
        } else {
            i0 i0Var = this.f56910a;
            if (i0Var != null) {
                i0Var.setState(f56909g);
            }
        }
        i0 i0Var2 = this.f56910a;
        if (i0Var2 == null) {
            return;
        }
        i0Var2.setVisible(false, false);
        unscheduleDrawable(i0Var2);
    }

    public final void c(long j13, long j14, float f13) {
        i0 i0Var = this.f56910a;
        if (i0Var == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            f13 *= 2;
        }
        long b13 = b3.w.b(j14, ql2.s.c(f13, 1.0f));
        b3.w wVar = i0Var.f56870b;
        if (wVar == null || !b3.w.c(wVar.f21392a, b13)) {
            i0Var.f56870b = new b3.w(b13);
            i0Var.setColor(ColorStateList.valueOf(androidx.compose.ui.graphics.a.u(b13)));
        }
        Rect rect = new Rect(0, 0, ml2.c.c(a3.f.d(j13)), ml2.c.c(a3.f.b(j13)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        i0Var.setBounds(rect);
    }

    public final void d(boolean z13) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f56913d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l13 = this.f56912c;
        long longValue = currentAnimationTimeMillis - (l13 != null ? l13.longValue() : 0L);
        if (z13 || longValue >= 5) {
            int[] iArr = z13 ? f56908f : f56909g;
            i0 i0Var = this.f56910a;
            if (i0Var != null) {
                i0Var.setState(iArr);
            }
        } else {
            u0.n nVar = new u0.n(this, 2);
            this.f56913d = nVar;
            postDelayed(nVar, 50L);
        }
        this.f56912c = Long.valueOf(currentAnimationTimeMillis);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Function0 function0 = this.f56914e;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
