package no2;

import kh2.g2;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import xk2.k;
import xk2.m;
import xk2.n;

/* loaded from: classes4.dex */
public final class d extends qo2.b {

    /* renamed from: a, reason: collision with root package name */
    public final rl2.d f91668a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f91669b;

    /* renamed from: c, reason: collision with root package name */
    public final k f91670c;

    public d(rl2.d baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.f91668a = baseClass;
        this.f91669b = q0.f80391a;
        this.f91670c = m.a(n.PUBLICATION, new g2(this, 23));
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return (oo2.g) this.f91670c.getValue();
    }

    @Override // qo2.b
    public final rl2.d h() {
        return this.f91668a;
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f91668a + ')';
    }
}
