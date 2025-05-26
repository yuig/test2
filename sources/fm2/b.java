package fm2;

import gm2.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lb.l0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f62575a;

    public b(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f62575a = classLoader;
    }

    public final q a(im2.q request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ym2.b bVar = request.f72761a;
        ym2.c g13 = bVar.g();
        Intrinsics.checkNotNullExpressionValue(g13, "getPackageFqName(...)");
        String b13 = bVar.h().b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        String m13 = z.m(b13, '.', '$');
        if (!g13.d()) {
            m13 = g13.b() + '.' + m13;
        }
        Class z13 = l0.z1(this.f62575a, m13);
        if (z13 != null) {
            return new q(z13);
        }
        return null;
    }
}
