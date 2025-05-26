package v21;

import c2.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123881i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f123882j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i13) {
        super(2);
        this.f123881i = i13;
        this.f123882j = jVar;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f123881i;
        j jVar = this.f123882j;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                int i15 = j.f123883e0;
                kg.p.b((c0) jVar.f123884c0.getValue(), null, oVar, 8, 2);
                break;
            case 1:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                fc0.n.a(false, null, false, false, q2.i.c(-1870913270, new i(jVar, 0), oVar), oVar, 24576, 15);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        break;
                    }
                }
                j1.h(androidx.compose.foundation.layout.e.f17184c, null, 0L, 0L, null, 0.0f, q2.i.c(-1646049750, new i(jVar, 1), oVar), oVar, 1572870, 62);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f123881i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
