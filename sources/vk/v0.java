package vk;

import java.util.Objects;

/* loaded from: classes.dex */
public final class v0 extends c {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f126063a;

    public v0(u0 u0Var) {
        this.f126063a = u0Var;
    }

    @Override // uk.q
    public final boolean a() {
        return this.f126063a != u0.f126057d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v0) && ((v0) obj).f126063a == this.f126063a;
    }

    public final int hashCode() {
        return Objects.hash(v0.class, this.f126063a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f126063a + ")";
    }
}
