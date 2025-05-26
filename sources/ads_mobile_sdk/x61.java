package ads_mobile_sdk;

import a.p6;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class x61 extends p6 {

    /* renamed from: a, reason: collision with root package name */
    public final j22 f13510a;

    public x61(j22 j22Var) {
        this.f13510a = j22Var;
    }

    @Override // a.p6
    public final boolean a() {
        return this.f13510a.f6610b.s() != ju1.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x61)) {
            return false;
        }
        j22 j22Var = ((x61) obj).f13510a;
        return this.f13510a.f6610b.s().equals(j22Var.f6610b.s()) && this.f13510a.f6610b.t().equals(j22Var.f6610b.t()) && this.f13510a.f6610b.u().equals(j22Var.f6610b.u());
    }

    public final int hashCode() {
        j22 j22Var = this.f13510a;
        return Objects.hash(j22Var.f6610b, j22Var.f6609a);
    }

    public final String toString() {
        String t13 = this.f13510a.f6610b.t();
        int ordinal = this.f13510a.f6610b.s().ordinal();
        return a.a.m("(typeUrl=", t13, ", outputPrefixType=", ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
