package b40;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements d40.k, d40.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f21762a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21763b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21764c;

    public x(String __typename, String id3, String entityId) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f21762a = __typename;
        this.f21763b = id3;
        this.f21764c = entityId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f21762a, xVar.f21762a) && Intrinsics.d(this.f21763b, xVar.f21763b) && Intrinsics.d(this.f21764c, xVar.f21764c);
    }

    public final int hashCode() {
        return this.f21764c.hashCode() + cb.d(this.f21763b, this.f21762a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("User(__typename=");
        sb3.append(this.f21762a);
        sb3.append(", id=");
        sb3.append(this.f21763b);
        sb3.append(", entityId=");
        return a.a.p(sb3, this.f21764c, ")");
    }
}
