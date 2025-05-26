package w80;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f128253a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f128254b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f128255c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f128256d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f128257e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f128258f;

    public /* synthetic */ b() {
        this(true, false, true, true, true, true);
    }

    public static b e(b bVar, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i13) {
        if ((i13 & 1) != 0) {
            z13 = bVar.f128253a;
        }
        boolean z19 = z13;
        if ((i13 & 2) != 0) {
            z14 = bVar.f128254b;
        }
        boolean z23 = z14;
        if ((i13 & 4) != 0) {
            z15 = bVar.f128255c;
        }
        boolean z24 = z15;
        if ((i13 & 8) != 0) {
            z16 = bVar.f128256d;
        }
        boolean z25 = z16;
        if ((i13 & 16) != 0) {
            z17 = bVar.f128257e;
        }
        boolean z26 = z17;
        if ((i13 & 32) != 0) {
            z18 = bVar.f128258f;
        }
        bVar.getClass();
        return new b(z19, z23, z24, z25, z26, z18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f128253a == bVar.f128253a && this.f128254b == bVar.f128254b && this.f128255c == bVar.f128255c && this.f128256d == bVar.f128256d && this.f128257e == bVar.f128257e && this.f128258f == bVar.f128258f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f128258f) + ep.b.e(this.f128257e, ep.b.e(this.f128256d, ep.b.e(this.f128255c, ep.b.e(this.f128254b, Boolean.hashCode(this.f128253a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BottomBarDisplayState(drawActionAvailable=");
        sb3.append(this.f128253a);
        sb3.append(", textActionAvailable=");
        sb3.append(this.f128254b);
        sb3.append(", addActionAvailable=");
        sb3.append(this.f128255c);
        sb3.append(", galleryActionAvailable=");
        sb3.append(this.f128256d);
        sb3.append(", cameraActionAvailable=");
        sb3.append(this.f128257e);
        sb3.append(", visible=");
        return a.a.r(sb3, this.f128258f, ")");
    }

    public b(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f128253a = z13;
        this.f128254b = z14;
        this.f128255c = z15;
        this.f128256d = z16;
        this.f128257e = z17;
        this.f128258f = z18;
    }
}
