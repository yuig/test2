package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132015a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132016b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132017c;

    /* renamed from: d, reason: collision with root package name */
    public final a6 f132018d;

    public b6(String __typename, String entityId, String str, a6 a6Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132015a = __typename;
        this.f132016b = entityId;
        this.f132017c = str;
        this.f132018d = a6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj;
        return Intrinsics.d(this.f132015a, b6Var.f132015a) && Intrinsics.d(this.f132016b, b6Var.f132016b) && Intrinsics.d(this.f132017c, b6Var.f132017c) && Intrinsics.d(this.f132018d, b6Var.f132018d);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132016b, this.f132015a.hashCode() * 31, 31);
        String str = this.f132017c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        a6 a6Var = this.f132018d;
        return hashCode + (a6Var != null ? a6Var.f131916a.hashCode() : 0);
    }

    public final String toString() {
        return "Data(__typename=" + this.f132015a + ", entityId=" + this.f132016b + ", text=" + this.f132017c + ", thread=" + this.f132018d + ")";
    }
}
