package oj;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import kh2.g0;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a */
    public final a f95345a;

    /* renamed from: b */
    public final View f95346b;

    /* renamed from: c */
    public final Paint f95347c;

    /* renamed from: d */
    public f f95348d;

    /* renamed from: e */
    public Drawable f95349e;

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f95345a = aVar;
        View view = (View) aVar;
        this.f95346b = view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.f95347c = paint;
        paint.setColor(0);
    }

    public final void a(Canvas canvas) {
        f fVar = this.f95348d;
        boolean z13 = !(fVar == null || fVar.f95356c == Float.MAX_VALUE);
        Paint paint = this.f95347c;
        a aVar = this.f95345a;
        View view = this.f95346b;
        if (z13) {
            aVar.m(canvas);
            if (Color.alpha(paint.getColor()) != 0) {
                canvas.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), paint);
            }
        } else {
            aVar.m(canvas);
            if (Color.alpha(paint.getColor()) != 0) {
                canvas.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), paint);
            }
        }
        Drawable drawable = this.f95349e;
        if (drawable == null || this.f95348d == null) {
            return;
        }
        Rect bounds = drawable.getBounds();
        float width = this.f95348d.f95354a - (bounds.width() / 2.0f);
        float height = this.f95348d.f95355b - (bounds.height() / 2.0f);
        canvas.translate(width, height);
        this.f95349e.draw(canvas);
        canvas.translate(-width, -height);
    }

    public final f b() {
        f fVar = this.f95348d;
        if (fVar == null) {
            return null;
        }
        f fVar2 = new f(fVar);
        if (fVar2.f95356c == Float.MAX_VALUE) {
            float f13 = fVar2.f95354a;
            float f14 = fVar2.f95355b;
            View view = this.f95346b;
            fVar2.f95356c = g0.l(f13, f14, view.getWidth(), view.getHeight());
        }
        return fVar2;
    }

    public final boolean c() {
        if (!this.f95345a.C()) {
            return false;
        }
        f fVar = this.f95348d;
        return !((fVar == null || (fVar.f95356c > Float.MAX_VALUE ? 1 : (fVar.f95356c == Float.MAX_VALUE ? 0 : -1)) == 0) ^ true);
    }

    public final void d(Drawable drawable) {
        this.f95349e = drawable;
        this.f95346b.invalidate();
    }

    public final void e(int i13) {
        this.f95347c.setColor(i13);
        this.f95346b.invalidate();
    }

    public final void f(f fVar) {
        View view = this.f95346b;
        if (fVar == null) {
            this.f95348d = null;
        } else {
            f fVar2 = this.f95348d;
            if (fVar2 == null) {
                this.f95348d = new f(fVar);
            } else {
                float f13 = fVar.f95354a;
                float f14 = fVar.f95355b;
                float f15 = fVar.f95356c;
                fVar2.f95354a = f13;
                fVar2.f95355b = f14;
                fVar2.f95356c = f15;
            }
            if (fVar.f95356c + 1.0E-4f >= g0.l(fVar.f95354a, fVar.f95355b, view.getWidth(), view.getHeight())) {
                this.f95348d.f95356c = Float.MAX_VALUE;
            }
        }
        view.invalidate();
    }
}
