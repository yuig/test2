package ads_mobile_sdk;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class t13 extends a.nb {

    /* renamed from: a, reason: collision with root package name */
    public final s13 f11320a;

    public t13(s13 s13Var) {
        this.f11320a = s13Var;
    }

    @Override // a.p6
    public final boolean a() {
        return this.f11320a != s13.f10905d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t13) && ((t13) obj).f11320a == this.f11320a;
    }

    public final int hashCode() {
        return Objects.hash(t13.class, this.f11320a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f11320a + ")";
    }
}
