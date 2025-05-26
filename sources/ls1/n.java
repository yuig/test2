package ls1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f84700a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84701b;

    public n(String originBoardId, String str) {
        Intrinsics.checkNotNullParameter(originBoardId, "originBoardId");
        this.f84700a = originBoardId;
        this.f84701b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f84700a, nVar.f84700a) && Intrinsics.d(this.f84701b, nVar.f84701b);
    }

    public final int hashCode() {
        int hashCode = this.f84700a.hashCode() * 31;
        String str = this.f84701b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinMovementEvent(originBoardId=");
        sb3.append(this.f84700a);
        sb3.append(", originSectionId=");
        return a.a.p(sb3, this.f84701b, ")");
    }
}
