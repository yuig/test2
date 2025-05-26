package di2;

import com.squareup.moshi.internal.Util$ParameterizedTypeImpl;
import io.embrace.android.embracesdk.internal.comms.api.ApiRequest;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.LogPayload;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import pg2.s;

/* loaded from: classes4.dex */
public final class p implements b {

    /* renamed from: a, reason: collision with root package name */
    public final ki2.a f55109a;

    /* renamed from: b, reason: collision with root package name */
    public final qg2.d f55110b;

    public p(ki2.a worker, qg2.d deliveryService) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(deliveryService, "deliveryService");
        this.f55109a = worker;
        this.f55110b = deliveryService;
    }

    @Override // di2.b
    public final void d(Envelope envelope) {
        Intrinsics.checkNotNullParameter(envelope, "envelope");
    }

    @Override // di2.b
    public final void f(Envelope envelope, boolean z13) {
        Intrinsics.checkNotNullParameter(envelope, "envelope");
        if (!z13) {
            this.f55109a.b(new qg2.f(4, this, envelope));
            return;
        }
        qg2.i iVar = (qg2.i) this.f55110b;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(envelope, "logEnvelope");
        pg2.n nVar = (pg2.n) iVar.f103869b;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(envelope, "logEnvelope");
        l0 l0Var = k0.f80436a;
        rl2.d clz = l0Var.b(Envelope.class);
        rl2.d another = l0Var.b(LogPayload.class);
        Intrinsics.checkNotNullParameter(clz, "clz");
        Intrinsics.checkNotNullParameter(another, "another");
        Util$ParameterizedTypeImpl Z = kg.a.Z(lb.l0.t0(clz), lb.l0.t0(another));
        Intrinsics.checkNotNullExpressionValue(Z, "newParameterizedType(clz.java, another.java)");
        pg2.b bVar = (pg2.b) nVar.f100136e.getValue();
        pg2.m mVar = pg2.m.f100131i;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(envelope, "envelope");
        Object obj = bVar.f100120d.get(s.LOGS);
        if (obj == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        ApiRequest a13 = bVar.a((String) obj);
        nVar.f100134c.a(new w.b(nVar, mVar, a13, new fn1.k(Z, nVar, envelope, 23), 15), a13);
    }

    @Override // di2.b
    public final void k(Envelope envelope, n transitionType) {
        Intrinsics.checkNotNullParameter(envelope, "envelope");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        ((qg2.i) this.f55110b).a(envelope, o.f55108a[transitionType.ordinal()] == 1 ? k.JVM_CRASH : k.NORMAL_END);
    }

    @Override // di2.b
    public final void m(Envelope envelope) {
        Intrinsics.checkNotNullParameter(envelope, "envelope");
        ((qg2.i) this.f55110b).a(envelope, k.PERIODIC_CACHE);
    }

    @Override // di2.b
    public final void q(Envelope envelope) {
        Intrinsics.checkNotNullParameter(envelope, "envelope");
    }

    @Override // cg2.e
    public final void w(String crashId) {
        Intrinsics.checkNotNullParameter(crashId, "crashId");
    }
}
