package ud1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f121924a;

    /* renamed from: b, reason: collision with root package name */
    public final String f121925b;

    /* renamed from: c, reason: collision with root package name */
    public final String f121926c;

    /* renamed from: d, reason: collision with root package name */
    public final String f121927d;

    /* renamed from: e, reason: collision with root package name */
    public final String f121928e;

    /* renamed from: f, reason: collision with root package name */
    public final String f121929f = null;

    /* renamed from: g, reason: collision with root package name */
    public final String f121930g;

    public a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f121924a = str;
        this.f121925b = str2;
        this.f121926c = str3;
        this.f121927d = str4;
        this.f121928e = str5;
        this.f121930g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f121924a, aVar.f121924a) && Intrinsics.d(this.f121925b, aVar.f121925b) && Intrinsics.d(this.f121926c, aVar.f121926c) && Intrinsics.d(this.f121927d, aVar.f121927d) && Intrinsics.d(this.f121928e, aVar.f121928e) && Intrinsics.d(this.f121929f, aVar.f121929f) && Intrinsics.d(this.f121930g, aVar.f121930g);
    }

    public final int hashCode() {
        String str = this.f121924a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f121925b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f121926c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f121927d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f121928e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f121929f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f121930g;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShoppingUnitAuxDataModel(storyType=");
        sb3.append(this.f121924a);
        sb3.append(", contentIds=");
        sb3.append(this.f121925b);
        sb3.append(", gridIndex=");
        sb3.append(this.f121926c);
        sb3.append(", storyId=");
        sb3.append(this.f121927d);
        sb3.append(", storyIndex=");
        sb3.append(this.f121928e);
        sb3.append(", advertiserId=");
        sb3.append(this.f121929f);
        sb3.append(", totalObjectCount=");
        return a.a.p(sb3, this.f121930g, ")");
    }
}
