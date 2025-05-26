package zg2;

import ai2.b;
import bi2.f;
import c0.d;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import j1.v0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kl2.l;
import kotlin.jvm.internal.Intrinsics;
import mm1.g;
import yh2.c;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final zh2.a f141961a;

    /* renamed from: b, reason: collision with root package name */
    public final og2.a f141962b;

    /* renamed from: c, reason: collision with root package name */
    public final b f141963c;

    /* renamed from: d, reason: collision with root package name */
    public final di2.b f141964d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f141965e;

    public a(zh2.a periodicSessionCacher, og2.a clock, b sessionIdTracker, di2.b payloadStore) {
        Intrinsics.checkNotNullParameter(periodicSessionCacher, "periodicSessionCacher");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(sessionIdTracker, "sessionIdTracker");
        Intrinsics.checkNotNullParameter(payloadStore, "payloadStore");
        this.f141961a = periodicSessionCacher;
        this.f141962b = clock;
        this.f141963c = sessionIdTracker;
        this.f141964d = payloadStore;
        this.f141965e = new AtomicBoolean(true);
    }

    public static final Envelope a(a aVar, c cVar, f fVar, l lVar) {
        Envelope envelope;
        aVar.getClass();
        try {
            d.M2("on-session-cache");
            Envelope envelope2 = null;
            if (Intrinsics.d(cVar.f139054a, ((ai2.c) aVar.f141963c).a()) && (envelope = (Envelope) lVar.invoke(fVar, Long.valueOf(aVar.f141962b.now()), cVar)) != null) {
                aVar.f141964d.m(envelope);
                envelope2 = envelope;
            }
            return envelope2;
        } finally {
        }
    }

    public final void b(c initial, f state, g supplier) {
        Intrinsics.checkNotNullParameter(initial, "initial");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(supplier, "supplier");
        v0 provider = new v0(state, this, initial, supplier, 21);
        zh2.a aVar = this.f141961a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        aVar.f141978d = aVar.f141975a.f79804a.scheduleWithFixedDelay(new qg2.f(3, provider, aVar), 0L, aVar.f141977c, TimeUnit.MILLISECONDS);
    }
}
