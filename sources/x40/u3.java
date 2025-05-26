package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    public final List f133408a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133409b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133410c;

    public u3(List list, String str, String str2) {
        this.f133408a = list;
        this.f133409b = str;
        this.f133410c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return Intrinsics.d(this.f133408a, u3Var.f133408a) && Intrinsics.d(this.f133409b, u3Var.f133409b) && Intrinsics.d(this.f133410c, u3Var.f133410c);
    }

    public final int hashCode() {
        List list = this.f133408a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f133409b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133410c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RichSummary(products=");
        sb3.append(this.f133408a);
        sb3.append(", typeName=");
        sb3.append(this.f133409b);
        sb3.append(", displayName=");
        return a.a.p(sb3, this.f133410c, ")");
    }
}
