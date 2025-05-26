package y31;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f136788a;

    /* renamed from: b, reason: collision with root package name */
    public final String f136789b;

    /* renamed from: c, reason: collision with root package name */
    public final String f136790c;

    /* renamed from: d, reason: collision with root package name */
    public final String f136791d;

    /* renamed from: e, reason: collision with root package name */
    public final n10.d f136792e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f136793f;

    public f(String name, String username, String pronouns, String str, n10.d verifiedStatus, boolean z13) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(pronouns, "pronouns");
        Intrinsics.checkNotNullParameter(verifiedStatus, "verifiedStatus");
        this.f136788a = name;
        this.f136789b = username;
        this.f136790c = pronouns;
        this.f136791d = str;
        this.f136792e = verifiedStatus;
        this.f136793f = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f136788a, fVar.f136788a) && Intrinsics.d(this.f136789b, fVar.f136789b) && Intrinsics.d(this.f136790c, fVar.f136790c) && Intrinsics.d(this.f136791d, fVar.f136791d) && this.f136792e == fVar.f136792e && this.f136793f == fVar.f136793f;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f136790c, cb.d(this.f136789b, this.f136788a.hashCode() * 31, 31), 31);
        String str = this.f136791d;
        return Boolean.hashCode(this.f136793f) + ((this.f136792e.hashCode() + ((d2 + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserInformationState(name=");
        sb3.append(this.f136788a);
        sb3.append(", username=");
        sb3.append(this.f136789b);
        sb3.append(", pronouns=");
        sb3.append(this.f136790c);
        sb3.append(", about=");
        sb3.append(this.f136791d);
        sb3.append(", verifiedStatus=");
        sb3.append(this.f136792e);
        sb3.append(", hasMoreInfo=");
        return a.a.r(sb3, this.f136793f, ")");
    }
}
