package lr1;

import kk2.m;
import kotlin.jvm.internal.Intrinsics;
import lh0.x1;
import qr1.j;
import so.ia;
import uj2.q;

/* loaded from: classes2.dex */
public final class f extends g {

    /* renamed from: h, reason: collision with root package name */
    public final ia f84599h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84600i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ia authControllerFactory, mr1.c activityProvider, q resultsFeed, String logValue) {
        super(j.f105010b, activityProvider, resultsFeed);
        Intrinsics.checkNotNullParameter(authControllerFactory, "authControllerFactory");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(resultsFeed, "resultsFeed");
        Intrinsics.checkNotNullParameter(logValue, "logValue");
        this.f84599h = authControllerFactory;
        this.f84600i = logValue;
    }

    @Override // or1.p
    public final String a() {
        return this.f84600i;
    }

    @Override // lr1.g
    public final m c() {
        x1 x1Var = this.f84606f;
        if (x1Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        return (m) new e(this.f84599h, this.f84602b, this.f84603c, x1Var).b();
    }
}
