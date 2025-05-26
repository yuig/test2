package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132588a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f132589b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132590c;

    /* renamed from: d, reason: collision with root package name */
    public final String f132591d;

    public j5(String __typename, String id3, String entityId, Object obj) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132588a = __typename;
        this.f132589b = obj;
        this.f132590c = id3;
        this.f132591d = entityId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj;
        return Intrinsics.d(this.f132588a, j5Var.f132588a) && Intrinsics.d(this.f132589b, j5Var.f132589b) && Intrinsics.d(this.f132590c, j5Var.f132590c) && Intrinsics.d(this.f132591d, j5Var.f132591d);
    }

    public final int hashCode() {
        int hashCode = this.f132588a.hashCode() * 31;
        Object obj = this.f132589b;
        return this.f132591d.hashCode() + a.cb.d(this.f132590c, (hashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LastMessage(__typename=");
        sb3.append(this.f132588a);
        sb3.append(", type=");
        sb3.append(this.f132589b);
        sb3.append(", id=");
        sb3.append(this.f132590c);
        sb3.append(", entityId=");
        return a.a.p(sb3, this.f132591d, ")");
    }
}
