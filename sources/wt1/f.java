package wt1;

import android.view.View;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import t3.s1;

/* loaded from: classes2.dex */
public abstract class f extends vq0.h {
    /* JADX WARN: Multi-variable type inference failed */
    public static void j(yk1.n view, i0 item) {
        e eVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "model");
        View view2 = view instanceof View ? (View) view : null;
        if (view2 != null) {
            yk1.m j13 = s1.j(view2);
            if (!(j13 instanceof e)) {
                j13 = null;
            }
            eVar = (e) j13;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(view, "view");
            d dVar = eVar.f131097a;
            if (dVar == null) {
                Intrinsics.r("viewModel");
                throw null;
            }
            u50.o itemDisplayState = dVar.b(item, false);
            if (itemDisplayState != null) {
                eVar.f131101e = itemDisplayState;
                d dVar2 = eVar.f131097a;
                if (dVar2 == null) {
                    Intrinsics.r("viewModel");
                    throw null;
                }
                u50.r eventIntake = dVar2.c();
                Intrinsics.checkNotNullParameter(itemDisplayState, "itemDisplayState");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                eVar.f131102f.h(itemDisplayState, view, eventIntake);
            }
        }
    }

    public abstract d b(j0 j0Var);

    @Override // vq0.h
    public final /* bridge */ /* synthetic */ void c(yk1.n nVar, Object obj, int i13) {
        j(nVar, (i0) obj);
    }

    @Override // vq0.h
    public final yk1.m f() {
        return new e(this);
    }

    public abstract void h(u50.o oVar, yk1.n nVar, u50.r rVar);

    public abstract void i(u50.r rVar, yk1.n nVar);
}
