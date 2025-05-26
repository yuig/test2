package di2;

import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.Log;
import io.embrace.android.embracesdk.internal.payload.LogPayload;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kh2.z;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xf2.r;
import xf2.v;
import xk2.s;

/* loaded from: classes4.dex */
public final class q implements b {

    /* renamed from: a, reason: collision with root package name */
    public final bh2.a f55111a;

    /* renamed from: b, reason: collision with root package name */
    public final og2.a f55112b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f55113c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f55114d;

    public q(bh2.a intakeService, og2.a clock, z processIdProvider) {
        i uuidProvider = i.f55087k;
        Intrinsics.checkNotNullParameter(intakeService, "intakeService");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(processIdProvider, "processIdProvider");
        Intrinsics.checkNotNullParameter(uuidProvider, "uuidProvider");
        this.f55111a = intakeService;
        this.f55112b = clock;
        this.f55113c = processIdProvider;
        this.f55114d = uuidProvider;
    }

    public final yg2.d a(yg2.f fVar, boolean z13, yg2.b bVar) {
        return new yg2.d(this.f55112b.now(), (String) this.f55114d.invoke(), (String) this.f55113c.invoke(), fVar, z13, bVar);
    }

    @Override // di2.b
    public final void d(Envelope envelope) {
        Intrinsics.checkNotNullParameter(envelope, "envelope");
        ((bh2.b) this.f55111a).a(envelope, a(yg2.f.ATTACHMENT, true, yg2.b.ATTACHMENT));
    }

    @Override // di2.b
    public final void f(Envelope envelope, boolean z13) {
        Log log;
        List list;
        Log log2;
        List list2;
        Intrinsics.checkNotNullParameter(envelope, "envelope");
        List list3 = ((LogPayload) envelope.f73112e).f73188a;
        String str = null;
        String a13 = (list3 == null || (log2 = (Log) CollectionsKt.firstOrNull(list3)) == null || (list2 = log2.f73179e) == null) ? null : ei2.d.a("emb.type", list2);
        yg2.f fVar = Intrinsics.d(a13, xf2.j.f134867e.f134852b) ? yg2.f.CRASH : Intrinsics.d(a13, xf2.q.f134886e.f134852b) ? yg2.f.CRASH : Intrinsics.d(a13, v.f134900e.f134852b) ? yg2.f.CRASH : Intrinsics.d(a13, xf2.m.f134875e.f134852b) ? yg2.f.CRASH : Intrinsics.d(a13, r.f134892e.f134852b) ? yg2.f.BLOB : yg2.f.LOG;
        yg2.a aVar = yg2.b.Companion;
        List list4 = ((LogPayload) envelope.f73112e).f73188a;
        if (list4 != null && (log = (Log) CollectionsKt.firstOrNull(list4)) != null && (list = log.f73179e) != null) {
            str = ei2.d.a("emb.type", list);
        }
        aVar.getClass();
        ((bh2.b) this.f55111a).a(envelope, a(fVar, true, yg2.a.a(str)));
    }

    @Override // di2.b
    public final void k(Envelope envelope, n transitionType) {
        Intrinsics.checkNotNullParameter(envelope, "envelope");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        ((bh2.b) this.f55111a).a(envelope, a(yg2.f.SESSION, true, yg2.b.SESSION));
    }

    @Override // di2.b
    public final void m(Envelope envelope) {
        Intrinsics.checkNotNullParameter(envelope, "envelope");
        ((bh2.b) this.f55111a).a(envelope, a(yg2.f.SESSION, false, yg2.b.SESSION));
    }

    @Override // di2.b
    public final void q(Envelope envelope) {
        Intrinsics.checkNotNullParameter(envelope, "envelope");
        ((bh2.b) this.f55111a).a(envelope, a(yg2.f.CRASH, false, yg2.b.UNKNOWN));
    }

    @Override // cg2.e
    public final void w(String crashId) {
        Intrinsics.checkNotNullParameter(crashId, "crashId");
        bh2.b bVar = (bh2.b) this.f55111a;
        long j13 = bVar.f22816g;
        ki2.e eVar = bVar.f22815f;
        eVar.getClass();
        try {
            xk2.q qVar = s.f135225b;
            ExecutorService executorService = eVar.f79809a;
            executorService.shutdown();
            executorService.awaitTermination(j13, TimeUnit.MILLISECONDS);
        } catch (Throwable th3) {
            xk2.q qVar2 = s.f135225b;
            ue.c.m(th3);
        }
    }
}
