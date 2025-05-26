package m40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f85821a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85822b;

    public e(String str, String str2) {
        this.f85821a = str;
        this.f85822b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f85821a, eVar.f85821a) && Intrinsics.d(this.f85822b, eVar.f85822b);
    }

    public final int hashCode() {
        String str = this.f85821a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f85822b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Data(countryCode=");
        sb3.append(this.f85821a);
        sb3.append(", countryName=");
        return a.a.p(sb3, this.f85822b, ")");
    }
}
