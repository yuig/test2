package in2;

import am2.r0;
import dm2.u0;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;

/* loaded from: classes2.dex */
public final class r extends o {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f72878f;

    /* renamed from: b, reason: collision with root package name */
    public final am2.g f72879b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f72880c;

    /* renamed from: d, reason: collision with root package name */
    public final on2.l f72881d;

    /* renamed from: e, reason: collision with root package name */
    public final on2.l f72882e;

    static {
        l0 l0Var = k0.f80436a;
        f72878f = new rl2.u[]{l0Var.g(new d0(l0Var.b(r.class), "functions", "getFunctions()Ljava/util/List;")), l0Var.g(new d0(l0Var.b(r.class), "properties", "getProperties()Ljava/util/List;"))};
    }

    public r(on2.u storageManager, am2.g containingClass, boolean z13) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
        this.f72879b = containingClass;
        this.f72880c = z13;
        containingClass.c();
        am2.h hVar = am2.h.CLASS;
        q qVar = new q(this, 0);
        on2.q qVar2 = (on2.q) storageManager;
        qVar2.getClass();
        this.f72881d = new on2.l(qVar2, qVar);
        this.f72882e = new on2.l(qVar2, new q(this, 1));
    }

    @Override // in2.o, in2.n
    public final Collection a(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) lb.l0.B0(this.f72881d, f72878f[0]);
        wn2.f fVar = new wn2.f();
        for (Object obj : list) {
            if (Intrinsics.d(((u0) obj).getName(), name)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    @Override // in2.o, in2.n
    public final Collection d(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) lb.l0.B0(this.f72882e, f72878f[1]);
        wn2.f fVar = new wn2.f();
        for (Object obj : list) {
            if (Intrinsics.d(((r0) obj).getName(), name)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    @Override // in2.o, in2.p
    public final am2.j e(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // in2.o, in2.p
    public final Collection g(g kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        on2.l lVar = this.f72881d;
        rl2.u[] uVarArr = f72878f;
        return CollectionsKt.l0((List) lb.l0.B0(this.f72882e, uVarArr[1]), (List) lb.l0.B0(lVar, uVarArr[0]));
    }
}
