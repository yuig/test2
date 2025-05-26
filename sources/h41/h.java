package h41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f67636a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67637b;

    public h(String str, String str2) {
        this.f67636a = str;
        this.f67637b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f67636a, hVar.f67636a) && Intrinsics.d(this.f67637b, hVar.f67637b);
    }

    public final int hashCode() {
        String str = this.f67636a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f67637b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UrlDisplay(url=");
        sb3.append(this.f67636a);
        sb3.append(", displayText=");
        return a.a.p(sb3, this.f67637b, ")");
    }
}
