package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l4 {

    /* renamed from: a, reason: collision with root package name */
    public final List f132698a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132699b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132700c;

    public l4(List list, String str, String str2) {
        this.f132698a = list;
        this.f132699b = str;
        this.f132700c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return Intrinsics.d(this.f132698a, l4Var.f132698a) && Intrinsics.d(this.f132699b, l4Var.f132699b) && Intrinsics.d(this.f132700c, l4Var.f132700c);
    }

    public final int hashCode() {
        List list = this.f132698a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f132699b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132700c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RichSummary(products=");
        sb3.append(this.f132698a);
        sb3.append(", typeName=");
        sb3.append(this.f132699b);
        sb3.append(", displayName=");
        return a.a.p(sb3, this.f132700c, ")");
    }
}
