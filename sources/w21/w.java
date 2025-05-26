package w21;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127843i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f127844j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, int i13) {
        super(2);
        this.f127843i = i13;
        this.f127844j = xVar;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f127843i;
        x xVar = this.f127844j;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                int i15 = x.f127855e0;
                e1.a((y1) xVar.f127856c0.getValue(), null, oVar, 8, 2);
                break;
            case 1:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                fc0.n.a(false, null, false, false, q2.i.c(-781483279, new w(xVar, 0), oVar), oVar, 24576, 15);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        break;
                    }
                }
                c2.j1.h(androidx.compose.foundation.layout.e.f17184c, null, 0L, 0L, null, 0.0f, q2.i.c(1300846609, new w(xVar, 1), oVar), oVar, 1572870, 62);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f127843i) {
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
