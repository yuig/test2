package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hh {

    /* renamed from: a, reason: collision with root package name */
    public final List f132510a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132511b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132512c;

    public hh(List list, String str, String str2) {
        this.f132510a = list;
        this.f132511b = str;
        this.f132512c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh)) {
            return false;
        }
        hh hhVar = (hh) obj;
        return Intrinsics.d(this.f132510a, hhVar.f132510a) && Intrinsics.d(this.f132511b, hhVar.f132511b) && Intrinsics.d(this.f132512c, hhVar.f132512c);
    }

    public final int hashCode() {
        List list = this.f132510a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f132511b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132512c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RichSummary(products=");
        sb3.append(this.f132510a);
        sb3.append(", typeName=");
        sb3.append(this.f132511b);
        sb3.append(", displayName=");
        return a.a.p(sb3, this.f132512c, ")");
    }
}
