package nd;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import pd.g0;

/* loaded from: classes3.dex */
public final class i implements p {

    /* renamed from: b, reason: collision with root package name */
    public final List f90416b;

    public i(p... pVarArr) {
        if (pVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f90416b = Arrays.asList(pVarArr);
    }

    @Override // nd.h
    public final void a(MessageDigest messageDigest) {
        Iterator it = this.f90416b.iterator();
        while (it.hasNext()) {
            ((p) it.next()).a(messageDigest);
        }
    }

    @Override // nd.p
    public final g0 b(com.bumptech.glide.f fVar, g0 g0Var, int i13, int i14) {
        Iterator it = this.f90416b.iterator();
        g0 g0Var2 = g0Var;
        while (it.hasNext()) {
            g0 b13 = ((p) it.next()).b(fVar, g0Var2, i13, i14);
            if (g0Var2 != null && !g0Var2.equals(g0Var) && !g0Var2.equals(b13)) {
                g0Var2.c();
            }
            g0Var2 = b13;
        }
        return g0Var2;
    }

    @Override // nd.h
    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f90416b.equals(((i) obj).f90416b);
        }
        return false;
    }

    @Override // nd.h
    public final int hashCode() {
        return this.f90416b.hashCode();
    }
}
