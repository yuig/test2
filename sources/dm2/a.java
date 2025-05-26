package dm2;

import java.util.List;
import kotlin.jvm.functions.Function0;
import pn2.t1;

/* loaded from: classes2.dex */
public final class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f55384b;

    public /* synthetic */ a(b bVar, int i13) {
        this.f55383a = i13;
        this.f55384b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f55383a;
        b bVar = this.f55384b;
        switch (i13) {
            case 0:
                in2.n L = bVar.L();
                xl2.i iVar = new xl2.i(this, 1);
                rn2.j jVar = t1.f100842a;
                if (rn2.m.g(bVar)) {
                    return rn2.m.d(rn2.l.UNABLE_TO_SUBSTITUTE_TYPE, bVar.toString());
                }
                pn2.b1 e13 = bVar.e();
                if (e13 == null) {
                    t1.a(12);
                    throw null;
                }
                if (L == null) {
                    t1.a(13);
                    throw null;
                }
                List e14 = t1.e(e13.getParameters());
                pn2.u0.f100848b.getClass();
                return pn2.g.s(pn2.u0.f100849c, e13, e14, false, L, iVar);
            case 1:
                return new in2.i(bVar.L());
            default:
                return new a0(bVar);
        }
    }
}
