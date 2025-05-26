package x4;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.c2;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f131689a;

    /* renamed from: b, reason: collision with root package name */
    public final int f131690b;

    /* renamed from: c, reason: collision with root package name */
    public final m f131691c;

    /* renamed from: d, reason: collision with root package name */
    public final int f131692d;

    /* renamed from: f, reason: collision with root package name */
    public final c2 f131694f;

    /* renamed from: g, reason: collision with root package name */
    public final Interpolator f131695g;

    /* renamed from: i, reason: collision with root package name */
    public float f131697i;

    /* renamed from: j, reason: collision with root package name */
    public float f131698j;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f131701m;

    /* renamed from: e, reason: collision with root package name */
    public final t4.f f131693e = new t4.f(0);

    /* renamed from: h, reason: collision with root package name */
    public boolean f131696h = false;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f131700l = new Rect();

    /* renamed from: k, reason: collision with root package name */
    public long f131699k = System.nanoTime();

    public c0(c2 c2Var, m mVar, int i13, int i14, int i15, Interpolator interpolator, int i16, int i17) {
        this.f131701m = false;
        this.f131694f = c2Var;
        this.f131691c = mVar;
        this.f131692d = i14;
        if (((ArrayList) c2Var.f16535f) == null) {
            c2Var.f16535f = new ArrayList();
        }
        ((ArrayList) c2Var.f16535f).add(this);
        this.f131695g = interpolator;
        this.f131689a = i16;
        this.f131690b = i17;
        if (i15 == 3) {
            this.f131701m = true;
        }
        this.f131698j = i13 == 0 ? Float.MAX_VALUE : 1.0f / i13;
        a();
    }

    public final void a() {
        boolean z13 = this.f131696h;
        c2 c2Var = this.f131694f;
        Interpolator interpolator = this.f131695g;
        m mVar = this.f131691c;
        int i13 = this.f131690b;
        int i14 = this.f131689a;
        if (!z13) {
            long nanoTime = System.nanoTime();
            long j13 = nanoTime - this.f131699k;
            this.f131699k = nanoTime;
            float f13 = (((float) (j13 * 1.0E-6d)) * this.f131698j) + this.f131697i;
            this.f131697i = f13;
            if (f13 >= 1.0f) {
                this.f131697i = 1.0f;
            }
            boolean e13 = mVar.e(interpolator == null ? this.f131697i : interpolator.getInterpolation(this.f131697i), nanoTime, mVar.f131777b, this.f131693e);
            if (this.f131697i >= 1.0f) {
                if (i14 != -1) {
                    mVar.f131777b.setTag(i14, Long.valueOf(System.nanoTime()));
                }
                if (i13 != -1) {
                    mVar.f131777b.setTag(i13, null);
                }
                if (!this.f131701m) {
                    ((ArrayList) c2Var.f16536g).add(this);
                }
            }
            if (this.f131697i < 1.0f || e13) {
                ((MotionLayout) c2Var.f16531b).invalidate();
                return;
            }
            return;
        }
        long nanoTime2 = System.nanoTime();
        long j14 = nanoTime2 - this.f131699k;
        this.f131699k = nanoTime2;
        float f14 = this.f131697i - (((float) (j14 * 1.0E-6d)) * this.f131698j);
        this.f131697i = f14;
        if (f14 < 0.0f) {
            this.f131697i = 0.0f;
        }
        float f15 = this.f131697i;
        if (interpolator != null) {
            f15 = interpolator.getInterpolation(f15);
        }
        boolean e14 = mVar.e(f15, nanoTime2, mVar.f131777b, this.f131693e);
        if (this.f131697i <= 0.0f) {
            if (i14 != -1) {
                mVar.f131777b.setTag(i14, Long.valueOf(System.nanoTime()));
            }
            if (i13 != -1) {
                mVar.f131777b.setTag(i13, null);
            }
            ((ArrayList) c2Var.f16536g).add(this);
        }
        if (this.f131697i > 0.0f || e14) {
            ((MotionLayout) c2Var.f16531b).invalidate();
        }
    }

    public final void b() {
        this.f131696h = true;
        int i13 = this.f131692d;
        if (i13 != -1) {
            this.f131698j = i13 == 0 ? Float.MAX_VALUE : 1.0f / i13;
        }
        ((MotionLayout) this.f131694f.f16531b).invalidate();
        this.f131699k = System.nanoTime();
    }
}
