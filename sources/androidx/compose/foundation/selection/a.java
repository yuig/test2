package androidx.compose.foundation.selection;

import am.d;
import i2.n;
import i2.o;
import k1.k1;
import kl2.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import u2.q;
import z3.g;

/* loaded from: classes2.dex */
public final class a extends s implements l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17349i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k1 f17350j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f17351k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f17352l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f17353m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ xk2.g f17354n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(k1 k1Var, boolean z13, boolean z14, g gVar, xk2.g gVar2, int i13) {
        super(3);
        this.f17349i = i13;
        this.f17350j = k1Var;
        this.f17351k = z13;
        this.f17352l = z14;
        this.f17353m = gVar;
        this.f17354n = gVar2;
    }

    public final q b(q qVar, o oVar) {
        d dVar = n.f71185a;
        u2.n nVar = u2.n.f120041b;
        int i13 = this.f17349i;
        xk2.g gVar = this.f17354n;
        k1 k1Var = this.f17350j;
        switch (i13) {
            case 0:
                i2.s sVar = (i2.s) oVar;
                sVar.W(-1525724089);
                Object J2 = sVar.J();
                if (J2 == dVar) {
                    J2 = d7.g.o(sVar);
                }
                o1.l lVar = (o1.l) J2;
                q j13 = androidx.compose.foundation.d.a(nVar, lVar, k1Var).j(new SelectableElement(this.f17351k, lVar, null, this.f17352l, this.f17353m, (Function0) gVar));
                sVar.r(false);
                return j13;
            default:
                i2.s sVar2 = (i2.s) oVar;
                sVar2.W(-1525724089);
                Object J3 = sVar2.J();
                if (J3 == dVar) {
                    J3 = d7.g.o(sVar2);
                }
                o1.l lVar2 = (o1.l) J3;
                q a13 = androidx.compose.foundation.d.a(nVar, lVar2, k1Var);
                g gVar2 = this.f17353m;
                q j14 = a13.j(new ToggleableElement(this.f17351k, lVar2, this.f17352l, gVar2, (Function1) gVar));
                sVar2.r(false);
                return j14;
        }
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f17349i) {
            case 0:
                ((Number) obj3).intValue();
                break;
            default:
                ((Number) obj3).intValue();
                break;
        }
        return b((q) obj, (o) obj2);
    }
}
