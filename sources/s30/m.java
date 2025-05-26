package s30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final List f111043a;

    /* renamed from: b, reason: collision with root package name */
    public final String f111044b;

    public m(List list, String str) {
        this.f111043a = list;
        this.f111044b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f111043a, mVar.f111043a) && Intrinsics.d(this.f111044b, mVar.f111044b);
    }

    public final int hashCode() {
        List list = this.f111043a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f111044b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Data(clusters=" + this.f111043a + ", publishStatus=" + this.f111044b + ")";
    }
}
