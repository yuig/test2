package ei2;

import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import io.embrace.android.embracesdk.internal.config.instrumented.OtelLimitsConfigExtKt;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xf2.c0;

/* loaded from: classes4.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    public final u f59041a;

    /* renamed from: b, reason: collision with root package name */
    public final h f59042b;

    /* renamed from: c, reason: collision with root package name */
    public final a f59043c;

    /* renamed from: d, reason: collision with root package name */
    public final OtelLimitsConfig f59044d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f59045e;

    public w(u spanRepository, h embraceSpanFactory, a currentSessionSpan) {
        OtelLimitsConfig limits = InstrumentedConfigImpl.INSTANCE.getOtelLimits();
        Intrinsics.checkNotNullParameter(spanRepository, "spanRepository");
        Intrinsics.checkNotNullParameter(embraceSpanFactory, "embraceSpanFactory");
        Intrinsics.checkNotNullParameter(currentSessionSpan, "currentSessionSpan");
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.f59041a = spanRepository;
        this.f59042b = embraceSpanFactory;
        this.f59043c = currentSessionSpan;
        this.f59044d = limits;
        this.f59045e = new AtomicBoolean(false);
    }

    @Override // nf2.j
    public final void a(long j13) {
        synchronized (this.f59045e) {
            this.f59043c.a(j13);
            this.f59045e.set(true);
            Unit unit = Unit.f80348a;
        }
    }

    @Override // ei2.v
    public final Object b(String name, oi2.a autoTerminationMode, oi2.b bVar, c0 type, boolean z13, boolean z14, Map attributes, List events, Function0 code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(code, "code");
        q c13 = c(type, autoTerminationMode, bVar, name, z13, z14);
        if (c13 != null) {
            try {
                if (((k) c13).r(null)) {
                    for (Map.Entry entry : attributes.entrySet()) {
                        ((k) c13).j((String) entry.getKey(), (String) entry.getValue());
                    }
                    Iterator it = events.iterator();
                    while (it.hasNext()) {
                        oi2.c cVar = (oi2.c) it.next();
                        k kVar = (k) c13;
                        kVar.k(cVar.f95342a, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(cVar.f95343b)), cVar.f95344c);
                    }
                }
            } catch (Throwable th3) {
                if (c13 != null) {
                    ((k) c13).s(ErrorCode.FAILURE, null);
                }
                throw th3;
            }
        }
        Object invoke = code.invoke();
        if (c13 != null) {
            ((k) c13).s(null, null);
        }
        return invoke;
    }

    @Override // ei2.v
    public final q c(c0 type, oi2.a autoTerminationMode, oi2.b bVar, String name, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(type, "type");
        if (i(name, z13, null, null) && this.f59043c.k(bVar, z13)) {
            return ((i) this.f59042b).a(type, autoTerminationMode, bVar, name, z13, z14);
        }
        return null;
    }

    @Override // ei2.v
    public final q d(e embraceSpanBuilder) {
        Intrinsics.checkNotNullParameter(embraceSpanBuilder, "embraceSpanBuilder");
        String str = embraceSpanBuilder.f58973d;
        boolean z13 = embraceSpanBuilder.f58970a;
        if (!i(str, z13, null, null)) {
            return null;
        }
        vi2.b bVar = embraceSpanBuilder.f58972c;
        if (bVar == null) {
            Intrinsics.r("parentContext");
            throw null;
        }
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (!this.f59043c.k((q) ((vi2.a) bVar).a(r.f59031a), z13)) {
            return null;
        }
        i iVar = (i) this.f59042b;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(embraceSpanBuilder, "embraceSpanBuilder");
        return new k(embraceSpanBuilder, iVar.f58991b, iVar.f58992c, iVar.f58993d);
    }

    @Override // nf2.j
    public final boolean e() {
        return this.f59045e.get();
    }

    @Override // ei2.v
    public final oi2.b f(String spanId) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        return this.f59041a.c(spanId);
    }

    @Override // ei2.v
    public final boolean g(String name, long j13, long j14, oi2.a autoTerminationMode, oi2.b bVar, c0 type, boolean z13, boolean z14, Map attributes, List events, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(events, "events");
        if (j13 <= j14 && i(name, z13, events, attributes) && this.f59043c.k(bVar, z13)) {
            k a13 = ((i) this.f59042b).a(type, autoTerminationMode, bVar, name, z13, z14);
            if (a13.r(Long.valueOf(j13))) {
                for (Map.Entry entry : attributes.entrySet()) {
                    a13.j((String) entry.getKey(), (String) entry.getValue());
                }
                Iterator it = events.iterator();
                while (it.hasNext()) {
                    oi2.c cVar = (oi2.c) it.next();
                    a13.k(cVar.f95342a, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(cVar.f95343b)), cVar.f95344c);
                }
                return a13.s(errorCode, Long.valueOf(j14));
            }
        }
        return false;
    }

    @Override // ei2.v
    public final q h(String str, oi2.a aVar, oi2.b bVar, Long l13, c0 c0Var, boolean z13, boolean z14) {
        return kg.p.b0(this, str, aVar, bVar, l13, c0Var, z13, z14);
    }

    public final boolean i(String str, boolean z13, List list, Map map) {
        OtelLimitsConfig otelLimitsConfig = this.f59044d;
        return OtelLimitsConfigExtKt.isNameValid(otelLimitsConfig, str, z13) && (list == null || list.size() <= otelLimitsConfig.getMaxCustomEventCount()) && (map == null || map.size() <= otelLimitsConfig.getMaxCustomAttributeCount());
    }
}
