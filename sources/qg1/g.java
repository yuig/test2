package qg1;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f103829a;

    /* renamed from: b, reason: collision with root package name */
    public final int f103830b;

    /* renamed from: c, reason: collision with root package name */
    public final int f103831c;

    /* renamed from: d, reason: collision with root package name */
    public final int f103832d;

    /* renamed from: e, reason: collision with root package name */
    public final int f103833e;

    /* renamed from: f, reason: collision with root package name */
    public final int f103834f;

    /* renamed from: g, reason: collision with root package name */
    public final int f103835g;

    /* renamed from: h, reason: collision with root package name */
    public final int f103836h;

    public /* synthetic */ g() {
        this(0, 0, 0, 0, 0, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f103829a == gVar.f103829a && this.f103830b == gVar.f103830b && this.f103831c == gVar.f103831c && this.f103832d == gVar.f103832d && this.f103833e == gVar.f103833e && this.f103834f == gVar.f103834f && this.f103835g == gVar.f103835g && this.f103836h == gVar.f103836h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f103836h) + ep.b.b(this.f103835g, ep.b.b(this.f103834f, ep.b.b(this.f103833e, ep.b.b(this.f103832d, ep.b.b(this.f103831c, ep.b.b(this.f103830b, Integer.hashCode(this.f103829a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PrepublishWorkInfo(prepublishVideoExportStarted=");
        sb3.append(this.f103829a);
        sb3.append(", prepublishVideoExportFinished=");
        sb3.append(this.f103830b);
        sb3.append(", prepublishVideoUploadStarted=");
        sb3.append(this.f103831c);
        sb3.append(", prepublishVideoUploadFinished=");
        sb3.append(this.f103832d);
        sb3.append(", prepublishImageUploadStarted=");
        sb3.append(this.f103833e);
        sb3.append(", prepublishImageUploadFinished=");
        sb3.append(this.f103834f);
        sb3.append(", prepublishCoverImageUploadStarted=");
        sb3.append(this.f103835g);
        sb3.append(", prepublishCoverImageUploadFinished=");
        return a.a.n(sb3, this.f103836h, ")");
    }

    public g(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        this.f103829a = i13;
        this.f103830b = i14;
        this.f103831c = i15;
        this.f103832d = i16;
        this.f103833e = i17;
        this.f103834f = i18;
        this.f103835g = i19;
        this.f103836h = i23;
    }
}
