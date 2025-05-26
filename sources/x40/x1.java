package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f133649a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133650b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133651c;

    public x1(List list, String str, String str2) {
        this.f133649a = list;
        this.f133650b = str;
        this.f133651c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return Intrinsics.d(this.f133649a, x1Var.f133649a) && Intrinsics.d(this.f133650b, x1Var.f133650b) && Intrinsics.d(this.f133651c, x1Var.f133651c);
    }

    public final int hashCode() {
        List list = this.f133649a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f133650b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133651c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RichSummary(products=");
        sb3.append(this.f133649a);
        sb3.append(", typeName=");
        sb3.append(this.f133650b);
        sb3.append(", displayName=");
        return a.a.p(sb3, this.f133651c, ")");
    }
}
