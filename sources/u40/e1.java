package u40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final d1 f120321a;

    /* renamed from: b, reason: collision with root package name */
    public final List f120322b;

    public e1(d1 pageInfo, List list) {
        Intrinsics.checkNotNullParameter(pageInfo, "pageInfo");
        this.f120321a = pageInfo;
        this.f120322b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Intrinsics.d(this.f120321a, e1Var.f120321a) && Intrinsics.d(this.f120322b, e1Var.f120322b);
    }

    public final int hashCode() {
        int hashCode = this.f120321a.hashCode() * 31;
        List list = this.f120322b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Connection(pageInfo=" + this.f120321a + ", edges=" + this.f120322b + ")";
    }
}
