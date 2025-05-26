package y01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f136381a;

    /* renamed from: b, reason: collision with root package name */
    public final String f136382b;

    public a(String pinUid, String apdId) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(apdId, "apdId");
        this.f136381a = pinUid;
        this.f136382b = apdId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f136381a, aVar.f136381a) && Intrinsics.d(this.f136382b, aVar.f136382b);
    }

    public final int hashCode() {
        return this.f136382b.hashCode() + (this.f136381a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CheckPinSpam(pinUid=");
        sb3.append(this.f136381a);
        sb3.append(", apdId=");
        return a.a.p(sb3, this.f136382b, ")");
    }
}
