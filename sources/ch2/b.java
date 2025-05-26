package ch2;

import a.g0;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.s0;
import lh2.e;
import lh2.g;
import xk2.q;
import xk2.s;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f27741b;

    public /* synthetic */ b(d dVar, int i13) {
        this.f27740a = i13;
        this.f27741b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yg2.d a13;
        Object m13;
        int i13 = this.f27740a;
        d dVar = this.f27741b;
        switch (i13) {
            case 0:
                lh2.b bVar = dVar.f27749f;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                for (a13 = dVar.a(s0.f80394a); a13 != null; a13 = dVar.a(linkedHashSet)) {
                    AtomicBoolean atomicBoolean = dVar.f27751h;
                    if (!atomicBoolean.get()) {
                        return;
                    }
                    try {
                        q qVar = s.f135225b;
                        if (dVar.c(a13) && atomicBoolean.get()) {
                            pg2.s endpoint = a13.f139034d.getEndpoint();
                            ConcurrentHashMap concurrentHashMap = dVar.f27750g;
                            Long l13 = (Long) concurrentHashMap.get(endpoint);
                            if (l13 != null && l13.longValue() <= dVar.f27748e.now()) {
                                concurrentHashMap.remove(endpoint);
                            }
                            dVar.f27752i.add(a13);
                            dVar.f27747d.c(new g0(23, dVar, a13));
                        }
                        m13 = Unit.f80348a;
                    } catch (Throwable th3) {
                        q qVar2 = s.f135225b;
                        m13 = ue.c.m(th3);
                    }
                    Throwable a14 = s.a(m13);
                    if (a14 != null) {
                        linkedHashSet.add(a13);
                        String str = a13.f139037g;
                        ((e) bVar).b(g.DELIVERY_SCHEDULING_FAIL, new IllegalStateException("Failed to queue payload with file name " + str, a14));
                    }
                }
                return;
            default:
                dVar.e();
                return;
        }
    }
}
