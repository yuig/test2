package lx0;

import ao2.j0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.jvm.internal.Intrinsics;
import ni1.t2;
import ni1.u0;
import ni1.y2;
import u50.o;
import u50.r;
import wt1.d;
import wt1.f;
import yk1.n;

/* loaded from: classes5.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85061a;

    /* renamed from: b, reason: collision with root package name */
    public final t2 f85062b;

    public b(t2 viewModelFactory, int i13) {
        this.f85061a = i13;
        if (i13 == 1) {
            this.f85062b = viewModelFactory;
        } else {
            Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
            this.f85062b = viewModelFactory;
        }
    }

    @Override // wt1.f
    public final d b(j0 scope) {
        t2 t2Var = this.f85062b;
        switch (this.f85061a) {
            case 0:
                Intrinsics.checkNotNullParameter(scope, "scope");
                break;
            default:
                Intrinsics.checkNotNullParameter(scope, "scope");
                break;
        }
        return t2.a(t2Var, scope, null, 14);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        int i14 = this.f85061a;
        switch (i14) {
            case 0:
                y2 model = (y2) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model, "model");
                        return model.f90901a.c4();
                    default:
                        Intrinsics.checkNotNullParameter(model, "model");
                        return model.f90901a.c4();
                }
            default:
                y2 model2 = (y2) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model2, "model");
                        return model2.f90901a.c4();
                    default:
                        Intrinsics.checkNotNullParameter(model2, "model");
                        return model2.f90901a.c4();
                }
        }
    }

    @Override // wt1.f
    public final /* bridge */ /* synthetic */ void h(o oVar, n nVar, r rVar) {
        switch (this.f85061a) {
            case 0:
                k((u0) oVar, (SbaPinRep) nVar, rVar);
                break;
            default:
                k((u0) oVar, (SbaPinRep) nVar, rVar);
                break;
        }
    }

    @Override // wt1.f
    public final void i(r eventIntake, n nVar) {
        int i13 = this.f85061a;
        switch (i13) {
            case 0:
                SbaPinRep view = (SbaPinRep) nVar;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.setEventIntake(eventIntake);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.setEventIntake(eventIntake);
                        break;
                }
            default:
                SbaPinRep view2 = (SbaPinRep) nVar;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                        Intrinsics.checkNotNullParameter(view2, "view");
                        view2.setEventIntake(eventIntake);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                        Intrinsics.checkNotNullParameter(view2, "view");
                        view2.setEventIntake(eventIntake);
                        break;
                }
        }
    }

    public final void k(u0 displayState, SbaPinRep view, r eventIntake) {
        switch (this.f85061a) {
            case 0:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                view.bindDisplayState(displayState);
                break;
            default:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                view.bindDisplayState(u0.e(displayState, 0, null, null, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 2097135));
                break;
        }
    }
}
