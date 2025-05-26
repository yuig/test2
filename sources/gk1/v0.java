package gk1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ni1.x2;

/* loaded from: classes2.dex */
public final class v0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f65273i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w0 f65274j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f65275k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l82.e f65276l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pj1.b f65277m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x2 f65278n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f65279o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u50.c f65280p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(l lVar, w0 w0Var, boolean z13, l82.e eVar, pj1.b bVar, x2 x2Var, int i13, u50.c cVar) {
        super(1);
        this.f65273i = lVar;
        this.f65274j = w0Var;
        this.f65275k = z13;
        this.f65276l = eVar;
        this.f65277m = bVar;
        this.f65278n = x2Var;
        this.f65279o = i13;
        this.f65280p = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l it = (l) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        List<u50.o> list = this.f65273i.f65239a;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        for (u50.o oVar : list) {
            if (oVar instanceof qj1.b) {
                qj1.b bVar = (qj1.b) oVar;
                oVar = qj1.b.f(bVar, pj1.f.f(bVar.g(), pj1.j.e(bVar.g().f100294e, null, 0, null, w0.g(this.f65274j, this.f65275k, ((x0) this.f65276l.f82219b).H), false, 0, null, this.f65277m, !this.f65278n.f90887w0, this.f65279o, this.f65280p, -125829153)), false, 30);
            }
            arrayList.add(oVar);
        }
        return l.e(it, arrayList, null, null, 6);
    }
}
