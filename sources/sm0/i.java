package sm0;

import ao2.j0;
import com.pinterest.api.model.v7;
import jc0.v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import qm0.b1;
import qm0.c1;
import qm0.d1;
import u50.r;

/* loaded from: classes5.dex */
public final class i implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final gi2.b f113259a;

    /* renamed from: b, reason: collision with root package name */
    public final w f113260b;

    public i(gi2.b optionsGenerator, w eventManager) {
        Intrinsics.checkNotNullParameter(optionsGenerator, "optionsGenerator");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f113259a = optionsGenerator;
        this.f113260b = eventManager;
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(j0 scope, d1 request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z13 = request instanceof c1;
        w wVar = this.f113260b;
        if (!z13) {
            if (request instanceof b1) {
                a.c.y(wVar);
            }
        } else {
            v7 v7Var = ((c1) request).f104252a;
            dl0.a a13 = jl0.b.f76936a.a(v7Var);
            this.f113259a.getClass();
            wVar.d(new v(new lp.k(new ha2.a(e0.b(cl0.c.a(gi2.b.o0(a13), new p70.a(eventIntake, 12), kh2.w.h0(v7Var))), false, (Integer) null, 14)), false, 0L, 30));
        }
    }
}
