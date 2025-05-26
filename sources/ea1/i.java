package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f58060a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58061b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58062c;

    public i(String str, String str2, String str3) {
        this.f58060a = str;
        this.f58061b = str2;
        this.f58062c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f58060a, iVar.f58060a) && Intrinsics.d(this.f58061b, iVar.f58061b) && Intrinsics.d(this.f58062c, iVar.f58062c);
    }

    public final int hashCode() {
        String str = this.f58060a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f58061b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f58062c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardLoadError(fallbackBoardName=");
        sb3.append(this.f58060a);
        sb3.append(", fallbackBoardImageUrl=");
        sb3.append(this.f58061b);
        sb3.append(", fallbackBoardLayout=");
        return a.a.p(sb3, this.f58062c, ")");
    }
}
