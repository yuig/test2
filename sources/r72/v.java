package r72;

/* loaded from: classes4.dex */
public final class v extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f106688b;

    /* renamed from: c, reason: collision with root package name */
    public final float f106689c;

    /* renamed from: d, reason: collision with root package name */
    public final float f106690d;

    /* renamed from: e, reason: collision with root package name */
    public final float f106691e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f106692f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f106693g;

    public v(float f13, float f14, float f15, float f16, boolean z13, boolean z14) {
        this.f106688b = f13;
        this.f106689c = f14;
        this.f106690d = f15;
        this.f106691e = f16;
        this.f106692f = z13;
        this.f106693g = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f106688b, vVar.f106688b) == 0 && Float.compare(this.f106689c, vVar.f106689c) == 0 && Float.compare(this.f106690d, vVar.f106690d) == 0 && Float.compare(this.f106691e, vVar.f106691e) == 0 && this.f106692f == vVar.f106692f && this.f106693g == vVar.f106693g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106693g) + ep.b.e(this.f106692f, a.a.a(this.f106691e, a.a.a(this.f106690d, a.a.a(this.f106689c, Float.hashCode(this.f106688b) * 31, 31), 31), 31), 31);
    }

    @Override // r72.i0, r72.j0
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EchoNew(speed=");
        sb3.append(this.f106688b);
        sb3.append(", intensity=");
        sb3.append(this.f106689c);
        sb3.append(", centerX=");
        sb3.append(this.f106690d);
        sb3.append(", centerY=");
        sb3.append(this.f106691e);
        sb3.append(", isTimeDirectionInverted=");
        sb3.append(this.f106692f);
        sb3.append(", isRadial=");
        return a.a.r(sb3, this.f106693g, ")");
    }
}
