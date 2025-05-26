package vk;

import java.util.Objects;

/* loaded from: classes.dex */
public final class m0 extends c {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f125997a;

    /* renamed from: b, reason: collision with root package name */
    public final String f125998b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f125999c;

    /* renamed from: d, reason: collision with root package name */
    public final c f126000d;

    public m0(l0 l0Var, String str, k0 k0Var, c cVar) {
        this.f125997a = l0Var;
        this.f125998b = str;
        this.f125999c = k0Var;
        this.f126000d = cVar;
    }

    @Override // uk.q
    public final boolean a() {
        return this.f125997a != l0.f125991c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return m0Var.f125999c.equals(this.f125999c) && m0Var.f126000d.equals(this.f126000d) && m0Var.f125998b.equals(this.f125998b) && m0Var.f125997a.equals(this.f125997a);
    }

    public final int hashCode() {
        return Objects.hash(m0.class, this.f125998b, this.f125999c, this.f126000d, this.f125997a);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f125998b + ", dekParsingStrategy: " + this.f125999c + ", dekParametersForNewKeys: " + this.f126000d + ", variant: " + this.f125997a + ")";
    }
}
