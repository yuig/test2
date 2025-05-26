package com.pinterest.shuffles.scene.composer;

/* loaded from: classes4.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f52005a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f52006b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f52007c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f52008d;

    public a1(boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f52005a = z13;
        this.f52006b = z14;
        this.f52007c = z15;
        this.f52008d = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f52005a == a1Var.f52005a && this.f52006b == a1Var.f52006b && this.f52007c == a1Var.f52007c && this.f52008d == a1Var.f52008d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52008d) + ep.b.e(this.f52007c, ep.b.e(this.f52006b, Boolean.hashCode(this.f52005a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StickerRenderConfig(highQuality=");
        sb3.append(this.f52005a);
        sb3.append(", preferBitmapMaskOverSvgMask=");
        sb3.append(this.f52006b);
        sb3.append(", renderMaskTypeLabels=");
        sb3.append(this.f52007c);
        sb3.append(", useStickerMask=");
        return a.a.r(sb3, this.f52008d, ")");
    }
}
