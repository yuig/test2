package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yf {

    /* renamed from: a, reason: collision with root package name */
    public final List f133749a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133750b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133751c;

    public yf(List list, String str, String str2) {
        this.f133749a = list;
        this.f133750b = str;
        this.f133751c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf)) {
            return false;
        }
        yf yfVar = (yf) obj;
        return Intrinsics.d(this.f133749a, yfVar.f133749a) && Intrinsics.d(this.f133750b, yfVar.f133750b) && Intrinsics.d(this.f133751c, yfVar.f133751c);
    }

    public final int hashCode() {
        List list = this.f133749a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f133750b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133751c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RichSummary(products=");
        sb3.append(this.f133749a);
        sb3.append(", typeName=");
        sb3.append(this.f133750b);
        sb3.append(", displayName=");
        return a.a.p(sb3, this.f133751c, ")");
    }
}
