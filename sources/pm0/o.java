package pm0;

import ao2.j0;
import ao2.v0;
import kotlin.jvm.internal.Intrinsics;
import x02.x0;

/* loaded from: classes5.dex */
public final class o implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f100688a;

    public o(x0 boardRepository) {
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        this.f100688a = boardRepository;
    }

    @Override // l82.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(j0 scope, p request, u50.r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof d0) {
            d0 d0Var = (d0) request;
            String str = d0Var.f100646a;
            ko2.f fVar = v0.f20219a;
            kotlin.jvm.internal.j.z(scope, ko2.e.f80326c, null, new n(d0Var.f100647b, this, str, eventIntake, null), 2);
        }
    }
}
