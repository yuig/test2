package ub1;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f121706a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f121707b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f121708c;

    public a(boolean z13, boolean z14, boolean z15) {
        this.f121706a = z13;
        this.f121707b = z14;
        this.f121708c = z15;
    }

    public static a e(a aVar, boolean z13, boolean z14, boolean z15, int i13) {
        if ((i13 & 1) != 0) {
            z13 = aVar.f121706a;
        }
        if ((i13 & 2) != 0) {
            z14 = aVar.f121707b;
        }
        if ((i13 & 4) != 0) {
            z15 = aVar.f121708c;
        }
        aVar.getClass();
        return new a(z13, z14, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f121706a == aVar.f121706a && this.f121707b == aVar.f121707b && this.f121708c == aVar.f121708c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f121708c) + ep.b.e(this.f121707b, Boolean.hashCode(this.f121706a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ContentPermissionsDisplayState(isAutoProductTagEnabled=");
        sb3.append(this.f121706a);
        sb3.append(", showDisableConfirmationDialog=");
        sb3.append(this.f121707b);
        sb3.append(", shouldDisableToggle=");
        return a.a.r(sb3, this.f121708c, ")");
    }
}
