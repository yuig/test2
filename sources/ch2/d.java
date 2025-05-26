package ch2;

import ah2.j;
import dh2.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import qg2.k;
import t3.t0;

/* loaded from: classes4.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final e f27744a;

    /* renamed from: b, reason: collision with root package name */
    public final j f27745b;

    /* renamed from: c, reason: collision with root package name */
    public final ki2.a f27746c;

    /* renamed from: d, reason: collision with root package name */
    public final ki2.a f27747d;

    /* renamed from: e, reason: collision with root package name */
    public final og2.a f27748e;

    /* renamed from: f, reason: collision with root package name */
    public final lh2.b f27749f;

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f27750g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f27751h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f27752i;

    /* renamed from: j, reason: collision with root package name */
    public final Set f27753j;

    /* renamed from: k, reason: collision with root package name */
    public final ConcurrentHashMap f27754k;

    public d(e storageService, j executionService, ki2.a schedulingWorker, ki2.a deliveryWorker, og2.a clock, lh2.b logger) {
        Intrinsics.checkNotNullParameter(storageService, "storageService");
        Intrinsics.checkNotNullParameter(executionService, "executionService");
        Intrinsics.checkNotNullParameter(schedulingWorker, "schedulingWorker");
        Intrinsics.checkNotNullParameter(deliveryWorker, "deliveryWorker");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f27744a = storageService;
        this.f27745b = executionService;
        this.f27746c = schedulingWorker;
        this.f27747d = deliveryWorker;
        this.f27748e = clock;
        this.f27749f = logger;
        this.f27750g = new ConcurrentHashMap();
        this.f27751h = new AtomicBoolean(true);
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(ConcurrentHashMap())");
        this.f27752i = newSetFromMap;
        Set newSetFromMap2 = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap2, "newSetFromMap(ConcurrentHashMap())");
        this.f27753j = newSetFromMap2;
        this.f27754k = new ConcurrentHashMap();
    }

    public final yg2.d a(Set set) {
        List F0 = CollectionsKt.F0((CopyOnWriteArraySet) this.f27744a.f55027b.f55025e.getValue());
        t0 t0Var = yg2.c.f139030b;
        List x03 = CollectionsKt.x0(F0, t0Var);
        ArrayList arrayList = new ArrayList();
        for (Object obj : x03) {
            yg2.d dVar = (yg2.d) obj;
            if (c(dVar) && !set.contains(dVar)) {
                arrayList.add(obj);
            }
        }
        return (yg2.d) CollectionsKt.firstOrNull(CollectionsKt.x0(arrayList, t0Var));
    }

    public final void b() {
        ConcurrentHashMap concurrentHashMap = this.f27754k;
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((c) ((Map.Entry) it.next()).getValue()).f27743b));
        }
        Long l13 = (Long) CollectionsKt.g0(arrayList);
        if (l13 != null) {
            long longValue = l13.longValue();
            og2.a aVar = this.f27748e;
            if (longValue <= aVar.now()) {
                e();
            } else if (longValue != Long.MAX_VALUE) {
                this.f27746c.a(new b(this, 1), longValue - aVar.now(), TimeUnit.MILLISECONDS);
            }
        }
    }

    public final boolean c(yg2.d dVar) {
        if (this.f27752i.contains(dVar) || this.f27753j.contains(dVar)) {
            return false;
        }
        Long l13 = (Long) this.f27750g.get(dVar.f139034d.getEndpoint());
        og2.a aVar = this.f27748e;
        if (l13 != null && l13.longValue() > aVar.now()) {
            return false;
        }
        c cVar = (c) this.f27754k.get(dVar);
        return cVar == null || aVar.now() >= cVar.f27743b;
    }

    @Override // bg2.b
    public final void d(k status) {
        Intrinsics.checkNotNullParameter(status, "status");
        boolean isReachable = status.isReachable();
        AtomicBoolean atomicBoolean = this.f27751h;
        if (isReachable != atomicBoolean.get()) {
            atomicBoolean.set(isReachable);
            if (isReachable) {
                e();
            }
        }
    }

    public final void e() {
        this.f27746c.b(new b(this, 0));
    }
}
