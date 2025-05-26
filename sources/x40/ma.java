package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ma implements z40.q {

    /* renamed from: a, reason: collision with root package name */
    public final String f132817a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132818b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132819c;

    public ma(String __typename, String id3, String entityId) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132817a = __typename;
        this.f132818b = id3;
        this.f132819c = entityId;
    }

    @Override // z40.q
    public final String a() {
        return this.f132819c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma)) {
            return false;
        }
        ma maVar = (ma) obj;
        return Intrinsics.d(this.f132817a, maVar.f132817a) && Intrinsics.d(this.f132818b, maVar.f132818b) && Intrinsics.d(this.f132819c, maVar.f132819c);
    }

    public final int hashCode() {
        return this.f132819c.hashCode() + a.cb.d(this.f132818b, this.f132817a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("User(__typename=");
        sb3.append(this.f132817a);
        sb3.append(", id=");
        sb3.append(this.f132818b);
        sb3.append(", entityId=");
        return a.a.p(sb3, this.f132819c, ")");
    }
}
