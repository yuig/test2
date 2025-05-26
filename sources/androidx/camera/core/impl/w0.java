package androidx.camera.core.impl;

import a.jg;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class w0 implements u1 {

    /* renamed from: b, reason: collision with root package name */
    public static final w0 f16981b = new w0(null);

    /* renamed from: a, reason: collision with root package name */
    public final g0.p f16982a;

    public w0(Object obj) {
        this.f16982a = g0.m.e(obj);
    }

    @Override // androidx.camera.core.impl.u1
    public final void a(t1 t1Var, Executor executor) {
        this.f16982a.d(new jg(25, this, t1Var), executor);
    }

    @Override // androidx.camera.core.impl.u1
    public final com.google.common.util.concurrent.c0 c() {
        return this.f16982a;
    }

    @Override // androidx.camera.core.impl.u1
    public final void f(t1 t1Var) {
    }
}
