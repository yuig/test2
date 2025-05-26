package in2;

import am2.r0;
import dm2.u0;
import java.util.Collection;
import java.util.List;
import kh2.g2;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;

/* loaded from: classes2.dex */
public abstract class h extends o {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f72867d;

    /* renamed from: b, reason: collision with root package name */
    public final am2.g f72868b;

    /* renamed from: c, reason: collision with root package name */
    public final on2.l f72869c;

    static {
        l0 l0Var = k0.f80436a;
        f72867d = new rl2.u[]{l0Var.g(new d0(l0Var.b(h.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    }

    public h(on2.u storageManager, am2.g containingClass) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
        this.f72868b = containingClass;
        g2 g2Var = new g2(this, 19);
        on2.q qVar = (on2.q) storageManager;
        qVar.getClass();
        this.f72869c = new on2.l(qVar, g2Var);
    }

    @Override // in2.o, in2.n
    public final Collection a(ym2.g name, hm2.e location) {
        Collection collection;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) lb.l0.B0(this.f72869c, f72867d[0]);
        if (list.isEmpty()) {
            collection = q0.f80391a;
        } else {
            wn2.f fVar = new wn2.f();
            for (Object obj : list) {
                if ((obj instanceof u0) && Intrinsics.d(((u0) obj).getName(), name)) {
                    fVar.add(obj);
                }
            }
            collection = fVar;
        }
        return collection;
    }

    @Override // in2.o, in2.n
    public final Collection d(ym2.g name, hm2.e location) {
        Collection collection;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) lb.l0.B0(this.f72869c, f72867d[0]);
        if (list.isEmpty()) {
            collection = q0.f80391a;
        } else {
            wn2.f fVar = new wn2.f();
            for (Object obj : list) {
                if ((obj instanceof r0) && Intrinsics.d(((r0) obj).getName(), name)) {
                    fVar.add(obj);
                }
            }
            collection = fVar;
        }
        return collection;
    }

    @Override // in2.o, in2.p
    public final Collection g(g kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return !kindFilter.a(g.f72859m.f72866b) ? q0.f80391a : (List) lb.l0.B0(this.f72869c, f72867d[0]);
    }

    public abstract List h();
}
