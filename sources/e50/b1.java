package e50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f57266a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f57267b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f57268c;

    /* renamed from: d, reason: collision with root package name */
    public final List f57269d;

    public b1(String __typename, Object obj, Object obj2, List list) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f57266a = __typename;
        this.f57267b = obj;
        this.f57268c = obj2;
        this.f57269d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Intrinsics.d(this.f57266a, b1Var.f57266a) && Intrinsics.d(this.f57267b, b1Var.f57267b) && Intrinsics.d(this.f57268c, b1Var.f57268c) && Intrinsics.d(this.f57269d, b1Var.f57269d);
    }

    public final int hashCode() {
        int hashCode = this.f57266a.hashCode() * 31;
        Object obj = this.f57267b;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f57268c;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        List list = this.f57269d;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "Sensitivity(__typename=" + this.f57266a + ", advisory=" + this.f57267b + ", severity=" + this.f57268c + ", notices=" + this.f57269d + ")";
    }
}
