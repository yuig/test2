package ua2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final View f121492a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f121493b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f121494c;

    /* renamed from: d, reason: collision with root package name */
    public z0 f121495d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f121496e;

    public f1(View pinRepView, b1 orientation) {
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f121492a = pinRepView;
        this.f121493b = orientation;
        this.f121494c = bs1.c.l1(pinRepView);
        this.f121496e = xk2.m.b(e1.f121485i);
    }

    public abstract wa2.l k();

    public final Rect q() {
        wa2.l k13 = k();
        if (k13 != null) {
            return k13.getBounds();
        }
        return null;
    }

    public abstract void r(Canvas canvas, int i13, int i14, int i15, int i16);

    public final int s() {
        wa2.l k13 = k();
        if (k13 != null) {
            return k13.f128841d;
        }
        return 0;
    }

    public int t() {
        return x();
    }

    public final void u(Canvas canvas) {
        boolean isShowingLayoutBounds;
        Rect q13;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (Build.VERSION.SDK_INT >= 30) {
            isShowingLayoutBounds = this.f121492a.isShowingLayoutBounds();
            if (!isShowingLayoutBounds || (q13 = q()) == null) {
                return;
            }
            canvas.drawRect(q13, (Paint) this.f121496e.getValue());
        }
    }

    public z0 v(int i13, int i14) {
        z0 y13 = y(i13, i14);
        this.f121495d = y13;
        return y13;
    }

    public final int w() {
        z0 z0Var = this.f121495d;
        if (z0Var != null) {
            return z0Var.f121641b;
        }
        return 0;
    }

    public final int x() {
        z0 z0Var = this.f121495d;
        if (z0Var != null) {
            return z0Var.f121640a;
        }
        return 0;
    }

    public abstract z0 y(int i13, int i14);

    public final void z(boolean z13) {
        this.f121494c = z13;
    }
}
