package ei2;

import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import io.embrace.android.embracesdk.internal.config.instrumented.OtelLimitsConfigExtKt;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig;
import io.embrace.android.embracesdk.internal.payload.Attribute;
import io.embrace.android.embracesdk.internal.payload.Span;
import io.embrace.android.embracesdk.spans.ErrorCode;
import io.opentelemetry.api.trace.StatusCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import xf2.e0;
import xf2.f0;
import xf2.h0;
import xf2.i0;
import xf2.j0;

/* loaded from: classes4.dex */
public final class k implements q {

    /* renamed from: a, reason: collision with root package name */
    public final e f58999a;

    /* renamed from: b, reason: collision with root package name */
    public final zi2.b f59000b;

    /* renamed from: c, reason: collision with root package name */
    public final u f59001c;

    /* renamed from: d, reason: collision with root package name */
    public final tg2.p f59002d;

    /* renamed from: e, reason: collision with root package name */
    public final OtelLimitsConfig f59003e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f59004f;

    /* renamed from: g, reason: collision with root package name */
    public Long f59005g;

    /* renamed from: h, reason: collision with root package name */
    public Long f59006h;

    /* renamed from: i, reason: collision with root package name */
    public th2.m f59007i;

    /* renamed from: j, reason: collision with root package name */
    public String f59008j;

    /* renamed from: k, reason: collision with root package name */
    public final ConcurrentLinkedQueue f59009k;

    /* renamed from: l, reason: collision with root package name */
    public final ConcurrentLinkedQueue f59010l;

    /* renamed from: m, reason: collision with root package name */
    public final ConcurrentHashMap f59011m;

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f59012n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicInteger f59013o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicInteger f59014p;

    /* renamed from: q, reason: collision with root package name */
    public final q f59015q;

    /* renamed from: r, reason: collision with root package name */
    public final oi2.a f59016r;

    public k(e spanBuilder, zi2.b openTelemetryClock, u spanRepository, tg2.p pVar) {
        OtelLimitsConfig limits = InstrumentedConfigImpl.INSTANCE.getOtelLimits();
        Intrinsics.checkNotNullParameter(spanBuilder, "spanBuilder");
        Intrinsics.checkNotNullParameter(openTelemetryClock, "openTelemetryClock");
        Intrinsics.checkNotNullParameter(spanRepository, "spanRepository");
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.f58999a = spanBuilder;
        this.f59000b = openTelemetryClock;
        this.f59001c = spanRepository;
        this.f59002d = pVar;
        this.f59003e = limits;
        this.f59004f = new AtomicReference(null);
        this.f59007i = th2.m.UNSET;
        this.f59009k = new ConcurrentLinkedQueue();
        this.f59010l = new ConcurrentLinkedQueue();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList<j0> arrayList = spanBuilder.f58976g;
        int a13 = y0.a(g0.q(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13 < 16 ? 16 : a13);
        for (j0 j0Var : arrayList) {
            linkedHashMap.put(j0Var.getKey().f134856b.f108404b, j0Var.getValue());
        }
        concurrentHashMap.putAll(linkedHashMap);
        this.f59011m = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        concurrentHashMap2.putAll(this.f58999a.f58977h);
        this.f59012n = concurrentHashMap2;
        this.f59013o = new AtomicInteger(0);
        this.f59014p = new AtomicInteger(0);
        vi2.b bVar = this.f58999a.f58972c;
        if (bVar == null) {
            Intrinsics.r("parentContext");
            throw null;
        }
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        this.f59015q = (q) ((vi2.a) bVar).a(r.f59031a);
        this.f59016r = this.f58999a.f58971b;
    }

    @Override // vi2.f
    public final vi2.a a(vi2.b context) {
        Intrinsics.checkNotNullParameter(context, "context");
        vi2.a b13 = ((vi2.a) context).b(r.f59031a, this);
        Intrinsics.checkNotNullExpressionValue(b13, "context.with(embraceSpanContextKey, this)");
        return b13;
    }

    public final boolean b() {
        ui2.j jVar = (ui2.j) this.f59004f.get();
        return jVar != null && jVar.b();
    }

    public final boolean j(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f59012n.size() >= this.f59003e.getMaxCustomAttributeCount() || !OtelLimitsConfigExtKt.isAttributeValid(this.f59003e, key, value, this.f58999a.f58970a)) {
            return false;
        }
        synchronized (this.f59012n) {
            if (this.f59012n.size() >= this.f59003e.getMaxCustomAttributeCount() || !b()) {
                Unit unit = Unit.f80348a;
                return false;
            }
            this.f59012n.put(key, value);
            this.f59001c.d();
            return true;
        }
    }

