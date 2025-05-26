package re1;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a */
    public final int f107603a;

    /* renamed from: b */
    public final int f107604b;

    /* renamed from: c */
    public final int f107605c;

    /* renamed from: d */
    public final int f107606d;

    /* renamed from: e */
    public final int f107607e;

    public i(int i13, int i14) {
        int i15 = xe1.v.C;
        int i16 = xe1.v.D;
        int i17 = xe1.v.H;
        this.f107603a = i13;
        this.f107604b = i15;
        this.f107605c = i16;
        this.f107606d = i14;
        this.f107607e = i17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f107603a == iVar.f107603a && this.f107604b == iVar.f107604b && this.f107605c == iVar.f107605c && this.f107606d == iVar.f107606d && this.f107607e == iVar.f107607e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f107607e) + ep.b.b(this.f107606d, ep.b.b(this.f107605c, ep.b.b(this.f107604b, Integer.hashCode(this.f107603a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FooterDimensionsSpec(emptyFooterViewHeight=");
        sb3.append(this.f107603a);
        sb3.append(", spotlightEmptyFooterViewHeight=");
        sb3.append(this.f107604b);
        sb3.append(", topPadding=");
        sb3.append(this.f107605c);
        sb3.append(", bottomPadding=");
        sb3.append(this.f107606d);
        sb3.append(", horizontalPadding=");
        return a.a.n(sb3, this.f107607e, ")");
    }
}
