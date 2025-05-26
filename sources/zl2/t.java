package zl2;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;

/* loaded from: classes2.dex */
public final class t extends ln2.a {
    @Override // ln2.a
    public final mn2.d d(ym2.c packageFqName) {
        InputStream a13;
        Intrinsics.checkNotNullParameter(packageFqName, "fqName");
        fm2.d dVar = (fm2.d) this.f84055b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        if (packageFqName.h(xl2.r.f135331k)) {
            mn2.a.f87796q.getClass();
            String a14 = mn2.a.a(packageFqName);
            dVar.f62579b.getClass();
            a13 = mn2.e.a(a14);
        } else {
            a13 = null;
        }
        if (a13 != null) {
            return f0.Y(packageFqName, this.f84054a, this.f84056c, a13);
        }
        return null;
    }
}
