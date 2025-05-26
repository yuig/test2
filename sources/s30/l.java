package s30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f111040a;

    /* renamed from: b, reason: collision with root package name */
    public final List f111041b;

    /* renamed from: c, reason: collision with root package name */
    public final String f111042c;

    public l(String str, String str2, List list) {
        this.f111040a = str;
        this.f111041b = list;
        this.f111042c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f111040a, lVar.f111040a) && Intrinsics.d(this.f111041b, lVar.f111041b) && Intrinsics.d(this.f111042c, lVar.f111042c);
    }

    public final int hashCode() {
        String str = this.f111040a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f111041b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f111042c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Cluster(actionUri=");
        sb3.append(this.f111040a);
        sb3.append(", entities=");
        sb3.append(this.f111041b);
        sb3.append(", title=");
        return a.a.p(sb3, this.f111042c, ")");
    }
}
