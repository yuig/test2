package vk;

import java.util.Objects;

/* loaded from: classes.dex */
public final class r0 extends c {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f126033a = q0.f126027a;

    /* renamed from: b, reason: collision with root package name */
    public final int f126034b = 8;

    @Override // uk.q
    public final boolean a() {
        return this.f126033a != q0.f126027a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return r0Var.f126033a == this.f126033a && r0Var.f126034b == this.f126034b;
    }

    public final int hashCode() {
        return Objects.hash(r0.class, this.f126033a, Integer.valueOf(this.f126034b));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("X-AES-GCM Parameters (variant: ");
        sb3.append(this.f126033a);
        sb3.append("salt_size_bytes: ");
        return a.a.n(sb3, this.f126034b, ")");
    }
}
