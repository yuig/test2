package nd;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: b */
    public final he.d f90422b = new he.d(0);

    @Override // nd.h
    public final void a(MessageDigest messageDigest) {
        int i13 = 0;
        while (true) {
            he.d dVar = this.f90422b;
            if (i13 >= dVar.f63294c) {
                return;
            }
            k kVar = (k) dVar.f(i13);
            Object j13 = this.f90422b.j(i13);
            j jVar = kVar.f90419b;
            if (kVar.f90421d == null) {
                kVar.f90421d = kVar.f90420c.getBytes(h.f90415a);
            }
            jVar.g(kVar.f90421d, j13, messageDigest);
            i13++;
        }
    }

    public final Object c(k kVar) {
        he.d dVar = this.f90422b;
        return dVar.containsKey(kVar) ? dVar.get(kVar) : kVar.f90418a;
    }

    @Override // nd.h
    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f90422b.equals(((l) obj).f90422b);
        }
        return false;
    }

    @Override // nd.h
    public final int hashCode() {
        return this.f90422b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f90422b + '}';
    }
}
