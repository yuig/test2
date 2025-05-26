package yg1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f139009a;

    /* renamed from: b, reason: collision with root package name */
    public final String f139010b;

    /* renamed from: c, reason: collision with root package name */
    public final vn1.e f139011c;

    public a(String str, String str2, vn1.e eVar) {
        this.f139009a = str;
        this.f139010b = str2;
        this.f139011c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f139009a, aVar.f139009a) && Intrinsics.d(this.f139010b, aVar.f139010b) && this.f139011c == aVar.f139011c;
    }

    public final int hashCode() {
        String str = this.f139009a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f139010b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        vn1.e eVar = this.f139011c;
        return (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "TitleAndSubtitleConfig(titleText=" + this.f139009a + ", subtitleText=" + this.f139010b + ", titleStyle=" + this.f139011c + ", subtitleTypeface=null)";
    }
}
