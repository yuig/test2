package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p8 {

    /* renamed from: a, reason: collision with root package name */
    public final List f133029a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133030b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133031c;

    public p8(List list, String str, String str2) {
        this.f133029a = list;
        this.f133030b = str;
        this.f133031c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8)) {
            return false;
        }
        p8 p8Var = (p8) obj;
        return Intrinsics.d(this.f133029a, p8Var.f133029a) && Intrinsics.d(this.f133030b, p8Var.f133030b) && Intrinsics.d(this.f133031c, p8Var.f133031c);
    }

    public final int hashCode() {
        List list = this.f133029a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f133030b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133031c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RichSummary(products=");
        sb3.append(this.f133029a);
        sb3.append(", typeName=");
        sb3.append(this.f133030b);
        sb3.append(", displayName=");
        return a.a.p(sb3, this.f133031c, ")");
    }
}
