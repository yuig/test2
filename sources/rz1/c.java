package rz1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f110239a;

    /* renamed from: b, reason: collision with root package name */
    public final String f110240b;

    /* renamed from: c, reason: collision with root package name */
    public final String f110241c;

    public c(String str, String str2, String str3) {
        this.f110239a = str;
        this.f110240b = str2;
        this.f110241c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f110239a, cVar.f110239a) && Intrinsics.d(this.f110240b, cVar.f110240b) && Intrinsics.d(this.f110241c, cVar.f110241c);
    }

    public final int hashCode() {
        String str = this.f110239a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f110240b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f110241c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PushEventData(source=");
        sb3.append(this.f110239a);
        sb3.append(", utmSource=");
        sb3.append(this.f110240b);
        sb3.append(", utmCampaign=");
        return a.a.p(sb3, this.f110241c, ")");
    }
}
