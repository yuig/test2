package ei2;

import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kh2.r2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xf2.c0;
import xf2.q0;

/* loaded from: classes4.dex */
public final class a implements vf2.c, nf2.j {

    /* renamed from: a, reason: collision with root package name */
    public final zi2.b f58958a;

    /* renamed from: b, reason: collision with root package name */
    public final gi2.a f58959b;

    /* renamed from: c, reason: collision with root package name */
    public final u f58960c;

    /* renamed from: d, reason: collision with root package name */
    public final x f58961d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f58962e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f58963f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f58964g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f58965h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f58966i;

    public a(zi2.b openTelemetryClock, gi2.a telemetryService, u spanRepository, x spanSink, r2 embraceSpanFactorySupplier) {
        Intrinsics.checkNotNullParameter(openTelemetryClock, "openTelemetryClock");
        Intrinsics.checkNotNullParameter(telemetryService, "telemetryService");
        Intrinsics.checkNotNullParameter(spanRepository, "spanRepository");
        Intrinsics.checkNotNullParameter(spanSink, "spanSink");
        Intrinsics.checkNotNullParameter(embraceSpanFactorySupplier, "embraceSpanFactorySupplier");
        this.f58958a = openTelemetryClock;
        this.f58959b = telemetryService;
        this.f58960c = spanRepository;
        this.f58961d = spanSink;
        this.f58962e = embraceSpanFactorySupplier;
        this.f58963f = new AtomicInteger(0);
        this.f58964g = new AtomicInteger(0);
        this.f58965h = new AtomicBoolean(false);
        this.f58966i = new AtomicReference(null);
    }

    @Override // nf2.j
    public final void a(long j13) {
        if (this.f58965h.get()) {
            return;
        }
        synchronized (this.f58966i) {
            try {
                if (!this.f58965h.get()) {
                    this.f58966i.set(n(j13));
                    this.f58965h.set(this.f58966i.get() != null);
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean i(q0 schemaType, long j13) {
        Intrinsics.checkNotNullParameter(schemaType, "schemaType");
        q qVar = (q) this.f58966i.get();
        if (qVar == null) {
            return false;
        }
        String str = schemaType.f134890b;
        Intrinsics.checkNotNullParameter(str, "<this>");
        String name = "emb-" + str;
        Long valueOf = Long.valueOf(j13);
        LinkedHashMap j14 = z0.j(schemaType.a(), schemaType.f134891c);
        c0 c0Var = schemaType.f134889a;
        Map k13 = z0.k(j14, new Pair(c0Var.f134851a.f134855a, c0Var.f134852b));
        k kVar = (k) qVar;
        Intrinsics.checkNotNullParameter(name, "name");
        return kVar.m(kVar.f59009k, kVar.f59013o, kVar.f59003e.getMaxTotalEventCount(), new j(name, valueOf, kVar, k13, 1));
    }

    public final void j(vf2.d attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        q qVar = (q) this.f58966i.get();
        if (qVar == null) {
            return;
        }
        k kVar = (k) qVar;
        String key = attribute.f125780a;
        Intrinsics.checkNotNullParameter(key, "key");
        String value = attribute.f125781b;
        Intrinsics.checkNotNullParameter(value, "value");
        kVar.f59011m.put(key, value);
        kVar.f59001c.d();
    }

    public final boolean k(oi2.b bVar, boolean z13) {
        q qVar = (q) this.f58966i.get();
        if (qVar == null || !((k) qVar).b() || (bVar != null && ((k) bVar).l() == null)) {
            return false;
        }
        if (z13) {
            AtomicInteger atomicInteger = this.f58964g;
            if (atomicInteger.get() < 5000) {
                synchronized (atomicInteger) {
                    r1 = atomicInteger.getAndIncrement() < 5000;
                }
            }
        } else {
            AtomicInteger atomicInteger2 = this.f58963f;
            if (atomicInteger2.get() < 500) {
                synchronized (atomicInteger2) {
                    r1 = atomicInteger2.getAndIncrement() < 500;
                }
            }
        }
        return r1;
    }

    public final List l(boolean z13, xf2.a aVar) {
        List list;
        synchronized (this.f58966i) {
            try {
                q qVar = (q) this.f58966i.get();
                if (qVar != null) {
                    k kVar = (k) qVar;
                    if (kVar.b()) {
                        for (Map.Entry entry : this.f58959b.a().entrySet()) {
                            kVar.j((String) entry.getKey(), (String) entry.getValue());
                        }
                        if (aVar == null) {
                            ((k) qVar).s(null, null);
                            u uVar = this.f58960c;
                            synchronized (uVar.f59039c) {
                                uVar.f59038b.clear();
                                Unit unit = Unit.f80348a;
                            }
                            this.f58966i.set(z13 ? n(TimeUnit.NANOSECONDS.toMillis(this.f58958a.now())) : null);
                        } else {
                            long millis = TimeUnit.NANOSECONDS.toMillis(this.f58958a.now());
                            this.f58960c.a(millis);
                            ri2.e key = aVar.f134848b.f134856b;
                            String value = aVar.f134847a;
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(value, "value");
                            String key2 = key.f108404b;
                            Intrinsics.checkNotNullExpressionValue(key2, "key.key");
                            Intrinsics.checkNotNullParameter(key2, "key");
                            Intrinsics.checkNotNullParameter(value, "value");
                            kVar.f59011m.put(key2, value);
                            kVar.f59001c.d();
                            kVar.s(ErrorCode.FAILURE, Long.valueOf(millis));
                        }
                        list = this.f58961d.a();
                    }
                }
                list = kotlin.collections.q0.f80391a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return list;
    }

    public final void m(xf2.w fixedAttribute) {
        Intrinsics.checkNotNullParameter(fixedAttribute, "type");
        q qVar = (q) this.f58966i.get();
        if (qVar == null) {
            return;
        }
        k kVar = (k) qVar;
        Intrinsics.checkNotNullParameter(fixedAttribute, "type");
        synchronized (kVar.f59013o) {
            Iterator it = kVar.f59009k.iterator();
            while (it.hasNext()) {
                oi2.c event = (oi2.c) it.next();
                Intrinsics.checkNotNullExpressionValue(event, "event");
                Set set = d.f58969a;
                Intrinsics.checkNotNullParameter(event, "<this>");
                Intrinsics.checkNotNullParameter(fixedAttribute, "fixedAttribute");
                if (Intrinsics.d(fixedAttribute.f134852b, event.f95344c.get(fixedAttribute.f134851a.f134855a))) {
                    kVar.f59009k.remove(event);
                    kVar.f59013o.decrementAndGet();
                    kVar.f59001c.d();
                    return;
                }
            }
            Unit unit = Unit.f80348a;
        }
    }

    public final k n(long j13) {
        this.f58963f.set(0);
        this.f58964g.set(0);
        k a13 = ((i) ((h) this.f58962e.invoke())).a(xf2.y.f134904d, oi2.a.NONE, null, "session", true, false);
        a13.r(Long.valueOf(j13));
        ri2.e key = tj2.f.f117934a;
        Intrinsics.checkNotNullExpressionValue(key, "SESSION_ID");
        String value = kh2.d.x();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        String key2 = key.f108404b;
        Intrinsics.checkNotNullExpressionValue(key2, "key.key");
        Intrinsics.checkNotNullParameter(key2, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        a13.f59011m.put(key2, value);
        a13.f59001c.d();
        return a13;
    }
}
