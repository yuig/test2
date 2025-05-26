package yd1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a */
    public final String f138780a;

    /* renamed from: b */
    public final String f138781b;

    /* renamed from: c */
    public final int f138782c;

    /* renamed from: d */
    public final boolean f138783d;

    /* renamed from: e */
    public final int f138784e;

    /* renamed from: f */
    public final boolean f138785f;

    /* renamed from: g */
    public final boolean f138786g;

    public /* synthetic */ a(String str, String str2, int i13, boolean z13, int i14, boolean z14, int i15) {
        this((i15 & 8) != 0 ? false : z13, (i15 & 4) != 0 ? 0 : i13, (i15 & 16) != 0 ? 0 : i14, true, str, (i15 & 64) != 0 ? false : z14, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f138780a, aVar.f138780a) && Intrinsics.d(this.f138781b, aVar.f138781b) && this.f138782c == aVar.f138782c && this.f138783d == aVar.f138783d && this.f138784e == aVar.f138784e && this.f138785f == aVar.f138785f && this.f138786g == aVar.f138786g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138786g) + ep.b.e(this.f138785f, ep.b.b(this.f138784e, ep.b.e(this.f138783d, ep.b.b(this.f138782c, cb.d(this.f138781b, this.f138780a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BrandAvatarViewModel(avatarImageUrl=");
        sb3.append(this.f138780a);
        sb3.append(", name=");
        sb3.append(this.f138781b);
        sb3.append(", avatarColorIndex=");
        sb3.append(this.f138782c);
        sb3.append(", verified=");
        sb3.append(this.f138783d);
        sb3.append(", verifiedIconSize=");
        sb3.append(this.f138784e);
        sb3.append(", showOverlayOnWhiteImage=");
        sb3.append(this.f138785f);
        sb3.append(", verifiedMerchant=");
        return a.a.r(sb3, this.f138786g, ")");
    }

    public a(boolean z13, int i13, int i14, boolean z14, String avatarImageUrl, boolean z15, String name) {
        Intrinsics.checkNotNullParameter(avatarImageUrl, "avatarImageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f138780a = avatarImageUrl;
        this.f138781b = name;
        this.f138782c = i13;
        this.f138783d = z13;
        this.f138784e = i14;
        this.f138785f = z14;
        this.f138786g = z15;
    }
}
