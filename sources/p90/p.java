package p90;

import kh2.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99208i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f99209j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(w wVar, int i13) {
        super(2);
        this.f99208i = i13;
        this.f99209j = wVar;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f99208i;
        w wVar = this.f99209j;
        int i15 = 2;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                el.a.i(null, null, null, null, 0, 0.0f, new o(wVar, 0), oVar, 0, 63);
                break;
            case 1:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                u2.d((a) wVar.R0.getValue(), null, new o(wVar, 1), new o(wVar, i15), new o(wVar, 3), oVar, 0, 2);
                break;
            case 2:
                if ((i13 & 11) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        break;
                    }
                }
                w.l9(wVar, oVar, 8);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar4 = (i2.s) oVar;
                    if (sVar4.z()) {
                        sVar4.Q();
                        break;
                    }
                }
                w.k9(wVar, oVar, 8);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f99208i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
