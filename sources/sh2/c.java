package sh2;

import ei2.q;
import ei2.v;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements ui2.k {

    /* renamed from: a, reason: collision with root package name */
    public final ei2.e f112940a;

    /* renamed from: b, reason: collision with root package name */
    public final v f112941b;

    /* renamed from: c, reason: collision with root package name */
    public final zi2.b f112942c;

    public c(ei2.e embraceSpanBuilder, v spanService, zi2.b clock) {
        Intrinsics.checkNotNullParameter(embraceSpanBuilder, "embraceSpanBuilder");
        Intrinsics.checkNotNullParameter(spanService, "spanService");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f112940a = embraceSpanBuilder;
        this.f112941b = spanService;
        this.f112942c = clock;
    }

    @Override // ui2.k
    public final ui2.j a() {
        q d2 = this.f112941b.d(this.f112940a);
        if (d2 != null && ((ei2.k) d2).r(null)) {
            return new b(d2, this.f112942c);
        }
        ui2.i iVar = ui2.i.f122314b;
        Intrinsics.checkNotNullExpressionValue(iVar, "getInvalid()");
        return iVar;
    }

    @Override // ui2.k
    public final ui2.k b() {
        this.f112940a.a();
        return this;
    }

    @Override // ui2.k
    public final ui2.k c(vi2.b context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f112940a.b(context);
        return this;
    }

    @Override // ui2.k
    public final ui2.k d(long j13, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f112940a.f58974e = Long.valueOf(unit.toMillis(j13));
        return this;
    }
}
