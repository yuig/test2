package ze1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f141808a;

    /* renamed from: b, reason: collision with root package name */
    public final String f141809b;

    public /* synthetic */ c(String str, int i13) {
        this((i13 & 1) != 0 ? null : str, (String) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f141808a, cVar.f141808a) && Intrinsics.d(this.f141809b, cVar.f141809b);
    }

    public final int hashCode() {
        String str = this.f141808a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f141809b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShoppingNavigationApiParams(navigationSource=");
        sb3.append(this.f141808a);
        sb3.append(", searchQuery=");
        return a.a.p(sb3, this.f141809b, ")");
    }

    public c(String str, String str2) {
        this.f141808a = str;
        this.f141809b = str2;
    }
}
