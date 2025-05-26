package xj;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import androidx.appcompat.widget.v2;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class j extends Drawable implements Animatable {

    /* renamed from: k */
    public static final v2 f135109k = new v2(17, Float.class, "growFraction");

    /* renamed from: a */
    public final Context f135110a;

    /* renamed from: b */
    public final c f135111b;

    /* renamed from: d */
    public ValueAnimator f135113d;

    /* renamed from: e */
    public ValueAnimator f135114e;

    /* renamed from: f */
    public ArrayList f135115f;

    /* renamed from: g */
    public boolean f135116g;

    /* renamed from: h */
    public float f135117h;

    /* renamed from: j */
    public int f135119j;

    /* renamed from: i */
    public final Paint f135118i = new Paint();

    /* renamed from: c */
    public final vt1.a f135112c = new vt1.a();

    public j(Context context, c cVar) {
        this.f135110a = context;
        this.f135111b = cVar;
        setAlpha(255);
    }

    public final float b() {
        c cVar = this.f135111b;
        if (cVar.f135078e == 0 && cVar.f135079f == 0) {
            return 1.0f;
        }
        return this.f135117h;
    }

    public final boolean c(boolean z13, boolean z14, boolean z15) {
        ContentResolver contentResolver = this.f135110a.getContentResolver();
        this.f135112c.getClass();
        return d(z13, z14, z15 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean d(boolean z13, boolean z14, boolean z15) {
        ValueAnimator valueAnimator = this.f135113d;
        v2 v2Var = f135109k;
        if (valueAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, v2Var, 0.0f, 1.0f);
            this.f135113d = ofFloat;
            ofFloat.setDuration(500L);
            this.f135113d.setInterpolator(gj.a.f65168b);
            ValueAnimator valueAnimator2 = this.f135113d;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f135113d = valueAnimator2;
            valueAnimator2.addListener(new i(this, 0));
        }
        if (this.f135114e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, v2Var, 1.0f, 0.0f);
            this.f135114e = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f135114e.setInterpolator(gj.a.f65168b);
            ValueAnimator valueAnimator3 = this.f135114e;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f135114e = valueAnimator3;
            valueAnimator3.addListener(new i(this, 1));
        }
        if (!isVisible() && !z13) {
            return false;
        }
        ValueAnimator valueAnimator4 = z13 ? this.f135113d : this.f135114e;
        ValueAnimator valueAnimator5 = z13 ? this.f135114e : this.f135113d;
        if (!z15) {
            if (valueAnimator5.isRunning()) {
                boolean z16 = this.f135116g;
                this.f135116g = true;
                new ValueAnimator[]{valueAnimator5}[0].cancel();
                this.f135116g = z16;
            }
            if (valueAnimator4.isRunning()) {
                valueAnimator4.end();
            } else {
                boolean z17 = this.f135116g;
                this.f135116g = true;
                new ValueAnimator[]{valueAnimator4}[0].end();
                this.f135116g = z17;
            }
            return super.setVisible(z13, false);
        }
        if (valueAnimator4.isRunning()) {
            return false;
        }
        boolean z18 = !z13 || super.setVisible(z13, false);
        c cVar = this.f135111b;
        if (!z13 ? cVar.f135079f != 0 : cVar.f135078e != 0) {
            boolean z19 = this.f135116g;
            this.f135116g = true;
            new ValueAnimator[]{valueAnimator4}[0].end();
            this.f135116g = z19;
            return z18;
        }
        if (z14 || !valueAnimator4.isPaused()) {
            valueAnimator4.start();
        } else {
            valueAnimator4.resume();
        }
        return z18;
    }

    public final void e(b bVar) {
        ArrayList arrayList = this.f135115f;
        if (arrayList == null || !arrayList.contains(bVar)) {
            return;
        }
        this.f135115f.remove(bVar);
        if (this.f135115f.isEmpty()) {
            this.f135115f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f135119j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.f135113d;
        return (valueAnimator2 != null && valueAnimator2.isRunning()) || ((valueAnimator = this.f135114e) != null && valueAnimator.isRunning());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f135119j = i13;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f135118i.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z13, boolean z14) {
        return c(z13, z14, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        d(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        d(false, true, false);
    }
}
