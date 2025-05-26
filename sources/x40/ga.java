package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ga {

    /* renamed from: a, reason: collision with root package name */
    public final List f132442a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132443b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132444c;

    public ga(List list, String str, String str2) {
        this.f132442a = list;
        this.f132443b = str;
        this.f132444c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga)) {
            return false;
        }
        ga gaVar = (ga) obj;
        return Intrinsics.d(this.f132442a, gaVar.f132442a) && Intrinsics.d(this.f132443b, gaVar.f132443b) && Intrinsics.d(this.f132444c, gaVar.f132444c);
    }

    public final int hashCode() {
        List list = this.f132442a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f132443b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132444c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RichSummary(products=");
        sb3.append(this.f132442a);
        sb3.append(", typeName=");
        sb3.append(this.f132443b);
        sb3.append(", displayName=");
        return a.a.p(sb3, this.f132444c, ")");
    }
}
