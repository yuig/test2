package ka0;

import b4.g0;
import kh2.a1;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78897i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f78898j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(j jVar, int i13) {
        super(2);
        this.f78897i = i13;
        this.f78898j = jVar;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f78897i;
        j jVar = this.f78898j;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return;
                    }
                }
                rm1.d dVar = new rm1.d(new rm1.f(rm1.q.ARROW_BACK, rm1.i.SM), null, null, 0, null, 30);
                gc0.a aVar = gc0.b.f64771a;
                i2.s sVar2 = (i2.s) oVar;
                sVar2.W(764057810);
                b4.d dVar2 = new b4.d();
                sVar2.W(764059125);
                int d2 = dVar2.d(new g0(0L, 0L, g4.l.f63471f, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                try {
                    dVar2.f21536a.append(a1.D0(b0.collages_retrieval_title, sVar2));
                    Unit unit = Unit.f80348a;
                    dVar2.c(d2);
                    sVar2.r(false);
                    b4.g e13 = dVar2.e();
                    sVar2.r(false);
                    k3.n(dVar, aVar, null, null, e13, null, new lr.v(jVar, 23), null, nc0.e.a(k3.b0(sVar2), eo1.c.space_300), sVar2, 3464, 160);
                    return;
                } catch (Throwable th3) {
                    dVar2.c(d2);
                    throw th3;
                }
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        return;
                    }
                }
                j.Y7(jVar, oVar, 8);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f78897i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
