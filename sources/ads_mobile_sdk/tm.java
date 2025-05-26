package ads_mobile_sdk;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class tm extends a.nb {

    /* renamed from: a, reason: collision with root package name */
    public final sm f11593a;

    public tm(sm smVar) {
        this.f11593a = smVar;
    }

    @Override // a.p6
    public final boolean a() {
        return this.f11593a != sm.f11148d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tm) && ((tm) obj).f11593a == this.f11593a;
    }

    public final int hashCode() {
        return Objects.hash(tm.class, this.f11593a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f11593a + ")";
    }
}
