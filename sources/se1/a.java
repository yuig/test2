package se1;

import ao2.j0;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;
import re1.j;
import u50.o;
import u50.r;
import ve1.e;
import wt1.f;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends f {
    @Override // wt1.f
    public final wt1.d b(j0 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new e(scope);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        kj kjVar;
        ve1.d model = (ve1.d) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        vh vhVar = model.f125760a;
        if (vhVar == null || (kjVar = vhVar.f42855m) == null) {
            return null;
        }
        return kjVar.a();
    }

    @Override // wt1.f
    public final void h(o oVar, n nVar, r eventIntake) {
        ve1.c displayState = (ve1.c) oVar;
        ve1.a view = (ve1.a) nVar;
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        view.getClass();
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        view.setOrientation(displayState.f125757a);
        view.setVisibility(displayState.f125758b);
        j jVar = displayState.f125759c;
        if (jVar != null) {
            view.e(jVar);
        }
    }

    @Override // wt1.f
    public final void i(r eventIntake, n nVar) {
        ve1.a view = (ve1.a) nVar;
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
