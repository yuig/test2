package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y7 {

    /* renamed from: a, reason: collision with root package name */
    public final List f133728a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133729b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133730c;

    public y7(List list, String str, String str2) {
        this.f133728a = list;
        this.f133729b = str;
        this.f133730c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) obj;
        return Intrinsics.d(this.f133728a, y7Var.f133728a) && Intrinsics.d(this.f133729b, y7Var.f133729b) && Intrinsics.d(this.f133730c, y7Var.f133730c);
    }

    public final int hashCode() {
        List list = this.f133728a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f133729b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133730c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RichSummary(products=");
        sb3.append(this.f133728a);
        sb3.append(", typeName=");
        sb3.append(this.f133729b);
        sb3.append(", displayName=");
        return a.a.p(sb3, this.f133730c, ")");
    }
}
