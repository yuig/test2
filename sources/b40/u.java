package b40;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements d40.a, d40.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f21749a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21750b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21751c;

    public u(String __typename, String id3, String entityId) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f21749a = __typename;
        this.f21750b = id3;
        this.f21751c = entityId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f21749a, uVar.f21749a) && Intrinsics.d(this.f21750b, uVar.f21750b) && Intrinsics.d(this.f21751c, uVar.f21751c);
    }

    public final int hashCode() {
        return this.f21751c.hashCode() + cb.d(this.f21750b, this.f21749a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Board(__typename=");
        sb3.append(this.f21749a);
        sb3.append(", id=");
        sb3.append(this.f21750b);
        sb3.append(", entityId=");
        return a.a.p(sb3, this.f21751c, ")");
    }
}
