package tc0;

import c2.d6;
import c2.u2;
import kh2.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117217i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m0 f117218j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(m0 m0Var, int i13) {
        super(2);
        this.f117217i = i13;
        this.f117218j = m0Var;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f117217i;
        m0 m0Var = this.f117218j;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                u2.a(com.bumptech.glide.c.M0(m0Var.f117289c, oVar), a1.D0(m0Var.f117288b, oVar), null, 0L, oVar, 8, 12);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                d6.b(m0Var.f117287a.f103517a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oVar, 0, 0, 131070);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f117217i) {
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
