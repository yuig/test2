package qr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f105053a;

    /* renamed from: b, reason: collision with root package name */
    public final String f105054b;

    public y(d0 basicInfo, String email) {
        Intrinsics.checkNotNullParameter(basicInfo, "basicInfo");
        Intrinsics.checkNotNullParameter(email, "email");
        this.f105053a = basicInfo;
        this.f105054b = email;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f105053a, yVar.f105053a) && Intrinsics.d(this.f105054b, yVar.f105054b);
    }

    public final int hashCode() {
        return this.f105054b.hashCode() + (this.f105053a.hashCode() * 31);
    }

    public final String toString() {
        return "PinterestSSOInfo(basicInfo=" + this.f105053a + ", email=" + this.f105054b + ")";
    }
}