    public final boolean k(String name, Long l13, Map map) {
        Intrinsics.checkNotNullParameter(name, "name");
        return m(this.f59010l, this.f59014p, this.f59003e.getMaxCustomEventCount(), new j(name, l13, this, map, 0));
    }

    public final String l() {
        ui2.j jVar = (ui2.j) this.f59004f.get();
        ui2.l h10 = jVar != null ? jVar.h() : null;
        if (h10 != null) {
            return ((ri2.b) h10).f108394b;
        }
        return null;
    }

    public final boolean m(ConcurrentLinkedQueue concurrentLinkedQueue, AtomicInteger atomicInteger, int i13, j jVar) {
        oi2.c cVar;
        if (atomicInteger.get() >= i13) {
            return false;
        }
        synchronized (atomicInteger) {
            if (atomicInteger.get() >= i13 || !b() || (cVar = (oi2.c) jVar.invoke()) == null) {
                Unit unit = Unit.f80348a;
                return false;
            }
            concurrentLinkedQueue.add(cVar);
            atomicInteger.incrementAndGet();
            this.f59001c.d();
            return true;
        }
    }

    public final LinkedHashMap n(Map map) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap(y0.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            tg2.p pVar = this.f59002d;
            if (pVar != null) {
                if (((tg2.q) pVar).a((String) entry.getKey())) {
                    str = "<redacted>";
                    linkedHashMap.put(key, str);
                }
            }
            str = (String) entry.getValue();
            linkedHashMap.put(key, str);
        }
        return linkedHashMap;
    }

    public final void p(StatusCode statusCode, String description) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(description, "description");
        ui2.j jVar = (ui2.j) this.f59004f.get();
        if (jVar != null) {
            synchronized (this.f59004f) {
                this.f59007i = d.e(statusCode);
                jVar.i(statusCode, description);
                this.f59001c.d();
                Unit unit = Unit.f80348a;
            }
        }
    }

    public final Span q() {
        String str;
        String str2;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f59010l;
        ArrayList arrayList = new ArrayList(g0.q(concurrentLinkedQueue, 10));
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            oi2.c it2 = (oi2.c) it.next();
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            arrayList.add(oi2.c.a(it2, n(it2.f95344c)));
        }
        if (l() == null || this.f59005g == null) {
            return null;
        }
        ui2.j jVar = (ui2.j) this.f59004f.get();
        ui2.l h10 = jVar != null ? jVar.h() : null;
        String str3 = h10 != null ? ((ri2.b) h10).f108393a : null;
        String l13 = l();
        q qVar = this.f59015q;
        if (qVar == null || (str = ((k) qVar).l()) == null) {
            str = "0000000000000000";
        }
        String str4 = str;
        synchronized (this.f59004f) {
            String str5 = this.f59008j;
            if (str5 == null) {
                str5 = this.f58999a.f58973d;
            }
            str2 = str5;
        }
        Long l14 = this.f59005g;
        Long valueOf = l14 != null ? Long.valueOf(TimeUnit.MILLISECONDS.toNanos(l14.longValue())) : null;
        Long l15 = this.f59006h;
        Long valueOf2 = l15 != null ? Long.valueOf(TimeUnit.MILLISECONDS.toNanos(l15.longValue())) : null;
        th2.m mVar = this.f59007i;
        ConcurrentLinkedQueue concurrentLinkedQueue2 = this.f59009k;
        ArrayList arrayList2 = new ArrayList(g0.q(concurrentLinkedQueue2, 10));
        Iterator it3 = concurrentLinkedQueue2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(kotlin.jvm.internal.r.u0((oi2.c) it3.next()));
        }
        ArrayList arrayList3 = new ArrayList(g0.q(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList3.add(kotlin.jvm.internal.r.u0((oi2.c) it4.next()));
        }
        ArrayList l03 = CollectionsKt.l0(arrayList3, arrayList2);
        ConcurrentHashMap concurrentHashMap = this.f59011m;
        ArrayList arrayList4 = new ArrayList(concurrentHashMap.size());
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            arrayList4.add(new Attribute((String) entry.getKey(), (String) entry.getValue()));
        }
        return new Span(str3, l13, str4, str2, valueOf, valueOf2, mVar, l03, CollectionsKt.l0(kotlin.jvm.internal.r.v0(n(this.f59012n)), arrayList4));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(java.lang.Long r10) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r9.f59004f
            java.lang.Object r0 = r0.get()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 == 0) goto L10
            return r1
        L10:
            if (r10 == 0) goto L1f
            long r3 = r10.longValue()
            long r3 = kh2.w.q0(r3)
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            goto L23
        L1f:
            ei2.e r10 = r9.f58999a
            java.lang.Long r10 = r10.f58974e
        L23:
            if (r10 == 0) goto L38
            long r3 = r10.longValue()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L30
            goto L31
        L30:
            r10 = 0
        L31:
            if (r10 == 0) goto L38
            long r3 = r10.longValue()
            goto L44
        L38:
            zi2.b r10 = r9.f59000b
            long r3 = r10.now()
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r3 = r10.toMillis(r3)
        L44:
            java.util.concurrent.atomic.AtomicReference r10 = r9.f59004f
            monitor-enter(r10)
            ei2.e r0 = r9.f58999a     // Catch: java.lang.Throwable -> L9c
            r0.getClass()     // Catch: java.lang.Throwable -> L9c
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L9c
            ui2.k r0 = r0.f58975f     // Catch: java.lang.Throwable -> L9c
            r0.d(r3, r5)     // Catch: java.lang.Throwable -> L9c
            ui2.j r0 = r0.a()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r5 = "sdkSpanBuilder.startSpan()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)     // Catch: java.lang.Throwable -> L9c
            boolean r5 = r0.b()     // Catch: java.lang.Throwable -> L9c
            if (r5 == 0) goto Lad
            java.util.concurrent.atomic.AtomicReference r1 = r9.f59004f     // Catch: java.lang.Throwable -> L9c
            r1.set(r0)     // Catch: java.lang.Throwable -> L9c
            ei2.u r1 = r9.f59001c     // Catch: java.lang.Throwable -> L9c
            r1.getClass()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r5 = "embraceSpan"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r5)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r5 = r9.l()     // Catch: java.lang.Throwable -> L9c
            if (r5 != 0) goto L78
            goto L94
        L78:
            java.util.concurrent.ConcurrentHashMap r6 = r1.f59037a     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L9c
            if (r6 != 0) goto L94
            java.util.concurrent.ConcurrentHashMap r6 = r1.f59038b     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L9c
            if (r6 != 0) goto L94
            java.util.concurrent.ConcurrentHashMap r6 = r1.f59039c     // Catch: java.lang.Throwable -> L9c
            jg2.h r7 = new jg2.h     // Catch: java.lang.Throwable -> L9c
            r8 = 26
            r7.<init>(r1, r5, r9, r8)     // Catch: java.lang.Throwable -> L9c
            kg.n.g(r6, r5, r7)     // Catch: java.lang.Throwable -> L9c
        L94:
            java.lang.String r1 = r9.f59008j     // Catch: java.lang.Throwable -> L9c
            if (r1 == 0) goto L9e
            r0.d(r1)     // Catch: java.lang.Throwable -> L9c
            goto L9e
        L9c:
            r0 = move-exception
            goto Laf
        L9e:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L9c
            r9.f59005g = r0     // Catch: java.lang.Throwable -> L9c
            ei2.u r0 = r9.f59001c     // Catch: java.lang.Throwable -> L9c
            r0.d()     // Catch: java.lang.Throwable -> L9c
            kotlin.Unit r0 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r10)
            return r2
        Lad:
            monitor-exit(r10)
            return r1
        Laf:
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ei2.k.r(java.lang.Long):boolean");
    }

    public final boolean s(ErrorCode errorCode, Long l13) {
        qi2.a aVar;
        boolean z13 = false;
        if (!b()) {
            return false;
        }
        long q03 = l13 != null ? kh2.w.q0(l13.longValue()) : TimeUnit.NANOSECONDS.toMillis(this.f59000b.now());
        synchronized (this.f59004f) {
            try {
                if (!b()) {
                    return false;
                }
                ui2.j jVar = (ui2.j) this.f59004f.get();
                if (jVar != null) {
                    for (Map.Entry entry : this.f59011m.entrySet()) {
                        jVar.f((String) entry.getKey(), (String) entry.getValue());
                    }
                    for (Map.Entry entry2 : n(this.f59012n).entrySet()) {
                        jVar.f((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    ConcurrentLinkedQueue concurrentLinkedQueue = this.f59010l;
                    ArrayList arrayList = new ArrayList(g0.q(concurrentLinkedQueue, 10));
                    Iterator it = concurrentLinkedQueue.iterator();
                    while (it.hasNext()) {
                        oi2.c it2 = (oi2.c) it.next();
                        Intrinsics.checkNotNullExpressionValue(it2, "it");
                        arrayList.add(oi2.c.a(it2, n(it2.f95344c)));
                    }
                    for (oi2.c cVar : CollectionsKt.l0(arrayList, this.f59009k)) {
                        if (true ^ cVar.f95344c.isEmpty()) {
                            qi2.b bVar = new qi2.b();
                            Intrinsics.checkNotNullExpressionValue(bVar, "builder()");
                            d.b(bVar, cVar.f95344c, this.f58999a.f58970a);
                            aVar = bVar.a();
                        } else {
                            aVar = qi2.a.f104005d;
                        }
                        jVar.e(cVar.f95342a, aVar, cVar.f95343b, TimeUnit.NANOSECONDS);
                    }
                    if (errorCode != null) {
                        p(StatusCode.ERROR, "");
                        i0 fixedAttribute = e0.f134858c;
                        fixedAttribute.getClass();
                        Intrinsics.checkNotNullParameter(errorCode, "<this>");
                        int i13 = h0.f134863a[errorCode.ordinal()];
                        if (i13 != 1) {
                            if (i13 == 2) {
                                fixedAttribute = xf2.g0.f134862c;
                            } else {
                                if (i13 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fixedAttribute = f0.f134860c;
                            }
                        }
                        Intrinsics.checkNotNullParameter(jVar, "<this>");
                        Intrinsics.checkNotNullParameter(fixedAttribute, "fixedAttribute");
                        c0.d.F2(jVar, fixedAttribute.f134865a, fixedAttribute.f134866b);
                    } else if (this.f59007i == th2.m.ERROR) {
                        e0 fixedAttribute2 = e0.f134858c;
                        Intrinsics.checkNotNullParameter(jVar, "<this>");
                        Intrinsics.checkNotNullParameter(fixedAttribute2, "fixedAttribute");
                        c0.d.F2(jVar, fixedAttribute2.f134865a, fixedAttribute2.f134866b);
                    }
                    jVar.g(q03, TimeUnit.MILLISECONDS);
                    z13 = !b();
                    if (z13) {
                        String spanId = l();
                        if (spanId != null) {
                            u uVar = this.f59001c;
                            uVar.getClass();
                            Intrinsics.checkNotNullParameter(spanId, "spanId");
                            kg.n.g(uVar.f59039c, spanId, new t(uVar, spanId, 1));
                        }
                        this.f59006h = Long.valueOf(q03);
                        this.f59001c.d();
                    }
                    Unit unit = Unit.f80348a;
                }
                return z13;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
