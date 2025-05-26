package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xa {

    /* renamed from: a, reason: collision with root package name */
    public final List f133681a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133682b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133683c;

    public xa(List list, String str, String str2) {
        this.f133681a = list;
        this.f133682b = str;
        this.f133683c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa)) {
            return false;
        }
        xa xaVar = (xa) obj;
        return Intrinsics.d(this.f133681a, xaVar.f133681a) && Intrinsics.d(this.f133682b, xaVar.f133682b) && Intrinsics.d(this.f133683c, xaVar.f133683c);
    }

    public final int hashCode() {
        List list = this.f133681a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f133682b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133683c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RichSummary(products=");
        sb3.append(this.f133681a);
        sb3.append(", typeName=");
        sb3.append(this.f133682b);
        sb3.append(", displayName=");
        return a.a.p(sb3, this.f133683c, ")");
    }
}
