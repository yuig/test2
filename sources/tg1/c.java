package tg1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f117580a;

    /* renamed from: b, reason: collision with root package name */
    public final String f117581b;

    /* renamed from: c, reason: collision with root package name */
    public final String f117582c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f117583d;

    public c(String str, String str2, String str3, Integer num) {
        this.f117580a = str;
        this.f117581b = str2;
        this.f117582c = str3;
        this.f117583d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f117580a, cVar.f117580a) && Intrinsics.d(this.f117581b, cVar.f117581b) && Intrinsics.d(this.f117582c, cVar.f117582c) && Intrinsics.d(this.f117583d, cVar.f117583d);
    }

    public final int hashCode() {
        String str = this.f117580a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f117581b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f117582c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f117583d;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SpotlightBoardUserViewModel(id=");
        sb3.append(this.f117580a);
        sb3.append(", name=");
        sb3.append(this.f117581b);
        sb3.append(", avatarUrl=");
        sb3.append(this.f117582c);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f117583d, ")");
    }
}
