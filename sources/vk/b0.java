package vk;

import java.util.Objects;

/* loaded from: classes.dex */
public final class b0 extends c {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f125930a;

    public b0(a0 a0Var) {
        this.f125930a = a0Var;
    }

    @Override // uk.q
    public final boolean a() {
        return this.f125930a != a0.f125928d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b0) && ((b0) obj).f125930a == this.f125930a;
    }

    public final int hashCode() {
        return Objects.hash(b0.class, this.f125930a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f125930a + ")";
    }
}
