package a2;

import b3.w;
import b3.x;
import b4.l0;
import b4.m0;
import b4.q0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f426i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f427j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i13) {
        super(1);
        this.f426i = i13;
        this.f427j = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f426i;
        m0 m0Var = null;
        h hVar = this.f427j;
        switch (i13) {
            case 0:
                List list = (List) obj;
                m0 m0Var2 = hVar.N0().f401n;
                if (m0Var2 != null) {
                    l0 l0Var = m0Var2.f21615a;
                    b4.g gVar = l0Var.f21603a;
                    q0 q0Var = hVar.f429o;
                    x xVar = hVar.f438x;
                    m0 m0Var3 = new m0(new l0(gVar, q0.f(0, 16777214, xVar != null ? xVar.a() : w.f21390n, 0L, 0L, 0L, q0Var, null, null, null, null), l0Var.f21605c, l0Var.f21606d, l0Var.f21607e, l0Var.f21608f, l0Var.f21609g, l0Var.f21610h, l0Var.f21611i, l0Var.f21612j), m0Var2.f21616b, m0Var2.f21617c);
                    list.add(m0Var3);
                    m0Var = m0Var3;
                }
                break;
            case 1:
                b4.g gVar2 = (b4.g) obj;
                f fVar = hVar.C;
                if (fVar == null) {
                    f fVar2 = new f(hVar.f428n, gVar2);
                    d dVar = new d(gVar2, hVar.f429o, hVar.f430p, hVar.f432r, hVar.f433s, hVar.f434t, hVar.f435u, hVar.f436v);
                    dVar.c(hVar.N0().f398k);
                    fVar2.f425d = dVar;
                    hVar.C = fVar2;
                } else if (!Intrinsics.d(gVar2, fVar.f423b)) {
                    fVar.f423b = gVar2;
                    d dVar2 = fVar.f425d;
                    if (dVar2 != null) {
                        q0 q0Var2 = hVar.f429o;
                        g4.d dVar3 = hVar.f430p;
                        int i14 = hVar.f432r;
                        boolean z13 = hVar.f433s;
                        int i15 = hVar.f434t;
                        int i16 = hVar.f435u;
                        List list2 = hVar.f436v;
                        dVar2.f388a = gVar2;
                        dVar2.f389b = q0Var2;
                        dVar2.f390c = dVar3;
                        dVar2.f391d = i14;
                        dVar2.f392e = z13;
                        dVar2.f393f = i15;
                        dVar2.f394g = i16;
                        dVar2.f395h = list2;
                        dVar2.f399l = null;
                        dVar2.f401n = null;
                        dVar2.f403p = -1;
                        dVar2.f402o = -1;
                        Unit unit = Unit.f80348a;
                    }
                }
                com.bumptech.glide.c.m0(hVar);
                com.bumptech.glide.c.l0(hVar);
                com.bumptech.glide.c.k0(hVar);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                f fVar3 = hVar.C;
                if (fVar3 != null) {
                    Function1 function1 = hVar.f439y;
                    if (function1 != null) {
                        function1.invoke(fVar3);
                    }
                    f fVar4 = hVar.C;
                    if (fVar4 != null) {
                        fVar4.f424c = booleanValue;
                    }
                    com.bumptech.glide.c.m0(hVar);
                    com.bumptech.glide.c.l0(hVar);
                    com.bumptech.glide.c.k0(hVar);
                    break;
                } else {
                    break;
                }
        }
        return Boolean.TRUE;
    }
}
