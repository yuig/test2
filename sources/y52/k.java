package y52;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements o {

    /* renamed from: a, reason: collision with root package name */
    public final String f137821a;

    /* renamed from: b, reason: collision with root package name */
    public final String f137822b;

    public k(String link, String inviteCode) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(inviteCode, "inviteCode");
        this.f137821a = link;
        this.f137822b = inviteCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f137821a, kVar.f137821a) && Intrinsics.d(this.f137822b, kVar.f137822b);
    }

    public final int hashCode() {
        return this.f137822b.hashCode() + (this.f137821a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShareLinkLoaded(link=");
        sb3.append(this.f137821a);
        sb3.append(", inviteCode=");
        return a.a.p(sb3, this.f137822b, ")");
    }
}
