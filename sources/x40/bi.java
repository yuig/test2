package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bi {

    /* renamed from: a, reason: collision with root package name */
    public final String f132058a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132059b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132060c;

    public bi(String __typename, String entityId, String id3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f132058a = __typename;
        this.f132059b = entityId;
        this.f132060c = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi)) {
            return false;
        }
        bi biVar = (bi) obj;
        return Intrinsics.d(this.f132058a, biVar.f132058a) && Intrinsics.d(this.f132059b, biVar.f132059b) && Intrinsics.d(this.f132060c, biVar.f132060c);
    }

    public final int hashCode() {
        return this.f132060c.hashCode() + a.cb.d(this.f132059b, this.f132058a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Data(__typename=");
        sb3.append(this.f132058a);
        sb3.append(", entityId=");
        sb3.append(this.f132059b);
        sb3.append(", id=");
        return a.a.p(sb3, this.f132060c, ")");
    }
}
