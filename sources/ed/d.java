package ed;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import pc.c0;
import pc.d0;

/* loaded from: classes.dex */
public final class d implements c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f58463c = new f0();

    /* renamed from: b, reason: collision with root package name */
    public final List f58464b;

    public d(List headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f58464b = headers;
    }

    @Override // pc.f0
    public final c0 a(d0 d0Var) {
        return tb.f.M(this, d0Var);
    }

    @Override // pc.f0
    public final pc.f0 b(d0 d0Var) {
        return tb.f.W(this, d0Var);
    }

    @Override // pc.f0
    public final pc.f0 c(pc.f0 f0Var) {
        return tb.f.Z(this, f0Var);
    }

    @Override // pc.f0
    public final Object d(Object obj) {
        return tb.f.K(this, obj);
    }

    @Override // pc.c0
    public final f0 getKey() {
        return f58463c;
    }
}
