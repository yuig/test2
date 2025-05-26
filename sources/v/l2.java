package v;

import java.util.UUID;

/* loaded from: classes2.dex */
public final class l2 implements androidx.camera.core.impl.z2 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.impl.q1 f123534a;

    public l2() {
        androidx.camera.core.impl.q1 c13 = androidx.camera.core.impl.q1.c();
        c13.s(androidx.camera.core.impl.z2.f17018pn, new g1());
        c13.s(androidx.camera.core.impl.i1.f16872an, 34);
        c13.s(h0.k.f66416vo, m2.class);
        c13.s(h0.k.f66415uo, m2.class.getCanonicalName() + "-" + UUID.randomUUID());
        this.f123534a = c13;
    }

    @Override // androidx.camera.core.impl.z2
    public final androidx.camera.core.impl.b3 A() {
        return androidx.camera.core.impl.b3.METERING_REPEATING;
    }

    @Override // androidx.camera.core.impl.d2
    public final androidx.camera.core.impl.v0 getConfig() {
        return this.f123534a;
    }
}
