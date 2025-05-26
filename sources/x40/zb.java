package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zb {

    /* renamed from: a, reason: collision with root package name */
    public final String f133818a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133819b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133820c;

    public zb(String __typename, String id3, String entityId) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133818a = __typename;
        this.f133819b = id3;
        this.f133820c = entityId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb)) {
            return false;
        }
        zb zbVar = (zb) obj;
        return Intrinsics.d(this.f133818a, zbVar.f133818a) && Intrinsics.d(this.f133819b, zbVar.f133819b) && Intrinsics.d(this.f133820c, zbVar.f133820c);
    }

    public final int hashCode() {
        return this.f133820c.hashCode() + a.cb.d(this.f133819b, this.f133818a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Board(__typename=");
        sb3.append(this.f133818a);
        sb3.append(", id=");
        sb3.append(this.f133819b);
        sb3.append(", entityId=");
        return a.a.p(sb3, this.f133820c, ")");
    }
}
