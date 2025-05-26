package zp;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f142481a;

    /* renamed from: b, reason: collision with root package name */
    public final int f142482b;

    /* renamed from: c, reason: collision with root package name */
    public final int f142483c;

    /* renamed from: d, reason: collision with root package name */
    public final int f142484d;

    /* renamed from: e, reason: collision with root package name */
    public final int f142485e;

    public s(int i13, int i14, int i15, int i16, int i17) {
        this.f142481a = i13;
        this.f142482b = i14;
        this.f142483c = i15;
        this.f142484d = i16;
        this.f142485e = i17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f142481a == sVar.f142481a && this.f142482b == sVar.f142482b && this.f142483c == sVar.f142483c && this.f142484d == sVar.f142484d && this.f142485e == sVar.f142485e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f142485e) + ep.b.b(this.f142484d, ep.b.b(this.f142483c, ep.b.b(this.f142482b, Integer.hashCode(this.f142481a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InviteCollaboratorUpsellState(iconResId=");
        sb3.append(this.f142481a);
        sb3.append(", titleResId=");
        sb3.append(this.f142482b);
        sb3.append(", messageResId=");
        sb3.append(this.f142483c);
        sb3.append(", primaryCtaResId=");
        sb3.append(this.f142484d);
        sb3.append(", secondaryCtaResId=");
        return a.a.n(sb3, this.f142485e, ")");
    }
}
