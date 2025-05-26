package sf1;

import android.view.MotionEvent;
import android.view.animation.Interpolator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 implements p1 {

    /* renamed from: b, reason: collision with root package name */
    public final ew0.a f112515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1 f112516c;

    public b1(e1 e1Var) {
        this.f112516c = e1Var;
        ew0.a aVar = ew0.a.f60338c;
        ew0.a aVar2 = ew0.a.f60338c;
        Interpolator interpolator = aVar2.f60340b;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        this.f112515b = new ew0.a(300L, interpolator);
    }

    @Override // sf1.p1
    public final boolean a() {
        e1 e1Var = this.f112516c;
        e1Var.getClass();
        nc2.h hVar = nc2.h.f90405a;
        j1 j1Var = e1Var.G;
        return nc2.h.a((j1Var != null ? ((rf1.p0) j1Var).u4() : null) + "-" + e1Var.f112558q.f19924d).f90409a;
    }

    @Override // sf1.p1
    public final void b(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        e1 e1Var = this.f112516c;
        j1 j1Var = e1Var.G;
        if (j1Var != null) {
            rf1.p0 p0Var = (rf1.p0) j1Var;
            Intrinsics.checkNotNullParameter(event, "event");
            k1 x33 = p0Var.x3();
            if (x33 != null) {
                ((e1) x33).t0(false, p0Var.j4());
            }
        }
        e1Var.getClass();
        ew0.a animation = this.f112515b;
        Intrinsics.checkNotNullParameter(animation, "animation");
        e1Var.T(false, animation);
    }

    @Override // sf1.p1
    public final void c(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f112516c.g0(event);
    }

    @Override // sf1.p1
    public final void d() {
        rf1.p0 p0Var;
        k1 x33;
        e1 e1Var = this.f112516c;
        j1 j1Var = e1Var.G;
        if (j1Var != null && (x33 = (p0Var = (rf1.p0) j1Var).x3()) != null) {
            ((e1) x33).t0(rf1.p0.s4(p0Var), p0Var.j4());
        }
        ew0.a animation = this.f112515b;
        Intrinsics.checkNotNullParameter(animation, "animation");
        e1Var.T(true, animation);
    }
}
