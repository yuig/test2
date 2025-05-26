package bg2;

import ei2.v;
import i1.u;
import k1.p;
import kotlin.jvm.internal.Intrinsics;
import qg2.k;

/* loaded from: classes4.dex */
public final class e extends uf2.e implements b {

    /* renamed from: d, reason: collision with root package name */
    public final og2.a f22793d;

    /* renamed from: e, reason: collision with root package name */
    public oi2.b f22794e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(og2.a clock, v spanService, lh2.b logger) {
        super(spanService, logger, new wf2.c(d.f22792i));
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(spanService, "spanService");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f22793d = clock;
    }

    @Override // bg2.b
    public final void d(k status) {
        Intrinsics.checkNotNullParameter(status, "status");
        long now = this.f22793d.now();
        oi2.b bVar = this.f22794e;
        uf2.c cVar = uf2.c.f122114k;
        if (bVar != null) {
            g(cVar, new p(this, now, 9), false);
        }
        g(cVar, new u(status, now, this, 1), true);
    }
}
