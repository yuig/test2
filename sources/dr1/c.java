package dr1;

import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c implements rz.d {
    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        vd0.a k13 = m13 != null ? m13.k("requirements") : new vd0.a();
        yk2.b bVar = new yk2.b();
        int d2 = k13.d();
        for (int i13 = 0; i13 < d2; i13++) {
            t92.a aVar = t92.c.Companion;
            int f13 = k13.f(i13);
            aVar.getClass();
            t92.c a13 = t92.a.a(f13);
            if (a13 != null) {
                bVar.add(a13);
            }
        }
        return new qr1.n(e0.a(bVar));
    }
}
