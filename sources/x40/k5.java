package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k5 implements z40.u {

    /* renamed from: a, reason: collision with root package name */
    public final String f132661a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132662b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132663c;

    /* renamed from: d, reason: collision with root package name */
    public final j5 f132664d;

    public k5(String __typename, String id3, String entityId, j5 j5Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132661a = __typename;
        this.f132662b = id3;
        this.f132663c = entityId;
        this.f132664d = j5Var;
    }

    @Override // z40.t
    public final String a() {
        return this.f132663c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj;
        return Intrinsics.d(this.f132661a, k5Var.f132661a) && Intrinsics.d(this.f132662b, k5Var.f132662b) && Intrinsics.d(this.f132663c, k5Var.f132663c) && Intrinsics.d(this.f132664d, k5Var.f132664d);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132663c, a.cb.d(this.f132662b, this.f132661a.hashCode() * 31, 31), 31);
        j5 j5Var = this.f132664d;
        return d2 + (j5Var == null ? 0 : j5Var.hashCode());
    }

    public final String toString() {
        return "Data(__typename=" + this.f132661a + ", id=" + this.f132662b + ", entityId=" + this.f132663c + ", lastMessage=" + this.f132664d + ")";
    }
}
