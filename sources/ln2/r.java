package ln2;

import am2.n0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r implements i {

    /* renamed from: a, reason: collision with root package name */
    public final am2.j0 f84132a;

    public r(n0 packageFragmentProvider) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        this.f84132a = packageFragmentProvider;
    }

    @Override // ln2.i
    public final h a(ym2.b classId) {
        h a13;
        Intrinsics.checkNotNullParameter(classId, "classId");
        ym2.c g13 = classId.g();
        Intrinsics.checkNotNullExpressionValue(g13, "getPackageFqName(...)");
        Iterator it = dl2.b.k2(this.f84132a, g13).iterator();
        while (it.hasNext()) {
            am2.i0 i0Var = (am2.i0) it.next();
            if ((i0Var instanceof s) && (a13 = ((s) i0Var).f84136j.a(classId)) != null) {
                return a13;
            }
        }
        return null;
    }
}
