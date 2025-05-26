package qp1;

import ao2.v0;
import kotlin.jvm.internal.Intrinsics;
import x02.i2;

/* loaded from: classes5.dex */
public final class l0 implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final np1.j f104803a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f104804b;

    /* renamed from: c, reason: collision with root package name */
    public final i92.k f104805c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.d0 f104806d;

    /* renamed from: e, reason: collision with root package name */
    public final ao2.f0 f104807e;

    public l0(np1.j handshakeManager, i2 pinRepository, i92.k toastUtils, zy.d0 pinalyticsSEP) {
        ko2.f fVar = v0.f20219a;
        ko2.e ioDispatcher = ko2.e.f80326c;
        Intrinsics.checkNotNullParameter(handshakeManager, "handshakeManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f104803a = handshakeManager;
        this.f104804b = pinRepository;
        this.f104805c = toastUtils;
        this.f104806d = pinalyticsSEP;
        this.f104807e = ioDispatcher;
    }

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        r0 request = (r0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z13 = request instanceof o0;
        ao2.f0 f0Var = this.f104807e;
        if (z13) {
            o0 o0Var = (o0) request;
            kotlin.jvm.internal.j.z(scope, f0Var, null, new g0(this, o0Var.f104815a, eventIntake, o0Var.f104816b, null), 2);
            return;
        }
        if (request instanceof q0) {
            this.f104805c.c(new k0(((q0) request).f104824a, 0));
        } else {
            if (Intrinsics.d(request, n0.f104813a)) {
                kotlin.jvm.internal.j.z(scope, f0Var, null, new h0(this, eventIntake, null), 2);
                return;
            }
            if (request instanceof p0) {
                kotlin.jvm.internal.j.z(scope, f0Var, null, new i0(this, eventIntake, null), 2);
            } else if (request instanceof m0) {
                this.f104806d.e(scope, ((m0) request).f104811a, eventIntake);
            }
        }
    }
}
