package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qb {

    /* renamed from: a, reason: collision with root package name */
    public final List f133115a;

    /* renamed from: b, reason: collision with root package name */
    public final pb f133116b;

    public qb(List list, pb pageInfo) {
        Intrinsics.checkNotNullParameter(pageInfo, "pageInfo");
        this.f133115a = list;
        this.f133116b = pageInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb)) {
            return false;
        }
        qb qbVar = (qb) obj;
        return Intrinsics.d(this.f133115a, qbVar.f133115a) && Intrinsics.d(this.f133116b, qbVar.f133116b);
    }

    public final int hashCode() {
        List list = this.f133115a;
        return this.f133116b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "Connection(edges=" + this.f133115a + ", pageInfo=" + this.f133116b + ")";
    }
}
