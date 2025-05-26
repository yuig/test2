package ek1;

import com.pinterest.api.model.f30;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w1 implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final ps.k f59388a;

    /* renamed from: b, reason: collision with root package name */
    public final m60.w f59389b;

    public w1(ps.k pinChipLooper, m60.w eventManager) {
        Intrinsics.checkNotNullParameter(pinChipLooper, "pinChipLooper");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f59388a = pinChipLooper;
        this.f59389b = eventManager;
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(ao2.j0 scope, v0 request, u50.r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof a1) {
            k((a1) request, eventIntake);
            return;
        }
        if (request instanceof b1) {
            l(((b1) request).j(), eventIntake);
            return;
        }
        boolean d2 = Intrinsics.d(request, c1.f59223a);
        ps.k kVar = this.f59388a;
        if (d2) {
            kVar.e();
            return;
        }
        if (Intrinsics.d(request, z0.f59401a)) {
            kVar.e();
            kVar.f101240c = 0;
        } else if (request instanceof y0) {
            ps.k.b(kVar, ((y0) request).j(), null, 6);
        } else if (Intrinsics.d(request, x0.f59391a)) {
            this.f59389b.f(new ps.m(kVar.a(), null));
        }
    }

    public final void k(a1 a1Var, u50.r rVar) {
        this.f59388a.f101240c = a1Var.k();
        f30 j13 = a1Var.j();
        String B0 = bs1.c.B0(j13);
        String y03 = bs1.c.y0(j13);
        int k13 = a1Var.k();
        as1.b a13 = as1.b.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        rVar.a(new ni1.v1(new u(k13, B0, y03, bs1.b.b(j13, a13))));
    }

    public final void l(List list, u50.r rVar) {
        ps.k kVar = this.f59388a;
        if (kVar.f101239b) {
            return;
        }
        kVar.c(list.size(), true, m1.f59282l, new ca0.j0(rVar, 4), new px0.g(kVar, list, rVar, 22));
    }
}
