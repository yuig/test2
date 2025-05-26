package b92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f22248a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22249b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f22250c;

    public b(String str, String str2, int i13) {
        str = (i13 & 1) != 0 ? null : str;
        str2 = (i13 & 2) != 0 ? null : str2;
        this.f22248a = str;
        this.f22249b = str2;
        this.f22250c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f22248a, bVar.f22248a) && Intrinsics.d(this.f22249b, bVar.f22249b) && Intrinsics.d(this.f22250c, bVar.f22250c);
    }

    public final int hashCode() {
        String str = this.f22248a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f22249b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l13 = this.f22250c;
        return hashCode2 + (l13 != null ? l13.hashCode() : 0);
    }

    public final String toString() {
        return "TargetHandshakeDataConnect(accessToken=" + this.f22248a + ", apiKey=" + this.f22249b + ", timeStamp=" + this.f22250c + ")";
    }
}
