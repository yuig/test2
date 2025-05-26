package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f132919a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132920b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132921c;

    public o2(List list, String str, String str2) {
        this.f132919a = list;
        this.f132920b = str;
        this.f132921c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return Intrinsics.d(this.f132919a, o2Var.f132919a) && Intrinsics.d(this.f132920b, o2Var.f132920b) && Intrinsics.d(this.f132921c, o2Var.f132921c);
    }

    public final int hashCode() {
        List list = this.f132919a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f132920b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132921c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RichSummary(products=");
        sb3.append(this.f132919a);
        sb3.append(", typeName=");
        sb3.append(this.f132920b);
        sb3.append(", displayName=");
        return a.a.p(sb3, this.f132921c, ")");
    }
}
