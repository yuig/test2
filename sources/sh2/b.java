package sh2;

import ei2.q;
import io.embrace.android.embracesdk.internal.config.instrumented.OtelLimitsConfigExtKt;
import io.opentelemetry.api.trace.StatusCode;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements ui2.j {

    /* renamed from: a, reason: collision with root package name */
    public final q f112939a;

    public b(q embraceSpan, zi2.b clock) {
        Intrinsics.checkNotNullParameter(embraceSpan, "embraceSpan");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f112939a = embraceSpan;
    }

    @Override // ui2.j
    public final boolean b() {
        return ((ei2.k) this.f112939a).b();
    }

    @Override // ui2.j
    public final ui2.j d(String newName) {
        Intrinsics.checkNotNullParameter(newName, "name");
        ei2.k kVar = (ei2.k) this.f112939a;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(newName, "newName");
        if (OtelLimitsConfigExtKt.isNameValid(kVar.f59003e, newName, kVar.f58999a.f58970a)) {
            synchronized (kVar.f59004f) {
                if (kVar.f59004f.get() != null && !kVar.b()) {
                    Unit unit = Unit.f80348a;
                }
                kVar.f59008j = newName;
                ui2.j jVar = (ui2.j) kVar.f59004f.get();
                if (jVar != null) {
                    jVar.d(newName);
                }
                kVar.f59001c.d();
            }
        }
        return this;
    }

    @Override // ui2.j
    public final ui2.j e(String name, qi2.a attributes, long j13, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(unit, "unit");
        ((ei2.k) this.f112939a).k(name, Long.valueOf(unit.toMillis(j13)), c0.d.U2(attributes));
        return this;
    }

    @Override // ui2.j
    public final void g(long j13, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (b()) {
            ((ei2.k) this.f112939a).s(null, Long.valueOf(unit.toMillis(j13)));
        }
    }

    @Override // ui2.j
    public final ui2.l h() {
        ui2.j jVar = (ui2.j) ((ei2.k) this.f112939a).f59004f.get();
        ui2.l h10 = jVar != null ? jVar.h() : null;
        if (h10 != null) {
            return h10;
        }
        ri2.b bVar = ri2.b.f108392g;
        Intrinsics.checkNotNullExpressionValue(bVar, "getInvalid()");
        return bVar;
    }

    @Override // ui2.j
    public final ui2.j i(StatusCode statusCode, String description) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(description, "description");
        if (b()) {
            ((ei2.k) this.f112939a).p(statusCode, description);
        }
        return this;
    }

    @Override // ui2.j
    public final ui2.j o(ri2.e key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        String str = key.f108404b;
        Intrinsics.checkNotNullExpressionValue(str, "key.key");
        ((ei2.k) this.f112939a).j(str, value.toString());
        return this;
    }
}
