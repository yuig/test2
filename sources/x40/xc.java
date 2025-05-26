package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xc {

    /* renamed from: a, reason: collision with root package name */
    public final List f133685a;

    /* renamed from: b, reason: collision with root package name */
    public final wc f133686b;

    public xc(List list, wc pageInfo) {
        Intrinsics.checkNotNullParameter(pageInfo, "pageInfo");
        this.f133685a = list;
        this.f133686b = pageInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc)) {
            return false;
        }
        xc xcVar = (xc) obj;
        return Intrinsics.d(this.f133685a, xcVar.f133685a) && Intrinsics.d(this.f133686b, xcVar.f133686b);
    }

    public final int hashCode() {
        List list = this.f133685a;
        return this.f133686b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "Connection(edges=" + this.f133685a + ", pageInfo=" + this.f133686b + ")";
    }
}
