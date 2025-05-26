package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qc {

    /* renamed from: a, reason: collision with root package name */
    public final String f133117a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133118b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133119c;

    public qc(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133117a = __typename;
        this.f133118b = str;
        this.f133119c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc)) {
            return false;
        }
        qc qcVar = (qc) obj;
        return Intrinsics.d(this.f133117a, qcVar.f133117a) && Intrinsics.d(this.f133118b, qcVar.f133118b) && Intrinsics.d(this.f133119c, qcVar.f133119c);
    }

    public final int hashCode() {
        int hashCode = this.f133117a.hashCode() * 31;
        String str = this.f133118b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133119c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ReadTimesM(__typename=");
        sb3.append(this.f133117a);
        sb3.append(", time=");
        sb3.append(this.f133118b);
        sb3.append(", userId=");
        return a.a.p(sb3, this.f133119c, ")");
    }
}
