package yl2;

import am2.d0;
import dm2.c0;
import dm2.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import lb.l0;
import on2.u;

/* loaded from: classes2.dex */
public final class a implements cm2.c {

    /* renamed from: a, reason: collision with root package name */
    public final u f139360a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f139361b;

    public a(u storageManager, i0 module) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.f139360a = storageManager;
        this.f139361b = module;
    }

    @Override // cm2.c
    public final Collection a(ym2.c packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        return s0.f80394a;
    }

    @Override // cm2.c
    public final boolean b(ym2.c packageFqName, ym2.g name) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        String b13 = name.b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        return (z.p(b13, "Function", false) || z.p(b13, "KFunction", false) || z.p(b13, "SuspendFunction", false) || z.p(b13, "KSuspendFunction", false)) && n.f139380c.a(b13, packageFqName) != null;
    }

    @Override // cm2.c
    public final am2.g c(ym2.b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (classId.f139465c || (!classId.f139464b.e().d())) {
            return null;
        }
        String b13 = classId.h().b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        if (!StringsKt.E(b13, "Function", false)) {
            return null;
        }
        ym2.c g13 = classId.g();
        Intrinsics.checkNotNullExpressionValue(g13, "getPackageFqName(...)");
        m a13 = n.f139380c.a(b13, g13);
        if (a13 == null) {
            return null;
        }
        l a14 = a13.a();
        int b14 = a13.b();
        List list = (List) l0.B0(((c0) this.f139361b.H(g13)).f55403e, c0.f55400h[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof xl2.d) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        ep.b.A(CollectionsKt.firstOrNull(arrayList2));
        return new c(this.f139360a, (xl2.d) CollectionsKt.S(arrayList), a14, b14);
    }
}
