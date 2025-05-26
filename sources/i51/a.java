package i51;

import u50.k0;

/* loaded from: classes5.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f71564a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final u32.c f71565b = u32.c.ARCHIVED;

    @Override // x31.a
    public final x31.r a() {
        return e.Archived;
    }

    @Override // i51.d
    public final u32.c c() {
        return f71565b;
    }

    @Override // x31.a
    public final k0 d() {
        return bs1.c.j2(new String[0], nz1.f.filter_archived);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1422375839;
    }

    public final String toString() {
        return "Archived";
    }
}
