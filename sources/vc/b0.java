package vc;

import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import pc.d0;
import pc.t0;

/* loaded from: classes.dex */
public final class b0 implements pc.c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f125506d = new f0();

    /* renamed from: b, reason: collision with root package name */
    public final t0 f125507b;

    /* renamed from: c, reason: collision with root package name */
    public final kl2.l f125508c;

    public b0(t0 t0Var, w retryWhen) {
        Intrinsics.checkNotNullParameter(retryWhen, "retryWhen");
        this.f125507b = t0Var;
        this.f125508c = retryWhen;
    }

    @Override // pc.f0
    public final pc.c0 a(d0 d0Var) {
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
        return f125506d;
    }
}
