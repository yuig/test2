package di2;

import i1.u;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.LogPayload;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    public final ci2.d f55089a;

    /* renamed from: b, reason: collision with root package name */
    public final og2.a f55090b;

    /* renamed from: c, reason: collision with root package name */
    public final sg2.a f55091c;

    /* renamed from: d, reason: collision with root package name */
    public final ai2.b f55092d;

    /* renamed from: e, reason: collision with root package name */
    public final a f55093e;

    /* renamed from: f, reason: collision with root package name */
    public final b f55094f;

    /* renamed from: g, reason: collision with root package name */
    public final zg2.a f55095g;

    /* renamed from: h, reason: collision with root package name */
    public final tf2.b f55096h;

    /* renamed from: i, reason: collision with root package name */
    public final vf2.c f55097i;

    /* renamed from: j, reason: collision with root package name */
    public final l f55098j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f55099k;

    /* renamed from: l, reason: collision with root package name */
    public yh2.c f55100l;

    /* renamed from: m, reason: collision with root package name */
    public bi2.f f55101m;

    public j(bi2.h processStateService, ci2.d payloadFactory, og2.a clock, sg2.a configService, ai2.b sessionIdTracker, a boundaryDelegate, b bVar, zg2.a aVar, tf2.b dataCaptureOrchestrator, ei2.a sessionSpanWriter, l sessionSpanAttrPopulator) {
        Intrinsics.checkNotNullParameter(processStateService, "processStateService");
        Intrinsics.checkNotNullParameter(payloadFactory, "payloadFactory");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(sessionIdTracker, "sessionIdTracker");
        Intrinsics.checkNotNullParameter(boundaryDelegate, "boundaryDelegate");
        Intrinsics.checkNotNullParameter(dataCaptureOrchestrator, "dataCaptureOrchestrator");
        Intrinsics.checkNotNullParameter(sessionSpanWriter, "sessionSpanWriter");
        Intrinsics.checkNotNullParameter(sessionSpanAttrPopulator, "sessionSpanAttrPopulator");
        this.f55089a = payloadFactory;
        this.f55090b = clock;
        this.f55091c = configService;
        this.f55092d = sessionIdTracker;
        this.f55093e = boundaryDelegate;
        this.f55094f = bVar;
        this.f55095g = aVar;
        this.f55096h = dataCaptureOrchestrator;
        this.f55097i = sessionSpanWriter;
        this.f55098j = sessionSpanAttrPopulator;
        this.f55099k = new Object();
        bi2.e eVar = (bi2.e) processStateService;
        this.f55101m = eVar.f22899g ? bi2.f.BACKGROUND : bi2.f.FOREGROUND;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        eVar.f22897e = this;
        try {
            c0.d.M2("start-first-session");
            b(this, n.INITIAL, null, new e(this, clock.now(), 0), null, false, null, 58);
            Unit unit = Unit.f80348a;
        } finally {
        }
    }

    public static void b(j jVar, n nVar, Function1 function1, Function0 function0, g gVar, boolean z13, String str, int i13) {
        tf2.d dVar;
        b bVar;
        b bVar2;
        if ((i13 & 2) != 0) {
            function1 = null;
        }
        if ((i13 & 4) != 0) {
            function0 = null;
        }
        Function0 function02 = gVar;
        if ((i13 & 8) != 0) {
            function02 = i.f55086j;
        }
        if ((i13 & 16) != 0) {
            z13 = false;
        }
        if ((i13 & 32) != 0) {
            str = null;
        }
        jVar.getClass();
        if (((Boolean) function02.invoke()).booleanValue()) {
            return;
        }
        synchronized (jVar.f55099k) {
            try {
                if (((Boolean) function02.invoke()).booleanValue()) {
                    return;
                }
                c0.d.M2("transition-state-start");
                zg2.a aVar = jVar.f55095g;
                if (aVar != null) {
                    ScheduledFuture scheduledFuture = aVar.f141961a.f141978d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    aVar.f141965e.set(true);
                }
                c0.d.M2("end-current-session");
                yh2.c cVar = jVar.f55100l;
                if (cVar != null) {
                    jVar.f55098j.a(nVar.lifeEventType(jVar.f55101m), str, cVar.f139058e);
                    Envelope envelope = function1 != null ? (Envelope) function1.invoke(cVar) : null;
                    if (envelope != null && (bVar2 = jVar.f55094f) != null) {
                        bVar2.k(envelope, nVar);
                    }
                }
                c0.d.N();
                c0.d.M2("prepare-new-session");
                jVar.f55093e.a(z13);
                c0.d.N();
                bi2.f endState = nVar.endState(jVar.f55101m);
                boolean z14 = endState == bi2.f.FOREGROUND;
                c0.d.M2("create-new-session");
                yh2.c cVar2 = function0 != null ? (yh2.c) function0.invoke() : null;
                jVar.f55100l = cVar2;
                ((ai2.c) jVar.f55092d).b(cVar2 != null ? cVar2.f139054a : null, z14);
                if (cVar2 != null) {
                    jVar.f55093e.b();
                    jVar.f55098j.b(cVar2);
                    c0.d.M2("initiate-periodic-caching");
                    if (nVar != n.CRASH) {
                        jVar.c();
                        zg2.a aVar2 = jVar.f55095g;
                        if (aVar2 != null) {
                            aVar2.b(cVar2, endState, new mm1.g(jVar, 7));
                        }
                    }
                    c0.d.N();
                }
                if (jVar.f55100l == null && nVar == n.ON_BACKGROUND && (bVar = jVar.f55094f) != null) {
                    eh2.a aVar3 = jVar.f55089a.f27769b;
                    aVar3.getClass();
                    bVar.q(aVar3.a(new LogPayload(q0.f80391a)));
                }
                c0.d.N();
                c0.d.M2("alter-session-state");
                jVar.f55101m = endState;
                int i14 = d.f55075a[endState.ordinal()];
                if (i14 == 1) {
                    dVar = tf2.d.FOREGROUND;
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = tf2.d.BACKGROUND;
                }
                jVar.f55096h.a(dVar);
                c0.d.N();
                c0.d.N();
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void a() {
        zg2.a aVar = this.f55095g;
        if (aVar != null) {
            aVar.f141965e.set(true);
        }
    }

    public final void c() {
        vf2.d dVar = new vf2.d(sh2.h.f112962k.f134855a, String.valueOf(TimeUnit.MILLISECONDS.toNanos(this.f55090b.now())));
        vf2.c cVar = this.f55097i;
        ((ei2.a) cVar).j(dVar);
        ((ei2.a) cVar).j(new vf2.d(sh2.h.f112961j.f134855a, "true"));
    }

    @Override // bi2.g
    public final void e(long j13, boolean z13) {
        b(this, n.ON_FOREGROUND, new f(this, j13, 2), new h(this, j13, z13), new g(this, 2), false, null, 48);
    }

    @Override // bi2.g
    public final void o(long j13) {
        b(this, n.ON_BACKGROUND, new f(this, j13, 1), new e(this, j13, 2), new g(this, 1), false, null, 48);
    }

    @Override // cg2.e
    public final void w(String crashId) {
        Intrinsics.checkNotNullParameter(crashId, "crashId");
        b(this, n.CRASH, new u(this, this.f55090b.now(), crashId, 5), null, null, false, crashId, 28);
    }
}
