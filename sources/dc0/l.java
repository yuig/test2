package dc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f54327a;

    /* renamed from: b, reason: collision with root package name */
    public final rm1.c f54328b;

    /* renamed from: c, reason: collision with root package name */
    public final int f54329c;

    public l(String creatorName, rm1.c cVar, int i13) {
        Intrinsics.checkNotNullParameter(creatorName, "creatorName");
        this.f54327a = creatorName;
        this.f54328b = cVar;
        this.f54329c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f54327a, lVar.f54327a) && this.f54328b == lVar.f54328b && this.f54329c == lVar.f54329c;
    }

    public final int hashCode() {
        int hashCode = this.f54327a.hashCode() * 31;
        rm1.c cVar = this.f54328b;
        return Integer.hashCode(this.f54329c) + ((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CreatorInfoData(creatorName=");
        sb3.append(this.f54327a);
        sb3.append(", creatorVerifiedIconColor=");
        sb3.append(this.f54328b);
        sb3.append(", collaboratorCount=");
        return a.a.n(sb3, this.f54329c, ")");
    }
}
