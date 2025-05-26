package androidx.camera.core.impl;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class j2 implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f16890a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final k2 f16891b;

    public j2(k2 k2Var) {
        this.f16891b = k2Var;
    }

    @Override // androidx.camera.core.impl.k2
    public final void a(o2 o2Var, m2 m2Var) {
        if (this.f16890a.get()) {
            return;
        }
        this.f16891b.a(o2Var, m2Var);
    }

    public final void b() {
        this.f16890a.set(true);
    }
}
