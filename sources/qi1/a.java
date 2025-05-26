package qi1;

import ao2.j0;
import bb2.e;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import ni1.h1;
import ni1.t2;
import ni1.u0;
import ni1.y2;
import qa2.d0;
import u50.o;
import u50.r;
import wa2.g0;
import wa2.i;
import wt1.d;
import wt1.f;
import yk1.n;

/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final i f103999a;

    /* renamed from: b, reason: collision with root package name */
    public final t2 f104000b;

    public a(i mutablePinFeatureConfig, t2 pinRepViewModelFactory) {
        Intrinsics.checkNotNullParameter(mutablePinFeatureConfig, "mutablePinFeatureConfig");
        Intrinsics.checkNotNullParameter(pinRepViewModelFactory, "pinRepViewModelFactory");
        this.f103999a = mutablePinFeatureConfig;
        this.f104000b = pinRepViewModelFactory;
    }

    @Override // wt1.f
    public final d b(j0 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        d0 d0Var = this.f103999a.f128768e0;
        t2 t2Var = this.f104000b;
        return d0Var != null ? t2.a(t2Var, scope, new zw.a(d0Var), 4) : t2.a(t2Var, scope, null, 12);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        y2 model = (y2) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }

    @Override // wt1.f
    public final void h(o oVar, n nVar, r eventIntake) {
        e eVar;
        u0 displayState = (u0) oVar;
        ti1.f view = (ti1.f) nVar;
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        i iVar = this.f103999a;
        g0 g0Var = iVar.f128764c0;
        if (g0Var == null || (eVar = g0Var.c()) == null) {
            eVar = iVar.f128766d0;
        }
        iVar.f128766d0 = eVar;
        view.bindDisplayState(displayState);
        eventIntake.a(new h1(f0.i0(iVar)));
    }

    @Override // wt1.f
    public final void i(r eventIntake, n nVar) {
        ti1.f view = (ti1.f) nVar;
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEventIntake(eventIntake);
    }
}
