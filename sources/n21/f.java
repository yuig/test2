package n21;

import android.view.View;
import com.pinterest.feature.pincarouselads.view.a0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.p2;
import lh0.z3;
import yk1.m;
import yk1.n;

/* loaded from: classes.dex */
public final class f extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final uk1.d f89005a;

    /* renamed from: b, reason: collision with root package name */
    public final p2 f89006b;

    public f(uk1.d presenterPinalytics, p2 experiments) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f89005a = presenterPinalytics;
        this.f89006b = experiments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v34, types: [yk1.m] */
    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        a0 view = (a0) nVar;
        m21.a model = (m21.a) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            yk1.j.a().getClass();
            ?? b13 = yk1.j.b(view);
            r1 = b13 instanceof e ? b13 : null;
        }
        e eVar = r1;
        if (eVar != null) {
            eVar.q3(((!model.e() || model.h()) && !model.m()) ? nc2.h.f90406b : true);
            p2 p2Var = this.f89006b;
            p2Var.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) p2Var.f83457a;
            eVar.u3((g1Var.o("android_full_screen_expand_collections", "enabled", z3Var) || g1Var.l("android_full_screen_expand_collections")) ? Intrinsics.d(model.p(), Boolean.TRUE) : false);
            eVar.v3(!model.m());
            eVar.t3(model.m());
            eVar.p3(model.o());
            eVar.w3((!model.e() || model.h()) && !model.m());
            eVar.x3((model.e() || model.h()) && !model.m());
            eVar.s3(model.e());
            eVar.z3(model.l());
            eVar.r3(this.f89005a);
            eVar.D3(model.n());
            eVar.B3(i13, model.c(), model.getPinId(), model.f(), model.r(), model.h(), model.s());
        }
    }

    @Override // vq0.h
    public final m f() {
        return new e();
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        m21.a model = (m21.a) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
