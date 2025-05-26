package sh2;

import ei2.q;
import ei2.r;
import ei2.v;
import kotlin.jvm.internal.Intrinsics;
import ui2.p;

/* loaded from: classes4.dex */
public final class d implements p {

    /* renamed from: a, reason: collision with root package name */
    public final p f112943a;

    /* renamed from: b, reason: collision with root package name */
    public final v f112944b;

    /* renamed from: c, reason: collision with root package name */
    public final zi2.b f112945c;

    public d(p sdkTracer, v spanService, zi2.b clock) {
        Intrinsics.checkNotNullParameter(sdkTracer, "sdkTracer");
        Intrinsics.checkNotNullParameter(spanService, "spanService");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f112943a = sdkTracer;
        this.f112944b = spanService;
        this.f112945c = clock;
    }

    @Override // ui2.p
    public final ui2.k a(String name) {
        Intrinsics.checkNotNullParameter(name, "spanName");
        xf2.c type = xf2.c.f134850d;
        vi2.c cVar = vi2.g.f125879b;
        vi2.b current = cVar.current();
        if (current == null) {
            current = cVar.root();
        }
        Intrinsics.checkNotNullExpressionValue(current, "current()");
        Intrinsics.checkNotNullParameter(current, "<this>");
        q qVar = (q) ((vi2.a) current).a(r.f59031a);
        oi2.a autoTerminationMode = oi2.a.NONE;
        p pVar = this.f112943a;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        return new c(new ei2.e(pVar, name, type, false, false, autoTerminationMode, qVar), this.f112944b, this.f112945c);
    }
}
