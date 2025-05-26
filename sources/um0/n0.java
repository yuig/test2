package um0;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final p70.e f122739a;

    /* renamed from: b, reason: collision with root package name */
    public final k92.j f122740b;

    /* renamed from: c, reason: collision with root package name */
    public final zb0.i f122741c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.d0 f122742d;

    /* renamed from: e, reason: collision with root package name */
    public final x02.x0 f122743e;

    /* renamed from: f, reason: collision with root package name */
    public final x02.z0 f122744f;

    /* renamed from: g, reason: collision with root package name */
    public final xk2.v f122745g;

    public n0(p70.e organizeToolsSEP, k92.j toastSEP, zb0.i alertSEP, zy.d0 pinalyticsSEP, x02.x0 boardRepository, x02.z0 boardSectionRepository) {
        Intrinsics.checkNotNullParameter(organizeToolsSEP, "organizeToolsSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(alertSEP, "alertSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(boardSectionRepository, "boardSectionRepository");
        this.f122739a = organizeToolsSEP;
        this.f122740b = toastSEP;
        this.f122741c = alertSEP;
        this.f122742d = pinalyticsSEP;
        this.f122743e = boardRepository;
        this.f122744f = boardSectionRepository;
        this.f122745g = xk2.m.b(m0.f122737i);
    }

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        h0 request = (h0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof e0) {
            this.f122739a.m(scope, ((e0) request).f122703a, new ca0.y(eventIntake, 20));
            return;
        }
        if (request instanceof d0) {
            this.f122740b.e(scope, ((d0) request).f122694a, new ca0.y(eventIntake, 21));
            return;
        }
        if (request instanceof b0) {
            this.f122741c.e(scope, ((b0) request).f122689a, new ca0.y(eventIntake, 22));
            return;
        }
        if (request instanceof c0) {
            this.f122742d.e(scope, ((c0) request).f122692a, eventIntake);
            return;
        }
        if (request instanceof f0) {
            kotlin.jvm.internal.j.z(scope, null, null, new i0(this, request, eventIntake, null), 3);
            return;
        }
        if (request instanceof g0) {
            kotlin.jvm.internal.j.z(scope, null, null, new j0(this, request, eventIntake, null), 3);
            return;
        }
        if (request instanceof a0) {
            String boardId = ((a0) request).f122683a;
            x02.x0 x0Var = this.f122743e;
            x0Var.getClass();
            Intrinsics.checkNotNullParameter(boardId, "boardId");
            x0Var.O.c(new Pair(boardId, ""));
        }
    }
}
