package xj;

import android.animation.ObjectAnimator;
import androidx.appcompat.app.j0;
import androidx.appcompat.widget.v2;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.List;

/* loaded from: classes3.dex */
public final class n extends j0 {

    /* renamed from: i, reason: collision with root package name */
    public static final v2 f135132i = new v2(18, Float.class, "animationFraction");

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f135133c;

    /* renamed from: d, reason: collision with root package name */
    public final q6.b f135134d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearProgressIndicatorSpec f135135e;

    /* renamed from: f, reason: collision with root package name */
    public int f135136f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f135137g;

    /* renamed from: h, reason: collision with root package name */
    public float f135138h;

    public n(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f135136f = 1;
        this.f135135e = linearProgressIndicatorSpec;
        this.f135134d = new q6.b();
    }

    public final void B() {
        this.f135137g = true;
        this.f135136f = 1;
        for (k kVar : (List) this.f16057b) {
            LinearProgressIndicatorSpec linearProgressIndicatorSpec = this.f135135e;
            kVar.f135122c = linearProgressIndicatorSpec.f135076c[0];
            kVar.f135123d = linearProgressIndicatorSpec.f135080g / 2;
        }
    }

    @Override // androidx.appcompat.app.j0
    public final void l() {
        ObjectAnimator objectAnimator = this.f135133c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // androidx.appcompat.app.j0
    public final void t() {
        B();
    }

    @Override // androidx.appcompat.app.j0
    public final void v(b bVar) {
    }

    @Override // androidx.appcompat.app.j0
    public final void w() {
    }

    @Override // androidx.appcompat.app.j0
    public final void y() {
        if (this.f135133c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f135132i, 0.0f, 1.0f);
            this.f135133c = ofFloat;
            ofFloat.setDuration(333L);
            this.f135133c.setInterpolator(null);
            this.f135133c.setRepeatCount(-1);
            this.f135133c.addListener(new androidx.appcompat.widget.d(this, 8));
        }
        B();
        this.f135133c.start();
    }

    @Override // androidx.appcompat.app.j0
    public final void z() {
    }
}
