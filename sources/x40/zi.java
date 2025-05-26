package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zi {

    /* renamed from: a, reason: collision with root package name */
    public final String f133831a;

    /* renamed from: b, reason: collision with root package name */
    public final List f133832b;

    /* renamed from: c, reason: collision with root package name */
    public final yi f133833c;

    public zi(String __typename, List list, yi pageInfo) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(pageInfo, "pageInfo");
        this.f133831a = __typename;
        this.f133832b = list;
        this.f133833c = pageInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi)) {
            return false;
        }
        zi ziVar = (zi) obj;
        return Intrinsics.d(this.f133831a, ziVar.f133831a) && Intrinsics.d(this.f133832b, ziVar.f133832b) && Intrinsics.d(this.f133833c, ziVar.f133833c);
    }

    public final int hashCode() {
        int hashCode = this.f133831a.hashCode() * 31;
        List list = this.f133832b;
        return this.f133833c.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return "Connection(__typename=" + this.f133831a + ", edges=" + this.f133832b + ", pageInfo=" + this.f133833c + ")";
    }
}
