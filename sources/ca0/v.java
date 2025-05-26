package ca0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27165i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f27166j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(z zVar, int i13) {
        super(2);
        this.f27165i = i13;
        this.f27166j = zVar;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f27165i;
        z zVar = this.f27166j;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                z.Y7(zVar, oVar, 8);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                fc0.n.a(false, null, false, false, q2.i.c(-1767333788, new v(zVar, 0), oVar), oVar, 24576, 15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f27165i) {
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
