package y90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138236i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f138237j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(d0 d0Var, int i13) {
        super(2);
        this.f138236i = i13;
        this.f138237j = d0Var;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f138236i;
        d0 d0Var = this.f138237j;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                jk.v.a(androidx.compose.foundation.layout.b.n(u2.n.f120041b, com.bumptech.glide.d.A(eo1.c.space_200, oVar)), new r(d0Var, 0), new r(d0Var, 1), oVar, 0, 0);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                d0.Y7(d0Var, oVar, 8);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f138236i) {
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
