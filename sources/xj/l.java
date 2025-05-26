package xj;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import androidx.appcompat.app.j0;
import c0.s0;
import java.util.List;

/* loaded from: classes3.dex */
public final class l extends j {

    /* renamed from: l, reason: collision with root package name */
    public final s0 f135124l;

    /* renamed from: m, reason: collision with root package name */
    public final j0 f135125m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f135126n;

    public l(Context context, c cVar, s0 s0Var, j0 j0Var) {
        super(context, cVar);
        this.f135124l = s0Var;
        this.f135125m = j0Var;
        j0Var.f16056a = this;
    }

    @Override // xj.j
    public final boolean d(boolean z13, boolean z14, boolean z15) {
        Drawable drawable;
        boolean d2 = super.d(z13, z14, z15);
        if (this.f135112c != null && Settings.Global.getFloat(this.f135110a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (drawable = this.f135126n) != null) {
            return drawable.setVisible(z13, z14);
        }
        if (!isRunning()) {
            this.f135125m.l();
        }
        if (z13 && z15) {
            this.f135125m.y();
        }
        return d2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            boolean z13 = this.f135112c != null && Settings.Global.getFloat(this.f135110a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f;
            c cVar = this.f135111b;
            if (z13 && (drawable = this.f135126n) != null) {
                drawable.setBounds(getBounds());
                this.f135126n.setTint(cVar.f135076c[0]);
                this.f135126n.draw(canvas);
                return;
            }
            canvas.save();
            s0 s0Var = this.f135124l;
            Rect bounds = getBounds();
            float b13 = b();
            ValueAnimator valueAnimator = this.f135113d;
            boolean z14 = valueAnimator != null && valueAnimator.isRunning();
            ValueAnimator valueAnimator2 = this.f135114e;
            boolean z15 = valueAnimator2 != null && valueAnimator2.isRunning();
            ((c) s0Var.f24333a).a();
            s0Var.b(canvas, bounds, b13, z14, z15);
            int i13 = cVar.f135080g;
            int i14 = this.f135119j;
            Paint paint = this.f135118i;
            if (i13 == 0) {
                this.f135124l.g(canvas, paint, 0.0f, 1.0f, cVar.f135077d, i14, 0);
            } else {
                k kVar = (k) ((List) this.f135125m.f16057b).get(0);
                k kVar2 = (k) ep.b.i((List) this.f135125m.f16057b, 1);
                s0 s0Var2 = this.f135124l;
                if (s0Var2 instanceof m) {
                    s0Var2.g(canvas, paint, 0.0f, kVar.f135120a, cVar.f135077d, i14, i13);
                    this.f135124l.g(canvas, paint, kVar2.f135121b, 1.0f, cVar.f135077d, i14, i13);
                } else {
                    i14 = 0;
                    s0Var2.g(canvas, paint, kVar2.f135121b, kVar.f135120a + 1.0f, cVar.f135077d, 0, i13);
                }
            }
            for (int i15 = 0; i15 < ((List) this.f135125m.f16057b).size(); i15++) {
                k kVar3 = (k) ((List) this.f135125m.f16057b).get(i15);
                this.f135124l.f(canvas, paint, kVar3, this.f135119j);
                if (i15 > 0 && i13 > 0) {
                    this.f135124l.g(canvas, paint, ((k) ((List) this.f135125m.f16057b).get(i15 - 1)).f135121b, kVar3.f135120a, cVar.f135077d, i14, i13);
                }
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f135124l.h();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f135124l.i();
    }
}
