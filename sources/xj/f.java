package xj;

import android.animation.ObjectAnimator;
import androidx.appcompat.app.j0;
import androidx.appcompat.widget.v2;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import java.util.List;

/* loaded from: classes3.dex */
public final class f extends j0 {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f135088k = {0, 1350, 2700, 4050};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f135089l = {667, 2017, 3367, 4717};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f135090m = {1000, 2350, 3700, 5050};

    /* renamed from: n, reason: collision with root package name */
    public static final v2 f135091n = new v2(15, Float.class, "animationFraction");

    /* renamed from: o, reason: collision with root package name */
    public static final v2 f135092o = new v2(16, Float.class, "completeEndFraction");

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f135093c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f135094d;

    /* renamed from: e, reason: collision with root package name */
    public final q6.b f135095e;

    /* renamed from: f, reason: collision with root package name */
    public final CircularProgressIndicatorSpec f135096f;

    /* renamed from: g, reason: collision with root package name */
    public int f135097g;

    /* renamed from: h, reason: collision with root package name */
    public float f135098h;

    /* renamed from: i, reason: collision with root package name */
    public float f135099i;

    /* renamed from: j, reason: collision with root package name */
    public va.c f135100j;

    public f(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f135097g = 0;
        this.f135100j = null;
        this.f135096f = circularProgressIndicatorSpec;
        this.f135095e = new q6.b();
    }

    @Override // androidx.appcompat.app.j0
    public final void l() {
        ObjectAnimator objectAnimator = this.f135093c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // androidx.appcompat.app.j0
    public final void t() {
        this.f135097g = 0;
        ((k) ((List) this.f16057b).get(0)).f135122c = this.f135096f.f135076c[0];
        this.f135099i = 0.0f;
    }

    @Override // androidx.appcompat.app.j0
    public final void v(b bVar) {
        this.f135100j = bVar;
    }

    @Override // androidx.appcompat.app.j0
    public final void w() {
        ObjectAnimator objectAnimator = this.f135094d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((l) this.f16056a).isVisible()) {
            this.f135094d.start();
        } else {
            l();
        }
    }

    @Override // androidx.appcompat.app.j0
    public final void y() {
        if (this.f135093c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f135091n, 0.0f, 1.0f);
            this.f135093c = ofFloat;
            ofFloat.setDuration(5400L);
            this.f135093c.setInterpolator(null);
            this.f135093c.setRepeatCount(-1);
            this.f135093c.addListener(new e(this, 0));
        }
        if (this.f135094d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f135092o, 0.0f, 1.0f);
            this.f135094d = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f135094d.setInterpolator(this.f135095e);
            this.f135094d.addListener(new e(this, 1));
        }
        this.f135097g = 0;
        ((k) ((List) this.f16057b).get(0)).f135122c = this.f135096f.f135076c[0];
        this.f135099i = 0.0f;
        this.f135093c.start();
    }

    @Override // androidx.appcompat.app.j0
    public final void z() {
        this.f135100j = null;
    }
}
