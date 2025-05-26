package sx;

import a.cb;
import ep.b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f115602a;

    /* renamed from: b, reason: collision with root package name */
    public final String f115603b;

    /* renamed from: c, reason: collision with root package name */
    public final String f115604c;

    /* renamed from: d, reason: collision with root package name */
    public final String f115605d;

    /* renamed from: e, reason: collision with root package name */
    public final String f115606e;

    /* renamed from: f, reason: collision with root package name */
    public final String f115607f;

    /* renamed from: g, reason: collision with root package name */
    public final int f115608g;

    /* renamed from: h, reason: collision with root package name */
    public final int f115609h;

    /* renamed from: i, reason: collision with root package name */
    public final int f115610i;

    /* renamed from: j, reason: collision with root package name */
    public final String f115611j;

    public a(String id3, String title, String str, String str2, String str3, String str4, int i13, int i14, int i15, String userId) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f115602a = id3;
        this.f115603b = title;
        this.f115604c = str;
        this.f115605d = str2;
        this.f115606e = str3;
        this.f115607f = str4;
        this.f115608g = i13;
        this.f115609h = i14;
        this.f115610i = i15;
        this.f115611j = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f115602a, aVar.f115602a) && Intrinsics.d(this.f115603b, aVar.f115603b) && Intrinsics.d(this.f115604c, aVar.f115604c) && Intrinsics.d(this.f115605d, aVar.f115605d) && Intrinsics.d(this.f115606e, aVar.f115606e) && Intrinsics.d(this.f115607f, aVar.f115607f) && this.f115608g == aVar.f115608g && this.f115609h == aVar.f115609h && this.f115610i == aVar.f115610i && Intrinsics.d(this.f115611j, aVar.f115611j);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f115603b, this.f115602a.hashCode() * 31, 31);
        String str = this.f115604c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f115605d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f115606e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f115607f;
        return this.f115611j.hashCode() + b.b(this.f115610i, b.b(this.f115609h, b.b(this.f115608g, (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardMetadata(id=");
        sb3.append(this.f115602a);
        sb3.append(", title=");
        sb3.append(this.f115603b);
        sb3.append(", image=");
        sb3.append(this.f115604c);
        sb3.append(", url=");
        sb3.append(this.f115605d);
        sb3.append(", ownerName=");
        sb3.append(this.f115606e);
        sb3.append(", ownerImage=");
        sb3.append(this.f115607f);
        sb3.append(", pinCount=");
        sb3.append(this.f115608g);
        sb3.append(", sectionCount=");
        sb3.append(this.f115609h);
        sb3.append(", avatarColorIndex=");
        sb3.append(this.f115610i);
        sb3.append(", userId=");
        return a.a.p(sb3, this.f115611j, ")");
    }
}
