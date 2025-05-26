package v60;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f124192a;

    /* renamed from: b, reason: collision with root package name */
    public final String f124193b;

    /* renamed from: c, reason: collision with root package name */
    public final String f124194c;

    public a(String str, String str2, String str3) {
        this.f124192a = str;
        this.f124193b = str2;
        this.f124194c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f124192a, aVar.f124192a) && Intrinsics.d(this.f124193b, aVar.f124193b) && Intrinsics.d(this.f124194c, aVar.f124194c);
    }

    public final int hashCode() {
        String str = this.f124192a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f124193b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f124194c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LoadingArgs(boardId=");
        sb3.append(this.f124192a);
        sb3.append(", boardSessionId=");
        sb3.append(this.f124193b);
        sb3.append(", requestParams=");
        return a.a.p(sb3, this.f124194c, ")");
    }
}
