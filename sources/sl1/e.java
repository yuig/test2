package sl1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f113171a;

    /* renamed from: b, reason: collision with root package name */
    public final String f113172b;

    /* renamed from: c, reason: collision with root package name */
    public final String f113173c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f113174d;

    public /* synthetic */ e(String str, String str2, Integer num, int i13) {
        this(str, str2, (String) null, (i13 & 8) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f113171a, eVar.f113171a) && Intrinsics.d(this.f113172b, eVar.f113172b) && Intrinsics.d(this.f113173c, eVar.f113173c) && Intrinsics.d(this.f113174d, eVar.f113174d);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f113172b, this.f113171a.hashCode() * 31, 31);
        String str = this.f113173c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f113174d;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AvatarInfo(url=");
        sb3.append(this.f113171a);
        sb3.append(", userID=");
        sb3.append(this.f113172b);
        sb3.append(", name=");
        sb3.append(this.f113173c);
        sb3.append(", colorIndex=");
        return a.c.i(sb3, this.f113174d, ")");
    }

    public e(String url, String userID, String str, Integer num) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.f113171a = url;
        this.f113172b = userID;
        this.f113173c = str;
        this.f113174d = num;
    }
}
