package kb1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f79091a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79092b;

    public p(String confirmedCode, String confirmedEmail) {
        Intrinsics.checkNotNullParameter(confirmedCode, "confirmedCode");
        Intrinsics.checkNotNullParameter(confirmedEmail, "confirmedEmail");
        this.f79091a = confirmedCode;
        this.f79092b = confirmedEmail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f79091a, pVar.f79091a) && Intrinsics.d(this.f79092b, pVar.f79092b);
    }

    public final int hashCode() {
        return this.f79092b.hashCode() + (this.f79091a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SubmitPasscodeRequest(confirmedCode=");
        sb3.append(this.f79091a);
        sb3.append(", confirmedEmail=");
        return a.a.p(sb3, this.f79092b, ")");
    }
}
