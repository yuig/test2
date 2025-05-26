package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132294a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132295b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132296c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f132297d;

    public e0(String __typename, String entityId, String str, d0 d0Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132294a = __typename;
        this.f132295b = entityId;
        this.f132296c = str;
        this.f132297d = d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.d(this.f132294a, e0Var.f132294a) && Intrinsics.d(this.f132295b, e0Var.f132295b) && Intrinsics.d(this.f132296c, e0Var.f132296c) && Intrinsics.d(this.f132297d, e0Var.f132297d);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132295b, this.f132294a.hashCode() * 31, 31);
        String str = this.f132296c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        d0 d0Var = this.f132297d;
        return hashCode + (d0Var != null ? d0Var.f132202a.hashCode() : 0);
    }

    public final String toString() {
        return "Data(__typename=" + this.f132294a + ", entityId=" + this.f132295b + ", text=" + this.f132296c + ", thread=" + this.f132297d + ")";
    }
}
