package b40;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o implements l {

    /* renamed from: b, reason: collision with root package name */
    public final String f21729b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21730c;

    /* renamed from: d, reason: collision with root package name */
    public final n f21731d;

    public o(String __typename, String entityId, n nVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f21729b = __typename;
        this.f21730c = entityId;
        this.f21731d = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f21729b, oVar.f21729b) && Intrinsics.d(this.f21730c, oVar.f21730c) && Intrinsics.d(this.f21731d, oVar.f21731d);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f21730c, this.f21729b.hashCode() * 31, 31);
        n nVar = this.f21731d;
        return d2 + (nVar == null ? 0 : nVar.hashCode());
    }

    public final String toString() {
        return "UserData(__typename=" + this.f21729b + ", entityId=" + this.f21730c + ", badgeCounts=" + this.f21731d + ")";
    }
}
