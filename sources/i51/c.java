package i51;

import u50.k0;

/* loaded from: classes5.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f71579a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final u32.c f71580b = u32.c.SECRET;

    @Override // x31.a
    public final x31.r a() {
        return e.Secret;
    }

    @Override // i51.d
    public final u32.c c() {
        return f71580b;
    }

    @Override // x31.a
    public final k0 d() {
        return bs1.c.j2(new String[0], nz1.f.filter_secret);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1375244561;
    }

    public final String toString() {
        return "Secret";
    }
}
