package ads_mobile_sdk;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class o61 extends a.nb {

    /* renamed from: a, reason: collision with root package name */
    public final String f9154a;

    /* renamed from: b, reason: collision with root package name */
    public final n61 f9155b;

    public o61(String str, n61 n61Var) {
        this.f9154a = str;
        this.f9155b = n61Var;
    }

    @Override // a.p6
    public final boolean a() {
        return this.f9155b != n61.f8688c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o61)) {
            return false;
        }
        o61 o61Var = (o61) obj;
        return o61Var.f9154a.equals(this.f9154a) && o61Var.f9155b.equals(this.f9155b);
    }

    public final int hashCode() {
        return Objects.hash(o61.class, this.f9154a, this.f9155b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f9154a + ", variant: " + this.f9155b + ")";
    }
}
