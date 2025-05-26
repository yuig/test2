package b40;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements d40.j, d40.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f21759a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21760b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21761c;

    public w(String __typename, String id3, String entityId) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f21759a = __typename;
        this.f21760b = id3;
        this.f21761c = entityId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f21759a, wVar.f21759a) && Intrinsics.d(this.f21760b, wVar.f21760b) && Intrinsics.d(this.f21761c, wVar.f21761c);
    }

    public final int hashCode() {
        return this.f21761c.hashCode() + cb.d(this.f21760b, this.f21759a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pin(__typename=");
        sb3.append(this.f21759a);
        sb3.append(", id=");
        sb3.append(this.f21760b);
        sb3.append(", entityId=");
        return a.a.p(sb3, this.f21761c, ")");
    }
}
