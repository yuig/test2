package fj2;

import aj2.f;
import aj2.h;
import aj2.i;
import bj2.j;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import kv0.p;
import ti2.e;

/* loaded from: classes4.dex */
public final class d implements e, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f62264h = Logger.getLogger(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final List f62265a;

    /* renamed from: b, reason: collision with root package name */
    public final List f62266b;

    /* renamed from: c, reason: collision with root package name */
    public final List f62267c;

    /* renamed from: d, reason: collision with root package name */
    public final kj2.a f62268d;

    /* renamed from: e, reason: collision with root package name */
    public final jf2.c f62269e;

    /* renamed from: f, reason: collision with root package name */
    public final h f62270f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f62271g = new AtomicBoolean(false);

    public d(ArrayList arrayList, IdentityHashMap identityHashMap, ArrayList arrayList2, mj2.a aVar, ij2.b bVar, i iVar) {
        f.f15443a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.f62265a = arrayList;
        List list = (List) identityHashMap.entrySet().stream().map(new bg.c(arrayList, 3)).collect(Collectors.toList());
        this.f62266b = list;
        this.f62267c = arrayList2;
        kj2.a aVar2 = new kj2.a(nanos, bVar, aVar);
        this.f62268d = aVar2;
        jf2.c cVar = new jf2.c(new bg.c(this, 4));
        this.f62269e = cVar;
        this.f62270f = iVar;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            jj2.a aVar3 = (jj2.a) it.next();
            new ArrayList(arrayList2).add(new p(cVar, aVar2, aVar3));
            aVar3.getClass();
            throw null;
        }
    }

    @Override // ti2.e
    public final ti2.d a() {
        return this.f62266b.isEmpty() ? ti2.b.f117761a.a() : new j(this.f62269e, "noop");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().b(TimeUnit.SECONDS);
    }

    public final zi2.c shutdown() {
        if (!this.f62271g.compareAndSet(false, true)) {
            f62264h.info("Multiple close calls");
            return zi2.c.f142036e;
        }
        List list = this.f62266b;
        if (list.isEmpty()) {
            return zi2.c.f142036e;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return zi2.c.c(arrayList);
        }
        ((jj2.a) it.next()).getClass();
        throw null;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SdkMeterProvider{clock=");
        kj2.a aVar = this.f62268d;
        sb3.append(aVar.f79856a);
        sb3.append(", resource=");
        sb3.append(aVar.f79857b);
        sb3.append(", metricReaders=");
        sb3.append(this.f62266b.stream().map(new ek0.b(9)).collect(Collectors.toList()));
        sb3.append(", metricProducers=");
        sb3.append(this.f62267c);
        sb3.append(", views=");
        return a.c.j(sb3, this.f62265a, "}");
    }
}
