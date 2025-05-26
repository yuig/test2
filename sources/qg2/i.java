package qg2;

import io.embrace.android.embracesdk.internal.comms.api.ApiRequest;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.Span;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kh2.n3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pg2.n;
import sw0.u;
import xk2.q;
import xk2.s;

/* loaded from: classes4.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    public final c f103868a;

    /* renamed from: b, reason: collision with root package name */
    public final pg2.j f103869b;

    /* renamed from: c, reason: collision with root package name */
    public final xh2.d f103870c;

    public i(c cacheManager, pg2.j apiService, xh2.d serializer) {
        Intrinsics.checkNotNullParameter(cacheManager, "cacheManager");
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f103868a = cacheManager;
        this.f103869b = apiService;
        this.f103870c = serializer;
    }

    public final void a(Envelope envelope, di2.k snapshotType) {
        ha2.i iVar;
        Long l13;
        Intrinsics.checkNotNullParameter(envelope, "envelope");
        Intrinsics.checkNotNullParameter(snapshotType, "snapshotType");
        c cVar = this.f103868a;
        g gVar = (g) cVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(envelope, "envelope");
        Intrinsics.checkNotNullParameter(snapshotType, "snapshotType");
        LinkedHashMap linkedHashMap = gVar.f103864c;
        if (linkedHashMap.size() >= 64) {
            List y03 = CollectionsKt.y0(CollectionsKt.x0(linkedHashMap.values(), new u(18)), linkedHashMap.size() - 63);
            if (!y03.isEmpty()) {
                Iterator it = y03.iterator();
                while (it.hasNext()) {
                    gVar.a(((b) it.next()).f103853a);
                }
            }
        }
        Span A = n3.A(envelope);
        String z13 = n3.z(envelope);
        if (z13 != null && A != null && (l13 = A.f73244e) != null) {
            long millis = TimeUnit.NANOSECONDS.toMillis(l13.longValue());
            boolean z14 = snapshotType == di2.k.JVM_CRASH;
            boolean z15 = snapshotType == di2.k.PERIODIC_CACHE;
            ha2.i iVar2 = new ha2.i(25, gVar, envelope);
            if (z14) {
                gVar.d(z13, millis, iVar2);
            } else {
                gVar.f103863b.a(new y9.b(gVar, z13, millis, iVar2), z15 ? ki2.f.LOW : ki2.f.CRITICAL);
            }
        }
        if (snapshotType == di2.k.PERIODIC_CACHE) {
            return;
        }
        try {
            q qVar = s.f135225b;
            String sessionId = n3.z(envelope);
            if (sessionId == null) {
                return;
            }
            g gVar2 = (g) cVar;
            gVar2.getClass();
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            b bVar = (b) gVar2.f103864c.get(sessionId);
            if (bVar != null) {
                String name = bVar.f103855c;
                Intrinsics.checkNotNullParameter(name, "name");
                e eVar = (e) gVar2.f103862a;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                iVar = new ha2.i(24, eVar, name);
            } else {
                iVar = null;
            }
            if (iVar == null) {
                iVar = new ha2.i(27, this, envelope);
            }
            ha2.i action = iVar;
            pg2.j jVar = this.f103869b;
            h onFinish = new h(this, sessionId, 1);
            n nVar = (n) jVar;
            nVar.getClass();
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(onFinish, "onFinish");
            pg2.b bVar2 = (pg2.b) nVar.f100136e.getValue();
            bVar2.getClass();
            Object obj = bVar2.f100120d.get(pg2.s.SESSIONS);
            if (obj == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            ApiRequest a13 = bVar2.a((String) obj);
            Future a14 = nVar.f100134c.a(new w.b(nVar, onFinish, a13, action, 15), a13);
            if (snapshotType == di2.k.JVM_CRASH && a14 != null) {
                a14.get(1L, TimeUnit.SECONDS);
            }
            Unit unit = Unit.f80348a;
        } catch (Throwable th3) {
            q qVar2 = s.f135225b;
            ue.c.m(th3);
        }
    }
}
