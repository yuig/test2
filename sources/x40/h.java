package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f132457a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132458b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132459c;

    public h(String __typename, String entityId, String id3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f132457a = __typename;
        this.f132458b = entityId;
        this.f132459c = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f132457a, hVar.f132457a) && Intrinsics.d(this.f132458b, hVar.f132458b) && Intrinsics.d(this.f132459c, hVar.f132459c);
    }

    public final int hashCode() {
        return this.f132459c.hashCode() + a.cb.d(this.f132458b, this.f132457a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Data(__typename=");
        sb3.append(this.f132457a);
        sb3.append(", entityId=");
        sb3.append(this.f132458b);
        sb3.append(", id=");
        return a.a.p(sb3, this.f132459c, ")");
    }
}
