package androidx.camera.core.impl;

import a.jg;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class n1 implements androidx.lifecycle.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f16921a = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final t1 f16922b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f16923c;

    public n1(t1 t1Var, Executor executor) {
        this.f16923c = executor;
        this.f16922b = t1Var;
    }

    @Override // androidx.lifecycle.m0
    public final void a(Object obj) {
        this.f16923c.execute(new jg(29, this, (o1) obj));
    }
}
