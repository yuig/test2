package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import c0.s0;
import com.google.android.material.internal.d0;
import fj.l;
import fj.m;
import java.util.ArrayList;
import java.util.Arrays;
import xj.b;
import xj.c;
import xj.h;
import xj.j;

/* loaded from: classes3.dex */
public abstract class a extends ProgressBar {

    /* renamed from: m, reason: collision with root package name */
    public static final int f32927m = l.Widget_MaterialComponents_ProgressIndicator;

    /* renamed from: a, reason: collision with root package name */
    public final c f32928a;

    /* renamed from: b, reason: collision with root package name */
    public int f32929b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32930c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32931d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32932e;

    /* renamed from: f, reason: collision with root package name */
    public final vt1.a f32933f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32934g;

    /* renamed from: h, reason: collision with root package name */
    public final int f32935h;

    /* renamed from: i, reason: collision with root package name */
    public final xj.a f32936i;

    /* renamed from: j, reason: collision with root package name */
    public final xj.a f32937j;

    /* renamed from: k, reason: collision with root package name */
    public final b f32938k;

    /* renamed from: l, reason: collision with root package name */
    public final b f32939l;

    public a(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(fk.a.a(context, attributeSet, i13, f32927m), attributeSet, i13);
        this.f32934g = false;
        this.f32935h = 4;
        this.f32936i = new xj.a(this, 0);
        this.f32937j = new xj.a(this, 1);
        this.f32938k = new b(this, 0);
        this.f32939l = new b(this, 1);
        Context context2 = getContext();
        this.f32928a = b(context2, attributeSet);
        TypedArray f13 = d0.f(context2, attributeSet, m.BaseProgressIndicator, i13, i14, new int[0]);
        f13.getInt(m.BaseProgressIndicator_showDelay, -1);
        this.f32932e = Math.min(f13.getInt(m.BaseProgressIndicator_minHideDelay, -1), 1000);
        f13.recycle();
        this.f32933f = new vt1.a();
        this.f32931d = true;
    }

    public static void a(a aVar) {
        ((j) aVar.getCurrentDrawable()).c(false, false, true);
        if (((h) super.getProgressDrawable()) == null || !((h) super.getProgressDrawable()).isVisible()) {
            if (((xj.l) super.getIndeterminateDrawable()) == null || !((xj.l) super.getIndeterminateDrawable()).isVisible()) {
                aVar.setVisibility(4);
            }
        }
    }

    public abstract c b(Context context, AttributeSet attributeSet);

    public final xj.l c() {
        return (xj.l) super.getIndeterminateDrawable();
    }

    public final h d() {
        return (h) super.getProgressDrawable();
    }

