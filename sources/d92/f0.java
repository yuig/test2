package d92;

import ao2.v0;
import kotlin.jvm.internal.Intrinsics;
import x02.i2;

/* loaded from: classes4.dex */
public final class f0 implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final z82.b f54142a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f54143b;

    /* renamed from: c, reason: collision with root package name */
    public final i92.k f54144c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.d0 f54145d;

    /* renamed from: e, reason: collision with root package name */
    public final ao2.f0 f54146e;

    public f0(z82.b handshakeManager, y82.h handshakeAnalytics, i2 pinRepository, i92.k toastUtils, zy.d0 pinalyticsSEP) {
        ko2.f fVar = v0.f20219a;
        ko2.e ioDispatcher = ko2.e.f80326c;
        Intrinsics.checkNotNullParameter(handshakeManager, "handshakeManager");
        Intrinsics.checkNotNullParameter(handshakeAnalytics, "handshakeAnalytics");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f54142a = handshakeManager;
        this.f54143b = pinRepository;
        this.f54144c = toastUtils;
        this.f54145d = pinalyticsSEP;
        this.f54146e = ioDispatcher;
    }

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        l0 request = (l0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z13 = request instanceof i0;
        ao2.f0 f0Var = this.f54146e;
        if (z13) {
            kotlin.jvm.internal.j.z(scope, f0Var, null, new c0(this, ((i0) request).f54153a, eventIntake, null), 2);
            return;
        }
        if (request instanceof k0) {
            this.f54144c.c(new qp1.k0(((k0) request).f54158a, 1));
        } else {
            if (Intrinsics.d(request, h0.f54149a)) {
                kotlin.jvm.internal.j.z(scope, f0Var, null, new d0(this, eventIntake, null), 2);
                return;
            }
            if (request instanceof j0) {
                kotlin.jvm.internal.j.z(scope, f0Var, null, new e0(this, eventIntake, null), 2);
            } else if (request instanceof g0) {
                this.f54145d.e(scope, ((g0) request).f54148a, eventIntake);
            }
        }
    }
}
