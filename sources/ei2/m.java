package ei2;

import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;
import kh2.r2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xf2.c0;

/* loaded from: classes4.dex */
public final class m implements v {

    /* renamed from: a, reason: collision with root package name */
    public final u f59020a;

    /* renamed from: b, reason: collision with root package name */
    public final a f59021b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f59022c;

    /* renamed from: d, reason: collision with root package name */
    public final z f59023d;

    /* renamed from: e, reason: collision with root package name */
    public volatile v f59024e;

    public m(u spanRepository, a currentSessionSpan, r2 embraceSpanFactorySupplier) {
        Intrinsics.checkNotNullParameter(spanRepository, "spanRepository");
        Intrinsics.checkNotNullParameter(currentSessionSpan, "currentSessionSpan");
        Intrinsics.checkNotNullParameter(embraceSpanFactorySupplier, "embraceSpanFactorySupplier");
        this.f59020a = spanRepository;
        this.f59021b = currentSessionSpan;
        this.f59022c = embraceSpanFactorySupplier;
        z zVar = new z();
        this.f59023d = zVar;
        this.f59024e = zVar;
    }

    @Override // nf2.j
    public final void a(long j13) {
        if (this.f59024e instanceof w) {
            return;
        }
        synchronized (this.f59024e) {
            try {
                if (!(this.f59024e instanceof w)) {
                    w wVar = new w(this.f59020a, (h) this.f59022c.invoke(), this.f59021b);
                    wVar.a(j13);
                    if (wVar.f59045e.get()) {
                        this.f59023d.i(wVar);
                    }
                    this.f59024e = wVar;
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
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
        return this.f59024e.b(name, autoTerminationMode, bVar, type, z13, z14, attributes, events, code);
    }

    @Override // ei2.v
    public final q c(c0 type, oi2.a autoTerminationMode, oi2.b bVar, String name, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f59024e.c(type, autoTerminationMode, bVar, name, z13, z14);
    }

    @Override // ei2.v
    public final q d(e embraceSpanBuilder) {
        Intrinsics.checkNotNullParameter(embraceSpanBuilder, "embraceSpanBuilder");
        return this.f59024e.d(embraceSpanBuilder);
    }

    @Override // nf2.j
    public final boolean e() {
        return this.f59024e instanceof w;
    }

    @Override // ei2.v
    public final oi2.b f(String spanId) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        return this.f59024e.f(spanId);
    }

    @Override // ei2.v
    public final boolean g(String name, long j13, long j14, oi2.a autoTerminationMode, oi2.b bVar, c0 type, boolean z13, boolean z14, Map attributes, List events, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(events, "events");
        return this.f59024e.g(name, j13, j14, autoTerminationMode, bVar, type, z13, z14, attributes, events, errorCode);
    }

    @Override // ei2.v
    public final q h(String str, oi2.a aVar, oi2.b bVar, Long l13, c0 c0Var, boolean z13, boolean z14) {
        return kg.p.b0(this, str, aVar, bVar, l13, c0Var, z13, z14);
    }
}
