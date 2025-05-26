package b40;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements d40.g {

    /* renamed from: a, reason: collision with root package name */
    public final String f21765a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21766b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21767c;

    public y(String __typename, String id3, String entityId) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f21765a = __typename;
        this.f21766b = id3;
        this.f21767c = entityId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f21765a, yVar.f21765a) && Intrinsics.d(this.f21766b, yVar.f21766b) && Intrinsics.d(this.f21767c, yVar.f21767c);
    }

    public final int hashCode() {
        return this.f21767c.hashCode() + cb.d(this.f21766b, this.f21765a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UsersDidItDatum(__typename=");
        sb3.append(this.f21765a);
        sb3.append(", id=");
        sb3.append(this.f21766b);
        sb3.append(", entityId=");
        return a.a.p(sb3, this.f21767c, ")");
    }
}
