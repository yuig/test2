package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ph {

    /* renamed from: a, reason: collision with root package name */
    public final List f133050a;

    /* renamed from: b, reason: collision with root package name */
    public final oh f133051b;

    public ph(List list, oh pageInfo) {
        Intrinsics.checkNotNullParameter(pageInfo, "pageInfo");
        this.f133050a = list;
        this.f133051b = pageInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph)) {
            return false;
        }
        ph phVar = (ph) obj;
        return Intrinsics.d(this.f133050a, phVar.f133050a) && Intrinsics.d(this.f133051b, phVar.f133051b);
    }

    public final int hashCode() {
        List list = this.f133050a;
        return this.f133051b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "Connection(edges=" + this.f133050a + ", pageInfo=" + this.f133051b + ")";
    }
}
