package es;

import com.pinterest.api.model.f30;
import h32.k0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface h {
    static k0 c(h hVar, f30 f30Var) {
        lh0.d experiments = lh0.d.f83320b.b();
        v vVar = (v) hVar;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        return vVar.g(f30Var, experiments.j(), experiments.h());
    }

    static /* synthetic */ ArrayList e(h hVar, f30 f30Var, Boolean bool, int i13) {
        lh0.d b13 = lh0.d.f83320b.b();
        if ((i13 & 4) != 0) {
            bool = null;
        }
        return ((v) hVar).A(f30Var, b13, bool);
    }
}
