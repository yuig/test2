package w31;

import u32.f;
import u50.k0;
import x31.r;

/* loaded from: classes5.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f127915a = new a();

    @Override // x31.a
    public final r a() {
        return e.CreatedByYou;
    }

    @Override // w31.c
    public final f b() {
        return f.CREATED_BY_ME;
    }

    @Override // x31.a
    public final k0 d() {
        return bs1.c.j2(new String[0], oz1.e.filter_created_by_you);
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
        return 531526407;
    }

    public final String toString() {
        return "CreatedByYou";
    }
}
