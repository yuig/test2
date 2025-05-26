package b40;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements d40.b, d40.d {

    /* renamed from: a, reason: collision with root package name */
    public final String f21753a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21754b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21755c;

    public v(String __typename, String id3, String entityId) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f21753a = __typename;
        this.f21754b = id3;
        this.f21755c = entityId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f21753a, vVar.f21753a) && Intrinsics.d(this.f21754b, vVar.f21754b) && Intrinsics.d(this.f21755c, vVar.f21755c);
    }

    public final int hashCode() {
        return this.f21755c.hashCode() + cb.d(this.f21754b, this.f21753a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Interest(__typename=");
        sb3.append(this.f21753a);
        sb3.append(", id=");
        sb3.append(this.f21754b);
        sb3.append(", entityId=");
        return a.a.p(sb3, this.f21755c, ")");
    }
}
