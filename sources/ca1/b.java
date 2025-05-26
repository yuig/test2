package ca1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f27193a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27194b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27195c;

    public b(String str, String str2, String str3) {
        this.f27193a = str;
        this.f27194b = str2;
        this.f27195c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f27193a, bVar.f27193a) && Intrinsics.d(this.f27194b, bVar.f27194b) && Intrinsics.d(this.f27195c, bVar.f27195c);
    }

    public final int hashCode() {
        String str = this.f27193a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f27194b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27195c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardLoaded(displayName=");
        sb3.append(this.f27193a);
        sb3.append(", imageUrl=");
        sb3.append(this.f27194b);
        sb3.append(", layout=");
        return a.a.p(sb3, this.f27195c, ")");
    }
}
