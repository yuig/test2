package nn2;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;

/* loaded from: classes2.dex */
public class a implements bm2.i {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f91581b;

    /* renamed from: a, reason: collision with root package name */
    public final on2.l f91582a;

    static {
        l0 l0Var = k0.f80436a;
        f91581b = new rl2.u[]{l0Var.g(new d0(l0Var.b(a.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public a(on2.u storageManager, Function0 compute) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(compute, "compute");
        on2.q qVar = (on2.q) storageManager;
        qVar.getClass();
        this.f91582a = new on2.l(qVar, compute);
    }

    @Override // bm2.i
    public final boolean Q(ym2.c cVar) {
        return kotlin.jvm.internal.j.s(this, cVar);
    }

    @Override // bm2.i
    public final bm2.c a(ym2.c cVar) {
        return kotlin.jvm.internal.j.l(this, cVar);
    }

    @Override // bm2.i
    public boolean isEmpty() {
        return ((List) lb.l0.B0(this.f91582a, f91581b[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) lb.l0.B0(this.f91582a, f91581b[0])).iterator();
    }
}
