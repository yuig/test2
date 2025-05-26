package y30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final List f136754a;

    /* renamed from: b, reason: collision with root package name */
    public final k f136755b;

    public l(List list, k pageInfo) {
        Intrinsics.checkNotNullParameter(pageInfo, "pageInfo");
        this.f136754a = list;
        this.f136755b = pageInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f136754a, lVar.f136754a) && Intrinsics.d(this.f136755b, lVar.f136755b);
    }

    public final int hashCode() {
        List list = this.f136754a;
        return this.f136755b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "Connection(edges=" + this.f136754a + ", pageInfo=" + this.f136755b + ")";
    }
}
