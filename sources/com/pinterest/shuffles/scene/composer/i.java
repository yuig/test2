package com.pinterest.shuffles.scene.composer;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f52053a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f52054b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f52055c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f52056d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f52057e;

    public i(boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f52053a = z13;
        this.f52054b = z14;
        this.f52055c = z15;
        this.f52056d = z16;
        this.f52057e = z15 || z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f52053a == iVar.f52053a && this.f52054b == iVar.f52054b && this.f52055c == iVar.f52055c && this.f52056d == iVar.f52056d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52056d) + ep.b.e(this.f52055c, ep.b.e(this.f52054b, Boolean.hashCode(this.f52053a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ChangePayload(layoutChanged=");
        sb3.append(this.f52053a);
        sb3.append(", effectChanged=");
        sb3.append(this.f52054b);
        sb3.append(", maskChanged=");
        sb3.append(this.f52055c);
        sb3.append(", textChanged=");
        return a.a.r(sb3, this.f52056d, ")");
    }
}