    public void e(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{b7.c.t(getContext(), fj.c.colorPrimary, -1)};
        }
        c cVar = this.f32928a;
        if (Arrays.equals(cVar.f135076c, iArr)) {
            return;
        }
        cVar.f135076c = iArr;
        ((xj.l) super.getIndeterminateDrawable()).f135125m.t();
        invalidate();
    }

    public void f(int i13, boolean z13) {
        if (!isIndeterminate()) {
            super.setProgress(i13);
            if (((h) super.getProgressDrawable()) == null || z13) {
                return;
            }
            ((h) super.getProgressDrawable()).jumpToCurrentState();
            return;
        }
        if (((h) super.getProgressDrawable()) != null) {
            this.f32929b = i13;
            this.f32930c = z13;
            this.f32934g = true;
            if (((xj.l) super.getIndeterminateDrawable()).isVisible()) {
                ContentResolver contentResolver = getContext().getContentResolver();
                this.f32933f.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    ((xj.l) super.getIndeterminateDrawable()).f135125m.w();
                    return;
                }
            }
            this.f32938k.a((xj.l) super.getIndeterminateDrawable());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            r2 = this;
            java.util.WeakHashMap r0 = q5.v0.f102521a
            boolean r0 = r2.isAttachedToWindow()
            if (r0 == 0) goto L2c
            int r0 = r2.getWindowVisibility()
            if (r0 != 0) goto L2c
            r0 = r2
        Lf:
            int r1 = r0.getVisibility()
            if (r1 == 0) goto L16
            goto L2c
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L23
            int r0 = r2.getWindowVisibility()
            if (r0 != 0) goto L2c
            goto L27
        L23:
            boolean r1 = r0 instanceof android.view.View
            if (r1 != 0) goto L29
        L27:
            r0 = 1
            goto L2d
        L29:
            android.view.View r0 = (android.view.View) r0
            goto Lf
        L2c:
            r0 = 0
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.progressindicator.a.g():boolean");
    }

    @Override // android.widget.ProgressBar
    public final Drawable getCurrentDrawable() {
        return isIndeterminate() ? (xj.l) super.getIndeterminateDrawable() : (h) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    public final Drawable getIndeterminateDrawable() {
        return (xj.l) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public final Drawable getProgressDrawable() {
        return (h) super.getProgressDrawable();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (((h) super.getProgressDrawable()) != null && ((xj.l) super.getIndeterminateDrawable()) != null) {
            ((xj.l) super.getIndeterminateDrawable()).f135125m.v(this.f32938k);
        }
        h hVar = (h) super.getProgressDrawable();
        b bVar = this.f32939l;
        if (hVar != null) {
            h hVar2 = (h) super.getProgressDrawable();
            if (hVar2.f135115f == null) {
                hVar2.f135115f = new ArrayList();
            }
            if (!hVar2.f135115f.contains(bVar)) {
                hVar2.f135115f.add(bVar);
            }
        }
        if (((xj.l) super.getIndeterminateDrawable()) != null) {
            xj.l lVar = (xj.l) super.getIndeterminateDrawable();
            if (lVar.f135115f == null) {
                lVar.f135115f = new ArrayList();
            }
            if (!lVar.f135115f.contains(bVar)) {
                lVar.f135115f.add(bVar);
            }
        }
        if (g()) {
            if (this.f32932e > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f32937j);
        removeCallbacks(this.f32936i);
        ((j) getCurrentDrawable()).c(false, false, false);
        xj.l lVar = (xj.l) super.getIndeterminateDrawable();
        b bVar = this.f32939l;
        if (lVar != null) {
            ((xj.l) super.getIndeterminateDrawable()).e(bVar);
            ((xj.l) super.getIndeterminateDrawable()).f135125m.z();
        }
        if (((h) super.getProgressDrawable()) != null) {
            ((h) super.getProgressDrawable()).e(bVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i13, int i14) {
        try {
            s0 s0Var = null;
            if (isIndeterminate()) {
                if (((xj.l) super.getIndeterminateDrawable()) != null) {
                    s0Var = ((xj.l) super.getIndeterminateDrawable()).f135124l;
                }
            } else if (((h) super.getProgressDrawable()) != null) {
                s0Var = ((h) super.getProgressDrawable()).f135102l;
            }
            if (s0Var == null) {
                return;
            }
            setMeasuredDimension(s0Var.i() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i13) : s0Var.i() + getPaddingLeft() + getPaddingRight(), s0Var.h() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i14) : s0Var.h() + getPaddingTop() + getPaddingBottom());
        } finally {
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i13) {
        super.onVisibilityChanged(view, i13);
        boolean z13 = i13 == 0;
        if (this.f32931d) {
            ((j) getCurrentDrawable()).c(g(), false, z13);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i13) {
        super.onWindowVisibilityChanged(i13);
        if (this.f32931d) {
            ((j) getCurrentDrawable()).c(g(), false, false);
        }
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setIndeterminate(boolean z13) {
        try {
            if (z13 == isIndeterminate()) {
                return;
            }
            j jVar = (j) getCurrentDrawable();
            if (jVar != null) {
                jVar.c(false, false, false);
            }
            super.setIndeterminate(z13);
            j jVar2 = (j) getCurrentDrawable();
            if (jVar2 != null) {
                jVar2.c(g(), false, false);
            }
            if ((jVar2 instanceof xj.l) && g()) {
                ((xj.l) jVar2).f135125m.y();
            }
            this.f32934g = false;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.widget.ProgressBar
    public final void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof xj.l)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((j) drawable).c(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setProgress(int i13) {
        if (isIndeterminate()) {
            return;
        }
        f(i13, false);
    }

    @Override // android.widget.ProgressBar
    public final void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof h)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            h hVar = (h) drawable;
            hVar.c(false, false, false);
            super.setProgressDrawable(hVar);
            hVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }
}
