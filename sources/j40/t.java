package j40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final s f74625a;

    /* renamed from: b, reason: collision with root package name */
    public final List f74626b;

    public t(s pageInfo, List list) {
        Intrinsics.checkNotNullParameter(pageInfo, "pageInfo");
        this.f74625a = pageInfo;
        this.f74626b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f74625a, tVar.f74625a) && Intrinsics.d(this.f74626b, tVar.f74626b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f74625a.f74624a) * 31;
        List list = this.f74626b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Connection(pageInfo=" + this.f74625a + ", edges=" + this.f74626b + ")";
    }
}
