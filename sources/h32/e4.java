package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e4 {

    /* renamed from: d, reason: collision with root package name */
    public static final vb0.i f66977d = new vb0.i(12);

    /* renamed from: a, reason: collision with root package name */
    public final h4 f66978a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f66979b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f66980c;

    public e4(h4 h4Var, Boolean bool, Long l13) {
        this.f66978a = h4Var;
        this.f66979b = bool;
        this.f66980c = l13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj;
        return this.f66978a == e4Var.f66978a && Intrinsics.d(this.f66979b, e4Var.f66979b) && Intrinsics.d(this.f66980c, e4Var.f66980c);
    }

    public final int hashCode() {
        h4 h4Var = this.f66978a;
        int hashCode = (h4Var == null ? 0 : h4Var.hashCode()) * 31;
        Boolean bool = this.f66979b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l13 = this.f66980c;
        return hashCode2 + (l13 != null ? l13.hashCode() : 0);
    }

    public final String toString() {
        return "VisibleEvent(type=" + this.f66978a + ", visible=" + this.f66979b + ", time=" + this.f66980c + ")";
    }
}
