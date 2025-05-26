package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g13 extends a.nb {

    /* renamed from: a, reason: collision with root package name */
    public final f13 f5353a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5354b;

    public g13(f13 f13Var, int i13) {
        this.f5353a = f13Var;
        this.f5354b = i13;
    }

    public static g13 a(f13 f13Var, int i13) {
        if (i13 < 8 || i13 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new g13(f13Var, i13);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g13)) {
            return false;
        }
        g13 g13Var = (g13) obj;
        return g13Var.f5353a == this.f5353a && g13Var.f5354b == this.f5354b;
    }

    public final int hashCode() {
        return Objects.hash(g13.class, this.f5353a, Integer.valueOf(this.f5354b));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("X-AES-GCM Parameters (variant: ");
        sb3.append(this.f5353a);
        sb3.append("salt_size_bytes: ");
        return a.a.n(sb3, this.f5354b, ")");
    }

    @Override // a.p6
    public final boolean a() {
        return this.f5353a != f13.f5010c;
    }
}
